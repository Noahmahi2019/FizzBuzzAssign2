public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {

            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("fizzbuzz");
             if (i % 3 == 0) {
                System.out.println("Fizz");
            }
             if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}
