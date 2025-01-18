package BasicCodingStudy.generic.ex3;

import BasicCodingStudy.generic.Cat;
import BasicCodingStudy.generic.Dog;

public class AnimalHospitalMainV0 {

    //개 병원은 개만 받아야 하고, 고양이 병원은 고양이만 받아야 한다.
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //개 병원에 고양이 전달 -> 컴파일 오류
        //개 타입 반환

        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("멍멍이2", 200));

    }
}
