import java.util.Random;

public class Moneda {

    public static void main(String[] args) throws InterruptedException{
        Random rand = new Random();
        int num;
        byte contador=0;
        byte cara=0;
        byte creu=0;
        
        while (contador < 100) { 
            num = rand.nextInt(2); 

            if (num == 0) {
                String moneda = "cara";
                // String moneda = "head";
                cara++;
                System.out.println("Ha sortit " + moneda + ". Han sortit " + cara + " " + moneda + "(s).");
                // System.out.println("It came up " + moneda + ". There have been " + cara + " " + moneda + "(s).");
            } else {
                String moneda = "creu";
                // String moneda = "tail";
                creu++;
                System.out.println("Ha sortit " + moneda + ". Han sortit " + creu + " " + moneda + "(s).");
                // System.out.println("It came up " + moneda + ". There have been " + creu + " " + moneda + "(s).");
            }

            contador++;
            Thread.sleep(1000); // pausa de 1 segon
        }

        System.out.println("Fi de les 100 tirades.");
        // System.out.println("End of the 100 tosses.");
}
}
