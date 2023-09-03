/*04) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
diferentes de 10; A é menor que 10) caso não seja verdade imprima:
"número não válido".
 */

public class Exerc04 {
	public static void main(String[] args) {
		int A = 5;
		int B = 5;
		
		if (A > 10 || A + B == 20) {
			System.out.println("Numero valido!");
		} else if (A == B) {
			System.out.println("A eh igual a B; A e B sao diferentes de 10; A eh menor que 10");
		} else {
			System.out.println("Numero nao valido!");
		}
	}
}