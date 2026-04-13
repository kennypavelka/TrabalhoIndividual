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

    void depositar(double valor){
        if (valor >0) {
            saldo += valor;

            System.out.printf("Ddeposito de R$ %.2f realizado! Saldo atual: #R %.2f%n", valor, saldo);
        } else {
            System.out.println(" Valor invalido para deposito." );

        }
    }

    void sacaar(double valor) {
        if (quantidadeSaques >=3) {

            System.out.println(" Limite de saques diarios atingisdos.");
        } else if (valor > 1000.00) {
            System.out.println("Valor maximo por saque é R$ 1.000,00.");
        }else if (valor > saldo) {
            System.out.println("SALDO insifuciente. ");
        }else if (valor <= 0){
            System.out.println("Valor invalido.");
        }else {

            saldo -= valor;
            quantidadeSaques++;

            System.out.printf("Saque de R$ %.2f realizado! Saldo restante: R# %.2fn", valor, saldo);
            System.out.println("Saques rezliados hoje: " + quantidadeSaques +"/3");


        }
    }
}
