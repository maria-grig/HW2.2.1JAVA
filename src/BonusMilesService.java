public class BonusMilesService {

    public int calculate (int price) {

        int bonusStake = 20;
        int bonus = price / bonusStake;

        return bonus;
     }

}


