package com.company;

import com.company.ChemicalElement;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ChemicalElement c1 = new ChemicalElement("Oxygen", "O", 8);
        ChemicalElement c2 = new ChemicalElement("Hydrogen", "H", 1);
        ChemicalElement c3 = new ChemicalElement("Zinc", "Zn", 30);

        System.out.println("Element Name: " + c1.getName() +
                "\nElement Symbol: " + c1.getSymbolic_name() +
                "\nAtomic Number: " + c1.getAtomic_number());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new element name: ");
        String name = sc.nextLine();
        System.out.print("Enter " + name +"'s symbol: ");
        String symbol = sc.nextLine();
        System.out.print("Enter " + name +"'s atomic number: ");
        int number = sc.nextInt();

        ChemicalElement c4 = new ChemicalElement(name, symbol, number);

        System.out.println("Element Name: " + c4.getName() +
                "\nElement Symbol: " + c4.getSymbolic_name() +
                "\nAtomic Number: " + c4.getAtomic_number());

    }
}
