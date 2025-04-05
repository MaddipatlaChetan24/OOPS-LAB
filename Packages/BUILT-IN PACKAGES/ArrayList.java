import java.util.ArrayList;
import java.util.Collections;
public class Main {
public static void main(String[] args) {
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Mango");
fruits.add("Apple");
fruits.add("Pineapple");
fruits.add("Banana");
fruits.add("Avocado");
System.out.println("Original List: " + fruits);
fruits.remove("Pineapple");
System.out.println("After removing 'Pineapple': " + fruits);
Collections.sort(fruits);
System.out.println("Sorted List: " + fruits
System.out.println("Fruits starting with 'A':");
for (String fruit : fruits) {
if (fruit.startsWith("A")) {
System.out.println("- " + fruit);
}
}
System.out.println("Indexed Fruits:");
for (int i = 0; i < fruits.size(); i++) {
System.out.println(i + ": " + fruits.get(i));
}
}
}
