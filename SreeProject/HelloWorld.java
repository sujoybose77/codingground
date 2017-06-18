public class HelloWorld{

     public static void main(String []args){
        final int a = 30;
        final int b = 45;
        System.out.println("Before swapping value of a " +a +" & value of b " +b);
        swapMethod(a,b);
        System.out.println("after swapping value of a " +a +" & value of b " +b);
     }
     
     
     public static void swapMethod (int x1, int x2){
         int x3 = x1;
         x1 = x2;
         x2 = x1;
         System.out.println("after swapping value of a " +x1 +" & value of b " +x2);
         
     } 
}
