public class Main {
    public static void PrintRect(Rectangle r) {

    }

    public static void main(String[] args) {
        Rectangle unitRect = new Rectangle();
        Rectangle rect = new Rectangle(5, 10);
        rect.setWidth(10);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Unit Area: " + unitRect.getArea());

        Person john = new Person("John S", "C00123456");
        System.out.println(john);
        Person landon = new Student("Landon", "C00123");
        System.out.println(landon.toString());

        john.equals(rect);
    }
}
