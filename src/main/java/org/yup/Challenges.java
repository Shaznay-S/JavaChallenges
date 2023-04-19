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

        //return the subtraction of number 1 and number 2 together
        System.out.print("Result: ");
        return number1 - number2;

    }

    public int multiplyTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        //ask the user for number 1
        System.out.print("Enter number to multiply: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter number to multiply: ");
        int number2 = theScanner.nextInt();

        //return the multiplication of number 1 and number 2 together
        System.out.print("Result: ");
        return number1 * number2;

    }

    public int interactiveCalculator() {

        //fire up the scanner so we can use it below
        Scanner theScanner = new Scanner(System.in);

        //displays some set of choices to the user
        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER: ");

        //this sits and waits for the user to give (1,2,3). When they hit enter their
        //selection is stored in user Selection
        int userSelection = theScanner.nextInt();

        //creating a variable to store the result of the math
        int result;

        //this shows a switch statement, figure out what to do based on user selection
        switch (userSelection) {
            case 1:
                //in the case they choose 1, this will run
                System.out.println("The user chose to add");
                result = this.addTwoNumbers();
                break;
            case 2:
                //in the case they choose 2, this will run
                System.out.println("The user chose to subtract");
                result = this.subtractTwoNumbers();
                break;
            case 3:
                //in the case they choose 3, this will run
                System.out.println("The user chose to multiply");
                result = this.multiplyTwoNumbers();
                break;
            default:
                System.out.println("Input does not exist: not found");
                result = 404;

        }

        //hand back the result of the above math from whichever case the user chose
        return result;

    }

    public String coinFlip() {

        //attempt to flip a coin
        //return heads or tails

        //this is where we flip the coin
        if (Math.random() > .5) {
            //here is where we return heads if the number generates was > .5
            return "Heads";

        } else {
            //here is where we return if the number generated was less than .5
            return "Tails";

        }

    }

    public String findTheBiggestNumber() {

        //The Scanner lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        //This is where we ask the user for input
        System.out.print("Give me the first number please: ");
        //This is where we capture that input and store it in a variable called firstNumber
        int firstNumber = theScanner.nextInt();

        System.out.print("Give me the second number please: ");
        //This is where we capture that input and store it in a variable called secondNumber
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + theBiggestNumber;

    }

    //find the smallest number
    public String findSmallestNumber() {

        //reference the above method to make one that finds the smaller of the two numbers
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Give me the first number please: ");
        int firstNumber = theScanner.nextInt();

        System.out.print("Give me the second number please: ");
        int secondNumber = theScanner.nextInt();

        int theSmallestNumber = Math.min(firstNumber, secondNumber);

        return "The smallest number between " + firstNumber + " and " + secondNumber + " is: " + theSmallestNumber;


    }

    //find the difference(not subtracting) between two numbers
    public String findTheDifferenceBetweenTwoNumbers() {

        //Math.abs()
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Give me the first number to subtract: ");
        int firstNumber = theScanner.nextInt();

        System.out.print("Give me the second number to subtract: ");
        int secondNumber = theScanner.nextInt();

        int theDifference = Math.abs(firstNumber - secondNumber);

        return "The difference between " + firstNumber + " and " + secondNumber + " is " + theDifference;

    }

    public String convertToUppercase() {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + " and we converted to: " + theWord.toUpperCase();

    }

    //covertoToLowercase below

    public String convertToLowercase() {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to convert to all lowercase: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + " and we converted to: " + theWord.toLowerCase();

    }

    //lengthOfWord
    public String lengthOfWord() {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to figure out the length of the word: ");
        String theWord = theScanner.nextLine();

        return "You provided " + theWord + " and the length is: " + theWord.length();

    }

    public void countToTen() {

        for (int i = 1; i <= 10; i++) {
            //run some code
            System.out.println(i);

        }

    }
    //make a method that counts from 10 to 1
    public void countToOne() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

        }


    }
    //make a method that counts from 1 to 100 but in increments of 2
    public void countToOneHundred() {

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);

        }

    }
    //make a method that counts from 0 to 50 but only prints even numbers
    public void countToFifty() {

        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);

        }

    }
}

