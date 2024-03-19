# Unifor
**Nome:** Danilo Ribeio Santos

**Disciplina:** Raciocínio Lógico Algorítmico
## Exercício 1
Objetivo: Calcule a média de quartro números inteiros dados:
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
### Pseudocódigo 3
```
1 ALGORITMO calculadora
2 DECLARE N1, N2: real
3	op: caractere
4 INÍCIO
5 ESCREVA "Digite dois números: "
6 LEIA N1, N2
7 ESCREVA "Escolha uma das operações [+][-][*][/]: "
8 LEIA op
9 SE op == +
10	ENTÃO CALCULE res = N1 + N2
11	ESCREVA res
12 SENÃO SE op == -
13 	ENTÃO CALCULE res = N1 - N2
14 	ESCREVA res
15 SENÃO SE op == *
16 	ENTÃO CALCULE res = N1 * N2
17 	ESCREVA res
18 SENÃO SE op == /
19 	ENTÃO CALCULE res = N1 / N2
20 		SE N2 != 0
21 			ENTÃO CALCULE res = N1 / N2
22 			ESCREVA res
23 		SENÃO ESCREVA "Digite um número maior que zero"
24 		FIM_SE
25 FIM_SE
26 FIM
```
### Teste de mesa 3
| N1 | N2 | op | op == + | op == - | op == * | op == / | N2 != 0 | Saída                           |
|----|----|----|---------|---------|---------|---------|:-------:|---------------------------------|
| 10 | 1  | +  | True    | False   | False   | False   |    -    | 11                              |
| 11 | 2  | -  | False   | True    | False   | False   |    -    | 9                               |
| 12 | 3  | *  | False   | False   | True    | False   |    -    | 36                              |
| 13 | 4  | /  | False   | False   | False   | True    |   True  | 3,25                            |
| 14 | 0  | /  | False   | False   | False   | True    |  False  | Digite um número maior que zero |
## Exercício 4
Objetivo: Elaborar um algoritmo que, dada a idade, classifique nas categorias: infantil A (5 - 7 anos), infantil B (8 -10 anos), juvenil A (11 - 13 anos), juvenil B (14 -17 anos) e adulto (maiores que 18 anos).
### Fluxograma 4
```mermaid
flowchart TD
A([INÍCIO])-->B{{"Digite a sua idade: "}}
B --> C[\id\]
C --> D{id <= 4}
D --True--> E{{"Digite uma idade maior que 4"}}
D --False--> F{5 >= id <= 7}
F --True--> G{{"Você está no infantil A"}}
F --False--> H{8 >= id <= 10}
H --True--> I{{"Você está no infantil B"}}
H --False--> J{11 >= id <= 13}
J --True--> K{{"Você está no juvenil A"}}
J --False--> L{14 >= id <= 17}
L --True--> M{{"Você está no juvenil B"}}
L --False--> N{{"Você está na categoria adulto"}}
N --> Z([FIM])
E --> Z
G --> Z
I --> Z
K --> Z
M --> Z
```
### Pseudocódigo 4
```
1 ALGORITMO idades
2 DECLARE id: int
3 INICIO
4 ESCREVA "Digite a sua idade: "
5 LEIA id
6 SE id <= 4
7 	ENTÃO ESCREVA "Digite uma idade maior que 4"
8 SENÃO SE 5 >= id <= 7
9 	ENTÃO ESCREVA "Você está no infantil A"
10 SENÃO SE 8 >= id <= 10
11 	ENTÃO ESCREVA "Você está no infantil B"
12 SENÃO SE 11 >= id <= 13
13 	ENTÃO ESCREVA "Você está no juvenil A"
14 SENÃO SE 14 >= id <= 17
15 	ENTÃO ESCREVA "Você está no juvenil B"
16 SENÃO ESCREVA "Você está na categoria adulto"
17 FIM_SE
18 FIM
```
### Teste de mesa 4
| id | id <= 4 | 5 >= id <= 7 | 8 >= id <= 10 | 11 >= id <= 13 | 14 >= id <= 17 | saída                         |
|----|---------|--------------|---------------|----------------|----------------|-------------------------------|
| 3  | True    | False        | False         | False          | False          | Digite uma idade maior que 4  |
| 7  | False   | True         | False         | False          | False          | Você está no infantil A       |
| 10 | False   | False        | True          | False          | False          | Você está no infantil B       |
| 12 | False   | False        | False         | True           | False          | Você está no juvenil A        |
| 17 | False   | False        | False         | False          | True           | Você está no juvenil B        |
| 20 | False   | False        | False         | False          | False          | Você está na categoria adulto |
