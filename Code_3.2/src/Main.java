public class Main {
    public static void main(String[] args) {
        long InitialBalance = 100_00; //kopecks
        long SumReplenish = 1000_01; //kopecks
        long Bonus;
        if (SumReplenish > 1000_00) {
            Bonus = SumReplenish * 1_00 / 100_00; //kopecks
        } else {
            Bonus = 0_00; //kopecks
        }
        long TotalBalance = InitialBalance + SumReplenish + Bonus; //kopecks
        System.out.println(TotalBalance);
    }
}
