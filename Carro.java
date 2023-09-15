public class Carro extends Veiculo {

    private int numerodeLugares;

    public Carro(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor, String tipoDeVeiculo, int anoFabricaccao, int anoModelo, int numerodeLugares) {
        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoDeVeiculo, anoFabricaccao, anoModelo);
        this.numerodeLugares = numerodeLugares;

    }

    public int getNumerodeLugares() {
        return numerodeLugares;
    }
}
