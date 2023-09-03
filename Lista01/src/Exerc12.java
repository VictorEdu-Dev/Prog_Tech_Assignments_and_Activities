/* 12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
verdadeiras, imprima: "números não válidos". Sejam as afirmações
anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
disciplina de Técnicas de Programação”.
 */

public class Exerc12 {
	public static void main(String[] args) {
		int A = 5;
		int B = 10;
		
		if (A > 10) {
			System.out.println("A > 10");
		} else if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numeros invalidos!");
		}
		
		if (A > 10 || A + B == 20 || A < 10 || A + B != 20) {
			System.out.println("Sejam bem-vindos a disciplina de Tecnicas de Programacao");
		}	
	}
}