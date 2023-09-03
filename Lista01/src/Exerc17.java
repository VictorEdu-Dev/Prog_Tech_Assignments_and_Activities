/* 17) Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual
a 20. Se pelo menos uma dessas afirmações for verdadeira, imprima
"número válido". Caso contrário, verifique se A é igual a B. Se for
verdade, imprima "A é igual B". Se A e B forem diferentes de 10 e A for
menor que 10, imprima "A é menor que 10". Caso nenhuma das
afirmações anteriores seja verdadeira, imprima "número não válido". */

public class Exerc17 {
	public static void main(String[] args) {
		int A = 5;
		int B = 10;
		
		if (A > 10 || A + B == 20) {
			System.out.println("Numero valido!");
		} else if (A == B) {
			System.out.println("A == B");
		} else if (A != 10 && B != 10 && A < 10) {
			System.out.println("A eh menor que 10");
		} else {
			System.out.println("Numero invalido!");
		}
		
	}
}