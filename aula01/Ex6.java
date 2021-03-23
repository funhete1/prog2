
import java.util.Scanner;
import static java.lang.System.*;

public class Ex6 {
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int counter = 0, num = 0;
        int random = (int) (Math.random() * (100+1));
        System.out.println(random);
        while(true){
            num = in.nextInt();
            if(num > random){
                out.printf("mais baixo\n");
            }
            if(num < random){
                out.printf("mais alto\n");
            }
            
            counter++;
            if(num == random){
                out.printf("Parabens o burro so te custaram %d tentativas\n", counter);
                break;
            }
        }
    }
}
