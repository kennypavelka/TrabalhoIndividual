import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;
        int quantidadeSaques = 0;
        int opcao;

        do{
            System.out.println(" ---- Caoxa Eletronico --- ");
            System.out.println("1- Ver o Saldo" );
            System.out.println("2- depositar ");
            System.out.println("3 - Sacar ");
            System.out.println("0 - Sair ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: r$ %.2f%n" , saldo);
                    break;


                case 2:
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Deposito realizado! Saldo: r$ %.2f%n", saldo);
                    }else {
                        System.out.println("valor invalido.");
                    }
                    break;


                case 3:
                    if(quantidadeSaques >= 3) {
                        System.out.println((" Limite de saques diarios atingidos."));
                        break;

                }
                    System.out.print("Valor para sacaar: r$$ ");
                    double saque = scanner.nextDouble();
                            if (saque >1000.00) {
                                System.out.println("valor maximo por saque é de r$ 1.000.00");
                            }else if (saque > saldo) {
                                System.out.println("Saldo insuficiente.");

                            }
                            else if (saque <= 0) {
                                System.out.println("Valor invalido");
                            }else {
                                saldo -= saque;
                                quantidadeSaques++;
                                System.out.printf(" Saque realidzado! Saldo restante: R$ %.2f%n", saldo);
                                System.out.println("Saques realizados hoje: " +quantidadeSaques + "/3");

                            }
                            break;

                case 0:
                    System.out.println("Encerrando.");
                    break;

                default:
                    System.out.println("Opão invalida.");

            }


        } while (opcao != 0);
        scanner.close();

    }



}
