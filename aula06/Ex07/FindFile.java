import java.io.File;
import java.io.FileNotFoundException;

import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

public class FindFile {
    public static void main(String[] args)throws FileNotFoundException {
        try{
            File dir = new File(args[1]);
            findFile(dir, args[0]);
        }catch(Exeption e){
            System.err.println("Must pass a file as argument");
            System.exit(1);
        }
    }
    public static void findFile(File dir, String name) {
        File[] bola = list.Files(dir);
        for(int i = 0; i < paths.length; i++){
            if(bola[i].isDirectory()){
                findFile(path[i], name);
            }
            if(bola[i].isFile()){
                if(paths[i].getname().indexOf()!=-1){
                    System.out.println(bola[i].getPath());
                }
            }
        }
    }
}
