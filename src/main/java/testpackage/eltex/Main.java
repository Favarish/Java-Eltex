package testpackage.eltex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        String operation;

        String temp = scanner.nextLine();
        String[] tempString = temp.split(" ");

        a = Integer.parseInt(tempString[0]);
        operation = tempString[1];
        b = Integer.parseInt(tempString[2]);

        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
        }
    }
}
