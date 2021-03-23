import java.util.Scanner;
import static java.lang.System.*;


public class Ex4 {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String[] frase = new String[50];
        for (int i = 0; i < frase.length; i++) {
            frase[i] = in.nextLine();
            if(frase[i].equals(""))break;
        }
         for(int i = 0; i < frase.length; i++){
            if(frase[i].equals(""))break;
            frase[i] = frase[i].replace("r", "").replace("R", "");
            frase[i] = frase[i].replace("l", "u").replace("L", "U");
            out.printf("%s\n", frase[i]);
        }
    }
}
