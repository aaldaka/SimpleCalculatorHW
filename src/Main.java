public class Main {
    private static int totalCalcs = 0;
    protected int lastRes = 0;
    public String calcName = "moiCalc";

    public int add(int a, int b){
        int sum = a + b;
        lastRes = sum;
        totalCalcs++;
        return sum;
    }

    protected int subtract(int a, int b){
        int diff = a - b;
        lastRes = diff;
        totalCalcs++;
        return diff;
    }

    private void resetCalculator(){
        lastRes = 0;
    }

    public void monthlyReset(){
        resetCalculator();
    }

    public static void showTotalCalculations(){
        System.out.println("Total number of calculations... " + totalCalcs);
    }

    public void showLastResult(){
        System.out.println("Instance lastRes value: " + this.lastRes);
        int lastRes = 1;
        System.out.println("Local/shadowed lastRes value: " + lastRes);
        System.out.println("Instance lastRes value: " + this.lastRes + " (accessible through this)");
    }

    //bonus
    public int multiply(int a, int b) {
        int productOf = a * b;
        lastRes = productOf;
        totalCalcs++;
        return productOf;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        double quo = (double) a / b;  //handle decimles
        lastRes = (int) quo;    // bring back to original
        totalCalcs++;
        return quo;
    }

    public static void main(String[] args) {
        Main calcs = new Main();
        System.out.println("Welcome to my humble calculator called.." + calcs.calcName);

        int sum = calcs.add(12, 25);
        System.out.println("Sum: " + sum);

        int diff = calcs.subtract(24, 2);
        System.out.println("Difference: " + diff);

        Main.showTotalCalculations();
        calcs.showLastResult();
        calcs.monthlyReset();
        calcs.showLastResult();

        double divZ = calcs.divide(5, 5);
        System.out.println(divZ);
        Main.showTotalCalculations();
    }
}