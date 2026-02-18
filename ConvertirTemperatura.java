import java.util.Scanner;
public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quantes vegades vols convertir la temperaura");
        // System.out.println("How many times do you want to convert the temperature?");
        byte contador=teclat.nextByte();
        byte vegades=0;
        while (vegades!=contador) {
        System.out.println("Entra una temperatura en Farenheit amb decimals: ");
        // System.out.println("Enter a temperature in Fahrenheit with decimals: ");
        double temperatureF=teclat.nextDouble();
        
        // convertir temp graus Fahrenheit i els converteixi en graus Celcius.
        double TemperatureC = ((temperatureF -32)*5)/9;
        String resultat = String.format("%.2f", TemperatureC);
        System.out.println("La temperatura en graus celcius: " + resultat + "ºC.");
        // System.out.println("The temperature in degrees Celsius: " + resultat + "ºC.");
        vegades++; 
        
        }
    }
}