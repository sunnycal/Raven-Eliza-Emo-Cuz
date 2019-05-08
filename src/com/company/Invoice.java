package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Invoice {

//    public  {
//
//        Scanner input = new Scanner(System.in);
//
//
//
//        System.out.println("Enter First Number: ");
//
//        firstNumber = input.nextInt();
//        System.out.println("Enter Second Number: ");
//        secondNumber = input.nextInt();
//
//        sum = firstNumber + secondNumber;
//
//        System.out.println("Sum of the two numbers is: " + sum);
//
//    }
    private String name;
    private String addressee;
    private String address_line_1;
    private String address_line_2;
    private String items;
    private int quantity;
    private double session_price;
    private double session_total;
    private double question_price;
    private int questions_asked;
    private double question_total;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public double getTotal() {
        double firstNumber=100, secondNumber= .35;
        int sum;
        return total;
    }

    private double total;

    public Invoice(){

    }
//    public Invoice(String name, String addressee, String address, String city, String state, String zip_code, String items, int quantity, double total){
//
//        this.name = name;
//        this.addressee = addressee;
//        this.items = items;
//        this.quantity = quantity;
//        this.total = total;
//    }
    public void getDescription(int question_number, int session_number){


        DecimalFormat df = new DecimalFormat("#.00");

        session_price=100.00;
        session_total=session_number * session_price;
        questions_asked=question_number;
        question_price=.35;
        question_total=question_price*question_number;
        double overall_total_due = question_total + session_total;


        System.out.println("\nRaven's invoice");
        System.out.println("\nTo");
        System.out.println(getName());
        System.out.println(getAddress_line_1());
        System.out.println(getAddress_line_2());

        System.out.println("\nitems");
        System.out.println("Quatity | Description | Price | Total" );
        System.out.println("\t" +session_number+ "\t\tSession " + "\t $" + df.format(session_price) + "\t $" + df.format(session_total));
        System.out.println("\t" + questions_asked + "\t questions " + "\t$" + df.format(question_price)+ "\t$"  + df.format(question_total));
        System.out.println("\nOverall Total Due : " + "$"  + df.format(overall_total_due));

        System.out.println("\nThank you for doing buisness with Raven.");
    }

}
