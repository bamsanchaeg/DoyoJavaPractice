package BasicCodingStudy.generic;

//객체를 보관할 수 있다
//이후 컬렉션 강좌를 들으며 제네릭이 어떻게 응용되는지 확인하는게 더 좋은 방향이다.
//깊게 사용할 수 있고, 로우타입은 되도록이면 사용하면 안된다.
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
