package Xadrez;

public class PecaMain {
	public static void main(String[] args) {
        Rei rei = new Rei(5, 5);
        Rainha rainha = new Rainha(5, 5);
        Torre torre = new Torre(1, 1);
        Bispo bispo = new Bispo(3, 1);
        Cavalo cavalo = new Cavalo(2, 1);
        Peao peao = new Peao(1, 2);

        
        //Testando movimentos
        System.out.println("Rei: " + rei.validaMovimento(6, 6));  //true
        System.out.println("Rainha: " + rainha.validaMovimento(8, 5));  //true
        System.out.println("Torre: " + torre.validaMovimento(1, 8));  //true
        System.out.println("Bispo: " + bispo.validaMovimento(6, 4));  //true
        System.out.println("Cavalo: " + cavalo.validaMovimento(3, 3));  //true
        System.out.println("Peão: " + peao.validaMovimento(1, 4));  //true
        System.out.println("Peão inválido: " + peao.validaMovimento(2, 4));  //false
    }
}
