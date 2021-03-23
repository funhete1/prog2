import static java.lang.System.*;
import java.util.Scanner;

public class DatasPassadas {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Data today = new Data();
        Data natal = new Data(25-1,12,today.ano()-1);
        do{
            natal.seguinte();
            out.println(natal.extenso());
        }while(!natal.toString().equals(today.toString()));
    }
}
