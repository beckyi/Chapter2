 package chapter02;

public class Goods {	//실행이 아닌 정의를 위한 클래스이므로  main(X)
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	public static int countofgood;
	
	public Goods(){	//셍성자 (리턴타입X)
	}
	//생성자 overload(덮다) - 시그니처만 다름.
	public Goods(String name, int price, int countStock, int countSold){	//셍성자 (리턴타입X)
		this.name=name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	public void setName(String name){
		this.name = name;	//클래스 내 변수이다.
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
