package Xadrez;

public class Bispo extends Peca implements Movimentacao {

	public Bispo(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean validaMovimento(int destinoX, int destinoY) {
		return Math.abs(destinoX - this.getX()) == Math.abs(destinoY - this.getY());
	}

}
