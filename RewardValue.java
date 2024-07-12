public class RewardValue {
    double cash;
    double miles;

    RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    RewardValue(int miles) {
        this.miles = miles;
        cash = miles * 0.0035;
    }

    double getMilesValue() {
        return this.cash / 0.0035;
    }

    double getCashValue() {
        return this.miles * 0.0035;
    }
}
