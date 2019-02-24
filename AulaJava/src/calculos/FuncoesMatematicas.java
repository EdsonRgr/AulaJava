package calculos;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		FuncoesMatematicas obj = new FuncoesMatematicas ();
	System.out.println("Soma : " + obj.soma(8, 8));	
	System.out.println("Multiplicação: " + obj.mult(7, 7));
	System.out.println("Divisão : "+obj.div(8, 2));
	System.out.println("Subtração : "+obj.sub(8, 8));
	System.out.println("Potencia, numero dps expoente :"+obj.pt(5, 1 ));
	System.out.println("potencia com for : " + obj.potenciacao(5, 1));
	}

	
	public double soma (int som1 , int som2) {
		return som1+som2;
	}
	public double mult (int mult1 , int mult2) {
		return mult1*mult2;
	}
	public double div (int div1 , int div2) {
		return div1/div2;
	}
	public double sub (int sub1 , int sub2) {
		return sub1-sub2;
	}
	public double pt (double pt1 , double pt2) {
		return Math.pow(pt1, pt2);
	}
	
	public double potenciacao (double base , double exp ) {
		
		double result = 1;
		for (int i = 0 ; i < exp; i++  ) {
			result = result * base ; 
			}
		return result;
	}
}
