package com.company;

import sun.plugin2.message.Conversation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private static ArrayList<String> conversation = new ArrayList<>();

    public static void main(String[] args) {
        int response_counter=0;
        Scanner scan = new Scanner(System.in);

        Raven r1 = new Raven();
        Invoice i1 = new Invoice();

        int question_counter=0;
        int session_counter=0;

        String[] str;
//        ArrayList<String>conversation = new ArrayList<>();
//        for (int x=0; x < conversation.size(); x++){
//            conversation.add();
//        }
        System.out.println("Please enter your personal contact information");
        System.out.println("NAME:");
        i1.setName(scan.nextLine());
        System.out.println("please enter your house number and street name: ");
        i1.setAddress_line_1(scan.nextLine());
        System.out.println("please enter your city, state, and zip code: ");
        i1.setAddress_line_2(scan.nextLine());
        System.out.println("Good morning, how are you today?");

        boolean quit = false;
//        int positiveCounter = 0;
//        int negativeCounter = 0;
//        String positiveResponse = "I'm so happy for you... Yay...";
//        String negativeResponse = "Really! Why, tell me more!";
//        String neutralResponse = "Mey!";

        while (!quit) {
            System.out.println("Please enter your response or Q to quit:");
            String response = scan.nextLine();
//            conversation.add(response);
//            System.out.println(conversation);

            str = response.split(" ");

            if (response.equalsIgnoreCase("Q")) {
                quit = true;
                System.out.println("Good buy!");
            } else {
//                r1.getResponse(str);
                System.out.println(r1.getResponse(str));
                question_counter++;
                session_counter=1;
//                for (int i = 0; i < str.length; i++) {
//                    if ((str[i].equalsIgnoreCase("good")) || (str[i].equalsIgnoreCase("glad")) ||
//                            str[i].equalsIgnoreCase("happy") || (str[i].equalsIgnoreCase("relaxed")
//                            || str[i].equalsIgnoreCase("accomplished") || (str[i].equalsIgnoreCase("alert")
//                            || str[i].equalsIgnoreCase("creative"))))
//
//                        positiveCounter++;
//
//                    else if ((str[i].equalsIgnoreCase("bad") || (str[i].equalsIgnoreCase("sad")) ||
//                            str[i].equalsIgnoreCase("tired") || (str[i].equalsIgnoreCase("angry")
//                            || str[i].equalsIgnoreCase("anxious") || (str[i].equalsIgnoreCase("hungry"))
//                            || str[i].equalsIgnoreCase("moody") || (str[i].equalsIgnoreCase("afraid")))))
//
//                        negativeCounter++;
//                }
//                if (positiveCounter > negativeCounter) {
//                    System.out.println(positiveResponse);
//                    conversation.add(positiveResponse);
//                } else if (negativeCounter > positiveCounter) {
//                    System.out.println(negativeResponse);
//                    conversation.add(negativeResponse);
//                } else if
//                        (negativeCounter == positiveCounter) {
//                    System.out.println(neutralResponse);
//                    conversation.add(neutralResponse);
//                }
//            }
//        }
//                System.out.println(conversation);
            }

        }

        i1.getDescription(question_counter, session_counter);

    }
}