 package spm123.tubeinsulatorproblem;

public class Cork  {

     private Cylinder cork;

        public double getRadius() {
        return cork.getRadius();
    }

    public void setRadius(double radius) {
        cork.setRadius(radius);
    }

    public double getHeight() {
        return cork.getHeight();
    }

    public void setHeight(double height) {
        cork.setHeight(height);
    }

    public Cork(double radius, double height) {
        cork = new Cylinder(radius, height);
    }

    public double getCorkTotalVolume() {
        return cork.getCylinderVolume();
    }

}
