/* 16) Verifique se o valor de A é igual a 10. Se essa afirmação for verdadeira,
imprima "A == 10". Em seguida, verifique se a soma de A e B é igual a
20. Se essa afirmação for verdadeira, imprima "A + B == 20". Depois
disso, verifique se o valor de B é igual a 10. Se essa afirmação for
verdadeira, imprima "B == 10". */

public class Exerc16 {
	public static void main(String[] args) {
		int A = 10;
		int B = A;
		
		if (A == 10) {
			System.out.println("A == 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
		}
		if (A == B) {
			System.out.println("B == 10");
		}
		
	}
}