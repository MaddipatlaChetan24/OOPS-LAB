import java.io.*;
class FileWriterExample {
public static void main(String[] args) {
try {
File f = new File("S:\\vs code for java'\\my first
project\\lc.txt");
FileWriter writer = new FileWriter(f);
try {
language.");
} finally {
writer.close();
writer.write("java programming is the best
}
System.out.println("Successfully wrote data to the
file.");
} catch (IOException i) {
System.out.println(i);
}
}
}
