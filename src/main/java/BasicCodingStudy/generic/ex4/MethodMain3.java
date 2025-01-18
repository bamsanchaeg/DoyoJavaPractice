package BasicCodingStudy.generic.ex4;

import BasicCodingStudy.generic.Cat;
import BasicCodingStudy.generic.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.<Cat>printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}