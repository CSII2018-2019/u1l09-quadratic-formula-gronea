import javax.swing.JOptionPane;

public class U1L09QuadraticFormula {
	/*Write a method called quadratic that solves quadratic equations
	 * and prints their roots. 
	 * Recall that a quadratic equation is a polynomial equation 
	 * in terms of a variable x of the form a x2 + b x + c = 0. 
	 * The formula for solving a quadratic equation is: 
	 * 		Here is an example equation and it’s roots:
	 * 			equation:   x2 - 7x + 12    
	 * 			Call:       quadratic(1, -7, 12);    
	 * 			output:     First root = 4.0
	 * 			   			Second root = 3.0
	 * Your method should accept the coefficients a, b, and c as parameters 
	 * and should print the roots of the equation. 
	 * You may assume that the equation has two real roots, 
	 * though mathematically this is not always the case.
	 */
	
	public static void main(String[] args) {
		int root1 = 1;
		int root2 = 2;
		String inputA = JOptionPane.showInputDialog("What is your x^2: ");
		int a = Integer.parseInt(inputA);
		String inputB = JOptionPane.showInputDialog("What is your x: ");
		int b = Integer.parseInt(inputB);
		String inputC = JOptionPane.showInputDialog("What is your variable with no x: ");
		int c = Integer.parseInt(inputC);
		double answer1 = quadratic(root1, a, b, c);
		double answer2 = quadratic(root2, a, b, c);
		System.out.println(answer1 + " or " + answer2);
		
	}
	public static double quadratic(double root, double a, double b, double c) {
		if (root == 1) {
			double x = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
			return x;
		}else {
			double x = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
			return x;
		}
			
	}
}
