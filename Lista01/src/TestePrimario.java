
public class TestePrimario {

	public static void main(String[] args) {
		String NomeTeste = "Parece que seu programa funcionou!";
		System.out.println(NomeTeste);
		
		int Num = 10;
		
		if (Num < 10) {
			System.out.println("Numero menor que 10!");
		} else if (Num == 10) {
			System.out.println("O numero eh igual a 10!" + "\n" + "Voce eh um corno!");
		}
		
		// Lembrar de adicionar esses malditos comentários
		
		boolean Avaliador = true;
		
		if (Avaliador) {
			System.out.println("Seus testes continuam funcionando, sr. excelentissimo corno!");
		}
		
		int NumDois = 5;
		if (NumDois < 20) {
			if (NumDois < 10) {
				System.out.println("Seu algoritmo inutil estah a funcionar!");
			} else {
				System.out.println("Fodase essa parte do seu código. Ela nunca será executada.");
			}
		}
		
		if (NumDois < 20 && NumDois < 10) {
			System.out.println("Duvido esse algoritmo funcionar...");
		}
	}
}