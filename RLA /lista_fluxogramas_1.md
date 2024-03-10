# UNIFOR 
**Nome**: Danilo Ribeiro

**Disciplina**: Raciocínio Lógico Algorítmico

**Turma**: T160-39
### Fluxograma 1 (MÉDIA)
```mermaid
flowchart TD
A([INÍCIO]) --> B{{"Digite dois números:"}}
B --> C[\N1, N2\]
C --> D[media = N1+N2/2]
D --> E{media >= 7}
E --NÃO--> F{{"Aluno Reprovado"}}
E --SIM--> G{{"Aluno Aprovado"}}
F --> Z([FIM])
G --> Z
```
### Pseudocódigo 1
```
1 ALGORITMO media
2 DECLARE N1, N2, media NUMERICO
3 ESCREVA "Digite dois números"
4 LEIA N1, N2, 
5 media = N1+N2/2
6 SE media >= 7
7 	ENTÃO ESCREVA "Aluno Aprovado"
8 SENÃO
9 	ESCREVA "Aluno Reprovado"
10 FIM_ALGORITMO
```
### Fluxograma 2 (SALÁRIO)
```mermaid
flowchart TD
A([INÍCIO]) --> B{{"Digite seu salário atual":}}
B --> C[\salario\]
C --> D{salario <= 500}
D --SIM--> E[n_salario = salario * 1.2]
D --NÃO--> F[n_salario = salario * 1.1]
E --> G{{"Este é o seu novo salário:" n_salario}}
F --> G
G --> Z([FIM])
```
### Pseudocódigo 2
```
1 ALGORITMO salario
2 DECLARE salario, n_salario NUMERICO
3 ESCREVA "Digite seu salário atual: "
4 LEIA salario
5 SE salario <= 500
6 	ENTÃO n_salario = salario * 1.2
7 SENÃO
8 	n_salario = salario * 1.1
9 	ESCREVA "Este é o seu novo salário: "n_salario
10 FIM_ALGORITMO
```
### Fluxograma 3 (PAR ou IMPAR)
```mermaid
flowchart TD
A([INÍCIO]) --> B{{"Digite um número:"}}
B --> C[\numero\]
C --> D{numero > 0}
D --NÃO--> E{{"O número não é positivo"}}
D --SIM--> F[R = numero % 2]
E --> Z([FIM])
F --> G{R == 0}
G --NÃO--> H{{Este número é impar}}
G --SIM--> I{{Este número é par}}
H --> Z
I --> Z
```
### Pseudocódigo 3
```
1 ALORITMO par_impar
2 DECLARE numero, R NUMERICO 
3 ESCREVA "Digite um número:"
4 LEIA numero
5 SE numero > 0 ENTÃO
6	R = numero % 2
7		SE R == 0 ENTÃO
8			ESCREVA "O número é par"
9		SENÃO
10			ESCREVA "O número é impar"
11 SENÃO
12 	ESCREVA "O número não é positivo
13 FIM_ALGORITMO
```
### Fluxograma 4 (CNH)
```mermaid
flowchart TD
A([INÍCIO]) --> B{{"Digite sua idade aqui: "}}
B --> C[\idade\]
C --> D{idade >= 18}
D --NÃO--> E[resto = 18 - idade]
E --> F{{"Falta(m) resto ano(s) 
para que possa tirar a CNH"}}
D --SIM--> G{{"Você está apto a 
tirar a CNH"}}
G --> Z([FIM])
F --> Z
```
### Pseudocódigo 4
```
1 ALGORITMO cnh
2 DECLARE idade, resto NUMERICO
3 ESCREVA "Digite sua idade aqui: "
4 LEIA idade
5 SE idade >= 18
6 	ENTÃO ESCREVA "Você está apto a tirar a CNH"
7 SENÃO
8 	resto = 18 - idade
9 	ESCREVA "Falta(m)"resto"ano(s) para 
10 	que possa tirar a CNH"
11 FIM_ALGORITMO
```

