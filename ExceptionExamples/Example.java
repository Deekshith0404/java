package com.xworks.ExceptionExamples;


    public class Example {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 0};

            for (int i = 0; i < numbers.length; i++) {
                try {
                    // Attempt to divide by the current number
                    int result = 10 / numbers[i];
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    // Handle the exception if an arithmetic error occurs (e.g., division by zero)
                    System.out.println("Error: Cannot divide by zero.");
                } finally {
                    // Always executes, whether an exception was thrown or not
                    System.out.println("This is the finally block. It always executes.");
                }
            }
        }
    }


