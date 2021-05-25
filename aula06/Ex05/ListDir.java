import java.io.File;
import java.io.IOException;

public class ListDir{
    public static void main(String[] args)throws IOException{
        try {
            File n = new File(args[0]);
            listFile(n);
        } catch (NullPointerException e) {
            System.out.println("argument is not a valid file");
            System.exit(1);
        }
    }
    public static void listFile(File n){
        File[] files = n.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()){
                System.out.println(files[i].getPath());
                listFile(files[i]);
            }else{
                System.out.println(files[i].getPath());
            }
        }
    }
}
