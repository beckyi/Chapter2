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
	}

}
