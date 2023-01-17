import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 =  getInput("Input first number: ");
        String s2 =  getInput("Input second number: ");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println(String.format("Add: %d + %d = %d ", num1, num2, addNumbers(num1,num2)));
        System.out.println(String.format("Subtract: %d - %d = %d ", num1, num2, substractNumbers(num1,num2)));
        System.out.println(String.format("Multiply: %d * %d = %d ", num1, num2, multiplyNumbers(num1,num2)));
        System.out.println(String.format("Divide: %d / %d = %d ", num1, num2, divideNumbers(num1,num2)));
        System.out.println(String.format("Mod: %d mod %d = %d ", num1, num2, mod(num1,num2)));


    }

    private static String getInput(String prompt){
        System.out.println(prompt);
        return new Scanner(System.in).nextLine();
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