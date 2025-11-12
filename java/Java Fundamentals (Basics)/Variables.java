public class Variables {

    public static void main(String[] args) {

        /*
        Definition:
        A variable is a named memory location that holds the data value of a particular data type.
        It acts as a container that stores data during program execution.

        Variables are also called symbolic variables because they are named.
        Each variable has:
        - A specific data type
        - A name (identifier)
        - A memory location
        ------------------------------------------------------------
        Key Points:
        ------------------------------------------------------------
        - Variables must be declared before use.
        - The value of a variable can change during program execution.
        - Each variable has a specific data type that determines its range and memory.
        - Variables can store text, numbers, codes, or temporary results.

        Example:
        int country_code;

        ------------------------------------------------------------
        Declaration Syntax:
        ------------------------------------------------------------
        dataType variableName;

        Example:
        double payRate;

        We can declare multiple variables of the same type in one line:
        double salary, wage, portNumber;

        ------------------------------------------------------------
        Naming Rules for Variables:
        ------------------------------------------------------------
        1. Cannot contain spaces → ❌ long dist ance = 1000;
        2. Can begin with $ or _
        3. Cannot begin with a digit
        4. Should begin with a lowercase letter (camelCase for multi-word names)
           ✅ int salaryPerDay;
        5. Cannot use reserved keywords (like int, class, for, etc.)
        6. Variable names are case-sensitive

        ------------------------------------------------------------
        Initialization:
        ------------------------------------------------------------
        Assign a value to a variable using:
        variableName = value;

        Or declare and initialize in one line:
        dataType variableName = value;

        Example:
        double area = 378.87;

        ------------------------------------------------------------
        Example Code: Variable Declaration & Operations
        ------------------------------------------------------------
        */
    }
}

// Example class demonstrating variable declaration and initialization
class VariableTutorial {
    public static void main(String args[]) {

        // Declaring and initializing variables
        long hoursWorked = 50;
        double payRate = 40.0, taxRate = 0.10, taxPayable;

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Payment Amount: " + (hoursWorked * payRate));

        taxPayable = hoursWorked * payRate * taxRate;
        System.out.println("Tax Payable: " + taxPayable);
    }
}

/*
Output:
Hours Worked: 50
Payment Amount: 2000.0
Tax Payable: 200.0
------------------------------------------------------------
Default Values of Variables (Class or Instance)
------------------------------------------------------------
Type        Default Value
byte        0
short       0
int         0
long        0L
float       0.0F
double      0.0D
char        '\u0000'
boolean     false
Reference   null
------------------------------------------------------------
*/

// Demonstrating default values of data types
class DefaultValues {

    // Primitive data types
    byte byteNum;
    short shortNum;
    int intNum;
    long longNum;
    float floatNum;
    double doubleNum;
    char charValue;
    boolean flag;

    // Reference types
    String mySentence;
    DefaultValues object1;

    public void getDefaultValues() {
        System.out.println("The Default value of byte is: " + byteNum);
        System.out.println("The Default value of short is: " + shortNum);
        System.out.println("The Default value of int is: " + intNum);
        System.out.println("The Default value of long is: " + longNum);
        System.out.println("The Default value of float is: " + floatNum);
        System.out.println("The Default value of double is: " + doubleNum);
        System.out.println("The Default value of char is: " + charValue);
        System.out.println("The Default value of boolean is: " + flag);
        System.out.println("The Default value of String is: " + mySentence);
        System.out.println("The Default value of Object is: " + object1);
    }

    public static void main(String args[]) {
        DefaultValues object = new DefaultValues();
        object.getDefaultValues();
    }
}

/*
------------------------------------------------------------
Types of Variables in Java
------------------------------------------------------------
1. Local Variables
2. Instance Variables
3. Static (Class) Variables
------------------------------------------------------------
*/

// 1️⃣ Local Variables Example
class EmployeeSalary {
    public void getSalary() {
        long salary;
        int workingDaysInAMonth = 25, salaryPerDay = 1000;
        salary = workingDaysInAMonth * salaryPerDay;
        System.out.println("Salary of the Employee is: " + salary);
    }

    public static void main(String args[]) {
        EmployeeSalary employee = new EmployeeSalary();
        employee.getSalary();
    }
}

/*
Local Variables:
- Declared inside a method, block, or constructor.
- Exist only within that block.
- Must be initialized before use.
- Cannot be static.
*/

// 2️⃣ Instance Variables Example
class AreaOfShapes {

    // Instance variables
    double breadth;
    double length;
    double areaOfRectangle;

    public static void main(String args[]) {

        // Object 1
        AreaOfShapes area1 = new AreaOfShapes();
        area1.length = 50;
        area1.breadth = 25;
        area1.areaOfRectangle = area1.length * area1.breadth;

        System.out.println("Details from the first object-");
        System.out.println("Length: " + area1.length);
        System.out.println("Breadth: " + area1.breadth);
        System.out.println("Area: " + area1.areaOfRectangle);

        // Object 2
        AreaOfShapes area2 = new AreaOfShapes();
        area2.length = 75.5;
        area2.breadth = 68;
        area2.areaOfRectangle = area2.length * area2.breadth;

        System.out.println("\nDetails from the second object-");
        System.out.println("Length: " + area2.length);
        System.out.println("Breadth: " + area2.breadth);
        System.out.println("Area: " + area2.areaOfRectangle);
    }
}

/*
Instance Variables:
- Declared inside a class but outside any method.
- Each object has its own copy.
- Stored in heap memory.
- Can have access modifiers.
*/

// 3️⃣ Static Variables Example
class Student {
    public static int marks;
    public static String studentName = "John";

    public static void main(String args[]) {
        Student.marks = 80;
        System.out.println("The marks of student " + Student.studentName + " are: " + Student.marks);

        // Creating 3 objects
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.println(student1.studentName);
        System.out.println(student2.studentName);
        System.out.println(student3.studentName);

        System.out.println(marks);

        // Changing value via one object
        student1.studentName = "Sam";

        // Reflected in all objects
        System.out.println(student1.studentName);
        System.out.println(student2.studentName);
        System.out.println(student3.studentName);
    }
}

/*
Output:
The marks of student John are: 80
John
John
John
80
Sam
Sam
Sam
*/
