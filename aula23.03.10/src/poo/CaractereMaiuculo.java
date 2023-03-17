package poo;

import java.util.Scanner;

public class CaractereMaiuculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma palavra para transformar em maiucula");
        String palavra = sc.nextLine();
        System.out.println(palavra.toUpperCase());

        sc.close();
    }
}
