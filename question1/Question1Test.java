package question1;

import java.util.Scanner;

public class Question1Test {
    public static void main(String[] args) {

        Question1 question1 = new Question1();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Input an integer number: ");
            int value = scan.nextInt();

            if (question1.addUserInput(value)) {
                System.out.print("The values of the sequence is: ");
                for (var item : question1.getValues()) {
                    System.out.print("[" + item + "]");
                }
            } else {
                System.out.println();
                break;
            }

        } while (true);

        for (var item : question1.getValues()) {
            System.out.print("[" + item + "]");
        }
        System.out.println("Program halted !");
        scan.close();
    }
}