package ua.goit;

public class SumCalculator {
    int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Can't calculate sum for 0");
        }
        return new SumCalculator().sumCalc(n);
   }
    int sumCalc(int n) {
        if (n >= 0)
            return n + sumCalc(n - 1);
        else
            return 0;
    }

}
