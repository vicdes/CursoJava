package course.application;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return this.width*this.height;
    }

    public double perimeter() {
        return 2*this.width+2*this.height;
    }

    public double diagonal() {
        return Math.sqrt(this.height*this.height+this.width*this.width);
    }

    public String toString() {
        return "AREA = "
                +  String.format("%.2f", this.area())
                + "\nPERIMETER = "
                + String.format("%.2f", this.perimeter())
                + "\nDIAGONAL = "
                +  String.format("%.2f", this.diagonal());
    }
}
