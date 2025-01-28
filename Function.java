
import java.util.Scanner;
public class Function {
    static int a=50;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the value of a: ");
         int a=sc.nextInt();
         System.out.println("\n enter the value of b: ");
         int b=sc.nextInt();
         sc.close();
         System.out.println(caluculatesum(a,b));
    }
    public static int caluculatesum(int a, int b){
        return a+b;
    }
    
}


    

    

