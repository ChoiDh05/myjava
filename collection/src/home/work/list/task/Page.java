package home.work.list.task;

import java.util.ArrayList;

public class Page {
    public static void main(String[] args) {
        Product transformer = new Product("트랜스포머", 50_000, "완구", 100);
        Product 후라이팬 = new Product("후라이팬", 10_000, "생활용품", 50);
        Product 냉장고 = new Product("냉장고", 300_000, "가전제품", 30);
        Product 숟가락 = new Product("숟가락", 1500, "생활용품", 200);
        Product RTX4090 = new Product("그래픽카드", 2_000_000, "전자제품", 10);
        
        Market market = new Market();
        
        if (market.checkProductName(RTX4090.getName()) == null) {
            market.add(RTX4090);
        }
        if (market.checkProductName(후라이팬.getName()) == null) {
            market.add(후라이팬);
        }
        if (market.checkProductName(냉장고.getName()) == null) {
            market.add(냉장고);
        }
        if (market.checkProductName(숟가락.getName()) == null) {
            market.add(숟가락);
        }
        if (market.checkProductName(transformer.getName()) == null) {
            market.add(transformer);
        }

        ArrayList<Product> products = market.findAll();
        System.out.println(products);

        products = market.findAll();
        System.out.println(products);

        System.out.println(market.findByCount("그래픽카드"));
    }
}