public class BonusMilesService {
    public int calculate(int price) {
        int rate = 20;
        int miles = price /rate;
        return miles;
    }
}
