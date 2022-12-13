public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment (){

        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment (Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double module(){
        int A = endPoint.getx() - startPoint.getx();
        int B = endPoint.gety() - startPoint.gety();
        return Math.sqrt(A * A + B * B);
    }
    public  String toString(){
        return startPoint.toString() + "-" + endPoint.toString() ;
    }
    public void setOffset(int offX, int offY){
        startPoint.setOffset(offX, offY);
        endPoint.setOffset(offX, offY);
    }
    public void setStatPoint(Point startPoint){
        this.startPoint = startPoint;
    }
    public void setEndPoint(Point endPoint){
        this.endPoint = endPoint;
    }
    public void getStatPoint(){
        return startPoint;
    }
    public void getEndPoint(){
        return endPoint;
    }






}
