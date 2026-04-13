public class ContaBancaria {


    int numero;
    String titular;
    double saldo;
    int quantidadeSaques;

    ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.00;    //saldo começando em 50 pelo bonus
        this.quantidadeSaques = 0;
        System.out.println("Contra criada com sucesso! Bonius de R$ 50.00 aplicado! ");

    }
}
