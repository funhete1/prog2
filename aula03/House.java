import java.util.Arrays;

public class House {
    private String type;
    private Room[] divis;
    private int expanse;
    
    public House(String type){
        this.type = type;
        divis = new Room[8];
        expanse = 4;
    }

    public House(String type, int number,  int adc){
        this.type = type;
        divis = new Room[number];
        expanse = adc; 
    }

    public void addRoom(Room nw){//melhor solucao
        int i;
        for (i = 0; i < divis.length; i++) {
            if(divis[i] == null){
                divis[i] = nw;
            }
        }
        divis = Arrays.copyOf(divis, divis.length + expanse);
        divis[i] = nw;
    }

    public int size(){
        for (int i = 0; i < divis.length; i++) {
            if(divis[i] == null) return i;
        }
        return divis.length;
    }

    public int maxSize(){
        return divis.length;
    }

    public Room room(int indice){
        assert indice > 0 && indice < divis.length;
        return divis[indice];
    }

    public double area(){
        double area = 0;
        for (int i = 0; i < divis.length; i++) {
            area += divis[i].area();
        }
        return area;
    }

    public RoomTypeCount[] getRoomTypeCounts(){
        RoomTypeCount[] rtc = new RoomTypeCount[1];

        for (int i = 0; i < divis.length; i++) {
            if(divis[i] == null) break;
            for (int j = 0; j < rtc.length; j++) {
                if(rtc[j] == null){
                    rtc = Arrays.copyOf(rtc, rtc.length+1);
                    rtc[j] = new RoomTypeCount();
                    rtc[j].roomType = divis[i].roomType();
                    rtc[j].count = 1;
                    break;
                }
                if(divis[i].roomType().equals(rtc[j].roomType)){
                    rtc[j].count++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rtc, rtc.length-1);
    }

    public double averageRoomDistance(){
        double soma = 0;
        int i = 0;
        for (i = 0; i < divis.length-1; i++) {
            if(i==divis.length-1){
                soma += Math.sqrt(Math.pow(divis[i].geoCenter().x()-divis[0].geoCenter().x(),2)+Math.pow(divis[i].geoCenter().y()-divis[0].geoCenter().y(),2));
                break;
            }
            if(divis[i+1]==null) {
                soma += Math.sqrt(Math.pow(divis[i].geoCenter().x()-divis[0].geoCenter().x(),2)+Math.pow(divis[i].geoCenter().y()-divis[0].geoCenter().y(),2));
                break;
            }
            soma += Math.sqrt(Math.pow(divis[i].geoCenter().x()-divis[i+1].geoCenter().x(),2)+Math.pow(divis[i].geoCenter().y()-divis[i+1].geoCenter().y(),2));
        }
        return soma/i;
    }
}
