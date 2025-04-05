import java.io.*;
class renamefile{
public static void main(String[] args){
File f = new File("C:\\Users\\lenovo\\Desktop\\LC.txt");
File r = new File("C:\\Users\\lenovo\\Desktop\\FC.txt");
if(f.exists()){
System.out.println(f.renameTo(r));
} else {
System.out.println("File does not exist");
}
}
}
