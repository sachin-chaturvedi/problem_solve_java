package Linklist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

public class solve {
  
  public static void hashMapExample(){
     Map<Integer,String> ma = new HashMap<>();
     ma.put(3, "sachin");
     ma.put(2, "jay");
     ma.put(1, "chaturvedi");
     System.out.println(ma);
     System.out.println(ma.get(2));
     System.out.println(ma.keySet());
     System.out.println(ma.values());
  }


  public static void hashsetExample(){
     HashSet<Integer> se = new HashSet<>();
     se.add(1);
     se.add(2);
     se.add(3);
     System.out.println(se);
     se.add(1);
     se.add(2);
     System.out.println(se);
  }
  public static void Dequeue(){
    Deque<Integer> d = new ArrayDeque<>();

    d.addFirst(1);
    d.addLast(2);
    d.addFirst(4);
    d.addLast(6);
    System.out.println(d);
  }
  public static void PrioriortyQueueExample(){
    PriorityQueue<Integer> pr = new PriorityQueue<>();
    
    pr.add(3);
    
    pr.add(2);
    
    pr.add(5);
    
    pr.add(0);
    System.out.println(pr);
  }

  public static void ArrayListExample(){
    ArrayList<Integer> li = new ArrayList<>();
    li.add(3);
    li.add(2);
    li.add(5);
    li.add(8);
    
    System.out.println(li);
    System.out.println(li.get(1));
    System.out.println(li.set(0, 10));
    
  }
  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  // public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  //   ListNode result = new ListNode(0);
  //   ListNode curr = result;
  //   int curray = 0;

  //   while (l1 != null || l2 != null || curray != 0) {
  //     int x = (l1 != null) ? l1.val : 0;
  //     int y = (l2 != null) ? l2.val : 0;

  //     int temp = x + y + curray;
  //     curray = temp / 10;
  //     curr.next = new ListNode(temp % 10);

  //     curr = curr.next;
  //     if (l1 != null)
  //       l1 = l1.next;
  //     if (l2 != null)
  //       l2 = l2.next;
  //   }
  //   return result.next;

  // }

  public static ListNode mergeNodes(ListNode head) {
    ListNode temp = head;
    LinkedList<Integer> newList = new LinkedList<>();
    ListNode new_head = null;
    ListNode new_temp = new_head;
    while(temp.next != null){

      if(temp.next.val != 0){
        temp.val = temp.val + temp.next.val;
        temp = temp.next;
  
      }else{
        new_temp.next.val = temp.val;
        new_temp = new_temp.next;
      }
    }

    return new_head.next;
        
        
        
    }
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    LinkedList<Integer> l2 = new LinkedList<>();
    


    l1.add(0);
    l1.add(9);
    l1.add(9);
    l1.add(9);
    l1.add(9);
    l1.add(9);
    l1.add(0);

    l2.add(9);
    l2.add(9);
    l2.add(9);
    l2.add(0);

    // ListNode head = 0;
    // System.out.println(mergeNodes(head.next));

// System.out.print(addTwoNumbers(head1, head2));


    
    // ArrayListExample();
    // PrioriortyQueueExample()
  //  Dequeue();
  //   hashsetExample();
    hashMapExample();

    
    
    
  


  }

}
