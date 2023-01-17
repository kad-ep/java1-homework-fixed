import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 =  getInput("Input first number: ");
        String s2 =  getInput("Input second number: ");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println(num1 + " + " + num2 + " = " + addNumbers(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + substractNumbers(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplyNumbers(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + divideNumbers(num1,num2));
        System.out.println(num1 + " mod " + num2 + " = " + divideNumbers(num1,num2));

    }

    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static int addNumbers(int d1, int d2){
        return d1 + d2;
    }

    private static int substractNumbers(int d1, int d2){
        return d1 - d2;
    }

    private static int multiplyNumbers(int d1, int d2){
        return d1 * d2;
    }

    private static int divideNumbers(int d1, int d2){
        return d1 / d2;
    }
    private static int mod(int d1, int d2){
        return d1 % d2;
    }
}