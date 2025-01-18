package BasicCodingStudy.generic;

//객체를 보관할 수 있다
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    // static T staticMethod1(T t) {} //제네릭 타입의 T 사용 불가능


}
