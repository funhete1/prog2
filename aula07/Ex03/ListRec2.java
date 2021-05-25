import p2utils.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;

import javax.print.event.PrintEvent;

public class ListRec2 {
    public static void main(String[] args) throws FileNotFoundException{
        assert args.length > 0 : "Must contains a file as argument";
        String dirPath = args.length>=1 ? args[0] : "./";
        LinkedList<File> list = new LinkedList<File>();
        try{
            File dir = new File(dirPath);
            listrec(list, dir);
            list.print();

        }catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
    }
    public static void listrec(LinkedList<File> lst, File n ){
        File[] List = n.listFiles();
        for (int i = 0; i < List.length; i++) {
            if(List[i].isDirectory()){
                lst.addLast(List[i]);
                listrec(lst, List[i]);
            }
            else if(List[i].isFile()){
                lst.addLast(List[i]);
            }
        }
    }
}
