package selflearning;

public class HomeAreaCalculator {

    public static void main(String args[]){

        /*********
         * Rectangle 1
         **********/

        // Create instance of Rectangle Class
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(20);
        double areaofRoom1 = room1.calculateArea();

        /*********
         * Rectangle 2
         **********/

        Rectangle room2 = new Rectangle(30, 20);
        double areaofRoom2 = room2.calculateArea();

        double totalArea = areaofRoom1 + areaofRoom2;

        System.out.println("Area of both Rooms:" +totalArea);
    }
}
