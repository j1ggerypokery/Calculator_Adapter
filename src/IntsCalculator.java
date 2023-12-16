public class IntsCalculator implements Ints {
    protected final Calculator target;
  //  Calculator calculator = new Calculator();

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        int result  = arg0 + arg1;
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int result = arg0 * arg1;
        return result;
    }

    @Override
    public int pow(int a, int b) {
        double result = Math.pow(a,b);
        return (int) result;
    }
}
