package Ejercicios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        double area;

        System.out.println("Introduce el radio de un circulo: ");
        r = sc.nextDouble();
        area = Math.PI * (Math.pow(r,2));

        System.out.println("El area es: " + area);

        sc.close();
    }
}
