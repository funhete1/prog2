import java.io.*;
import java.util.Scanner;
import java.lang.Exception;

class SortInts{
    public static void main(String[] args)throws IOException{
        SortedListInt inteiros = new SortedListInt();
        assert args.length > 0 : "Run the program with java -ea _name of the files that you want to read_";
        File[] files = new File[args.length];
        try{
            for(int i = 0; i < args.length; i++){
                files[i] = new File("./"+args[i]);
                assert files[i].isFile() : "The input file is not a File";

                Scanner sc = new Scanner(files[i]);
                while(sc.hasNextLine()){
                    String line = sc.next();
                    try{
                        int n = Integer.parseInt(line); 
                        inteiros.insert(n);
                    }catch(Exception e){}
                }
                sc.close();
            }
        }catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
        for(int i = 0; i <= inteiros.size(); i++){
            System.out.println(inteiros.first());
            inteiros.removeFirst();
        }
        
    }
}
