/* 9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
verdadeiras imprima: "número não válido".
 */

public class Exerc09 {
	public static void main(String[] args) {
		int A = 15;
		int B = 5;
		
		if (A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero invalido");
		}
		
	}
}