package Bomba;

public class BombaMain {
	public static void main(String[] args) {

        BombaGasolina bombaGasolina = new BombaGasolina(6.10);
        BombaEtanol bombaEtanol = new BombaEtanol(2.73);
        BombaDiesel bombaDiesel = new BombaDiesel(5.96);


        System.out.println("Valor da Gasolina: R$ " + bombaGasolina.getPrecoPorLitro());
        System.out.println("Valor do Etanol: " + bombaEtanol.getPrecoPorLitro());
        System.out.println("Valor do Diesel: " + bombaDiesel.getPrecoPorLitro());
        
        System.out.println("Abastecimento por valor (R$ 100) Gasolina: " + bombaGasolina.abastecerPorValor(100) + " litros");
        System.out.println("Abastecimento por valor (R$ 100) Etanol: " + bombaEtanol.abastecerPorValor(100) + " litros");
        System.out.println("Abastecimento por valor (R$ 100) Diesel: " + bombaDiesel.abastecerPorValor(100) + " litros");

        System.out.println("Abastecimento por litor (20L) Gasolina: R$ " + bombaGasolina.abastecerPorLitros(20));
        System.out.println("Abastecimento por litro (20L) Etanol: R$ " + bombaEtanol.abastecerPorLitros(20));
        System.out.println("Abastecimento por litro (20L) Diesel: R$ " + bombaDiesel.abastecerPorLitros(20));

	}
}
