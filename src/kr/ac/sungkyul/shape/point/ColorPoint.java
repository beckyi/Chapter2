package kr.ac.sungkyul.shape.point;

public class ColorPoint extends Point {

	private String Color;

	public ColorPoint(int x, int y, String Color) {
		super(x,y);
//		setX(x);
//		setY(y);
		this.Color = Color;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	@Override	//부가정보 추가한 대상 표시
	public void show() {
//		super.show();	//부모 힘스
		System.out.println("[x= "+getX()+", y= "+getY()+", color = "+ Color +"]에 점을 그렸습니다.");	//x,y는 private
		
	}
}
