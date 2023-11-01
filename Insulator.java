 package spm123.tubeinsulatorproblem;

public class Insulator {

    private Cylinder insulator;

    public double getRadius() {
        return insulator.getRadius();
    }

    public void setRadius(double radius) {
        insulator.setRadius(radius);
    }

    public double getHeight() {
        return insulator.getHeight();
    }

    public void setHeight(double height) {
        insulator.setHeight(height);
    }

    public Insulator(double radius, double height) {
        insulator = new Cylinder(radius, height);
    }

    public double getInsulatorTotalVolume() {
        return insulator.getCylinderVolume();
    }

}
