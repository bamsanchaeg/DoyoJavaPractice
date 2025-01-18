package BasicCodingStudy.generic.ex3;

import BasicCodingStudy.generic.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {

        this.animal = animal;
    }

    public void checkup() {

        //T의 타입을 메서드를 정의하기 전까진 알 수 없다. Object의 기능만 사용
        animal.toString();
        animal.equals(null);

        // 컴파일 오류 발생
        //System.out.println("동물 이름 : " + animal.getName());
        //System.out.println("동물 크기 : " + animal.getSize());
        //animal.sound();

    }

    public Animal bigger(T target) {
        //컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}