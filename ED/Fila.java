import java.util.Arrays;

public class Fila {
    private int[] vetor;
    private int num_itens;

    public Fila(int range) {
        vetor = new int[range];
        num_itens = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }

    public boolean filaVazia() {
        return num_itens == 0;
    }

    public boolean filaCheia() {
        return num_itens == vetor.length;
    }
    
    public int checarFila() {
        return vetor[0];
    }

    public void enfilerar(int e) {
        if (filaCheia()) {
            System.out.println("fila vazia, impossivel remover");
        } else {
            int i = num_itens;
            vetor[i] = e;
            num_itens++;
        }
    }

    public int desenfilerar() {
        if (filaVazia() ) {
            System.out.println("fila vazia, impossivel adicionar");
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
    
    public void removerCauda(int range) {
        Fila filaAux = new Fila(range);

        if (filaVazia()) {
            System.out.println("fila vazia, impossivel realizar ação");
        } else {
            for(int i = 0; i < num_itens - 1; i++){
                int inicio = desenfilerar();
                enfilerar(inicio);
            }
            desenfilerar();
        }
    }
}
