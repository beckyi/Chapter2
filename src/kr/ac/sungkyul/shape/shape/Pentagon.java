package kr.ac.sungkyul.shape.shape;

import kr.ac.sungkyul.shape.i.Drawable;

public class Pentagon extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("오각형을 그렸습니다.");
	}

}
