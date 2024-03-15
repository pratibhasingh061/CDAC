package in.acts.cdac;

public class program3 {
	public static void main(String[] args) {
	int num1 = Integer.parseInt( args[ 0 ] );	
	double num2 = Double.parseDouble( args[ 1 ] );
	float num3 = Float.parseFloat( args[ 2 ] );
	double result = num1 + num2 + num3;
	System.out.println("Result  : "+result);
	}
}
