package spm123.tubeinsulatorproblem;

public class Tube {

    private Cylinder tube;

    public double getRadius() {
        return tube.getRadius();
    }

    public void setRadius(double radius) {
        tube.setRadius(radius);
    }

    public double getHeight() {
        return tube.getHeight();
    }

    public void setHeight(double height) {
        tube.setHeight(height);
    }

    public Tube(double radius, double height) {
        tube = new Cylinder(radius, height);
    }

    public double getTubeTotalVolume() {
        return tube.getCylinderVolume();
    }

}
