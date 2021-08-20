package controller;

public class SomaController {

	public SomaController() {
		super();
		}
		
		public int result(int soma) {
			//Condição de parada = se o result for 0, deverá retornar 0
		 if (soma == 0) {
	      return 0;	
	      //Caso seja diferente de 0, deverá somar soma + (soma - 1)
		 }else {
			 //Fatorial + (Fatorial - 1)
			 return soma + result(soma - 1);
		 }
		 
	}
	}