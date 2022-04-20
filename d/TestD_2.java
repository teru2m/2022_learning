/* Permutation & Combination */
// [factorial & power & factorial]_method

public class TestD_2 {
    public static void main(String[] args) {
        int perm, comb, permDupl, combDupl, permCirc;

        Factorial fValue = new Factorial();
        Factorial value;

        value = fValue.initialize(5, 2);
        perm = value.nFact / value.nrFact;
        comb = value.nFact / (value.rFact * value.nrFact);
        permDupl = value.nrPow;
        combDupl = value.nr1Fact / (value.rFact * value.n1Fact);
        permCirc = value.n1Fact;
        System.out.println(perm);
        System.out.println(comb);
        System.out.println(permDupl);
        System.out.println(combDupl);
        System.out.println(permCirc);
        System.out.println();

        value = fValue.initialize(6, 3);
        perm = value.nFact / value.nrFact;
        comb = value.nFact / (value.rFact * value.nrFact);
        permDupl = value.nrPow;
        combDupl = value.nr1Fact / (value.rFact * value.n1Fact);
        permCirc = value.n1Fact;
        System.out.println(perm);
        System.out.println(comb);
        System.out.println(permDupl);
        System.out.println(combDupl);
        System.out.println(permCirc);
        System.out.println();
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
        fValue.nrPow = power(n,r);

        return fValue;
    }
}
