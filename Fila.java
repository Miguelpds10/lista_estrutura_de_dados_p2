public class Fila {
    private No primeiro;
    private No ultimo;
    //construtor padrão: primeiro e ultimo são nulos
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void enfileira (Pessoa pessoa) {
        No novo = new No(pessoa);
        if (estaVazia())
            primeiro = novo;
        else
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public Pessoa desenfileira () {
        if (estaVazia()) return null;
        Pessoa p = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a fila
            ultimo = null;
        return p;
    }

    // Exercício 8: devolve a Pessoa da frente SEM remover; null se a fila estiver vazia
    public Pessoa espiaFrente() {
        if (estaVazia()) return null;
        return primeiro.getInfo(); // não altera primeiro
    }

    // Exercício 8: devolve o número de elementos (percorre a fila: O(n))
    public int tamanho() {
        int contador = 0;
        No temp = primeiro;
        while (temp != null) {
            contador++;
            temp = temp.getProximo();
        }
        return contador;
    }

    @Override 
    public String toString() {
        if (estaVazia()) return "fila vazia";
        String s = "";
        No temp = primeiro;
        while (temp != null) {
            s += temp + "-> ";
            temp = temp.getProximo();
        }
        return s + "//";
    }
}
