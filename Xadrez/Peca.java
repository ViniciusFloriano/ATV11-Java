package Xadrez;

public class Peca {
	
	private int x;
	private int y;

	public Peca(int x, int y) {
		if (x >= 1 && x < 9) {
			this.x = x;
		}
		if (y >= 1 && y < 9) {
			this.y = y;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 1 && x < 9) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 1 && y < 9) {
			this.y = y;
		}
	}
	
	
	
	
}
