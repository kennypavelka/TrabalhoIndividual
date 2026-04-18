import java.util.ArrayList;

public class Pedido{

    int numeroPedido;
    Cliente cliente;
    ArrayList<ItemPedido> itens;
    double frete, totalFinal;

    public Pedido(int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
            }

            public void adicoinarItem(ItemPedido item) {
                itens.add(item);
            }


}