package Week8.Revise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class EISTOCK2 {

    public static void main(String[] args) {
        int numberOfTransaction = sc.nextInt();
        HashMap<Integer, Product> productMap = new HashMap<>();
        for (int i = 0; i < numberOfTransaction; i++) {
            String condition = sc.next();
            int code = sc.nextInt();
            int quantity = sc.nextInt();
            long price = sc.nextLong();
            int time = sc.nextInt();
            productMap.putIfAbsent(code, new Product(code));
            Product product = productMap.get(code);
            Transaction t = new Transaction(time, price, quantity);
            switch (condition) {
                case "+":
                    product.importGoods(t);
                    break;

                case "-":
                    product.exportGoods(t);
                    break;
            }
        }

        List<Product> products = new ArrayList<>(productMap.values());
        sort(products);
        print(products);
    }

    static void print(List<Product> products) {
        for (Product p : products) {
            if (p.stock > 0) {
                long avgPrice = p.totalPrice / p.stock;
                int oldestTransaction = p.batches.getFirst().time;
                sb.append(p.id).append(" ")
                        .append(p.stock).append(" ")
                        .append(avgPrice).append(" ")
                        .append(oldestTransaction).append("\n");
            }
        }
        System.out.println(sb);
    }

    static void sort(List<Product> products) {
        products.sort((p1, p2) -> p1.id - p2.id);
    }

    static class Transaction {
        int time;
        long price;
        int quantity;

        public Transaction(int time, long price, int quantity) {
            this.time = time;
            this.price = price;
            this.quantity = quantity;
        }

    }

    static class Product {
        int id;
        Deque<Transaction> batches = new ArrayDeque<>();
        int stock = 0;
        long totalPrice;

        public Product(int id) {
            this.id = id;
        }

        public void importGoods(Transaction t) {
            batches.add(t);
            stock += t.quantity;
            totalPrice += t.price * t.quantity;
        }

        public void exportGoods(Transaction t) {
            if (stock >= t.quantity) {
                int quantityNeeded = t.quantity;
                while (quantityNeeded > 0 && !batches.isEmpty()) {
                    Transaction oldestBatch = batches.peekFirst();
                    if (oldestBatch.quantity > quantityNeeded) { // if oldest batch have larger quantity needed
                        totalPrice -= quantityNeeded * oldestBatch.price;
                        oldestBatch.quantity -= quantityNeeded;
                        stock -= quantityNeeded;
                        quantityNeeded = 0; // export enough quantity

                    } else { // if oldest batch doesnt meet the needed quantity
                        batches.pollFirst();
                        totalPrice -= oldestBatch.quantity * oldestBatch.price;
                        stock -= oldestBatch.quantity;
                        quantityNeeded -= oldestBatch.quantity;
                    }
                }
            }

        }
    }

    /*
     * Bộ đọc dưới này, đừng sửa gì hết, k cần khai báo lại Reader, StringBuilder
     * Don't see below
     */

    static Reader sc = new Reader();
    static StringBuilder sb = new StringBuilder();
    static Random rd = new Random();

    static class Reader {
        private int BUFFER_SIZE = 1 << 16;
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int bufferPointer = 0, bytesRead = 0;
        private InputStream rd;

        public Reader() {
            this.rd = System.in;
        }

        public Reader(String nameFile) {
            try {
                this.rd = new FileInputStream(nameFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void close() {
            try {
                rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                bufferPointer = 0;
                try {
                    bytesRead = rd.read(buffer, bufferPointer, BUFFER_SIZE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bytesRead == -1) {
                    return -1;
                }
            }
            return buffer[bufferPointer++];
        }

        public int nextInt() {
            int number = 0;
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                number = number * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');
            return negative ? -number : number;
        }

        public long nextLong() {
            long number = 0L;
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                number = number * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');
            return negative ? -number : number;
        }

        public String next() {
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            StringBuilder t = new StringBuilder();
            do {
                t.append((char) c);
                c = read();
            } while (c > ' ');
            return t.toString();
        }

        public String nextLine() {
            int c = read();
            while (c == '\n' || c == '\r') {
                c = read();
            }
            StringBuilder t = new StringBuilder();
            while (c != '\n' && c != '\r' && c != -1) {
                t.append((char) c);
                c = read();
            }
            return t.toString();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char nextChar() {
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            return (char) c;
        }
    }
}
