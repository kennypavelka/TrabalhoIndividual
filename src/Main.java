public class Main{
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");

        Pedido pedido1 = new Pedido(1001, cliente1);
        pedido1.adicoinarItem(new ItemPedido("Teclado mecanido", 170.00, 1));
        pedido1.adicoinarItem(new ItemPedido("Mouse Gamer", 80.00, 1);
        pedido1.fecharPedido();

        System.out.println();

        Cliente cliente2 = new Cliente("Pavelka ok", "195.231.222-22");
        Pedido pedido2 = new Pedido(1002, cliente2);

        pedido2.adicoinarItem(new ItemPedido("Monitor 24 polegadas", 900.00, 1));
        pedido2.adicoinarItem(new ItemPedido("Cadeira Gamer", 1200);
        pedido2.fecharPedido();


    }
}