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
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getLast());
    }

    public static void doubleCache() {
        var list = new Cache<Double>(5);
        System.out.println(list.getFirst());
    }

    public static void stringCache() {
        var list = new Cache<String>(5);
        System.out.println(list.getFirst());
    }
}