public class Onibus extends Veiculo {
    private int numeroDePoltronas;

    public Onibus(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor, String tipoDeVeiculo, int anoFabricaccao, int anoModelo, int numeroDePoltronas) {
        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoDeVeiculo, anoFabricaccao, anoModelo);
        this.numeroDePoltronas = numeroDePoltronas;
    }

    public int getNumeroDePoltronas() {
        return numeroDePoltronas;
    }
}
