package Xadrez;

public class Rei extends Peca implements Movimentacao{

	public Rei(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean validaMovimento(int destinoX, int destinoY) {
		return Math.abs(destinoX - this.getX()) <= 1 && Math.abs(destinoY - this.getY()) <= 1;
	}

}
