/* 6) Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
20”.
 */

public class Exerc06 {
	public static void main(String[] args) {
		int A = 15;
		int B = 5;
		
		if (A > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
	}
}	