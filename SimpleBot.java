package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet() {
        String assistantName = "Tex";
        int birthYear = 2021;
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        byte rem3 = scanner.nextByte();
        byte rem5 = scanner.nextByte();
        byte rem7 = scanner.nextByte();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        byte userChoice = scanner.nextByte();

        for (int i = 0; i < 4; i++) {
            if (userChoice != 2) {
                System.out.println("Please, try again.");
                userChoice = scanner.nextByte();
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}