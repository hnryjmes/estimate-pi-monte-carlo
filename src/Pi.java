public class Pi {
    public static void main(String[] args) {
        System.out.println(getPi(1_000));
        System.out.println(getPi(10_000));
        System.out.println(getPi(100_000));
        System.out.println(getPi(1_000_000));
        System.out.println(getPi(10_000_000));
        System.out.println(getPi(100_000_000));
    }

    public static double getPi(int numThrows) {
        int numInCircle = 0;
        for (int i = 0; i < numThrows; i++) {
            double randX = (Math.random() * 2) - 1;
            double randY = (Math.random() * 2) - 1;
            double distance = Math.hypot(randX, randY);
            if (distance < 1) {
                numInCircle++;
            }
        }
        return 4.0 * numInCircle / numThrows;
    }
}