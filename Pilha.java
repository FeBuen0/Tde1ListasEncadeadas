public class Pilha {
    private Node topo;

    public Pilha() {

        this.topo = null;
    }

    public void insere(int informacao) {
        Node no = new Node();
        no.setInformacao(informacao);
        no.setProximo(topo);
        topo = no;
    }

    public void remove() {
        topo = topo.getProximo();
    }

    public void imprime() {
        System.out.print("null ");
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }

        Node atual = topo;
        while (atual != null) {
            System.out.print(" -> " + atual.getInformacao());
            atual = atual.getProximo();
        }
        System.out.println(" ");
    }
}



