package Xadrez;

public class Torre extends Peca implements Movimentacao {

	public Torre(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean validaMovimento(int destinoX, int destinoY) {
		return this.getX() == destinoX || this.getY() == destinoY;
	}

}
