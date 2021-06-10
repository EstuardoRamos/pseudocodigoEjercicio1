
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num, numAleatorio, par = 0, impar = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero N: ");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            Random rd = new Random();
            numAleatorio = rd.nextInt(100) + 1;
            System.out.println(numAleatorio);
            float resi = numAleatorio % 2;
            if (resi == 0) {
                par = par + 1;
            } else {
                impar += 1;
            }
        }
        System.out.println("La cantidad de numero pares es " + par);
        System.out.println("La cantidad de numero impares es " + impar);
    }

}
