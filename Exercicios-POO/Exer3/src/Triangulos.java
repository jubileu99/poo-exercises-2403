import java.lang.Math;

public class Triangulos {
	
	
	
	public Triangulos(double a, double b, double c) {
		if(checkTriangle(a, b, c)){
			System.out.println("� um triangulo");
		}else {
			System.out.println("N�o � um triangulo");
		}
	}
	public Triangulos(double catOposto, double catAdj) {
		double tg = Math.tan(catOposto/catAdj);
		
		System.out.println(":  " + tg);
		
		if((tg*180/Math.PI) < 90 ) {
			System.out.println("N�o � retangulo " + tg*180/Math.PI);
		}else {
			System.out.println("Retangulo " + tg*180/Math.PI);
		}
		
	}
	
	public boolean checkTriangle(double a, double b, double c) {
		if(((Math.abs(b-c) < a) && a < (b + c)) && ((Math.abs(a-c) < b) && b < (a + c)) && ((Math.abs(b-a) < c) && c < (b + a))) {
			return true;
		}else {
			return false;
		}
	}
	
	
}