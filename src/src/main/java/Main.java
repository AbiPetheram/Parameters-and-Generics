import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box box = new Box<>(5);
        box.castValue(5);
        System.out.println(box.castValue(2));
        System.out.println(box.castValue("Result: 2"));

        float f = 5F;

        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");

        box.castValue(f);
        System.out.println(box.castValue(5F));

        box.castValue(fruit);
        System.out.println(box.castValue(fruit));
    }
}
