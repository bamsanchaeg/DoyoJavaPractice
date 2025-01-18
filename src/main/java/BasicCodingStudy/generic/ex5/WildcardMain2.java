package BasicCodingStudy.generic.ex5;

import BasicCodingStudy.generic.Animal;
import BasicCodingStudy.generic.Cat;
import BasicCodingStudy.generic.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox); 하한이 Animal(최소한 Animal 까지만 가능하다)
        //writeBox(catBox); 
        
        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box){

        box.set(new Dog("멍멍이", 100));

    }
}
