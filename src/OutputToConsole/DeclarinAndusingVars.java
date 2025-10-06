package OutputToConsole;

public class DeclarinAndusingVars {
    public static void main(String[] args) {
        var sidelength = 10;
        var sideheight = 10;
        var areaRectangle = sidelength * sideheight;
        System.out.println("The area of the rectangle is : " + areaRectangle);

        var radius = 9;
        var pi = 3.142;
        float areaCircle = (float) (pi * (radius * radius));
        System.out.println("The area of the circle is : " + areaCircle);
    }
}
