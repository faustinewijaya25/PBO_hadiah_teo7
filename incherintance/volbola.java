import java.util.Scanner;
class volbola {
	public static void main(String [] args) {
		r supobj = new r();
		vb subobj = new vb();
		Scanner in = new Scanner(System.in);
		System.out.println("Super Class: ");
		supobj.tampilr();
		
		System.out.println();
		
		System.out.println("Sub Class: ");
		System.out.print("Jari-jari Bola = ");
		subobj.r= in.nextDouble();
		subobj.phi = 3.14;
		subobj. x= 4.0/3.0;
		subobj.volume();
	}
}