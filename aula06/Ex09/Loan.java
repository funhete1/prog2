public class Loan {
    public static void main(String[] args) {
        assert args.length == 4 : "run with java -ea 2 1000 1 20";
        int mouths = Double.parseInt(args[0]);
        double montante = Double.parseDouble(args[1]);
        double juros = Double.parseDouble(args[2]);
        double prestacao = Double.parseDouble(args[3]);
        System.out.printf("Total a pegar: %d", int_juros(mouths, montante, juros, prestacao));


    }
    public static double int_Loan(int mouths, double montante, double juros, double prestacao){
        for(int i= 0; i < mouths; i++){
            montante = montante + montante*(juros/100)-prestacao;
        }
        return montante;
    }
    public static double recu_Loan(int mouths, double montante, double juros, double prestacao){
        if (mouths == 0){
            return montante;
        }
        double total = recu_loan(mouths-1, montante, juros, prestacao);
        return total+total*(juros/100)-prestacao;
    }
}
