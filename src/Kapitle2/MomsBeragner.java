package Kapitle2;

import java.util.Scanner;

public class MomsBeragner {
    public static void main(String[] args) {
        PlusMoms();
        }

    public static void PlusMoms(){

        Scanner input = new Scanner(System.in);

        System.out.println("Intast Beløb ");
        double KoebSum = input.nextDouble();

        double Moms = KoebSum * 0.25;
        System.out.println("salg Moms er DKK " + (int)(Moms * 100)/100.0);

    }

}
