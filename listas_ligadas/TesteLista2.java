public class TesteLista2 {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // (3) Teste com lista vazia
        System.out.println("Contém 10 (vazia): " + lista.contem(10)); 
        System.out.println("Conta 10 (vazia): " + lista.conta(10));   

    
        lista.insereFim(10);
        lista.insereFim(20);
        lista.insereFim(10);

        // (1) Teste com valor que está na lista
        System.out.println("Contém 10: " + lista.contem(10)); 
        System.out.println("Conta 10: " + lista.conta(10));   

        // (2) Teste com valor que NÃO está na lista
        System.out.println("Contém 99: " + lista.contem(99)); 
        System.out.println("Conta 99: " + lista.conta(99));   
    }
}
