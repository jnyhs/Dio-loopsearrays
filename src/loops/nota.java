package loops;

/* Programa que faça uma nota entre 0 e 10
Mostre uma mensagem caso o valor seja inválido
Continue pedindo até que o usuário informe um valor válido.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota:");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {

            System.out.println("Nota Inválida! Digite novamente.");
            nota = scan.nextInt();

        }
        System.out.println("nota inserida com sucesso!");
    }

}
