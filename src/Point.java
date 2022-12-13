public class Point {

    // Fields

    public int x;
    public int y;

    // Constructors

    public Point (int a, int b) {
        x = a;
        y = b;
    }
    public Point (){
        int x= 0;
        int y= 0;
        }
    public String toString() {
        return (x - y);
    }
    public int moveTo (int a, int b) {

        int newPoint = a + b;
        return newPoint;
    }
    public void setx(int newx) {
        x = newx;
    }
    public void sety(int newy) {
        y = newy;
    }
    public void getx() {
        return x;
    }
    public void gety() {
        return y;
    }
    public setOffset (int offX, int offY){
        x = offX;
        y = offY;
    }






}


