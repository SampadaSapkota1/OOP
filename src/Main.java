//import Models.Bike;
//import Models.Car;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Bike b1 = new Bike();
//        System.out.println(b1.wheels);
//        System.out.println(b1.cc1);
//        b1.startB();
//
//        Bike b2 = new Bike();
//        System.out.println(b2.wheels);
//        System.out.println(b2.cc2);
//        b2.startB();
//
//        Bike b3 = new Bike();
//        System.out.println(b3.wheels);
//        System.out.println(b3.cc3);
//        b3.startB();
//
//        Mammal Cow = new Mammal("Cow",4);
//        Mammal Dog = new Mammal("Dog",4);
//
//
//
//
//    }
//}


import Model.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();


        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        while (true) {
            System.out.println("Choose an operation: add, sub, multiply, or divide");
            String operation = scanner.next();


            if (operation.equals("add")) {
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            } else if (operation.equals("sub")) {
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            } else if (operation.equals("multiply")) {
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            } else if (operation.equals("divide")) {
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            } else {

                System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}
