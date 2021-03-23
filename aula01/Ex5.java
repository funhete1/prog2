import java.util.Scanner;
import static java.lang.System.*;

public class Ex5 {
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int counter = 0;
        double soma = 0, media = 0;
        Double[] num = new Double[50];
        do{
            num[counter] = in.nextDouble();
            if(num[counter] == 0)break;
            counter++;
        }while(true);
        for(int i = 0; i < counter; i++){
            soma = soma + num[i];
            if(num[0] == 0)break;
            media = soma / counter;
        }
        out.printf("soma: %.1f\nmedia:%.1f\n",soma, media);
    }
}
