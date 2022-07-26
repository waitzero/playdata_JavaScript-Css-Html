package dev.syntax.step04oop.step04practice;

public class DogTest {

	public static void main(String[] args) {
	Dog tyka =  new Dog();
	tyka.setAge(13);
	tyka.setColor("검정");
	tyka.setName("타이카");
	
	tyka.bark();
	System.out.println(tyka.getAge());
	System.out.println(tyka.getColor());
	//정보은닉 때문에
	}

}

//System.out.println(tyke == spike); // false가 나오는 이유 주석으로 작성하기
//이유:주소값이 같지 않아서 

//tyke = spike;
//System.out.println(tyke == spike); // true가 나오는 이유 주석으로 작성하기
//윗줄로 주소값이 같아져서