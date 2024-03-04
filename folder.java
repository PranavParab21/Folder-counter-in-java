import java.io.*;
class folder
{
    public static void main(String args[])
    {
    File f1=new File("C:\\Users\\prana\\OneDrive\\Desktop");
    File[] folders=f1.listFiles(File::isDirectory);
    int fc=folders.length;
    System.out.println("No of folder are ="+fc);
}
}
    