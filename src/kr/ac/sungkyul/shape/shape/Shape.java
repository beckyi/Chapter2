package kr.ac.sungkyul.shape.shape;

public abstract class Shape {	//구현 X 메소드 (객체화 X)
	private String lineColor;
	private String fillColor;
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
//	public void draw(){
//		System.out.println("구체적인 도형을 그릴 수  없습니다.");
//	}
//	public abstract void draw();	//추상메소드 (사용 금지)
}
