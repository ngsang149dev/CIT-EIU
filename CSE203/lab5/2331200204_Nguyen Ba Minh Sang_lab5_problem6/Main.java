package CSE203.lab5.p6;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(100);
        System.out.println(list.smallest());

        MyList<String> stringList = new MyList<>();
        stringList.add("Nguyen");
        stringList.add("Ba");
        stringList.add("Minh");
        stringList.add("Sang");
        System.out.println(stringList.largest());
    }
    
}
