package Control;

/**
 *
 * @author Early Risers
 */
public class HarvestTime{
    public static int calcHarvest(int percent, int acresOwned, int highTithesYieldPerAcre, int medTithesYieldPerAcre, int lowTithesYieldPerAcre) {      
        if (percent < 0) {
            return -1;
        } 
        else if (percent > 100) {
            return -2;
        }
        else if (percent > 12) {
		int result = acresOwned * highTithesYieldPerAcre;
                return result;
	} else if (percent >= 8) {
		int result = acresOwned * medTithesYieldPerAcre;
                return result;
	} else {
		int result = acresOwned * lowTithesYieldPerAcre;
                return result;
	}
    }
}