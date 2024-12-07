package Bomba;

public class BombaEtanol extends Bomba implements Abastecer {

	public BombaEtanol(double precoPorLitro) {
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
