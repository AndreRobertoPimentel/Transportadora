public class Caminhao extends Veiculo{
    protected String tipoDeCaminhao;

    public Caminhao(String placa, String tipoCombustivel,
                    String fabricante, String numeroChassis,
                    String cor, String tipoDeVeiculo, int anoFabricaccao,
                    int anoModelo, String tipoDeCaminhao) {
        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoDeVeiculo, anoFabricaccao, anoModelo);
        this.tipoDeCaminhao = tipoDeCaminhao;
    }

    public String getTipoDeCcaminhao() {
        return tipoDeCaminhao;
    }
}
