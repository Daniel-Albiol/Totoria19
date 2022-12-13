public class Polygon {
    private Point[] points;
    public Polygon (Point... points){
        this.points = points;
    }
    public Polygon(){
        points = null;
    }
    public double getLength(){
        double length = 0;
        for (int i = 0; i < points.length; i++){
            Segment s = new Segment(points[i], points[i + 1]);
            length = length + s.module();
        }
        Segment s = new Segment(points[points.length - 1], points[0]);
        length = length + s.module();
        return length;
    }
    public void setOffset(int offX,int offY){
        for(Point p: points){
            p.setOffset(offX,offY);
        }

    }
    public class MainPolygon{
        public static void main (String [] args){
            Polygon p = new Polygon(new Point(1,2), new Point(3,4),
                    new Point(5,6));
            System.out.println(p);
        }
    }
}
