import java.util.Scanner;
public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number");
            double a= sc.nextDouble();

            System.out.println("Enter the second number");
            double b= sc.nextDouble();

            System.out.println("Choose operation: + - * /");
            char op = sc.next().charAt(0);
            if(op=='+'){
                System.out.println("Result="+(a+b));
            }else if(op=='-'){
                System.out.println("Result="+(a-b));
            }else if(op=='*'){
                System.out.println("Result="+(a*b));
            }else if(op=='/'){
                if(b==0){
                    System.out.println("Cannot be divided by zero");
                }else
                    System.out.println("Result="+(a/b));
            }else {
                System.out.println("Invalid Operation");
            }
        }
}