package controller;

public class SomaController {

	public SomaController() {
		super();
		}
		
		public int fat(int fatorial) {
			//Condição de parada = se o fatorial for 0, deverá retornar 0
		 if (fatorial == 0) {
	      return 0;	
	      //Caso seja diferente de 0, deverá somar fatorial + (fatorial - 1)
		 }else {
			 //Fatorial + (Fatorial - 1)
			 return fatorial + fat(fatorial - 1);
		 }
		 
	}
	}