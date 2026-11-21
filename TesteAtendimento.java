public class TesteAtendimento {

    public static void atende(Fila fila, int quantidade) {
        int atendidas = 0;
        while (atendidas < quantidade) {
            Pessoa p = fila.desenfileira();
            if (p == null) { // verificação ANTES de usar p, evita NullPointerException
                System.out.println("Aviso: a fila acabou. Pediram " + quantidade
                        + ", mas só " + atendidas + " foram atendidas.");
                return;
            }
            System.out.println("Atendido: " + p.getNome());
            atendidas++;
        }
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileira(new Pessoa(2000, "Ana"));
        fila.enfileira(new Pessoa(2001, "Bia"));
        fila.enfileira(new Pessoa(2002, "Caio"));
        fila.enfileira(new Pessoa(2003, "Duda"));
        fila.enfileira(new Pessoa(2004, "Edu"));

        atende(fila, 3);
        System.out.println("---");
        atende(fila, 4);
    }
}
