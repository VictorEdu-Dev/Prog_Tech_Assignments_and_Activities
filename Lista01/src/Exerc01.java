/* 1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
segunda afirmação não seja verdadeira, imprima: "número não válido".
 */

public class Exerc01 {
	public static void main(String[] args) {
		int A = 20;
		int B = 0;
		
		if (A>10) {
			System.out.println("A > 10");
			if (A + B == 20) {
				System.out.println("A + B = 20");
			} else {
				System.out.println("Numero nao valido!");
			}
		}
	}
}