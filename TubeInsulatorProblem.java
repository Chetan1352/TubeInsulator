package spm123.tubeinsulatorproblem;

public class TubeInsulatorProblem {

    public static void main(String[] args) {

//        TubeInsulator tubeInsulator = new TubeInsulator(2.5, 36, 1.5, 10);
//        Operation.printTubeInsulatorDetails(tubeInsulator);
//       
        double radius = 3.6;
        double height = 4.6;
        

        boolean result = Validation.Validateradius(13, 6);
        if (result == true) {
            TubeInsulator tc = new TubeInsulator(radius, height, radius, height);
            Operation.printTubeInsulatorDetails(tc);
        } else {
            System.out.println("Incorrect radius and height");
        }
           }
}
