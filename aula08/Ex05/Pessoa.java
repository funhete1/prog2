public class Pessoa implements Comparable<Pessoa>//metodo compareTo fica inbutido na classe
{ 
  private String name;
  private Data data;
  
  public Pessoa(String name, Data date){
    this.name = name;
    data = date;
  }
  public String Nome(){return name;}

  public Data Dia(){return data;}

  public String toString(){
    return String.format("%s - %s", data, name);
  }
  @Override
  public int compareTo(Pessoa p2) {
    if(this.data.compareTo(p2.data)<0)return -1;
    if(this.data.compareTo(p2.data)>0) return 1;
    return 0;
  }

  // public int compareTo(Pessoa p2){
  //   Data second = p2.Dia();
  //   if(data.mes() == second.mes()){
  //     if(data.dia() != second.dia()){return (data.dia() > second.dia()) ? 1 : -1;}
  //     else{
  //       return 0;
  //     }
  //   }
  //   else{
  //     return (data.mes() > second.mes()) ? 1 : -1;
  //   }
  // }
  
 
}
