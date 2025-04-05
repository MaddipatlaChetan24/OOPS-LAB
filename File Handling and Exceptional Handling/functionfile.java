class file{
public static void main(String[] args) throws IOException{
File f = new File("S:\\vs code for java'\\my first
project\\lc.txt");
if(f.exists()){
System.out.println("file name." + f.getName());
System.out.println("file Location." +
f.getAbsolutePath());
System.out.println("file Writable." + f.canWrite());
System.out.println("file Readable." + f.canRead());
System.out.println("file size." + f.length());
System.out.println("file removed." + f.delete());
} else {
System.out.println("file does not exist");
}
}
}
