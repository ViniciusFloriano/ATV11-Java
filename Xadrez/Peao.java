package Xadrez;

public class Peao extends Peca implements Movimentacao {

	public Peao(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean validaMovimento(int destinoX, int destinoY) {
		int direcao = 1;
        if (this.getY() == 2) {
            return (destinoY - this.getY() == direcao || destinoY - this.getY() == 2 * direcao) && this.getX() == destinoX;
        }
        return destinoY - this.getY() == direcao && this.getX() == destinoX;
	}

}
