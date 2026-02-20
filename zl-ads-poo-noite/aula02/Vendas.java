public class Vendas {

    double totalVendido = 0.0;
    // Declarada dentro da Classe  (Variavel de Instancia)
    int volumeVendido = 0;
    float precoProduto = 10.50f;
    double reportSummarySalesQuarter = 0.0;

    public void fazerVenda( int quantidade ) { 
        // Declarada dentro do Método/Função (Variavel Local)
        // float precoProduto = 5.50f; // Shadowing (Não fazer)
        float total = quantidade * precoProduto;
        System.out.println("Vendendo " + quantidade);
        volumeVendido += quantidade;
        totalVendido += total;
    }

    public static void main(String[] args) {
        Vendas vendaMochilas = new Vendas();
        vendaMochilas.fazerVenda( 10 );
        vendaMochilas.fazerVenda( 15 );

        System.out.println("Total Vendido: " + vendaMochilas.totalVendido);
    }
    
}
