/* 8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
for verdade: imprima "número não válido ".
 */

public class Exerc08 {
	public static void main(String[] args) {
		int A = 15;
		int B = 5;
		
		if (A > 10) {
		System.out.println("A > 10");
			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("Numero nao valido!");
			}
		}
		
	}
}