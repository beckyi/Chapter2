package shpae;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("[x= "+x+", y= "+y+"]에 점을 그렸습니다.");
	}
	public void show(boolean visible){
		if(visible){
			show();	//재사용
			return;	//값 넘겨주도 않아도 종료
		}else{
			System.out.println("[x= "+x+", y= "+y+"]점을 지웠습니다.");
		}
	}
}
