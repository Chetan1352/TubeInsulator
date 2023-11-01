
package spm123.tubeinsulatorproblem;


public class Validation {
    
    
    public static boolean Validateradius(double tubeRadius , double insulatorradius){
    if( tubeRadius <= insulatorradius && insulatorradius>=tubeRadius){
    
        return true;
        
    }else{
        return false;
        
    }}
     public static boolean Validateheight(double tubeheight , double insulatorheight){
    if( tubeheight <= insulatorheight && insulatorheight >=tubeheight){
    
        return true;
        
    }else{
        return false;
        
    }}
}
