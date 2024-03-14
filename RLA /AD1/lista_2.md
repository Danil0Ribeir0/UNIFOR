# Unifor
**Nome:** Danilo Ribeio Santos
**Disciplina:** Raciocínio Lógico Algorítmico
## Exercício 1
Calcule a média de quartro números inteiros dados:
### Fluxograma 1
```mermaid
flowchart TD
A([INÍCIO]) --> B{{"Digite quatro números inteiros: "}}
B --> C[\N1, N2, N3, N4\]
C --> D["media = (N1+N2+N3+N4)/4"]
D --> E{{"A média é: "media}}
E --> Z([FIM])
```
### Pseudocódigo 1
```
1 ALGORITMO media
2 DECLARE N1, N2, N3, N4, media: int
3 INICIO
4 ESCREVA "Digite quatro números inteiros: "
5 LEIA N1, N2, N3, N4
6 media = (N1+N2+N3+N4)/4
7 ESCREVA "A média é: "media
8 FIM_ALGORITMO
```
### Teste de Mesa 1
|N1|N2|N3|N4|somatória| media |
|-|-|-|-|-|-|
|1|5|9|13|28|7
|2|6|10|14|32|8
|3|7|11|15|36|9
## Exercício 2
Objetivo: Leia uma temperatura dada na escala Celsius (C) e imprima o equivalente em Fahrenheit.
### Fluxograma 2
```mermaid
flowchart TD
A([INÍCIO]) --> B{{"Digite a temperatura atual: "}}
B --> C[\celsius\]
C --> D["F = (9/5) * celsius + 32"]
D --> E{{"A temperatura em Fahrenheit é: "F}}
E --> F([FIM])
```
### Pseudocódigo 2
```
1 ALGORITMO fahrenheit
2 DECLARE celsius, F: real
3 INICIO
4 ESCREVA "Digite a temperatura atual: "
5 LEIA celsius
6 F = (9/5) * celsius + 32
7 ESCREVA "A temperatura em Fahrenheit é: "F
8 FIM
```
### Teste de mesa 2
|Celsius (C°)|Fahrenheit (F°)|
|      -     |       -       |
|      0     |       32      |
|     20     |       68      |
|     100    |      212      |
## Exercício 3
Objetivo: Receba dois números reais e um operador e efetue a operação correspondente com os valores recebidos (operandos). O algoritmo deve retornar o resultado da operação selecionada simulando todas as operações de uma calculadora simples.
### Fluxograma 3
```mermaid
flowchart TD
A([INICIO]) --> B{{"Digite dois números: "}}
B --> C[\N1,N2\]
C --> D{{"Escolha uma das operações [+][-][*][/]: "}}
D --> E[\op\]
E --> F{"op == +"}
	F --True--> G[res = N1 + N2]
	G --> H{{"res"}}
	F --False--> I{"op == -"}
		I --True--> J[res = N1 - N2]
		J --> H
		I --False--> K{"op == *"}
			K --True--> L[res = N1 * N2]
			L --> H
			K --False--> M{"op == /"}
				M --True--> N{"N2 != 0"}
				N --True--> O[res = N1/N2]
				O --> H
				N --False--> P{{"Digite um número maior que zero"}}
P --> Z([FIM])
H --> Z
```
