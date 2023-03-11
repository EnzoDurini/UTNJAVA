import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hola = "Hola como estas?";
        char a = 'a';
        int b = 0;
        for (int i = 0; i < hola.length(); i++) {
            if (a == hola.charAt(i)) {
                b++;
            }

        }
        System.out.println("la cantidad de 'a' que hay es de " + b);


        //Ejercicio B
        Scanner leer = new Scanner(System.in);
        int aux = 0;
        int numeros[] = new int[3];
        int suma = 0;
        System.out.println("Ingrese los numeros por favor");
        numeros[0] = leer.nextInt();
        numeros[1] = leer.nextInt();
        numeros[2] = leer.nextInt();
        System.out.println("Ingrese x");
        int x = leer.nextInt();


        Arrays.sort(numeros);
        for (int num: numeros) {
            if (num > x){
                suma+=num;
            }
            System.out.print(num + " ");

        }
         System.out.println("\n La suma es " + suma);
        }

    }






