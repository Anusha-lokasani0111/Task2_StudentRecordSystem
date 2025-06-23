import java.util.Scanner;
class Calcualtor2 {
    public static void add(double a , double b){
        System.out.println("the addition of two num is:"+(a+b));
    }
    public static void sub(double a , double b){
        System.out.println("the subraction of two num is:"+(a-b));
    }
    public static void mul(double a , double b){
        System.out.println("the multiplication of two num is:"+(a*b));
    }
    public static void div(double a , double b){
        System.out.println("the division of two num is:"+(a/b));
    }
    public static void mod(double a , double b){
        System.out.println("the remainder of two num is:"+(a%b));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("welcome to simple Calculator");
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("-------------------------------------------------");
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
                add(a,b);
            }break;
            case 2:{
                sub(a,b);
            }break;
            case 3:{
                mul(a,b);
            }break;
            case 4:{
                div(a,b);
            }break;
            case 5:{
                mod(a,b);
            }break;
            case 6:{
                flag = false;
                System.out.println("Thank you Visit Again");
            }break;
            default: {
                System.out.println("dabba fellow enter the valid option");

            }
            
        }
        System.out.println("---------------------------------------------------");
        }


    }
}