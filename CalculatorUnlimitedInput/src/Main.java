import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("For Exit the program ENTER 'e' ");
            System.out.println("1.+\n2.-\n3.*\n4./\nEnter Operator");
            String input = sc.nextLine();
            if (input.charAt(0) == 'e'){
                break;
            }
            System.out.println("Enter First number");
            float num1 = Float.parseFloat(sc.nextLine());
            System.out.println("Enter Second number");
            float num2 = Float.parseFloat(sc.nextLine());
            float result = 0;
            switch (input){
                case "+":
                    result = num1+num2;
                    break;
                case "-":
                    result = num1-num2;
                    break;
                case "*":
                    result = num1*num2;
                    break;
                case "/":
                    if (num2 != 0){
                            result = num1/num2;
                    }
                    else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid: Operator");
                    continue;
            }
            System.out.println(result);
        }
    }
}