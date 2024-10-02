package Ejercicios;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if(num1 % num2 == 0) {
            System.out.println("Los numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        }
    }
}
