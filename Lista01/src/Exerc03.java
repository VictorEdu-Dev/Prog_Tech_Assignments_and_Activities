/* 3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
impressões são permitidas na saída do programa).
 */

public class Exerc03 {
	public static void main(String[] args) {
		int A = 10;
		int B = A;
		
		if (A + B == 20) {
			System.out.println("A == 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
			}
		if (B == 10) {
			System.out.println("B == 10");
		}
	}
}