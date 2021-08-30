/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String Str1="";
        String Str2="";
        Scanner input= new Scanner(System.in);
        System.out.print("What is the quote? ");
        Str1=input.nextLine();
        System.out.print("Who said it? ");
        Str2=input.nextLine();
        System.out.println(Str2+" says, \""+Str1+"\"");
    }
}