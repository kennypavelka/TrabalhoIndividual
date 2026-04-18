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

public double calcularTotalItens() {
        double total = 0;
        for (ItemPedido item:itens)  {
            total += item.getSubtotal();


        }

        return total;

 }

 public void fecharPedido(){
        double totalItens = calcularTotalItens()


                if (totaItens > 250.00) {

                    frete = 0:
                } else {
                    frete = 25.00;

                }

                totalFinal = totalItens + frete;


                System.out.println("---- recbo do pedido ----");
     System.out.println("Pedido n: " +numeroPedido);
     System.out.println("Cliente: " + cliente.nome + " CPF : " + cliente.cpf);
     System.out.println(" =====--=======");
     System.out.println("Itemns: ");

     for (ItemPedido item : itens) {
         System.out.printlf(" %-20s x%d  R#$ %.2f%n", item.nomeProduto, item.quantidade, item.getSubtotal());


     }

     System.out.println(" -------------------");
     System.out.printlf("Subtotal: R# %.2f%n", totalItens);

     if (frete ==0) {
         System.out.println("Frete:  Gratis");
     } else  {
         System.out.printf("Frete: R$ %.2f%n", frete);

     }

     System.out.printlf("Total :    R$ %.2f%n", totalFinal);

 }

 System.out.printlf("TOLtal:   R$ %.2f%n", totalFinal);
    System.out.println(" -----------");

}