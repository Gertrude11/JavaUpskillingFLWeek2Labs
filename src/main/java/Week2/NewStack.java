package Week2;

import java.util.Scanner;
import java.util.Stack;

public class NewStack {
    public static void main(String[] args) {
        //it uses LIFO method (last in first out)

        Stack calculator = new Stack();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter First Number: ");
            int n1 = sc.nextInt();

            System.out.println("Enter Second Number: ");
            int n2 = sc.nextInt();

            System.out.println("Enter operator to use (+,-,*,/,%): ");
            char c = sc.next().charAt(0);
            double result ;

            calculator.push(n2);
            calculator.push(n1);
            calculator.push(c);
            switch (c) {
                case '+':
                    result = n1+n2;
                    break;
                case '-':
                    result = n1-n2;

                    break;
                case '*':
                    result = n1*n2;

                    break;
                case '/':
                    if(n2==0){
                        throw new ArithmeticException("Can't divide by zero");
                    }
                    result = n1/n2;

                    break;
                case '%':
                    result = n1%n2;
                    break;

                default:
                    System.out.println("Invalid operator: " + c);
                    continue;
            }
            System.out.println(result);
            System.out.println(calculator);
            calculator.push(result);
            System.out.println("After pushing results: "+calculator);
            System.out.println("popped element: "+calculator.pop());
            System.out.println("After popping element: "+calculator);
            System.out.println("Element at the top: "+calculator.peek());



        }


    }


}



