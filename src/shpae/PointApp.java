package shpae;

public class PointApp {

	public static void main(String[] args) {
		
		// point1
		Point point1 = new Point();
		
		point1.setX(100);
		point1.setY(200);
		point1.show();
		
		// 셍성자 비교 - point2
		Point point2 = new Point();
		
		point2.setX(10);
		point2.setY(20);

		point2.show();
		point2.show(false);
		
		//Point 상속받은 ColorPoint - point3
		Point point3 = new ColorPoint();
		
		point3.setX(1000);
		point3.setY(2000);
		((ColorPoint)point3).setColor("blue");
		
		point3.show();
	}

}
