package kr.ac.sungkyul.shape.shape;

public abstract class Shape {	//���� X �޼ҵ� (��üȭ X)
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
//		System.out.println("��ü���� ������ �׸� ��  �����ϴ�.");
//	}
//	public abstract void draw();	//�߻�޼ҵ� (��� ����)
}
