public class Rectangle {
    private double height, width;
    public Rectangle() {
        //height = width = 1;
        this(1, 1); // chain constructors
    }
    public Rectangle(double w, double height) {
        width = this.height = 1;
        if (w > 0) width = w;
        if (height > 0) this.height = height;
    }
    public Rectangle(double dimension) {
        width = height = dimension;
    }
    double getArea() {
        return height * width;
    }

    // Getters and setters
    public double getHeight() {return height;}
    public double getWidth() {return width;}
    public void setHeight(double h) {
        if (h > 0) height = h;
    }
    public void setWidth(double w) {
        if (w > 0) width = w;
    }
}
