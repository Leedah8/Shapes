package pkgShapes;

public class Main {
	public static void main (String[] args) {
		
		Rectangle rec1= new Rectangle (10,20); 
		rec1.setLength(40);
		
		System.out.println(rec1.Area());
		System.out.println(rec1.Perimeter());
	}

}
