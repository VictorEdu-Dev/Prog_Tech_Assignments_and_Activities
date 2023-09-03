/* 18)Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual a
20. Se pelo menos uma dessas afirmações for verdadeira, imprima
"número válido". Caso contrário, imprima "número não válido". */

public class Exerc18 {
	public static void main(String[] args) {
		int A = 10;
		int B = 10;
		
		if (A > 10 || A + B == 20) {
			System.out.println("Numero valido!");
		} else {
			System.out.println("Numero nao valido!");
		}
		
		
	}
}