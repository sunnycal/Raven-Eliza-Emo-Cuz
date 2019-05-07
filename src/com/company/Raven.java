package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Raven {

    public static void main(String[] args) {

        // write your code here
        int poscount = 0;
        int negcount = 0;

        int x = 0;



        String text = "";
        Scanner input = new Scanner(System.in);


        String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

        String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

        boolean loopValidate = true;

        while (loopValidate==true) {
            System.out.println("Good morning, how are you feeling today?");
            text = input.nextLine();
//
//                if (text.equals("Q")) {
//                    loopValidate = false;
//                } else {

            for (String a : text.split(" " )) {
                for (String p : positive) {
                    System.out.println("Really! Why, tell me more!");

                }
                for (String n : negative) {
                    if (text.equals(n)) {
                        System.out.println("Really! Why, tell me more!");


                    }
                }
            }


//                else if (text.equals("bad" + "sad" + "tired" + "angry" + "anxious" + "hungry" + "moody" + "afraid")){
//                    System.out.println("Really! Why, tell me more!");
//                } else if (text == "good" + "glad" + "happy" + "relaxed" + "accomplished" + "alert" + "creative") {
//                    System.out.println("I am so happy for you...Yay..");
//                }
//            }while (x < 3);
//                System.out.println("Good morning, how are you feeling today?");
//                text = input.nextLine();



            //a. print out statement for Raven asking user how they are feeling
            //b. pre-program feeling/emo words
            //c. make Java scan replies for sets of emo words
            //d. store feeling words in arry or arraylist
            //e. if more positive words than negative words, program Ravel to respond with "I am so happy for you..Yay.."
            //1. enter number of positive and number of negative words
            //2. count number of positve and negative words
            //3. compare if positive and negative words cancel each other
            //4. if the number of positive and negative words cancel each other out, program a response such as : "Meh"
            //5. allow user to enter conversational text
            //6. when user wants to quit allow user to enter Q to quit
            //7. display a chat history after user types Q
            //8. place chat history in OOP

            //

            for (String p : positive) {
                System.out.println(p);
            }


        }


    }


//        ArrayList<Positive> positive = new ArrayList<Positive>();
//        ArrayList<Good> good = new ArrayList<Good>();
//        ArrayList<Glad> glad = new ArrayList<Glad>();
//        ArrayList<Happy>happy = new ArrayList<Happy>();
//        ArrayList<Relaxed>relaxed = new ArrayList<Relaxed>();
//        ArrayList<Accomplished>accomplished = new ArrayList<Accomplished>();
//        ArrayList<Alert>alert = new ArrayList<Alert>();
//        ArrayList<Creative>creative = new ArrayList<Creative>();
//
//        String s1 = "Positive";
//        String s2 = "Good";
//        String s3 = "Glad";
//        String s4 = "Happy";
//        String s5 = "Relaxed";
//        String s6 = "Accomplished";
//
//        ArrayList<Negative> negative = new ArrayList<Negative>();
//        ArrayList<Bad> bad = new ArrayList<Bad>();
//        ArrayList<Sad> sad = new ArrayList<Sad>();
//        ArrayList<Tired>tired = new ArrayList<Tired>();
//        ArrayList<Antry>angry = new ArrayList<Angry>();
//        ArrayList<Anxious>anxious = new ArrayList<Anxious>();
//        ArrayList<Hungry>hungry = new ArrayList<Hungry>();
//        ArrayList<Moody>moody = new ArrayList<Moody>();
//        ArrayList<Afraid>afraid = new ArrayList<Afraid>();
//
//        ArrayList.addAll();


}

    public Raven() {
    }
}
