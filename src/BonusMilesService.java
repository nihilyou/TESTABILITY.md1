public class BonusMilesService {
    public int calculate(int cost) {
        int expense = 100;
        int bonus;
        int replenishment = 1100;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int prise = expense + replenishment + bonus;

        return prise;

    }

}
