package byui.cit260.EarlyRisers.control;
import byui.cit260.EarlyRisers.exceptions.HarvestTimeException;
/**
 *
 * @author Early Risers
 */
public class HarvestTime{
    public static void calcHarvest(int percent, int acresOwned, int highTithesYieldPerAcre, int medTithesYieldPerAcre, int lowTithesYieldPerAcre) throws HarvestTimeException{      
        if (percent < 0) {
           throw new HarvestTimeException ("Percent cannot be less than zero.");
        } 
        else if (percent > 100) {
            throw new HarvestTimeException ("Harvest percent cannot be less than 100.");
        }
        else if (percent > 12) {
		int result = acresOwned * highTithesYieldPerAcre;
                
	} else if (percent >= 8) {
		int result = acresOwned * medTithesYieldPerAcre;
                
	} else {
		int result = acresOwned * lowTithesYieldPerAcre;
                
	}
    }
}