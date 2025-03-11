// 1. Inverta uma lista usando uma pilha;
System.out.print("Selecione o tamanho do vetor: ");
int range = sc.nextInt();

Lista lista = new Lista(range);

for(int i=3;i>0;i--) {
    lista.addInicio(i);
} //Lista: [1, 2, 3]

System.out.println("Lista Original: "+lista);

Pilha aux = new Pilha(range);

while(!aux.pilhaCheia()) {
    aux.push(lista.removerInicio());
}

System.out.println("Pilha Auxiliar: "+aux);

while(!aux.pilhaVazia()) {
    lista.addFinal(aux.pop());
}

System.out.println("Lista Invertida: "+lista);
        
sc.close();
