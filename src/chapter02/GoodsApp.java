package chapter02;

public class GoodsApp {

	public static void main(String[] args) {	//실행
		// TODO Auto-generated method stub
		
		System.out.println(Goods.countofGoods);
		
		Goods camera = new Goods();	//new 뒤에 붙어서 객체가 생성되기전에  호출 - 인스터스 변수 초기화에 사용
		Goods goods1 = new Goods("cannon",300000,0,100);
		
		camera.setName("nikon");
		camera.setPrice(500000);
		camera.setCountSold(10);
		camera.setCountStock(50);
//		camera.name = "nikon";
//		camera.price = 400000;
//		camera.countStock = 30;
//		camera.countSold = 50;
		
//		String str = camera.toString();	//객체 정보를 String으로 바꿔줌. (상위 클래스  Object 내 함수)
//		System.out.println(str);	//참조  해싱값
		
		camera.showInfo();
		System.out.println(camera);
		
		int discountPrice = camera.calcDiscountPrice(43);
		System.out.println(discountPrice);
		
		System.out.println(camera.getName());
		
		System.out.println(Goods.countofGoods);

	}
}
