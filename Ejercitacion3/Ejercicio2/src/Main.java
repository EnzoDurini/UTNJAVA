import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indroduce una frase");
        String palabra = leer.next();
        char abecedario[]= {' ',' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' ',' '};
        /*for (int i=0; i<palabra.length(); i++) {
            System.out.println("\n" + palabra.charAt(i));
        }*/
        for (int i=0; i<=palabra.length(); i++) {
            for (int j=2; j<30; j++){
                char a = palabra.charAt(i);
                char b = abecedario[j];
                if (a == b){
                   a = abecedario[j+2];
                    System.out.println(a);
                }
                }
            }

        }


}
