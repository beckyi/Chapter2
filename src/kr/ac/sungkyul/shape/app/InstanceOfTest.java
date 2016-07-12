package kr.ac.sungkyul.shape.app;

import kr.ac.sungkyul.shape.i.Drawable;
import kr.ac.sungkyul.shape.point.ColorPoint;
import kr.ac.sungkyul.shape.point.Point;
import kr.ac.sungkyul.shape.shape.*;

public class InstanceOfTest {

	public static void main(String[] args) {
		
//		Circle c = new Circle();
//		System.out.println(c instanceof Rectangle);	// 에러 출력
		
		Shape s = new Circle();
		
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rectangle);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Drawable);

		Point p = new ColorPoint(50,100,"yellow");
		
		System.out.println(p instanceof ColorPoint);
		System.out.println(p instanceof Point);
		System.out.println(p instanceof Drawable);
		
//		System.out.println(p instanceof ColorPoint);
	}
}
