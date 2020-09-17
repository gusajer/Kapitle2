package Kapitle2;

import java.util.Scanner;

public class HvisTid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Skriv et intenger for sekunder : ");
        int sekunder = input.nextInt();

        int minuter = sekunder / 60; // Find minuter i sekunder
        int ResterendeSekunder = sekunder % 60; // Sekunder resterende
        System.out.println(sekunder + " sekunder er " + minuter +
                " minuter og " + ResterendeSekunder + " sekunder");
    }
}