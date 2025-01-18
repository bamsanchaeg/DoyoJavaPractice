package BasicCodingStudy.generic.ex4;

import BasicCodingStudy.generic.Cat;
import BasicCodingStudy.generic.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);
    }
}
