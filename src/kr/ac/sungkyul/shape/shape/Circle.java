package kr.ac.sungkyul.shape.shape;

import kr.ac.sungkyul.shape.i.Drawable;

public class Circle extends Shape implements Drawable {

	//���� Ŭ������ ��� �߻� �޼ҵ� �ݵ�� ���ٶ��̵�!
	@Override	//�������̵� ���� �ʾ��� ��� �θ�(shape) draw() ȣ��
	public void draw() {
		System.out.println("���� �׷Ƚ��ϴ�.");
	}
	
	
}
