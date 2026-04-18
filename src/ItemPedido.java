public class ItemPedido {
    String nomeProduto;
    double preco;
    int quantidade;

    public ItemPedido(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto ;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public double getSubtotal(){
        return preco *quantidade;

    }
}


