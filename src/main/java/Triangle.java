public class Triangle extends Graphical {
    public double high;
    public double bottom;
    public double side;

    public double areaGraphical() {

        area = (bottom * high) / 2;
        return area;

    }

    public double PerimeterGraphical() {

        Perimeter = high + bottom + side;
        return Perimeter;


    }
}
