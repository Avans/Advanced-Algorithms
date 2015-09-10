package bstempty;

public class AbstractSyntaxTree {
	
	public static void main(String args[]) {
		Number vier = new Number(4);
		Number vijf = new Number(5);
		Operand vier_plus_vijf = new Operand('+', vier, vijf);
		
		Number zeven = new Number(7);
		Operand dat_keer_zeven = new Operand('*', vier_plus_vijf, zeven);
		
		System.out.println(dat_keer_zeven.toString()); // Should print "((4+5)*7)"
		System.out.println(dat_keer_zeven.evaluate()); // Should print "63"
		
		
	}
	
}
