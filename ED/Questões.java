// 1. Inverta uma lista usando uma pilha;
System.out.print("Selecione o tamanho do vetor: ");
int range = sc.nextInt();

Lista lista = new Lista(range);

lista.addFinal(1);
lista.addFinal(2);
lista.addFinal(3);

System.out.println("Lista Original: "+lista);

Pilha aux = new Pilha(range);

aux.push(lista.removerInicio());
aux.push(lista.removerInicio());
aux.push(lista.removerInicio());

System.out.println("Pilha Auxiliar: "+aux);

lista.addFinal(aux.pop());
lista.addFinal(aux.pop());
lista.addFinal(aux.pop());


System.out.println("Lista Invertida: "+lista);

sc.close();
