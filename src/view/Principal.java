package view;

//Importando a classe de controle do Fatorial
import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		//Método construtor
		SomaController ft = new SomaController();
		//Definindo um valor para o fatorial
		int soma = 10;
		//variavel que recebe o resultado
		int resultado = ft.result(soma);
		System.out.println("Resultado: "+resultado);

	}

}
