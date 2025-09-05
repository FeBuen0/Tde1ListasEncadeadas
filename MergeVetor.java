public class MergeVetor {
    private int[] vetorC;
    private int tamanhoC;

    public int[] mergeVetores(int[] A, int tamanhoA, int[] B, int tamanhoB) {
        vetorC = new int[tamanhoA + tamanhoB];
        tamanhoC = 0;

        int i = 0, j = 0;

        while (i < tamanhoA && j < tamanhoB) {
            if (A[i] <= B[j]) {
                vetorC[tamanhoC] = A[i];
                tamanhoC++;
                i++;
            } else {
                vetorC[tamanhoC] = B[j];
                tamanhoC++;
                j++;
            }
        }

        while (i < tamanhoA) {
            vetorC[tamanhoC] = A[i];
            tamanhoC++;
            i++;
        }

        while (j < tamanhoB) {
            vetorC[tamanhoC] = B[j];
            tamanhoC++;
            j++;
        }

        return vetorC;
    }

    public void imprime() {
        for (int i = 0; i < tamanhoC; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}