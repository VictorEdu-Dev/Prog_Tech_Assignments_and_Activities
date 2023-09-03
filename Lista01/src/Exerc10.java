/* 10) Verifique se A é maior que 10 se não for imprima: "número menor que
10". Verifique se A mais B é igual a 20 se não for verdade imprima
"número diferente de 20". */

public class Exerc10 {
	public static void main(String[] args) {
		int A = 5;
		int B = 10;
		
		if (A > 10) {
			return;
		} else {
			System.out.println("Numero menor que 10!");
		}
		if (A + B == 20) {
			return;
		} else {
			System.out.println("Numero diferente de 20!");
		}
	}
}