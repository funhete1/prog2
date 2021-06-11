import java.util.Arrays;
import java.util.Scanner;

class SumRec{
    public static double sum = 0;
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        assert args.length > 0 : "Run with java SumRec _arrays numbers_";
        System.out.println("from what index do you want start the sum and in what element should the sum stop: ");

        int start = sc.nextInt();
        int end = sc.nextInt();
        
        assert start < end : "the index of start must be smaller than the end index";
        assert start >= 0 && end >= 0 : "negative index's are not valible";
        
        double[] doubleArray = Arrays.stream(args).mapToDouble(Double::parseDouble).toArray();
        double result = Sum_Rec(doubleArray, start, end);
        System.out.printf("%.2f\n", result);
    }
    public static double Sum_Rec(double[] arr, int index, int end){
        if(index ==  arr.length|| index == end){
            return 0;
        }
        return arr[index] + Sum_Rec(arr, index+1, end);
    }
}