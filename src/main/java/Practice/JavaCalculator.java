package Practice;

import java.util.Scanner;

public class JavaCalculator {

    public static void main(String[] args) {

        String yn;
        do {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter Number 1 : ");
            int n1 = s.nextInt();
            System.out.println("Enter Number 2 : ");
            int n2 = s.nextInt();
            System.out.println("Select symbol (+-*/)");
            String sym = s.nextLine();
            switch (sym) {
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "-":
                    System.out.println(n2 - n1);
                    break;
                case "*":
                    System.out.println(n1 * n2);
                    break;
                case "/":
                    System.out.println(n2 / n1);
                    break;
                default:
                    System.out.println("Wrong Symbol entered");

            }
            System.out.println("Do you want to continue press y if yed otherwise anything");
            yn = s.nextLine();

        } while (yn == "y" || yn == "Y");

    }

}
