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
        if (listaVazia()) {
            System.out.println("lista vazia, impossivel remover");
            return 0;
        } else {
            if (index <= 0) {
                return removerInicio();
            } else if (index >= num_itens - 1) {
                return removerFinal();
            } else {
                int elementoRemovido = vetor[index];
                for (int i = index; i < num_itens - 1; i++) {
                    vetor[i] = vetor[i + 1];
                }
                num_itens--;
                return elementoRemovido;
            }
        }
    }

    public int retornaMeio(){
        if (listaVazia()) {
            System.out.println("Lista vazia!");
            return 0;
        } else if (num_itens % 2 == 0) {
            System.out.println("Impossível, a lista não possui meio definitivo");
            return 0;
        }else {
            int meio = (num_itens / 2) + 1;
            return vetor[meio];
        }
    }

    public void trocaPontas() {
        if (listaVazia()) {
            System.out.println("Lista está vazia");
        } else {
            int inicio = removerInicio();
            int fim = removerFinal();

            addInicio(fim);
            addFinal(inicio);
        }
    }

    public void removeRepetidos() {
        for (int i=0;i<num_itens;i++) {
            int eRemovido = vetor[0];
            System.out.println("elemento removido: "+eRemovido);

            for (int j=1;j<num_itens;j++) {
                if (eRemovido == vetor[j]) {
                    System.out.println("vetor j: "+j);
                    removerPosicao(j);
                }
            }
        }
        System.out.println("Lista sem repetidos: "+ Arrays.toString(vetor));
    }

    public void ordenarCrescente(int range) {
        Lista aux = new Lista(range);

        while (!listaVazia()) {
            int menor = vetor[0];
            int indexMenor = 0;

            for (int i = 1; i < num_itens; i++) {
                if (vetor[i] < menor) {
                    menor = vetor[i];
                    indexMenor = i;
                }
            }

            aux.addFinal(menor);
            removerPosicao(indexMenor);
        }

        for (int i = 0; i < aux.num_itens; i++) {
            addFinal(aux.vetor[i]);
        }
    }
}
