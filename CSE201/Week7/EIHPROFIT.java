package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EIHPROFIT {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Product> products = new ArrayList<>();
        while (n > 0) {
            int id = sc.nextInt();
            String name = sc.next();
            long price = sc.nextLong();
            long cost = sc.nextLong();
            int quantity = sc.nextInt();
            long profit = (price - cost) * quantity;
            Product product = new Product(id, name, profit);
            products.add(product);
            n--;
        }

        products.sort((p1, p2) -> {
            var cmp = Long.compare(p2.profit, p1.profit);
            if (cmp == 0) {
                cmp = p1.id - p2.id;
            }
            return cmp;
        });

        long standard = k < products.size()  ? products.get(k-1).profit : Long.MIN_VALUE;
        for (int i = 0; i < products.size();i++) {
            Product product = products.get(i);
            if (product.profit >= standard) {
                sb.append(product).append("\n");
            }
            else break;
        }
        System.out.println(sb);
    }

    static class Product {
        int id; 
        String name;
        long profit;

        public Product(int id, String name, long profit) {
            this.id = id;
            this.name = name;
            this.profit = profit;
        }  
        
        @Override
        public String toString() {
            return "%s %s %s".formatted(this.id, this.name, this.profit);
        }
    }
}