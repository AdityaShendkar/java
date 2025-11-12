
public class Data_Types {

    public static void main(String[] args) {

        /*
         * 
         * 
         * What is a Data Type?
         * - Defines the type of data a variable can hold.
         * - Determines memory size, range, and valid operations.
         * - Example: int num = 5; // stores integer only
         * 
         * ------------------------------------------------------------
         * Types of Programming Languages:
         * ------------------------------------------------------------
         * 1. Statically Typed → Data type known at compile-time
         * Examples: Java, C, C++, C#, Scala
         * 
         * 2. Dynamically Typed → Data type decided at run-time
         * Examples: Python, Ruby, PHP
         * 
         * ------------------------------------------------------------
         * Java Data Types
         * ------------------------------------------------------------
         * Java is statically typed and supports two categories:
         * 1️ Primitive Data Types (8 types)
         * 2️ Non-Primitive (Reference) Data Types
         * 
         * ------------------------------------------------------------
         * 1️ Primitive Data Types (8 types)
         * ------------------------------------------------------------
         * byte - 1 byte -128 to 127
         * short - 2 bytes -32,768 to 32,767
         * int - 4 bytes -2^31 to 2^31 - 1
         * long - 8 bytes -2^63 to 2^63 - 1
         * float - 4 bytes ~7 decimal digits (must end with 'f')
         * double - 8 bytes ~15 decimal digits
         * char - 2 bytes Unicode (0–65535)
         * boolean - 1 bit true / false
         * 
         * ------------------------------------------------------------
         * 2️ Non-Primitive (Reference) Data Types
         * ------------------------------------------------------------
         * - Created by programmers.
         * - Store memory address (reference) of actual value.
         * - Can be null and have methods.
         * 
         * Includes:
         * - String
         * - Array
         * - Class & Object
         * - Interface
         * 
         * ------------------------------------------------------------
         * Quick Summary
         * ------------------------------------------------------------
         * Primitive Types: byte, short, int, long, float, double, char, boolean
         * Non-Primitive Types: String, Array, Class/Object, Interface
         * 
         * 
         */

        // Primitive Data Types
        byte byteVal = 10;
        short shortVal = 3000;
        int intVal = 50000;
        long longVal = 100000L;
        float floatVal = 3.14f;
        double doubleVal = 99.99;
        char charVal = 'A';
        boolean boolVal = true;

        // Non-Primitive Data Types
        String name = "Hello World";
        int[] numbers = { 10, 20, 30, 40 };

        // Output
        System.out.println("----------- Primitive Data Types -----------");
        System.out.println("byte value: " + byteVal);
        System.out.println("short value: " + shortVal);
        System.out.println("int value: " + intVal);
        System.out.println("long value: " + longVal);
        System.out.println("float value: " + floatVal);
        System.out.println("double value: " + doubleVal);
        System.out.println("char value: " + charVal);
        System.out.println("boolean value: " + boolVal);

        System.out.println("\n----------- Non-Primitive Data Types -----------");
        System.out.println("String value: " + name);

        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

}
