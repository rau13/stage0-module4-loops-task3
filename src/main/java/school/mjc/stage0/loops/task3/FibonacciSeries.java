package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if(lastFibonacci == 0 || lastFibonacci == 1) {
            System.out.println(lastFibonacci);
        }
        int n0 = 0, n1 = 1;
        int tempNthTerm;
        for (int i = 2; i <= lastFibonacci; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }
        System.out.println(lastFibonacci);
    }
}

