import java.util.Scanner;

public class ViDu2 {
	public static void main(String[] args) {
		double r, dienTich,chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bán kính r = ");
		r=sc.nextDouble();
		
		//Tính Chu vi
		chuVi=2*Math.PI*r;
		System.out.println("Chu vi = "+chuVi);
		System.out.println("Cv= "+ Math.round(chuVi));
		System.out.println("Cv= "+Math.round(chuVi*100.0)/100.0);
		
	
	}
}
