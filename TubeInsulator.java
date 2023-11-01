
package spm123.tubeinsulatorproblem;

import static java.lang.Math.PI;


public class TubeInsulator {
    private Tube tube;
    private Insulator insulator;
    private Cork leftCork;
    private Cork rightCork;

    public Tube getTube() {
        return tube;
    }

    public void setTube(Tube tube) {
        this.tube = tube;
    }

    public Insulator getInsulator() {
        return insulator;
    }

    public void setInsulator(Insulator insulator) {
        this.insulator = insulator;
    }

    public Cork getLeftCork() {
        return leftCork;
    } 

    public void setLeftCork(Cork leftCork) {
        this.leftCork = leftCork;
    }

    public Cork getRightCork() {
        return rightCork;
    }

    public void setRightCork(Cork rightCork) {
        this.rightCork = rightCork;
    }
 
    
    public TubeInsulator(double tubeRadius, double tubeHeight, double insulatorRadius, double insulatorHeight) {
        tube = new Tube(tubeRadius, tubeHeight);
        insulator = new Insulator(insulatorRadius, insulatorHeight);
        leftCork = new Cork(getCorkRadiusCalculation(), getCorkHeightCalculation());
        rightCork = new Cork(getCorkRadiusCalculation(), getCorkHeightCalculation());
        
    }
    
    public double getCorkHeightCalculation() {
        return (tube.getHeight() - insulator.getHeight()) / 2;
        }

    public double getCorkRadiusCalculation() {
        return tube.getRadius();
    }

    public double getHoleVolume() {
        return PI * tube.getRadius() * tube.getRadius() * tube.getHeight();
    }

    public double getTotalInsulatedVolume() {
        return insulator.getInsulatorTotalVolume() - getHoleVolume();
    }

    public double getLeftCorkVolume() {
        return leftCork.getCorkTotalVolume();
    }

    public double getRightCorkVolume() {
        return rightCork.getCorkTotalVolume();
    }

    public double getLiquidVolume() {
        return tube.getTubeTotalVolume() - leftCork.getCorkTotalVolume() - rightCork.getCorkTotalVolume();
    }

}


