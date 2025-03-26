import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your userId");
        int UserId=sc.nextInt();
        if(UserId==105){
            System.out.println("Your name is Jack and Your Age is 30");
        }
        else{
            System.out.println("Invalide UserId");
        }
    }
}
