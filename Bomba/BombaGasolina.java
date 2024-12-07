package Bomba;

public class BombaGasolina extends Bomba implements Abastecer {

	public BombaGasolina(double precoPorLitro) {
		super(precoPorLitro);
	}

    @Override
    public double abastecerPorValor(double valor) {
        return valor / precoPorLitro;
    }

    @Override
    public double abastecerPorLitros(double litros) {
        return litros * precoPorLitro;
    }

}
