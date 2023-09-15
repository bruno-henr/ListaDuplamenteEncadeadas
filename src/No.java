public class No<T> {

    private T conteudo;
    private No<T> noProximo;
    private No<T> noPrevio;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public No<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(No<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
