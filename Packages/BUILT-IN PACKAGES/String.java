import java.lang.String;
public class Main {
public static void main(String[] args) {
String str = " Java is powerful and fun! ";
System.out.println("Original string: '" + str + "'");
String trimmed = str.trim();
System.out.println("Trimmed string: '" + trimmed + "'");
String replaced = trimmed.replace("fun", "awesome");
System.out.println("Replaced string: '" + replaced + "'");
String[] words = replaced.split(" ");
System.out.println("Number of words: " + words.length);
System.out.println("Words:");
for (String word : words) {
System.out.println("- " + word);
}
}
}
