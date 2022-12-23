public class BonusMilesService {
    public int calculate(int cost) {
        int rublesPerMiles = 20;
        int milesModernization = cost / rublesPerMiles;
        return milesModernization;
    }
}