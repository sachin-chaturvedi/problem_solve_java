// import java.util.*;
// class TCSQuestion {
//     public static void main(String[]args){
//         int n = 10;
//         int k = 5;
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num >= 1&& num <= 5){
//            System.out.println("Input the number  " + num );
//            System.out.println("totla remaining candi" + ( n - num));
            
//         }else{
//              System.out.print("invalede statement ");
//         }
//     }

// }

                //  question 2

// import java.util.*;

// class TCSQuestion {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int [][] value = new int[3][3];
//         int [] av = new int[3];
//         for(int i = 0;i<3;i++){
//             for(int j = 0;j<3;j++){
//                 value[i][j] = sc.nextInt();
//                 if(value[i][j] <0 || value[i][j]> 100) value [i][j] = 0;
//             }
//             for(int k = 0;k < 3;k++){
//                 av[i] += value[i][k];
//             }
//             av[i] = av[i]/3;
//         } 
//         for(int i = 0;i<3;i++){
//             if(av[i] > 70 ) System.out.println("trainer are pass");
//             else System.out.println("trainer are fail");
//         }

        
//     }
// }
             

                                                //    Question 3 solve 

//  import java.util.*;

//  class TCSQuestion{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int val = sc.nextInt();
//         if(0<=val && val<=2000){
//             System.out.println( 25);
//         }else if(2000<val && 4000>=val){
//             System.out.println(35);
//         }else if(4000 < val && 7000 > val){
//             System.out.println(45);
//         }else{
//             System.out.println("in vailed outpur");
//         }
//     }
//  }

                    //   Question 4 solve 


//   import java.util.*;
//   class TCSQuestion {
//        public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the key value  :");
//         int key  = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter the String  :");
//         String val = sc.nextLine();
//         custemcasserciper(val,key);

//        }
//        public static void custemcasserciper(String val, int key){
//            StringBuilder sb = new StringBuilder();
                    
//           for(int i = 0;i<val.length();i++){

//              char ch = val.charAt(i);
//              if(ch != ' '){
//                     int akey = (int)ch + key;
//                     sb.append((char)akey);
//              }else{

//                  sb.append(" ");
//              }
//           }
//           System.out.println(sb);
//        }
//   }

// import java.util.*;
 
// class TCSQuestion{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Number of Interiar wall :  ");
//          int InteWall = sc.nextInt();
//          System.out.print("Number of exterial wall :  ");
//          int EXteWall = sc.nextInt();
         
         
//          int unitInCost = 18,unitExCost = 12;
//          float surfaceArea ,cast  = 0;
//          if(InteWall< 0&& EXteWall< 0){
//             System.out.println("Invalid Input statment ");

//          }
//         else if(InteWall == 0 && EXteWall == 0){
//             System.out.println("envailed  number cost is 0");
//          }else{

//              for(int i = 0;i<InteWall;i++){
//                     System.out.print(i + " Interiar wall Area :");
//                      surfaceArea = sc.nextFloat();
//                      cast += unitInCost * surfaceArea;
//              }
//              for(int i = 0;i<EXteWall;i++){
//                 System.out.print(i + "Exteria wall Area : ");
//                     surfaceArea = sc.nextFloat();
//                     cast += unitExCost * surfaceArea;
//              }
//          }
        
//          System.out.printf("Cast : %.1f", cast);


//     }
// }

// import java.util .*;
// class TCSQuestion{
//     public static void main (String[]args){
//         Scanner sc = new Scanner(System.in);
//         String source = sc.nextLine();
//         String distination = sc.nextLine();
//         System.out.println(getFare(source,distination));


//     }
//     public static int getFare( String source , String distination){
//         int []path = {800,600,750,900,1400,1200,1100,1500};
//         int n = path.length;
//         String[]busStop = {"Th","GA","IC","HA","TE","LU","NI","CA"};
//         int sourceIn = -1,distinationIn = -1;
//         for(int i = 0;i<path.length;i++){
//             if(busStop[i].equals(source)) sourceIn = i;

//             if(busStop[i].equals(distination)) distinationIn = i;  
//         }
//         float diffvalue = 0;
//         int i = sourceIn; 
//         while(distinationIn != i){
//             diffvalue += path[i];
//              i = (i+1)%n;
//         }

//         float ans = (diffvalue/1000)*5;
//         int finalFare = (int) Math.ceil(ans);
//         return finalFare ;

//     }
// }

//                                            Question 7 only 

// import java.util.*;
// class TCSQuestion{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int j = sc.nextInt();
//         int m = sc.nextInt();
//         int p = sc.nextInt();
//         int sum = 0;
//         if(m == 0||n == 0||k==0||j==0||p==0) System.out.println("INVAiLd STATEMENT");

//         sum = m/k + p / j;
//         sum = n-sum;
//           System.out.println( "number of monkey left on Tree  : " + sum);
//     }
// }



                                            // Question 8 only 

// import java.util.*;
// class TCSQuestion{
//     public static void main (String[]args){
//         Scanner sc = new Scanner(System.in);
//         int parent = sc.nextInt();

//         char child  = sc.next().charAt(0);
//         if(child == 'y'){
//             int numberchild = sc.nextInt();
//             System.out.println(numberchild+1);
//             System.out.println("Commision datail : ");
//             System.out.println(parent);
//             for(int i = 0;i<numberchild;i++){
//             int bonas = (parent/2) / numberchild;
//             System.out.println(bonas);
//         }
//         }
//         else{
//             parent += (parent/2);
//             System.out.println(parent);

//         }

//     }
// }


                                  
                                    //   Question 9 only 


// import java.util.*;
// class TCSQuestion {
//     public static void main (String[]args){
//         Scanner sc = new Scanner(System.in);
       
//         char ch = sc.next().charAt(0); 
//          if(ch == 'c'){
//             int value = sc.nextInt();
//              HashMap<Integer,String> h = new HashMap<>();
//             h.put(1,"Espresso coffee");
//             h.put(2,"cappuccino coffee");
//             h.put(3,"Latte Coffe");
//             if(value > h.size()) System.out.println("INVAID INPUT");
//             for(int i = 1;i<=h.size();i++){
//                 if(value == i) {
//                     System.out.println("Welcome to CCD!");
//                     System.out.println("Enjoy Your " + h.get(i)+"!");
//                 }
//             }
//          }
//          else if(ch == 'T'){
//             int value = sc.nextInt();
//             HashMap<Integer,String> h = new HashMap<>();
//             h.put(1,"Plain Tea");
//             h.put(2 ,"Assam Tea");
//             h.put(3,"Ginger Tea");
//             h.put(3,"Cardmom Tea");
//             h.put(4,"Masala Tea");
//             h.put(5,"Lemone Tea");
//             h.put(6,"Green TEA");
//             h.put(7,"organic dargenic Tea");
//             if(value> h.size()) System.out.println("InVAID INPUt");
//             for(int i = 1;i<=h.size();i++){
//                  if(value == i) {
//                     System.out.println("Welcome to CCD!");
//                     System.out.println("Enjoy Your " + h.get(i)+"!");
//                 }
//             }

//          }
         
         
//     }
// }

import java.util.*;
class TCSQuestion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        int sum = 0;

        for(int i = 0;i<2;i++){
            li.add(sc.nextInt());
        }
        for(int i : li){
            if ( i < 17) sum += 200;
            if(i < 40 && i>= 17) sum += 400;
            if (i > 40) sum += 300;
        }

        System.out.println("Total income :" + sum );

    }
}
