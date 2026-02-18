import java.util.Scanner;

public class Lletres {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int pedir = 0;
    while(pedir < 10)
    {
        System.out.println("Dona'm un numero");
        // System.out.println("Give me a number");
        char Caracter = lector.next().charAt(0);
        if(Caracter >= 'a' && Caracter <= 'z' ){
        System.out.println("Es minuscula");
        // System.out.println("Is lowercase");
        }else if(Caracter >= 'A' && Caracter <= 'Z' ){
        System.out.println("Es mayuscula");
        // System.out.println("Is uppercase");
        }else{
        System.out.println("No es una lletra");
        // System.out.println("Is not a letter");
        }
    }
    }
    
}