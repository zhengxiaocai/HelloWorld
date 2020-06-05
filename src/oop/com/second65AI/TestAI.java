package oop.com.second65AI;

import java.util.Scanner;

public class TestAI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AI ai = new AI();

        while (true){

            String question = scanner.nextLine();

            if ("stop".equals(question)){
                System.out.println("再见！");
                break;
            }

            String answser = ai.answer(question);
            System.out.println(answser);
        }
    }
}
