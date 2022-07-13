package loops;

/*
 Desenvolver um gerador de tabuada;
 Caapaz de gerara tabuada de qualquer inteiro de 1 a 10
 Informar de qual número quer ver a tabuada
 A saída deve ser conorme o exeplo abaixo:
  5 x 1 = 1
  5 x  2 = 10 (...)*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }

}