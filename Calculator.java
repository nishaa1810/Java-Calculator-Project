
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //taking input
    System.out.println("Enter first number (a) :");
    int a = sc.nextInt();
    System.out.println("Enter second  number (b) :");
    int b = sc.nextInt();

    //display operation
System.out.println("\nChoose operation");
System.out.println("1 : Addition");
System.out.println("2 : Subtraction");
System.out.println("3 : Multiplication");
System.out.println("4 : Division");
System.out.println("5 : Modulo");

    System.out.println("Enter your choise :");
    int choice = sc.nextInt();

    //perform operation
    switch(choice){
    case 1:
        System.out.println("Result = " +(a+b));
        break;
    case 2:
        System.out.println("Result = " +(a-b));
        break;    
    case 3:
        System.out.println("Result = " +(a*b));
        break;
    case 4:
     if(b != 0){
        System.out.println("Result = " +(a/b));
     }else{
        System.out.println("Division by zero is not allowed");
    }
     break;
    case 5:
    if(b !=0){
        System.out.println("Result =" +(a % b));
    }else{
        System.out.println(" Modulo by zero is not allowed");
    }

        break;
    default:
      System.out.println("invalid choice");
    }

        System.out.println("Thankyou");







    sc.close();
    
    
    
    }
        
    }
    

