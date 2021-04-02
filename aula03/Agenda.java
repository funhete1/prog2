public class Agenda{
    private Tarefa[] tarefa; 
    public Agenda(){
        tarefa = new Tarefa[1000];
    }
    
    public void novaTarefa(Tarefa t){
        for (int i = 0; i < tarefa.length; i++) {
            
            if(tarefa[i]==null){
                tarefa[i] = t;
                break;
            }
            if(tarefa[i].inicio.compareTo(t.inicio) > 0) {
                Tarefa next = t;
                for (int j = i; j < tarefa.length; j++) {
                    Tarefa old = tarefa[j];
                    tarefa[j] = next;
                    next = old;
                    if(next==null) break;
                }
                break;
            }
        }
    }
    public void escrever(){
        for (int i = 0; i < tarefa.length; i++) {
            if(this.tarefa[i] == null)break;
            System.out.printf("Conteudo da tarefa %d: %s\n", i, tarefa[i].toString());
        }
    }
}