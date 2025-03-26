import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 value");
        int num1=sc.nextInt();
        System.out.println("Enter num2 value");
        int num2=sc.nextInt();
        System.out.println("Enter num3 value");
        int num3=sc.nextInt();
        int Max_Value=num1;
        if(num2 > Max_Value){
            Max_Value=num2;
        }
        if(num3 > Max_Value){
            Max_Value=num3;
        }
        else{
            System.out.println("invalide number");
        }
        System.out.println("The largest number is:"+Max_Value);   
    }
}
