/* 7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
afirmação não seja verdadeira, imprima: "número não válido". */

public class Exerc07 {
	public static void main(String[] args) {
		int A = 5;
		int B = 14;
		
		if (A > 10 && A + B == 20) {
			System.out.println("Numeros validos!");	
		} else if (A <= 10) {
			System.out.println("Numero nao valido!");
		}	
	}
}