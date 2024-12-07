package Xadrez;

public class Rainha extends Peca implements Movimentacao {

	public Rainha(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean validaMovimento(int destinoX, int destinoY) {
		return (this.getX() == destinoX || this.getY() == destinoY) || (Math.abs(destinoX - this.getX()) == Math.abs(destinoY - this.getY()));
	}

}
