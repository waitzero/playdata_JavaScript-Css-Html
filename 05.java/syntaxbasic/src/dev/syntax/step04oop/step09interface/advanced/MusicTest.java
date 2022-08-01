package dev.syntax.step04oop.step09interface.advanced;

public class MusicTest {

	public static void main(String[] args) {
		// 음악을 재생시켜주는 Audio 클래스를 만들고, 1pRecorde라는 참조변수에 인스턴스 할당
		Audio lpRecord = new Audio();
//		BTS앨범
		BTS btsAlbum = new BTS();
		lpRecord.musicPlay(btsAlbum); // "다이너마이트~"
		
		System.out.println("다음 노래 재생");
		
		//Joy앨범
		//Joy joyAlbum = new Joy();
		
		//1pRecord.musicPlay(joyAlbum);//"외로운 날들이여 이제는 안녕~"
		
		//인터페이스도 타입이다 라는 개념을 활용해야함

	}

}
