public class TesteExercicio8 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("=== CASO EXTREMO: FILA VAZIA ===");
        System.out.println("espiaFrente: " + fila.espiaFrente()); // esperado: null
        System.out.println("tamanho: " + fila.tamanho());         // esperado: 0

        System.out.println("\n CASO COMUM: FILA COM ELEMENTOS");
        fila.enfileira(new Pessoa(2000, "Ana"));
        fila.enfileira(new Pessoa(2001, "Bia"));
        System.out.println("Fila: " + fila);

        // espiaFrente duas vezes seguidas: a frente continua a mesma
        System.out.println("espiaFrente 1: " + fila.espiaFrente().getNome()); // Ana
        System.out.println("espiaFrente 2: " + fila.espiaFrente().getNome()); // Ana
        System.out.println("tamanho: " + fila.tamanho());                     // 2

        System.out.println("\n DIFERENÇA PARA desenfileira()");
        System.out.println("desenfileira: " + fila.desenfileira().getNome()); // Ana
        System.out.println("espiaFrente: " + fila.espiaFrente().getNome());   // Bia
        System.out.println("tamanho: " + fila.tamanho());                     // 1

        System.out.println("\n ESVAZIANDO DE NOVO");
        fila.desenfileira();
        System.out.println("espiaFrente: " + fila.espiaFrente()); // null
        System.out.println("tamanho: " + fila.tamanho());         // 0
    }
}