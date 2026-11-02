/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MethodsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Task 1: greetUser()
        greetUser();
        
        //Task 2: Arithmetic Methods
        System.out.print("Enter the first number: ");
        int firstNum1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum1 = input.nextInt();
        int sum = add(firstNum1, secondNum1);
        System.out.println("Addition: " + sum);
        int difference = subtract(firstNum1, secondNum1);
        System.out.println("Subtraction: " + difference);
        int product = multiply(firstNum1, secondNum1);
        System.out.println("Multiplication: " + product);
        if (secondNum1 == 0) {
            System.out.println("Division: Invalid value due to division by zero.");
        } else {
            double quotient = divide(firstNum1, secondNum1);
            System.out.println("Division: " + quotient);
        }
        
        //Task 3: factorialInt()
        System.out.print("Enter a number for factorial: ");
        int f = input.nextInt();
        int facto = factorial(f);
        if (facto < 0) {
            System.out.println("Invalid value.");
        } else {
            System.out.println("Factorial: " + facto);
        }
        
        //Task 4: sumArray(int[])
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        int total = sumArray(numbers);
        System.out.println("Sum of array elements: " + total);
        
        //Task 5: isPrime(int)
        System.out.print("Enter a number to check prime: ");
        int p = input.nextInt();
        if (isPrime(p)) {
            System.out.println(p + " is prime.");
        } else {
            System.out.println(p + " is not prime.");
        }
        
        //Additional - Task 6: maxInArray(int[])
        System.out.print("Enter the number of values: ");
        int x = input.nextInt();
        if (x <= 0) {
            System.out.println("Invalid value.");
        } else {
            int[] set = new int[x];
            System.out.println("Enter " + x + " values:");
            for (int i = 0; i < x; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                set[i] = input.nextInt();
            }
            System.out.println("Maximum number in array: " + maxInArray(set));
        }
        
        //Additional - Task 7: gcd(int, int) and lcm(int, int)
        System.out.print("Enter the first number: ");
        int firstNum2 = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum2 = input.nextInt();
        System.out.println("GCD: " + gcd(firstNum2, secondNum2));
        System.out.println("LCM: " + lcm(firstNum2, secondNum2));
        
        //Challenge 1: Recursive Factorial
        System.out.print("Enter a number for factorial: ");
        int rFa = input.nextInt();
        if (rFa < 0) {
            System.out.println("Invalid value.");
        } else {
            System.out.println("Factorial: " + recursiveFactorial(rFa));
        }
        
        //Challenge 2: Recursive Fibonacci
        System.out.print("Enter a number for n-th Fibonacci: ");
        int rFi = input.nextInt();
        if (rFi < 0) {
            System.out.println("Invalid value.");
        } else {
            System.out.println("The Fibonacci term at index " + rFi + ": " + recursiveFibonacci(rFi));
        }
        
        //Challenge 3: isPalindrome(String)
        System.out.print("Enter a word for palindrome verifier: ");
        String iP = input.next();
        if (isPalindrome(iP)) {
            System.out.println("\"" + iP + "\" -> true.");
        } else {
            System.out.println("\"" + iP + "\" -> false.");
        }
    input.close();
    }
    
    
    
    //Task 1 method
    static void greetUser(){
        System.out.println("Hello, welcome to the Math Program!");
    }
    
    //Task 2 method
    static int add(int x, int y){
        return x + y;
        }
    static int subtract(int x, int y){
        return x - y;
        }
    static int multiply(int x, int y){
        return x * y;
        }
    static double divide(double x, double y){
        return x / y;
        }
    
    //Task 3 method
    static int factorial(int x){
        int y = 1;
        int facto = 1;
        if (x < 0) {
            return -1;
        } else {
            do {
                facto = facto * y;
                y++;
            } while (y <= x);
            return facto;
        } 
    }
    
    //Task 4 method
    static int sumArray(int[] suA) {
        int sum = 0;
        for (int i = 0; i < suA.length; i++) {
            sum += suA[i];
        }
        return sum;
    }
    
    //Task 5 method
    static boolean isPrime(int x){
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //Additional - Task 6 method
    static int maxInArray(int[] mIA){
        int max = mIA[0];
        for (int i = 1; i < mIA.length; i++) {
            if (mIA[i] > max) {
                max = mIA[i];
            }
        }
        return max;
    }
    
    //Additional - Task 7 method
    static int gcd(int a, int b){
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }
    
    //Challenge 1 method
    static int recursiveFactorial(int x) {
        if (x <= 1) {
            return 1;
        }
        int facto = x * recursiveFactorial(x-1);
        return facto;
    }
    
    //Challenge 2 method
    static int recursiveFibonacci(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return recursiveFibonacci(x - 1) + recursiveFibonacci(x - 2);
    }
    
    //Challenge 3 method
    static boolean isPalindrome(String text) {
        if (text == null) return false;
        
        String cleanText = text.toLowerCase();
        
        int left = 0;
        int right = cleanText.length() - 1;
        
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}