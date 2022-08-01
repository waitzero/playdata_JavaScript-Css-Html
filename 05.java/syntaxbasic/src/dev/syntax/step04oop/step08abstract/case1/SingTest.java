 package dev.syntax.step04oop.step08abstract.case1;

  public class SingTest { // Ctrl + Shift + P(중괄호 위치 확인)

    public static void main(String[] args) {
      // Animal 타입의 배열 animals를 만들고, 반복문을 통해 sing()를 일괄적으로 호출
      Animal[] animals = new Animal[4]; // 길이가 4인 비어있는 배열

      animals[0] = new Cat();
      animals[1] = new Mouse();
      animals[2] = new Dog();
      animals[3] = new Animal();

      for (Animal anAnimal: animals) { // animals 배열에서 요소 한개를 anAnimal 임시 변수에 할당
        anAnimal.sing();
      }
    }

  }

  class Mouse extends Animal { void sing() { System.out.println("찍찍");} }
  class Cat extends Animal { void sing() { System.out.println("야옹야옹");} }
  class Dog extends Animal { void sing() { System.out.println("멍멍");} }