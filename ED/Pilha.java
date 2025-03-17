import java.util.Arrays;

public class Pilha {
    private int[] vetor;
    private int num_itens;

    public Pilha(int range) {
        vetor = new int[range];
        num_itens = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }

    public boolean pilhaVazia() {
        return num_itens == 0;
    }

    public boolean pilhaCheia() {
        return num_itens == vetor.length;
    }

    public void push(int e) {
        if (pilhaCheia()) {
            System.out.println("lista vazia, impossivel adicionar");
        } else {
            int i = num_itens;
            vetor[i] = e;
            num_itens++;
        }
    }

    public int pop() {
        if (pilhaVazia() ) {
            System.out.println("lista vazia, impossivel remover");
            return 0;
        } else {
            int i = num_itens - 1;
            int eRemovido = vetor[i];
            num_itens--;
            return eRemovido;
        }
    }

    public int top() {
        return vetor[num_itens];
    }

    public void palindromo() {
        boolean palindromo = true;

        for (int i=0;i<num_itens;i++) {
            if (vetor[i] != pop()){
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
