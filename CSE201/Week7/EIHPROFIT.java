package Week7;

import java.util.ArrayList;
import java.util.Scanner;

public class EIHPROFIT {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

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

    public static void main(String[] args) {
        int numberOfProduct = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < numberOfProduct;i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            int cost = sc.nextInt();
            int quantity = sc.nextInt();
            long profit = cost == 0 ? 0 : (price - cost) * (long)quantity;
            var product = new Product(id, name, profit);
            products.add(product);
        }

        products.sort((p1, p2) -> {
            var compare = Long.compare(p2.profit, p1.profit);
            if (compare == 0) {
                compare = Integer.compare(p1.id, p2.id);
            }
            return compare;
        });

        long standard = k < numberOfProduct? products.get(k-1).profit:Long.MIN_VALUE;;
        for (int i = 0; i < numberOfProduct;i++) {
            if (products.get(i).profit >= standard) {
                sb.append(products.get(i)).append("\n");
            }
            else break;
        }
        System.out.println(sb);
    }
}
