public class BmiService {
    public int calculate(int bodyWeight, int bodyGrowth) {

        int massIndex = bodyWeight / (bodyGrowth / 100 * 2);

        return massIndex;
    }
}
