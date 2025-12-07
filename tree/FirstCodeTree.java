package tree;

import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstCodeTree {
    static int size = 0;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print( root.val+" ->");
        if(root.left != null) System.out.print(root.left.val+" ");
         if(root.right != null) System.out.print(root.right.val);
         System.out.println();
         size++;
        display(root.left); 
        display(root.right);


    }
    public static int size(Node root){
        if(root==null) return 1;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return  root.val + sum(root.left) + sum(root.right); 
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }
    public static int min(Node root){
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static int height(Node root){
        if(root == null)return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static int product(Node root){
        if(root == null) return 1;
        return root.val * (product(root.left)*product(root.right));
    }
    public static void preorder(Node root){

        // preorder root left then right;

        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){

        // inorder root left then right;

        if(root == null) return;
        preorder(root.left);
        System.out.print(root.val+" ");
        preorder(root.right);
    }
    public static  void nThLevel(Node root , int n , ArrayList<Integer> li){
        if(root == null) return ;
        if(n == 1){
             li.add(root.val);
             return;
        } 
        nThLevel(root.left, n-1 , li);
        nThLevel(root.right, n-1 , li);

    }
    public static void nThLevel2(Node root,int n , ArrayList<Integer> li ){
        if(root == null) return;
        if(n == 1){
            li.add(root.val);
            return;
        }
        nThLevel2(root.right,n-1, li);
        nThLevel2(root.left, n-1, li);
        
    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }  
    public static int diameter(Node root){
        if(root == null || (root.left == null&& root.right == null))return 0;
        int leftAns  =  diameter(root.left);
        int rightAns = diameter(root.right);
        int mid = height(root.left)+ height(root.right);
        if(root.left != null) mid++;
        if(root.right != null) mid++;
        int max = Math.max(leftAns,Math.max(rightAns, mid));
        return max;

    }
    public static boolean isBalanced(Node root){
        if(root == null)return true;
        int lh = height(root.left);
        if(root.left != null) lh++;
        int rh = height(root.right);
        if(root.right != null) rh++;
        int d = lh - rh;
        if(d<0) d=-1;
        if(d>1)return false;
        return(isBalanced(root.left)&& isBalanced(root.right));
    }
    public static boolean IsSameTree(Node p , Node q){
        if(p == null && q == null)return true;
        if(p == null && q != null)return false;
        if (p.val != q.val) return false;
        return IsSameTree(p.left, q.left) && IsSameTree(p.right, q.right);

    }
    public static void helper(Node root, ArrayList<String> ans , String s){
        if(root == null) return;
        if(root.left==null && root.right == null){
            s+= root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s+root+"->");
         helper(root.right, ans, s+root+"->");
    }
    public static  ArrayList<String> binaryTreePaths(Node root){
        ArrayList<String> ans = new ArrayList<>();
       helper(root,ans, " ");
        return ans;

    }
    public static boolean contains(Node root , Node node){
               if(root == null)return false;
               if(root == node)return true;
               return contains(root.left, node) || contains(root.right, node);
    }
public static Node LowestCommonAncestor(Node root, Node p , Node q){
    if(p == root || q == root) return root;
    if(p == q ) return p;
    boolean leftp = contains(root.left,p);
    boolean rightq = contains(root.right, q);
    if((leftp && rightq)||(!leftp && !rightq)) return root;
    if(leftp && !rightq) LowestCommonAncestor(root.left, p, q);
    if(!leftp & rightq) LowestCommonAncestor(root.right, p, q);

    return null;
}
 public static ArrayList<ArrayList<Integer>> traversal_Zicz_zac(Node root){
    
    int height = height(root);
    int level = height+1;
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    for(int i = 0;i<level;i++){
        ArrayList<Integer> l = new ArrayList<>();
        if(level%2!=0){
            nThLevel2(root, i, l);
        } else{
            nThLevel(root, i, l);
        }
        ans.add(l);
    }
    return ans ;
    

    
 }
 public static Node helper1(int[]preorder,int prelo,int prehi,int [] inorder,int inlo,int inhi){
    if(prelo>prehi) return null;
    Node root = new Node(preorder[prelo]);
    int i = inlo;
    while(inorder[i] != preorder[prelo]) i++;
    int leftsize = i- inlo;
    root.left = helper1(preorder,prelo+1,prelo+leftsize,inorder,inlo,i-1);
    root.right = helper1(preorder, prelo+leftsize+1, prehi, inorder, i+1, inhi);
    return root;
 }
 public static Node buildTree(int preorder[] , int []inorder){
    int n = preorder.length;
    return helper1(preorder, 0, n-1, inorder, 0, n-1);
 }
 public static boolean targetPathSum(Node root, int targer){
    if(root == null) return false;
    if(root != null && (root.left == null&& root.right == null)){
        if(root.val == targer) return true;
    }
    return (targetPathSum(root.left, targer-root.val)|| targetPathSum(root.right, targer-root.val));
 }
 public static ArrayList<ArrayList<Integer>> helperTarger(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> arr , Node root,int targerSum){
    if(root == null) return ans;
    if(root.left==null&& root.right==null){
        arr.add(root.val);
        if(root.val == targerSum){
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0; i<arr.size();i++){
                a.add(arr.get(i));
            }
            ans.add(a);
        }
        arr.remove(arr.size()-1);
        return ans;
    }
    arr.add(root.val);
   helperTarger(ans, arr, root.left, targerSum-root.val);
   helperTarger(ans, arr, root.right, targerSum-root.val);
   arr.remove(arr.size()-1);
   return ans;
 }
 public static ArrayList<ArrayList<Integer>> TargetPathSum2(Node root, int targetsum){
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>();
    return helperTarger(ans, arr, root, targetsum);

 } 
 public static int noOfTargetSum(Node root,long targerSum){
    if(root == null) return 0;
    int count = 0;
    if((long)root.val == targerSum) count++;

    return count + noOfTargetSum(root.left, targerSum-(long)root.val) + noOfTargetSum(root.right, targerSum-(long)root.val);
 }
 public static int TargetPathSum3(Node root , int targerSum){
    if(root== null) return 0;
    int count = noOfTargetSum(root,(long)targerSum);
    count += (TargetPathSum3(root.left, targerSum) + TargetPathSum3(root.right, targerSum));
    return count;

 }
 public static int Rtarget (int []arr,int target ,int i){
 
 if(i==arr.length) return 0;
    if(arr[i] == target){
        return i;
    }

   return Rtarget(arr, target, i+1);
   
 }
 public static void flatten(Node root){
    if(root == null) return;
    Node leftTree = root.left;
    Node rightTree = root.right;
    root.left = null;
    flatten(leftTree);
    flatten(rightTree);
    root.right = leftTree;
    Node temp = leftTree;
    while(temp != null && temp.right!=null){
        temp = temp.right;
    }
    if(temp != null) temp.right = rightTree;
    else root.right = rightTree;
    return;

 }
 public static void flatten_Method2(Node root){
    Node curr = root;
    while(curr != null){
        if(curr.left != null){
            Node pred = curr.left;
            while(pred.right != null){
                pred = pred.right;
            }
            pred.right = curr.right;
            curr.right = curr.left;
            curr.left = null;
        }
        curr = curr.right;
    }
 }
 public static Node getNode(Node root, int start){
    if(root == null) return null;
    if(root.val == start) return root;
    Node left = getNode(root.left, start);
    Node right = getNode(root.right, start);
    if(left == null) return right;
    else return left;

 }
 public static void preorderH(Node root, HashMap<Node,Node>p){
    if(root == null)return;
    if(root.left != null)p.put(root.left, root);
    if(root.right != null) p.put(root.right, root);
    preorderH(root.left, p);
    preorderH(root.right, p);
 }
 public static  int amountOfTime(Node root, int start){
    Node node = getNode(root,start);
    HashMap<Node,Node> p = new HashMap<>();
    preorderH(root, p); 

    // Bfs

    Queue<Node> q = new LinkedList<>();
     q.add(node);
     HashMap<Node,Integer> v = new HashMap<>();
     v.put(node, 0);
     while(q.size()>0){
        Node temp = q.peek();
        int level = v.get(temp);
        if(temp.left != null && !v.containsKey(temp.left)){
            q.add(temp.left);
            v.put(temp.left, level+1);
        }
         if(temp.right != null && !v.containsKey(temp.right)){
            q.add(temp.right);
            v.put(temp.right, level+1);
        }
        if(p.containsKey(temp)&&!v.containsKey(p.get(temp))){
             q.add(p.get(temp));
            v.put(p.get(temp), level+1);

        }
        q.remove();

     }
     int max = -1;
     for(int level : v.values()){
        max = Math.max(max, level);
     }

return max;

 }

 public static void bfs1(Node root){
    Queue <Node> q = new LinkedList();
    q.add(root);

    while(!q.isEmpty()){
        Node temp = q.poll();
        System.out.print(temp.val +" ");
        if(temp.left != null) q.add(temp.left);
        if(temp.right != null) q.add(temp.right);
    }
 }
    public static void main (String[]args){
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        // Node f = new Node(8);
        a.left = c;
        a.right = d;
        b.right = e;
        // e.right= f;
        //  display(root);
        //  System.out.println(size);
        // System.out.println();
        // System.out.print(size);
        //  System.out.println(size(root));
        // System.out.println(sum(root));
        //  System.out.println(max(root));
        //  System.out.println(min(root));
         //System.out.println(height(root));
         bfs1(root);

        // System.out.println(product(root));
        // preorder(root);
        // System.out.println();
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // nThLevel(root, 3);
        // int level = height(root)+1;
        // ArrayList<Integer> li = new ArrayList<>();

        // for(int i = 0;i<level;i++){
        //     nThLevel(root, i , li);
        //     System.out.println();
        // }
        // bfs(root);
        // System.out.println();
        // System.out.printls(diameter(root));
        // System.out.println(isBalanced(root));
        // System.out.println(binaryTreePaths(root));
        // LowestCommonAncestor(root, a, f);
        //System.out.println(traversal_Zicz_zac(root));
        // int[]preorder = {1,2,4,5,3,6};
        // int[]inorder = {4,2,5,1,3,6};
        // buildTree(preorder, inorder);
        // System.out.println(targetPathSum(root, 23));
        // int arr[] = {30,28,20,16,4};
        // System.out.println(Rtarget(arr, 28,0));
       // System.out.println(binaryserach(arr, 28));
    }
    
}
