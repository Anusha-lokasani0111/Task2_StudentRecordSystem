import java.util.Scanner;
class Calculator {
    public static void add(double a ,double b){
        System.out.println("the addition of two num is:"+ (a+b));
    }
    public static void sub(double a ,double b){
        System.out.println("the sbstraction of two num is:"+ (a-b));
    }
    public static void mul(double a ,double b){
        System.out.println("the multiplication of two num is:"+ (a*b));
    }
    public static void div(double a ,double b){
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("The division of two numbers is: " + (a / b));
        }
    }
    public static void mod(double a ,double b){
        System.out.println("the modulus of two num is:"+(a%b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Welcome to Simple Calculator");
            System.out.println("Enter a value");
            double a=sc.nextDouble();
            System.out.println("Enter b value");
            double b=sc.nextDouble();
            System.out.println("----------------------------");
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            switch(choice){
                case 1:{
                    add(a,b);
                }break;
                case 2:{
                    sub(a, b);
                }break;
                case 3:{
                    mul(a, b);
                }break;
                case 4:{
                    div(a, b);
                }break;
                case 5:{
                    mod(a,b);
                }break;
                case 6:{
                    flag=false;
                    System.out.println("Thankyou visit again");
                }break;
                default:{
                    System.out.println("enter valid choice....");
                }
            }
            System.out.println("-------------------------------");
        }

    }
}
