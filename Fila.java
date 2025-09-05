public class Fila {
    private Node primeiro;
    private Node ultimo;

    public Fila(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void insere (int informacao){
        Node no = new Node();
        no.setInformacao(informacao);
        if(primeiro == null){
            primeiro = no;
        }
        else{
            Node atual = primeiro;
            while (atual.getProximo() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            ultimo = no;
        }
    }

    public void remove(){
        if(primeiro != null) {
            primeiro = primeiro.getProximo();
        }
    }

    public void imprime(){
        if (primeiro == null) {
            System.out.println("Fila vazia!");
            return;
        }

        Node atual = primeiro;
        while (atual != null) {
            System.out.print(atual.getInformacao() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("Null");
    }


    public Node getPrimeiro() {
        return primeiro;
    }
}
