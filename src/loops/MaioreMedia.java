package loops;

/*Programa comcinco nímeros
Maior número
Média dos números */

import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;
        int media;


        int count = 0;

    do {

        System.out.println("Número:");
        numero = scan.nextInt();

        soma = soma + numero;

        if (numero > maior) maior = numero;


        count = count + 1;

    }  while(count < 5);
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
