import java.util.Arrays;

public class Lista {
    private int[] vetor;
    private int num_itens;

    public Lista(int range) {
        vetor = new int[range];
        num_itens = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }

    public boolean listaVazia() {
        return num_itens == 0;
    }

    public boolean listaCheia() {
        return num_itens == vetor.length;
    }

    public void addInicio(int e) {
        if (listaCheia()) {
            System.out.println("Erro, a lista está cheia");
        } else {
            for (int i=num_itens-1;i>=0;i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[0] = e;
            num_itens++;
        }
    }

    public int removerInicio() {
        if (listaVazia() ) {
            System.out.println("lista vazia, impossivel remover");
            return 0;
        } else {
            int eRemovido = vetor[0];

            for (int i = 1; i < num_itens; i++) {
                vetor[i - 1] = vetor[i];
            }
            num_itens--;
            return eRemovido;
        }
    }

    public void addFinal(int e) {
        if (listaCheia()) {
            System.out.println("lista vazia, impossivel remover");
        } else {
           int i = num_itens;
           vetor[i] = e;
           num_itens++;
        }
    }

    public int removerFinal() {
        if (listaVazia() ) {
            System.out.println("lista vazia, impossivel remover");
            return 0;
        } else {
            int i = num_itens - 1;
            int eRemovido = vetor[i];
            num_itens--;
            return eRemovido;
        }
    }

    public void addPosicao(int e, int index) {
        if (listaCheia()) {
            System.out.println("lista vazia, impossivel remover");
        } else {
            if (index <= 0) {
                addInicio(e);
            } else if (index >= num_itens) {
                addFinal(e);
            } else {
                for (int i = num_itens;i>index;i--) {
                    vetor[i] = vetor[i - 1];
                }
                vetor[index] = e;
            }
            num_itens++;
        }
    }
    
    public int removerPosicao(int index) {

    }
}
