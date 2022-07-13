package loops;

/* Programa que peça N números inteiros;
CAlcule e mostre a quantidade de números pares e
 quantidade de número ímpares;
 */

import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        System.out.println("Quantidade de Números: ");
        quantNumeros = scan.nextInt();

        int numero;
        int count = 0;
        int quantPares = 0;
        int quantImapares = 0;


        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++ ;
            else quantImapares++ ;

            count++;
        }

        while(count < quantNumeros);
        System.out.println("Pares: " + quantPares);
        System.out.println("Ímpares:" + quantImapares);

    }
}
