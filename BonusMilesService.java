public class BonusMilesService {
    public int calculate(int cost) {

        int bonusMiles = 20;
        int miles = cost / bonusMiles;

        return miles;
    }
}