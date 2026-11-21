public class TesteExercicio5 {
    public static void main(String[] args) {

        // Itens a) e b): remover o único elemento
        System.out.println(" (a)/(b) Lista com um único elemento");
        Lista lista = new Lista();
        lista.insereInicio(42);
        System.out.println("Antes: " + lista);
        int v = lista.removeInicio();
        System.out.println("Removeu: " + v);
        System.out.println("Depois: " + lista); // esperado: lista vazia (primeiro == null)

        // Item c): o problema com o valor 0
        System.out.println("\n (c) O problema: valor 0 legítimo");
        lista.insereInicio(0);
        v = lista.removeInicio();
        // Teste ingênuo: quem chama usa o retorno como sinal de sucesso
        if (v > 0) {
            System.out.println("Removeu com sucesso: " + v);
        } else {
            System.out.println("ERRO APARENTE: 'nada removido' (mas o 0 foi removido!)");
        }
        System.out.println("Lista agora: " + lista);

        // Item d): correção na classe de teste, verificando listaVazia() ANTES de remover
        System.out.println("\n (d) Correção: verificar listaVazia() antes");
        lista.insereInicio(0);
        removeComSeguranca(lista); // caso comum: remove o 0 e informa corretamente
        removeComSeguranca(lista); // caso extremo: lista vazia

        // Mesmo problema com -1 (valor que o método usa como sinal de lista vazia)
        lista.insereInicio(-1);
        removeComSeguranca(lista);
    }

    public static void removeComSeguranca(Lista lista) {
        if (!lista.listaVazia()) {
            int v = lista.removeInicio();
            System.out.println("Removeu: " + v);
        } else {
            System.out.println("Nada a remover: lista vazia");
        }
    }
}
