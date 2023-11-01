package spm123.tubeinsulatorproblem;

public class Operation {

    private static double getLiquidCapacity(TubeInsulator tubeInsulator) {
        return tubeInsulator.getLiquidVolume() * Density.glycerine;
    }

    private static double getDustQuantity(TubeInsulator tubeInsulator) {
        return tubeInsulator.getHoleVolume() * Density.dust;
    }

    private static double getWoodQuantity(TubeInsulator tubeInsulator) {
        return tubeInsulator.getTotalInsulatedVolume() * Density.wood;
    }

    public static void printTubeInsulatorDetails(TubeInsulator tubeInsulator) {
        System.out.println("Tube Radius " + tubeInsulator.getTube().getRadius());
        System.out.println("Tube Height " + tubeInsulator.getTube().getHeight());
        System.out.println("Insulator Radius " + tubeInsulator.getInsulator().getRadius());
        System.out.println("Insulator Height " + tubeInsulator.getInsulator().getHeight());
        System.out.println("Left Cork Radius " + tubeInsulator.getLeftCork().getRadius());
        System.out.println("Left Cork Height " + tubeInsulator.getLeftCork().getHeight());
        System.out.println("Right Cork Radius " + tubeInsulator.getRightCork().getRadius());
        System.out.println("Right Cork Height " + tubeInsulator.getLeftCork().getHeight());
        System.out.println("Available Volume " + tubeInsulator.getLiquidVolume());
        System.out.println("Liquid Capacity " + getLiquidCapacity(tubeInsulator));
        System.out.println("Dust Capacity " + getDustQuantity(tubeInsulator));
        System.out.println("Wood Capacity " + getWoodQuantity(tubeInsulator));
        System.out.println("Hole Capacity " + tubeInsulator.getHoleVolume());
    }

}
