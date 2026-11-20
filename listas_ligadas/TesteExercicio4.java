public class TesteExercicio4 {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println("=== TESTE COM LISTA VAZIA ===");
        try {
            System.out.println("Maior: " + lista.maior());
        } 
        catch (IllegalStateException e) {
            System.out.println("Erro esperado em maior(): " + e.getMessage());
        }

        try {
            System.out.println("Menor: " + lista.menor());
        } 
        catch (IllegalStateException e) {
            System.out.println("Erro esperado em menor(): " + e.getMessage());
        }

        try {
            System.out.println("Soma: " + lista.soma());
        } 
        catch (IllegalStateException e) {
            System.out.println("Erro esperado em soma(): " + e.getMessage());
        }

        try {
            System.out.println("Média: " + lista.media());
        } 
        catch (IllegalStateException e) {
            System.out.println("Erro esperado em media(): " + e.getMessage());
        }

        System.out.println("\n=== TESTE COM ELEMENTOS ===");
        lista.insereFim(10);
        lista.insereFim(25);
        lista.insereFim(5);
        lista.insereFim(3);

        System.out.println("Lista: " + lista);
        System.out.println("Maior: " + lista.maior());
        System.out.println("Menor: " + lista.menor());
        System.out.println("Soma: " + lista.soma());
        System.out.println("Média: " + lista.media());

        System.out.println("\n=== TESTE COM NEGATIVOS ===");
        Lista listaNegativos = new Lista();
        listaNegativos.insereFim(-15);
        listaNegativos.insereFim(-4);
        listaNegativos.insereFim(-22);

        System.out.println("Lista: " + listaNegativos);
        System.out.println("Maior: " + listaNegativos.maior());
        System.out.println("Menor: " + listaNegativos.menor());
        System.out.println("Soma: " + listaNegativos.soma());
        System.out.println("Média: " + listaNegativos.media());
    }
}
