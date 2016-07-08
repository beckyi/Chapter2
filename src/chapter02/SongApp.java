package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song IU = new Song();
		IU.setArtist("아이유");
		IU.setTitle("좋은날");
		IU.setAlbum("Real");
		IU.setYear(2010);
		IU.setTrack(3);
		IU.setComposer("이민수");
		
		IU.show();
		
		Song song1 = new Song("아이유","좋은날","Real","이민수",2010,3);
		song1.show();
		
		Song song2 = new Song("송민호","겁");
		Song song3 = new Song("케이윌","말해뭐해");
		
		song2.show();
		song3.show();
	}

}
