package shpae;

public class ColorPoint extends Point {
	private String Color;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	@Override	//�ΰ����� �߰��� ��� ǥ��
	public void show() {
//		super.show();	//�θ� ����
		System.out.println("[x= "+getX()+", y= "+getY()+", color = "+ Color +"]�� ���� �׷Ƚ��ϴ�.");	//x,y�� private
		
	}
}
