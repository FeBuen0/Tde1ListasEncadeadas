###  TDE-1 
Este projeto implementa estruturas de dados básicas em Java usando listas encadeadas e vetores. O objetivo é demonstrar o funcionamento de Pilha, Fila e operações de Merge.

## Componentes
Node: estrutura de nó que guarda um valor inteiro e a referência para o próximo.
Pilha (lista encadeada): estrutura FILO com métodos insere, remove e imprime.
Fila (lista encadeada): estrutura FIFO com métodos insere, remove e imprime.
Merge: recebe duas filas ordenadas e gera uma terceira fila também ordenada.
MergeVetor: faz o mesmo que merge, mas usando vetores.
Main: executa todos os testes.
Como Executar
Basta compilar e rodar o arquivo Main:
   javac *.java
   java Main

## Ele mostra:
1) Pilha funcionando
2) Fila funcionando
3) Merge entre duas filas (lista encadeada)
4) Merge entre dois vetores
   
## Exemplos:
Pilha: insere 1, 3, 5, 7; remove duas vezes; imprime o estado.
Fila: insere 2, 4, 6, 8; remove duas vezes; imprime o estado.
Merge (lista): A = [1,3,5,7,9], B = [2,4,6,8] → C = [1,2,3,4,5,6,7,8,9].
Merge (vetores): vetA = {1,3,5,7,9}, vetB = {2,4,6,8} → vetC = {1,2,3,4,5,6,7,8,9}.
