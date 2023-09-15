public class ListaDupEncadeada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    private int tamanhoLista;

    public ListaDupEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNovo = new No<>(conteudo);
        novoNovo.setNoProximo(null);
        novoNovo.setNoPrevio(ultimoNo);
        if(primeiroNo == null) {
            primeiroNo = novoNovo;
        }
        if(ultimoNo != null) {
            ultimoNo.setNoProximo(novoNovo);
        }
        ultimoNo = novoNovo;
        tamanhoLista++;
    }

    public void add(int index, T conteudo) {


        No<T> aux = (No<T>) get(index);
        No<T> novoNo = new No<>(conteudo);
        novoNo.setNoProximo(aux);
        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(aux.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;

    }



    private No<T> getNo(int index) {
        No<T> aux = this.primeiroNo;
        for(int i = 0; (i < index) && (aux != null); i++) {
            aux = aux.getNoProximo();
        }
        return aux;
    }

    private int size() {
        return tamanhoLista;
    }
}
