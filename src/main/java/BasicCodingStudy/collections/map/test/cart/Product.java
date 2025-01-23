package BasicCodingStudy.collections.map.test.cart;

import java.util.Objects;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    //equals와 hashCode의 중요성. 중복된 키의 값을 리뉴얼 하지 않고 새롭게 더해줘야 하기 때문에 이 부분이 제대로 돌아간다
    //이 두 메소드가 없으면 중복 제거가 절대 안됨.. 주의합시다.
    //Map` 의 Key로 `Product` 가 사용된다. 따라서 반드시 `hashCode()` , `equals()` 를 재정의해야 한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", price=" + price +
                '}';
    }
}
