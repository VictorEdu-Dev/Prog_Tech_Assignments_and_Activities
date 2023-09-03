/* 14) Verifique se o valor de A é maior que 10. Se for verdade, imprima "A >
10". Além disso, verifique se a soma de A e B é igual a 20. Se essa
afirmação também for verdadeira, imprima "A + B == 20". Caso a
segunda afirmação não seja verdadeira, imprima "número não válido". */

public class Exerc14 {
	public static void main(String[] args) {
		int A = 5;
		int B = 15;
		
		if (A > 10) {
			System.out.println("A > 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero invalido!");
		}
		
	}
}