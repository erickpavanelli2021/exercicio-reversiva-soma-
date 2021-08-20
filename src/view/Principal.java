package view;
import javax.swing.JOptionPane;

//Importando a classe de controle do Fatorial
import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		//Método construtor
		SomaController ft = new SomaController();
		//Definindo um valor para o fatorial
		int soma = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número desejado: "));
		//int num = Integer.parseInt(numero);
		//variavel que recebe o resultado
		int resultado = ft.result(soma);
		System.out.println("Resultado: "+resultado);

	}

}
