package Ejercicios;

import java.util.Scanner;

public class Numeros_iguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " es igual que " + num2);
        } else {
            System.out.println("Los números son distintos");
        }
        sc.close();
    }
}
