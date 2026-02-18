import java.util.Scanner;

public class Bucle {

    public static void main(String[] args) throws InterruptedException{
        Scanner teclat = new Scanner(System.in);
        int numero=2;
        System.out.println("Fins a quin numero vols la sequencia?");
        // System.out.println("Up to what number do you want the sequence?");
        short num=teclat.nextShort();
        while (num >= numero) {
            System.out.print(numero + ",");
            numero=numero+3;
            
        }
}
}