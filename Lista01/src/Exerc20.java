/* 20) Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual
a 20. Se pelo menos uma dessas afirmações for verdadeira, imprima
"números válidos". Caso contrário, imprima "número não válido". Em
qualquer caso, imprima "Sejam bem-vindos à disciplina de Técnicas de
Programação". */

public class Exerc20 {
	public static void main(String[] args) {
		int A = 10;
		int B = 10;
		
		if (A > 10 || A + B == 20) {
			System.out.println("Numeros validos!");
		} else {
			System.out.println("Numeros nao validos");
		}
		if (true) {
			System.out.println("Sejam bem vindos a disciplina de Tecncicas de Programacao!");
		}	
	}
}