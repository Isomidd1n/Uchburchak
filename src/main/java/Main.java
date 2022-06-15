public class Main {
    public static void main(String[] args) {
        Triangle p1 = new Triangle();
        p1.high = 6;
        p1.side = 10;
        p1.bottom = 8;
        p1.areaGraphical();
        p1.PerimeterGraphical();
        System.out.println("Uchburchakning maydoni:" + p1.areaGraphical() + "\nUchburchak perimetri:" + p1.PerimeterGraphical());

        rectangle p2 = new rectangle();
        p2.Width = 4;
        p2.Length = 8;
        p2.areaGraphical();
        p2.PerimeterGraphical();
        System.out.println("To'rtburchaklar maydoni:" + p2.areaGraphical() + "\nTo'rtburchaklar perimetri:" + p2.PerimeterGraphical());
    }
}
