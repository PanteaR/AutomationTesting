package tipuriDeDate;
import java.util.Scanner;
public class ConvertireTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu temperatura: ");
        double temperaturaF = scanner.nextDouble();
        double temperaturaC = calculCelsius(temperaturaF);
        System.out.println("Afiseaza temperatura in grade Celsius: " + temperaturaC);
    }

    public static double calculCelsius(double temperaturaF) {
        return (temperaturaF - 32) * 5 / 9;
    }
}