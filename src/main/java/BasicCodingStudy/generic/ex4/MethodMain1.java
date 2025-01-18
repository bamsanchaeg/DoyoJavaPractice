package BasicCodingStudy.generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        // 제네릭으로 뭔갈 넘길땐 타입 매개변수를 정해줘야 한다
        // 제네릭 타입은 객체를 생성하는 시점에 타입이 정해지기 때문에 static 메서드에 타입 매개변수를 사용할 수 없다.
        // 따라서 static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야 한다.
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>genericMethod(10);
        Double doubleValue = GenericMethod.<Double>genericMethod(20.0);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);

    }
}
