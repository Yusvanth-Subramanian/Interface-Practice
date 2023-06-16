
public class Main {
    public static void main(String[] args) {

        // Lambda Expression
        greet(message -> System.out.println("Hello World!!!"));

        // Method reference
        greet(System.out::println);

        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer){
        printer.print("Hello World!!!");
    }
}