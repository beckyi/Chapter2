package shpae;

public class PointApp {

	public static void main(String[] args) {
		
		// point1
		Point point1 = new Point(100,200);
		
//		point1.setX(100);
//		point1.setY(200);
		point1.show();
		
		// 셍성자 비교 - point2
		Point point2 = new Point(10,20);
		
//		point2.setX(10);
//		point2.setY(20);

		point2.show();
		point2.show(false);
		
		//Point 상속받은 ColorPoint - point3
		Point point3 = new ColorPoint(1000,2000,"red");
		//ColorPoint 상속받은  point4
//		ColorPoint point4 = new ColorPoint();
		
//		point3.setX(1000);
//		point3.setY(2000);
//		((ColorPoint)point3).setColor("blue");
		point3.show();
		
//		drawPoint(point1);
//		drawPoint(point2);
//		drawColorPoint((ColorPoint)point3);
//		drawColorPoint(point4);
		
		draw(point1);
		draw(point2);
		draw(point3);

//		drawShape(new Rectangle());
//		drawShape(new Triangle());
//		drawShape(new Circle());

//		drawShape(new Shape());
		
		draw(new Rectangle());
		draw(new Triangle());
		draw(new Circle());
		draw(new Pentagon());
		
	}
//	public static void drawPoint(Point point){
//		point.show();
//	}
//	public static void drawColorPoint(ColorPoint point){
//		point.show();
//	}
//	public static void drawShape(Shape shape){
//		shape.draw();
//	}
	
	public static void draw(Drawable drawable){
		drawable.draw();
	}
}
