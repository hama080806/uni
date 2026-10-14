import java.util.*;
public class recursion_test {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("please enter the number to find it's factorial: ");
         int num= in.nextInt();
         while (num <0){
            System.out.println("please enter a valid number (non-negative integers only)");
             num= in.nextInt();
         }
       

        System.out.println(num+"!"+" = "+ factorial(num));

    }
    public static int factorial(int n){
        if (n==0){
          return 1;
        }
        
        else{
            return n*factorial(n-1);
        }
    }
    
}
