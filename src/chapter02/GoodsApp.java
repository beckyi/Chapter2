package chapter02;

public class GoodsApp {

	public static void main(String[] args) {	//����
		// TODO Auto-generated method stub
		
		System.out.println(Goods.countofGoods);
		
		Goods camera = new Goods();	//new �ڿ� �پ ��ü�� �����Ǳ�����  ȣ�� - �ν��ͽ� ���� �ʱ�ȭ�� ���
		Goods goods1 = new Goods("cannon",300000,0,100);
		
		camera.setName("nikon");
		camera.setPrice(500000);
		camera.setCountSold(10);
		camera.setCountStock(50);
//		camera.name = "nikon";
//		camera.price = 400000;
//		camera.countStock = 30;
//		camera.countSold = 50;
		
//		String str = camera.toString();	//��ü ������ String���� �ٲ���. (���� Ŭ����  Object �� �Լ�)
//		System.out.println(str);	//����  �ؽ̰�
		
		camera.showInfo();
		System.out.println(camera);
		
		int discountPrice = camera.calcDiscountPrice(43);
		System.out.println(discountPrice);
		
		System.out.println(camera.getName());
		
		System.out.println(Goods.countofGoods);

	}
}
