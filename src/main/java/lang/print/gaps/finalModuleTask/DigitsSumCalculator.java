package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number / 100;
        int b = number % 100 / 10 ;
        int c = number % 10;
        System.out.print(c+b+a);

        }
}
