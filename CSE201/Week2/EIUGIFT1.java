package Week2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;

public class EIUGIFT1 {

    public static void main(String[] args) {
        int numberOfGifts = sc.nextInt();
        int numberOfWarpers = sc.nextInt();
        int[] gifts = new int[numberOfGifts];
        int[] wrappers = new int[numberOfWarpers];
        for (int i = 0; i < gifts.length;i++) {
            gifts[i] = sc.nextInt();
        }
        for (int i = 0; i < wrappers.length;i++) {
            wrappers[i] = sc.nextInt();
        }
        Arrays.sort(gifts);
        Arrays.sort(wrappers);
        int i = 0, j = 0;
        int count = 0;
        while (i < gifts.length && j < wrappers.length) {
            if (gifts[i] * 2 <= wrappers[j] && gifts[i] * 3 >= wrappers[j]) {
                count++;
                i++;
                j++;
            }
            else if (wrappers[j] < gifts[i] * 2 ) {
                j++;
            } else if (gifts[i] * 3 < wrappers[j]) {
                i++;
            }
        }
        System.out.println(count);
    }
    /*
            Bộ đọc dưới này, đừng sửa gì hết, k cần khai báo lại Reader, StringBuilder
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
