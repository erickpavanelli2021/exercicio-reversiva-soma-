package controller;

public class SomaController {

	public SomaController() {
		super();
		}
		
		public int result(int soma) {
			//Condi��o de parada = se o fatorial for 0, dever� retornar 0
		 if (soma == 0) {
	      return 0;	
	      //Caso seja diferente de 0, dever� somar fatorial + (fatorial - 1)
		 }else {
			 //Fatorial + (Fatorial - 1)
			 return soma + result(soma - 1);
		 }
		 
	}
	}