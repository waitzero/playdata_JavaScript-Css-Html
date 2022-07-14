// js에서 원시 값을 제외한 모든 것은 객체
// 원시값:5,'Yoo'같은 값들

// 기본적인 차이는 원시 값들을 하나의 값만을 나타내지만,
// 객채는 다양한 타입의 겂들을 하나의단위로 구성한 복함 자료 구조
let dog = {};
console.log(dog);
console.log(typeof dog);

let doggy = {
  //property:name, favirfruit
  //key:name, favorfruit
  //valuie:'toto','kiwi'
  name: "cloud",
  favoriteFruit: "paprika",
  bark: function () {
    console.log(`왈왈!${this.favoriteFruit}가 먹고싶다`);
  },
};
console.log(doggy);

//프로퍼티 조회(접근)
console.log(doggy.name); //.(dot)연산자를 통하여 객체의 포로퍼티에 접근
console.log(doggy.bark());
console.log(doggy[`name`]);

doggy.age = 2;
console.log(doggy);
