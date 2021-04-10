public class Room {
    private Point topRight;
    private Point bottomLeft;
    private String type;

    public Room(Point topRight, Point bottomLeft, String division){
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.type = division;
    }
    public String roomType(){
        return type;
    }

    public Point topRight(){
        return topRight;
    }
    
    public Point bottomLeft(){
        return bottomLeft;
    }

    public Point geoCenter(){
        double  x  =  topRight.x() - bottomLeft.x();
        double y   =  topRight.y() -  bottomLeft.y();
        Point geocenter = new Point(x/2.0, y/2.0);
        return geocenter;
    }
    public double area(){
        double width  =  topRight.x() - bottomLeft.x();
        double heigth =  topRight.y() -  bottomLeft.y();
        return width * heigth;
    }


}
