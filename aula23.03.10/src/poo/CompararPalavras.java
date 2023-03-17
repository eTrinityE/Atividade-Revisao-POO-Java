package poo;

import java.util.Scanner;

public class CompararPalavras {
    public static void main(String[] args) {
        String p1, p2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira palavra: ");
        p1 = sc.nextLine();
        System.out.println("Insira a segunda palavra: ");
        p2 = sc.nextLine();

        if(p1.equals(p2)){
            System.out.println("Palavras são iguais");
        }else {
            System.out.println("Palavras não são iguais");
        }
    }
}
