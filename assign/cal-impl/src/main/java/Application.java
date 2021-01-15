import java.util.Scanner;
import java.lang.*;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calc = new Calculator();
        /*Structure of Calculator*/
        System.out.println("******CALCULATOR******");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Choose the option from 1 to 4");
        /*Taking input for choosing which calculation to perform*/
        int number=sc.nextInt();
        /*If number entered is valid, let user enter the value of operands*/
        if(number>0 && number<5){
            System.out.println("Enter Two Numbers");
            int first=sc.nextInt();
            int second= sc.nextInt();
            sc.nextLine();
            /*Prints the output*/
            switch(number)
            {
                case 1:System.out.println("Addition is "+calc.addition(first,second));
                    break;
                case 2:System.out.println("Subtraction is "+calc.subtraction(first,second));
                    break;
                case 3:System.out.println("Multiplication is "+calc.multiplication(first,second));
                    break;
                case 4:System.out.println("Division is "+calc.division(first,second));
                    break;
            }
        }
        else{
            System.out.println("Invalid option");
        }
        sc.close();
    }
}