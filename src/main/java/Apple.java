import java.util.ArrayList;

public class Apple {
    // this is a non-static property (it is unique to every instance of apple)
    String color;

    // this is a static property (it is the same for every instance of apple)
    static int coreSize = 5;

    Apple(String color) {
        this.color = color;
    }

    // this function can be run without creating an apple instance, !!!you can only access static properties inside!!!
    static void grow() {
        coreSize += 1;
    }
}

class Test {
    public static void main(String[] args) {
        Apple redApple = new Apple("red");
        Apple greenApple = new Apple("green");

        System.out.println(redApple.coreSize);
        System.out.println(greenApple.coreSize);

        Apple.coreSize = 10; // <-- even if you change the static property on a single instance of your apples
        // it will still update every single instance because it is marked as static

        System.out.println(redApple.coreSize);
        System.out.println(greenApple.coreSize);

        Apple.grow(); // <-- you can call static functions without creating an object first (you can call the function on the class directly)
        Apple.grow();
        Apple.grow();
    }
}