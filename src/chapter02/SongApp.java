package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song IU = new Song();
		IU.setArtist("������");
		IU.setTitle("������");
		IU.setAlbum("Real");
		IU.setYear(2010);
		IU.setTrack(3);
		IU.setComposer("�̹μ�");
		
		IU.show();
		
		Song song1 = new Song("������","������","Real","�̹μ�",2010,3);
		song1.show();
		
		Song song2 = new Song("�۹�ȣ","��");
		Song song3 = new Song("������","���ع���");
		
		song2.show();
		song3.show();
	}

}
