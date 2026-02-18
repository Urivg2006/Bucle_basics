import java.util.Random;

public class Numbers_random {
    public static void main(String[] args)  throws InterruptedException{
        byte num=1;
        while (num!=51){
            Random rand = new Random();
            short num_rand = (short) (rand.nextInt(Short.MAX_VALUE - Short.MIN_VALUE + 1) + Short.MIN_VALUE);
            System.out.println(num +".Numero aleatori: " + num_rand);
            // System.out.println(num +".Number random: " + num_rand);
           num++;
           Thread.sleep(1000); // pausa de 1 segon
           
        }
    }
}

