public class Main{
public static void main(String[] args) {

    Pilha pilha = new Pilha();
    pilha.insere(10);
    pilha.insere(20);

    System.out.println("Pilha:");
    pilha.imprime();

    pilha.remove();

    System.out.println("Pilha:");
    pilha.imprime();

    pilha.insere(30);

    System.out.println("Pilha:");
    pilha.imprime();


    Fila fila = new Fila();
    fila.insere(5);
    fila.insere(15);

    System.out.println("Fila:");
    fila.imprime();

    fila.remove();

    System.out.println("Fila:");
    fila.imprime();

    fila.insere(25);

    System.out.println("Fila:");
    fila.imprime();


    Fila A = new Fila();
    A.insere(12); A.insere(35); A.insere(52); A.insere(64);

    Fila B = new Fila();
    B.insere(5); B.insere(15); B.insere(23); B.insere(55); B.insere(75);

    Merge merge = new Merge();
    merge.mergeFilas(A, B);

    System.out.println("Fila C (lista encadeada):");
    merge.imprime();

    int[] vetorA = {12, 35, 52, 64};
    int[] vetorB = {5, 15, 23, 55, 75};

    int tamanhoA = 4;
    int tamanhoB = 5;

    MergeVetor mergeVetor = new MergeVetor();
    mergeVetor.mergeVetores(vetorA, tamanhoA, vetorB, tamanhoB);

    System.out.println("Vetor C:");
    mergeVetor.imprime();
}
}