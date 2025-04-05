import java.io.*;
class file {
public static void main(String[] args) throws IOException {
File f = new File("S:\\vs code for java'\\my first
project\\lc.txt");
if (f.createNewFile()) {
System.out.println("File successfully created.");
} else {
System.out.println("File already exists.");
}
}
}
