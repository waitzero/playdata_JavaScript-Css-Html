package dev.syntax.step04oop.step04practice;

public class DogTest {

	public static void main(String[] args) {
	Dog tyka =  new Dog();
	tyka.setAge(13);
	tyka.setColor("����");
	tyka.setName("Ÿ��ī");
	
	tyka.bark();
	System.out.println(tyka.getAge());
	System.out.println(tyka.getColor());
	//�������� ������
	}

}

//System.out.println(tyke == spike); // false�� ������ ���� �ּ����� �ۼ��ϱ�
//����:�ּҰ��� ���� �ʾƼ� 

//tyke = spike;
//System.out.println(tyke == spike); // true�� ������ ���� �ּ����� �ۼ��ϱ�
//���ٷ� �ּҰ��� ��������