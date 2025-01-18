package BasicCodingStudy.generic.ex5;

import BasicCodingStudy.generic.Animal;

public class WildcardEx {

    //T라는 제네릭 값을 받아서 출력함
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T =" + box);
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> t){
        T type = t.get();
        System.out.println("이름 = " + type.getName());
        return type;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
