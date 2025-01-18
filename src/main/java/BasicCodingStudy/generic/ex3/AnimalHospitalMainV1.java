package BasicCodingStudy.generic.ex3;

import BasicCodingStudy.generic.Cat;
import BasicCodingStudy.generic.Dog;

public class AnimalHospitalMainV1 {

    //개 병원은 개만 받아야 하고, 고양이 병원은 고양이만 받아야 한다.
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        //문제 1 : 개 병원에 고양이 전달
        dogHospital.set(cat); //매개변수 체크 실패 : 컴파일 오류가 발생하지 않음

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
