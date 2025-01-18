package BasicCodingStudy.generic.ex3;

import BasicCodingStudy.generic.Cat;
import BasicCodingStudy.generic.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        //문제 1 : 개 병원에 고양이 전달
        dogHospital.set(dog); //다른 타입을 입력하면 컴파일 오류가 발생한다. dogHospital.set(cat);

        catHospital.set(cat);
        catHospital.checkup();

        //개 병원에 고양이 전달 -> 컴파일 오류
        //개 타입 반환

        dogHospital.set(dog);
        //반환하는 타입이 Animal이다. 사용할 경우 다운캐스팅을 해줘야 함(but 타입 안정성이 깨짐)
        Dog biggerdog = (Dog)dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigger = " + biggerdog);
    }
}
