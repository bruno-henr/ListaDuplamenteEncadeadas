public class Main {
    public static void main(String[] args) {
        ListaDupEncadeada<String> lista = new ListaDupEncadeada<>();

        lista.add("Teste 1");
        lista.add("Teste 2");
        lista.add("Teste 3");

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
    }
}

