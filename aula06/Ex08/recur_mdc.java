public class recur_mdc {

    public static void main(String[] args) { 
        
        System.out.println(recu_mdc(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    public static int recu_mdc(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return recu_mdc(b, a % b);
    }
}
