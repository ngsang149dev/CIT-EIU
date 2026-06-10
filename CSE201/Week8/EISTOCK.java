package Week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EISTOCK {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<Integer, Product> productMap = new HashMap<>();
        while (n > 0) {
            String condition = sc.next();
            int code = sc.nextInt();
            int quantity = sc.nextInt();
            long cost = sc.nextLong();
            productMap.putIfAbsent(code, new Product(code));
            Product product = productMap.get(code);
            if (condition.equals("+")) {
                product.importGoods(quantity, cost);
            } else {
                product.exportGoods(quantity, cost);
            }
             n--;
        }
        List<Product> products = new ArrayList<>(productMap.values());
        products.sort((p1, p2) -> {return p1.code-p2.code;});

        for (Product p : products) {
            if (p.isValid) {
                sb.append(p).append("\n");
            }
        }
        System.out.println(sb);
    }

    static class Product {
        boolean isValid;
        int code;
        int stock;
        long importCost;
        long exportCost;

        public Product(int code) {
            this.code = code;
        }

        public void importGoods(int quantity, long cost) {
            stock+= quantity;
            importCost+= quantity * cost;
            isValid = true;
        }
        
        public void exportGoods(int quantity, long cost) {
            if (stock >= quantity) {
                stock-= quantity;
                exportCost+= quantity * cost;
                isValid = true;
            }
        }

        @Override
        public String toString() {
            return "%s %s %s".formatted(this.code, this.importCost, this.exportCost);
        }
    }
}