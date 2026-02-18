import java.util.Scanner;
public class HoresMinutsSegons {

    public static void main(String[] args) {
        byte vegades=0;
        while (vegades != 4) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Afegeix uns segons: ");
        // System.out.println("Add seconds: ");
        int segons;  // Exemple:   41668;
        segons=teclat.nextInt();
        double hores=segons/3600;
        double residu=segons % 3600;
        double minuts= residu/60;
        double residu_2=segons%60;
        double segons_def=residu_2%60;
        System.out.println("Això son: " + hores + " hores amb " + minuts + " i " + segons_def);
        // System.out.println("This is: " + hores + " hours with " + minuts + " and " + segons_def);
        vegades++;
        }
        
    }
}