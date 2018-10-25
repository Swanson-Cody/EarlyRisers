package Control;

/**
 *
 * @author Early Risers
 */
public class HarvestTime{
            
    public static int calcHarvest(int percent, int acresOwned, int highTithesYieldPerAcre, int medTithesYieldPerAcre, int lowTithesYieldPerAcre) {
        if (percent > 12) {
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