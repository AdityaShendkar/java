public class Literals {

    public static void main(String[] args) {
	

		/*
		Literals are data items that have fixed or constant values.
		Therefore, literals are also known as constants in Java.

		Literals can represent numeric, character, boolean, or string values.
		We can assign literals to any of the 8 primitive data types in Java.

		Example:
		int number = 20;   // Here, 20 is a literal.

		Note: We cannot change the value of a literal during program execution.
		*/

		// ------------------------------------------------------------
		// 🧩 Types of Java Literals
		// ------------------------------------------------------------
		/*
		1. Integer Literals
		2. Floating Literals
		3. Boolean Literals
		4. Character Literals
		5. String Literals
		6. Null Literal
		*/

		// ------------------------------------------------------------
		// 1️⃣ Integer Literals
		// ------------------------------------------------------------
		/*
		Integer literals are whole numbers without any fractional part.
		They can be positive, negative, or unsigned, and cannot include commas.

		Rules:
		- Must contain at least one digit.
		- Must not contain a decimal point.
		- May have + or - sign.
		- No commas allowed.
		*/


		public class IntegerLiterals {
		    public static void main(String[] args) {
		        int decimalLiteral = 561;       // Decimal literal (base 10)
		        int octalLiteral = 01204;       // Octal literal (base 8, starts with 0)
		        int hexaDecimalLiteral = 0x1BfA; // Hexadecimal literal (base 16, starts with 0x or 0X)

		        System.out.println("The value of Decimal literal is: " + decimalLiteral);
		        System.out.println("The value of Octal literal is: " + octalLiteral);
		        System.out.println("The value of Hexa-decimal literal is: " + hexaDecimalLiteral);
		    }
		}

		/*
		Output:
		The value of Decimal literal is: 561
		The value of Octal literal is: 644
		The value of Hexa-decimal literal is: 7162
		*/

		// ------------------------------------------------------------
		// 2️⃣ Floating Literals
		// ------------------------------------------------------------
		/*
		Floating literals (real literals) have fractional parts or decimal points.
		They can be written in:
		1. Fractional form (e.g., 12.34)
		2. Exponential form (e.g., 1.23E4)

		Rules:
		- Must have at least one digit before and after the decimal point.
		- Can be positive or negative.
		- No commas or multiple decimals allowed.
		- By default, floating literals are of type double.
		  To use float, add suffix 'f' or 'F'.
		*/


		public class FloatingPointLiteral {
		    public static void main(String args[]) {
		        double floatingLiteral1 = 987.678;   // Fractional literal
		        double floatingLiteral2 = 89.0987;   // Another fractional literal
		        double floatingLiteral3 = 1.234e20;  // Exponential literal

		        System.out.println("The floating literal in fractional form is: " + floatingLiteral1);
		        System.out.println("The floating literal in fractional form is: " + floatingLiteral2);
		        System.out.println("The floating literal in exponential form is: " + floatingLiteral3);
		    }
		}

		/*
		Output:
		The floating literal in fractional form is: 987.678
		The floating literal in fractional form is: 89.0987
		The floating literal in exponential form is: 1.234E20
		*/

		// ------------------------------------------------------------
		// 3️⃣ Boolean Literals
		// ------------------------------------------------------------
		/*
		Boolean literals can have only two values: true or false.
		They are used for conditions or flags.
		*/


		public class BooleanLiterals {
		    public static void main(String args[]) {
		        boolean b1 = false;
		        int x = 20;

		        if (x % 2 == 0) {
		            b1 = true;
		            System.out.println("The result for the if condition is: " + b1);
		            System.out.println("The number is even");
		        } else {
		            b1 = false;
		            System.out.println("The result for the if condition is: " + b1);
		            System.out.println("The number is odd");
		        }
		    }
		}

		/*
		Output:
		The result for the if condition is: true
		The number is even
		*/

		// ------------------------------------------------------------
		// 4️⃣ Character Literals
		// ------------------------------------------------------------
		/*
		A character literal represents a single character enclosed in single quotes (' ').

		Example:
		char ch = 'A';

		Java also supports escape sequences for non-printable characters like:
		\t (tab), \n (newline), \\ (backslash), \' (single quote), \" (double quote)

		Unicode representation: '\uxxxx' where xxxx is a 4-digit hexadecimal number.
		*/


		public class CharacterLiteral {
		    public static void main(String[] args) {
		        char character = 'd';
		        char unicodeCharacter = '\u0064'; // Unicode for 'd'

		        System.out.println("Character literal value is: " + character);
		        System.out.println("Value of Unicode character is: " + unicodeCharacter);
		        System.out.println("\" is a symbol");
		    }
		}

		/*
		Output:
		Character literal value is: d
		Value of Unicode character is: d
		" is a symbol
		*/

		// ------------------------------------------------------------
		// 5️⃣ String Literals
		// ------------------------------------------------------------
		/*
		String literals represent sequences of characters enclosed in double quotes (" ").

		Examples:
		String s1 = "Hello";
		String s2 = "Java Programming";
		String s3 = "Rita\'s book"; // escape sequence
		*/


		public class StringLiteral {
		    public static void main(String[] args) {
		        String myString = "Welcome to Tutorials of Java";
		        System.out.println("The String is: " + myString);
		    }
		}

		/*
		Output:
		The String is: Welcome to TechVidvan Tutorials of Java
		*/

		// ------------------------------------------------------------
		// 6️⃣ Null Literal
		// ------------------------------------------------------------
		/*
		The null literal represents the absence of a value or reference.
		It can only be assigned to reference types (objects, arrays, etc.), not primitives.

		Example:
		String name = null;
		Object obj = null;
		*/


		public class NullLiteral {
		    public static void main(String[] args) {
		        String name = null;
		        Object obj = null;

		        System.out.println("Value of name is: " + name);
		        System.out.println("Value of object is: " + obj);
		    }
		}

		/*
		Output:
		Value of name is: null
		Value of object is: null
		*/

	


	}

}
