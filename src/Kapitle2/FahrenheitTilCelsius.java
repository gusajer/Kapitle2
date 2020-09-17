package Kapitle2;

    import java.util.Scanner;

public class FahrenheitTilCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv grader i Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        PlusTemp(fahrenheit);
    }
    public static void PlusTemp(double fahrenheit){

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");
    }

}
