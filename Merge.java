public class Merge {
    private Fila filaC;

    public Merge() {
        filaC = new Fila();
    }

    public void mergeFilas(Fila A, Fila B) {
        Node atualA = A.getPrimeiro();
        Node atualB = B.getPrimeiro();

        while (atualA != null && atualB != null) {
            if (atualA.getInformacao() <= atualB.getInformacao()) {
                filaC.insere(atualA.getInformacao());
                atualA = atualA.getProximo();
            } else {
                filaC.insere(atualB.getInformacao());
                atualB = atualB.getProximo();
            }
        }

        while (atualA != null) {
            filaC.insere(atualA.getInformacao());
            atualA = atualA.getProximo();
        }

        while (atualB != null) {
            filaC.insere(atualB.getInformacao());
            atualB = atualB.getProximo();
        }
    }

    public void imprime() {
        filaC.imprime();
    }
}
