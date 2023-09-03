/* 5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
imprima: "número não válido".
 */

public class Exerc05 {
	public static void main(String[] args) {
		int A = 15;
		int B = 0;
		
		if (A > 10 || A + B == 20) {
			System.out.println("Numero valido!");
		} else {
			System.out.println("Numero nao valido!");
		}
	}
}