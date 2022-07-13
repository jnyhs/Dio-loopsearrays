package Arrays;

/*Criar vetor de 66 números inteiros e mostrar ordem inversa */
public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {4, 8, 5, -3, 9, 2};

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
}

