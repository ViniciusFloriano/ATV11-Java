package Xadrez;

public class Cavalo extends Peca implements Movimentacao {

	public Cavalo(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean validaMovimento(int destinoX, int destinoY) {
		int dx = Math.abs(destinoX - this.getX());
        int dy = Math.abs(destinoY - this.getY());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
	}

}
