/* 15) Verifique se o valor de A é menor que 10. Se essa afirmação for
verdadeira, imprima "A < 10". Em seguida, verifique se a soma de A e B
é igual a 20. Se essa afirmação for verdadeira, imprima "A + B == 20".
Caso nenhuma das afirmações seja verdadeira, imprima "número não
válido". */

public class Exerc15 {
	public static void main(String[] args) {
		int A = 10;
		int B = 10;
		
		if (A < 10) {
			System.out.println("A < 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
		}
		
		if (A >= 10 || A + B != 20) {
			System.out.println("Numero nao valido!");
		}
		
	}
}