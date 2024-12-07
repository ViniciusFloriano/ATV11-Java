package Bomba;

public abstract class Bomba {
    protected double precoPorLitro;

    public Bomba(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }
}
