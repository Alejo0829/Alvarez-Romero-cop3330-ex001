package org.example;

import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is your name? " );
        String firstName = input.nextLine();
        String greeting = "Hello, " + firstName + ", nice to meet you!";
        System.out.println(greeting);
    }
}
