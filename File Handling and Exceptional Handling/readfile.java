import java.io.*;
class FileReaderExample {
public static void main(String[] args) {
try {
FileReader r = new
FileReader("C:\\Users\\lenovo\\Desktop\\LC.txt");
try {
int i;
while ((i = r.read()) != -1) {
System.out.print((char) i);
}
} finally {
r.close();
System.out.println("file closed");
}
} catch (IOException e) {
System.out.println("Exception Handled...!");
}
}
}
