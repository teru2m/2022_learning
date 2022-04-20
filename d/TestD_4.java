public class TestD_4 {
    static void factPermComb(String flag, Factorial value) {
        int result = 0;

        switch(flag) {
            case "perm":
                result = value.nFact / value.nrFact;
                break;
            case "comb":
                result = value.nFact / (value.rFact * value.nrFact);
                break;
            case "permDupl":
                result = value.nrPow;
                break;
            case "combDupl":
                result = value.nr1Fact / (value.rFact * value.n1Fact);
                break;
            case "permCirc":
                result = value.n1Fact;
                break;
        }
        System.out.println(result);
    }

    static void runProcess(int n, int r) {
        Factorial fValue = new Factorial();
        Factorial value;

        value = fValue.initialize(n, r);
        factPermComb("perm", value);
        factPermComb("comb", value);
        factPermComb("permDupl", value);
        factPermComb("combDupl", value);
        factPermComb("permCirc", value);
        System.out.println();
    }

    public static void main(String[] args) {
        
        runProcess(5, 2);
        runProcess(6, 3);

    }
}

class Factorial {
    int nFact, rFact, nrFact, nr1Fact, n1Fact, nrPow;

    static int factorial(int fact) {
        for(int i = fact-1; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    static int power(int num, int expo) {
        int pow = num;

        for(int i = expo-1; i > 0; i--) {
            pow *= num;
        }
        return pow;
    }

    static Factorial initialize(int n, int r) {
        Factorial fValue = new Factorial();
        fValue.nFact = factorial(n);
        fValue.nFact = factorial(n);
        fValue.rFact = factorial(r);
        fValue.nrFact = factorial(n-r);
        fValue.nr1Fact = factorial(n+r-1);
        fValue.n1Fact = factorial(n-1);
        if(n == 6)System.out.println("‡B" + fValue.n1Fact);
        fValue.nrPow = power(n,r);

        return fValue;
    }
}
