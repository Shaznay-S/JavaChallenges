package org.yup;

import java.util.Scanner;
public class Challenges {

    public String greeting(String name, int age) {

        if (age >= 21) {
            //this is what happens if the condition is true
            return "Hello " + name + ", welcome to the party";
        } else {
            //this is what happens if the condition is false
            return "Hello " + name + ", I am sorry but we cannot let you into the party";
        }

    }


    public String greetingWithUserInput() {

        Scanner theScanner = new Scanner(System.in);

        //we need to ask the user what their name is
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //we need to ask the user what their age is
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        if (age >= 21) {
            //this is what happens if the condition is true
            return "Hello " + name + ", welcome to the party";
        } else {
            //this is what happens if the condition is false
            return "Hello " + name + ", I am sorry but we cannot let you into the party";
        }


    }

    public int addTwoNumbers() {

        Scanner theScanner = new Scanner(System.in);

        //ask the user for number 1
        System.out.print("Enter a number to add: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter a number to add: ");
        int number2 = theScanner.nextInt();

        //return the sum of number 1 and number 2 together
        System.out.print("Result: ");
        return number1 + number2;

    }

    //create a method like the above for subtractTwoNumbers and multiply 2 numbers
    public int subtractTwoNumbers() {

        Scanner theScanner = new Scanner(System.in);

        //ask the user for number 1
        System.out.print("Enter a number to subtract: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter number to subtract: ");
        int number2 = theScanner.nextInt();

        //return the minus of number 1 and number 2 together
        System.out.print("Result: ");
        return number1 - number2;

    }

    public int multiplyTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);

        //ask the user for number 1
        System.out.print("Enter number to multiply: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter number to multiply: ");
        int number2 = theScanner.nextInt();

        //return the minus of number 1 and number 2 together
        System.out.print("Result: ");
        return number1 * number2;

    }

}
