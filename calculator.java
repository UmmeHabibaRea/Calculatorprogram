public class calculator{
	public static void main(String[] args){
		addition p = addition(4,5);
		System.out.pritln(p);
		
		
	}
	public double SubtractionMethod(double x,double y){
		double result;
		result=x-y;
		return result;
	}

	double addition(double x,double y){
		double result = x + y;
		return result;
	}
}