import java.util.HashMap;
import java.util.Map;
public class Main {
public static void main(String[] args) {
HashMap<String, Integer> people = new HashMap<>();
people.put("Noah", 40);
people.put("Mia", 27);
people.put("Lucas", 33);
people.put("Sophia", 29);
people.put("Ethan", 45);
System.out.println("People and their ages: " + people);
people.put("Mia", 28);
System.out.println("Updated Mia's age: " + people.get("Mia"));
String oldestPerson = "";
int maxAge = Integer.MIN_VALUE;
for (Map.Entry<String, Integer> entry : people.entrySet()) {
if (entry.getValue() > maxAge) {
maxAge = entry.getValue();
oldestPerson = entry.getKey();
}
}
System.out.println("Oldest person: " + oldestPerson + " (" + maxAge + " years)");
int totalAge = 0;
for (int age : people.values()) {
totalAge += age;
}
double averageAge = (double) totalAge / people.size();
System.out.println("Average age: " + averageAge);
}
}
