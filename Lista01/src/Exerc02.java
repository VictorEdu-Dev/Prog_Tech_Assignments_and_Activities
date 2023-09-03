/* 2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
nenhumas das afirmação não seja verdadeira, imprima: "número não
válido", (obs: apenas uma impressão é permitida na saída do programa). */

public class Exerc02 {
	public static void main(String[] args) {
		int A = 10;
		int B = 1;
		
		if (A < 10) {
				System.out.println("A < 10");
			} else if (A + B == 20) {
				System.out.println("A + B == 20");
				} else {
				System.out.println("Numero nao valido!");
			}
		}
	}