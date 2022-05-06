//

import java.util.Scanner;

public class CalculationObject {
    public static void main(String[] args) {

        //Print problems and results in console provided in assignment.
        System.out.println("===========================================");
        System.out.println("Problems and results from assignment:");
        Calculator calc = new Calculator();
        System.out.println("1 + 1 = " + calc.add(1,1));
        System.out.println("23 - 52 = " + calc.subtract(23,52));
        System.out.println("34 * 2 = " + calc.multiply(34,2));
        System.out.println("12 / 3 = " + calc.divide(12,3));
        System.out.println("12 / 7 = " + calc.divide(12,7));
        System.out.println("3.4 + 2.3 = " + calc.add(3.4,2.3));
        System.out.println("6.7 * 4.4 = " + calc.multiply(6.7,4.4));
        System.out.println("5.5 - 0.5 = " + calc.subtract(5.5,0.5));
        System.out.println("10.8 / 2.2 = " + calc.divide(10.8,2.2 ));


// Using same code from ConverterApplication assignment to take in numbers and print the math solutions.
        System.out.println("==================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");

        int firstIntNum = scan.nextInt();


        System.out.println("Enter another integer: ");
        int secondIntNum = scan.nextInt();

        System.out.println("----------");
        System.out.println("     Integer Calculations");
        System.out.println("------------");
//        Print results to numbers entered by user.
        System.out.println("Sum =");
        System.out.println(firstIntNum + secondIntNum);
        System.out.println("Difference =");
        System.out.println(firstIntNum - secondIntNum);
        System.out.println("Product =");
        System.out.println(firstIntNum * secondIntNum);
        System.out.println("Quotient =");
        System.out.println(firstIntNum / secondIntNum);


        System.out.println("Now enter a double: ");
        double firstDoubleNum = scan.nextDouble();

        System.out.println("Enter another double: ");
        double secondDoubleNum = scan.nextDouble();

        System.out.println("--------------");
        System.out.println("    Doubles Calculations");
        System.out.println("--------------");
        System.out.println("Sum =");
        System.out.println(firstDoubleNum + secondDoubleNum);
        System.out.println("Difference =");
        System.out.println(firstDoubleNum - secondDoubleNum);
        System.out.println("Product =");
        System.out.println(firstDoubleNum * secondDoubleNum);
        System.out.println("Quotient =");
        System.out.println(firstDoubleNum / secondDoubleNum);

    }
}
