
public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio {


    final String marca;
    final String placa;
    double valorLocacaoDiaria;
    final int anoFabricacao;
    double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria,
                   int anoFabricacao, double precoFipe) throws Exception {

        if (placa == null || placa.isBlank())
            throw new Exception("Placa não pode ser vazia!");
        if (marca == null || marca.isBlank())
            throw new Exception("Marca não pode ser vazia!");
        if (valorLocacaoDiaria <= 0)
            throw new Exception("Valor da diária tem que ser maior que zero.");
        if (anoFabricacao <= 0)
            throw new Exception("Ano de fabricação inválido.");
        if (precoFipe <= 0)
            throw new Exception("Preço FIPE tem que ser maior que zero.");

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;

    }

    protected boolean isIsentoIpva(){
        int anoAtual = 2025;
        return ((anoAtual) - anoFabricacao) > 20;


    }



}

