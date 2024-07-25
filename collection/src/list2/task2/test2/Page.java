 package list2.task2.test2;

import list.task.DBConnecter;
import java.util.ArrayList;

public class Page {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // 상품 생성
        Product1 apple = new Product1("Apple", 1000, "Fruit", 50);
        Product1 banana = new Product1("Banana", 1500, "Fruit", 30);
        Product1 laptop = new Product1("Laptop", 1500000, "Electronics", 10);
        Product1 headphones = new Product1("Headphones", 50000, "Electronics", 20);
        Product1 orange = new Product1("Orange", 1200, "Fruit", 40);
        Product1 blender = new Product1("Blender", 80000, "Appliances", 15);
        Product1 monitor = new Product1("Monitor", 300000, "Electronics", 5);
        Product1 mouse = new Product1("Mouse", 25000, "Electronics", 25);
        Product1 watermelon = new Product1("Watermelon", 1800, "Fruit", 10);
        Product1 keyboard = new Product1("Keyboard", 45000, "Electronics", 30);

        // 상품 추가
        shop.add(apple);
        shop.add(banana);
        shop.add(laptop);
        shop.add(headphones);
        shop.add(orange);
        shop.add(blender);
        shop.add(monitor);
        shop.add(mouse);
        shop.add(watermelon);
        shop.add(keyboard);

        // 상품 목록 조회
        ArrayList<Product1> products = shop.findAll();
        System.out.println("전체 상품 목록: " + products);

        // 상품 이름으로 조회
        Product1 foundProduct = shop.checkProductName("Banana");
        System.out.println("조회된 상품(Banana): " + foundProduct);

        // 상품 수정
        banana.setPrice(1200);
        banana.setCount(25);
        shop.update(banana);

        // 수정된 상품 목록 조회
        products = shop.findAll();
        System.out.println("수정된 상품 목록: " + products);

        // 상품 삭제
        shop.remove(apple);

        // 삭제된 상품 목록 조회
        products = shop.findAll();
        System.out.println("삭제된 후 상품 목록: " + products);
    }
}
