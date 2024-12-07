package Bomba;

public class BombaDiesel extends Bomba implements Abastecer {

	public BombaDiesel(double precoPorLitro) {
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
