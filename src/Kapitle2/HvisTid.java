package Kapitle2;

import java.util.Scanner;

public class HvisTid {
    public static void main(String[] args) {

        System.out.print("Skriv et intenger for sekunder : ");
        plustid();
    }
    public static void plustid(){
        Scanner input = new Scanner(System.in);
        int sekunder = input.nextInt();

        int minuter = sekunder / 60;
        int ResterendeSekunder = sekunder % 60;
        System.out.println(sekunder + " sekunder er " + minuter +
                " minuter og " + ResterendeSekunder + " sekunder");
    }
}