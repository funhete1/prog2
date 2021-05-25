import java.util.Scanner;

class teste{

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        assert n != 0 : "tem que ser positivo o burro";
        System.out.println(n);
    }   
}