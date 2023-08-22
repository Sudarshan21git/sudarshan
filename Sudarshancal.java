interface Addition {
    double add(double a, double b);
}

interface Subtraction {
    double subtract(double a, double b);
}

interface Multiplication {
    double multiply(double a, double b);
}

interface Division {
    double divide(double a, double b);
}

class Calculator implements Addition, Subtraction, Multiplication, Division {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}

public class Sudarshancal {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 21;
        double num2 = 12;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
