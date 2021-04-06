import java.util.Scanner;

class Ex01{
    public static final Scanner in = new Scanner(System.in);
    static String[] operations = {"+","-","*","/"};

    public static void main(String[] args) {
        double a = in.nextDouble();
        String operation = in.next();
        double b = in.nextDouble();

        if(!arrayContains(operation)) {
            System.err.println("Operation not included in this calculator!");
        }

        double result = makeOperation(operation,a,b);
        System.out.println("Result " + result);
    }

    static boolean arrayContains(String element) {
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals(element)) return true;
        }
        return false;
    }

    static double makeOperation(String operation, double a, double b) {
        double result;
        switch(operation){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            default:
                System.err.println("Bad Error!");
                return Double.NaN;
        }
        return result;
    }
}
