package spm123.tubeinsulatorproblem;

public class Cylinder {

    private double radius = 20;
    private double height = 10;
    public static double pie = 3.14;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void setPie(double pie) {
        Cylinder.pie = pie;
    }

    public void print() {

        System.out.println(radius);
        System.out.println(height);
    }

    public double getCylinderVolume() {

        return pie * radius * radius * height;
    }


}
