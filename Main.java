public class Main{
    public static void main(String[] args) {
        System.out.println("Integer test: ");
        intCache();

        System.out.println("\nDouble test: ");
        doubleCache();

        System.out.println("\nString test: ");
        stringCache();
    }

    public static void intCache() {
        var list = new Cache<Number>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.exists(30));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.remove(20));
        System.out.println(list.getItemByIndex(2));
    }

    public static void doubleCache() {
        var list = new Cache<Double>(3);
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);

        System.out.println(list.exists(5.5));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.remove(5.5));
        System.out.println(list.getItemByIndex(2));
    }

    public static void stringCache() {
        var list = new Cache<String>(4);
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");

        System.out.println(list.exists("Banana"));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.remove("Pineapple"));
        System.out.println(list.getItemByIndex(1));
    }
}