package kr.ac.sungkyul.shape.shape;

import kr.ac.sungkyul.shape.i.Drawable;

public class Circle extends Shape implements Drawable {

	//상위 클래스의 모든 추상 메소드 반드시 오바라이딩!
	@Override	//오버라이드 되지 않았을 경우 부모(shape) draw() 호출
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	
	
}
