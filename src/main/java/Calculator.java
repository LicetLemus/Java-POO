import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.print("Por favor, ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor, ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Eliga el tipo de operación (+, -, *, /): ");
        String operator = scanner.next();

        double result = 0;

        switch (operator){
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
        }

        System.out.println("El resultado es: " + result);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir por 0");
        }
    }
}