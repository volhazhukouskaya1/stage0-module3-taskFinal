package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a = number / 100;
        int b = number % 100 / 10 ;
        int c = number % 10;
        System.out.print(c);
        System.out.print(b);
        System.out.println(a);
    }
}
