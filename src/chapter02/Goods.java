 package chapter02;

public class Goods {	//������ �ƴ� ���Ǹ� ���� Ŭ�����̹Ƿ�  main(X)
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	public static int countofGoods;
	
	public Goods(){	//�ļ��� (����Ÿ��X) - �ʱ�ȭ
		Goods.countofGoods++;
	}
	//������ overload(����) - �ñ״�ó�� �ٸ�.
	public Goods(String name, int price, int countStock, int countSold){	//�ļ��� (����Ÿ��X)
		this.name=name;	//�Ķ���� ������ �̸��� ���� �� this�� ����Ͽ� ����
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	public static int getCountofGoods() {	//Ŭ���� ������ ���� ����
		return countofGoods;
	}
	public static void setCountofGoods(int countofGoods) {
		Goods.countofGoods = countofGoods;
	}
	public void setName(String name){
		this.name = name;	//Ŭ���� �� �����̴�.
	}
	public String getName(){
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0){
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public String showInfo(){
		return "";
	}
	public int calcDiscountPrice(int a){
		return a;
	}
	public String toString(){
		return "Goods[name= "+name+", price= "+price+", countStock= "+countStock+" ]";
	}
}
