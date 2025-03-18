class Calculator {

 
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

   
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
       
        System.out.println("Addition of 3 and 5 (int): " + calc.add(3, 5));
        System.out.println("Addition of 3.5 and 5.2 (double): " + calc.add(3.5, 5.2));
        System.out.println("Addition of 1, 2, and 3 (int): " + calc.add(1, 2, 3));
      
        System.out.println("Subtraction of 10 and 5 (int): " + calc.subtract(10, 5));
        System.out.println("Subtraction of 10.5 and 5.2 (double): " + calc.subtract(10.5, 5.2));
        
        
        System.out.println("Multiplication of 3 and 4 (int): " + calc.multiply(3, 4));
        System.out.println("Multiplication of 3.5 and 4.2 (double): " + calc.multiply(3.5, 4.2));
        
        System.out.println("Division of 10 by 2 (int): " + calc.divide(10, 2));
        System.out.println("Division of 10.0 by 2.0 (double): " + calc.divide(10.0, 2.0));
    }
}

