public class Point2D {
    private float x;
    private float y;

    Point2D(){
    }
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = new float[2];
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{"
                + "x=" + x
                + ", y=" + y
                + '}';
    }
}
