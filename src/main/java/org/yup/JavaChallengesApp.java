package org.yup;

public class JavaChallengesApp {

    public static void main(String[] args){

        //this code is running greeting

        //create a new instance of the challenges class so we can use the challenges in our application
        Challenges challenges = new Challenges();

        //this runs the greeting method from our challenges and returns a string greeting and
        //stores it in the greeting variable we created

        String greeting = challenges.greeting( "Shaznay", 23 );

        //this prints the greeting to the console
        System.out.println(greeting);

        //code below is running greetingWithUserInput()
        String greetingWithUserInput = challenges.greetingWithUserInput();

        System.out.println(greetingWithUserInput);

        //code below is running addition
        int addTwoNumbers = challenges.addTwoNumbers();

        System.out.println(addTwoNumbers);

        //code below is running subtraction
        int subtractTwoNumbers = challenges.subtractTwoNumbers();

        System.out.println(subtractTwoNumbers);

        //code below is running multiplication
        int multiplyTwoNumbers = challenges.multiplyTwoNumbers();

        System.out.println(multiplyTwoNumbers);

    }
}
