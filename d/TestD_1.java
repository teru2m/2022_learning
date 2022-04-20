/* Permutation & Combination */

public class TestD_1 {
    public static void main(String[] args) {
        int n, r;
        int nFact, rFact, nrFact, nr1Fact, n1Fact;
        int perm, comb, permDupl, combDupl, permCirc;

        n = 5;
        r = 2;
        nFact = n;
        for(int i = nFact-1; i > 0; i--) {
            nFact *= i;
        }
        rFact = r;
        for(int i = rFact-1; i > 0; i--) {
            rFact *= i;
        }
        nrFact = n-r;
        for(int i = nrFact-1; i > 0; i--) {
            nrFact *= i;
        }
        System.out.println("‡@" +nrFact);
        nr1Fact = n+r-1;
        for(int i = nr1Fact-1; i > 0; i--) {
            nr1Fact *= i;
        }
        n1Fact = n-1;
        for(int i = n1Fact-1; i > 0; i--) {
            n1Fact *= i;
        }
        perm = nFact / nrFact;
        comb = nFact / (rFact * nrFact);
        permDupl = n;
        for(int i = r-1; i > 0; i--) {
            permDupl *= n;
        }
        combDupl = nr1Fact / (rFact * n1Fact);
        permCirc = n1Fact;
        System.out.println(perm);
        System.out.println(comb);
        System.out.println(permDupl);
        System.out.println(combDupl);
        System.out.println(permCirc);
        System.out.println();

        n = 6;
        r = 3;
        nFact = n;
        for(int i = nFact-1; i > 0; i--) {
            nFact *= i;
        }
        rFact = r;
        for(int i = rFact-1; i > 0; i--) {
            rFact *= i;
        }
        nrFact = n-r;
        for(int i = nrFact-1; i > 0; i--) {
            nrFact *= i;
        }
        nr1Fact = n+r-1;
        for(int i = nr1Fact-1; i > 0; i--) {
            nr1Fact *= i;
        }
        n1Fact = n-1;
        for(int i = n1Fact-1; i > 0; i--) {
            n1Fact *= i;
        }
        System.out.println("‡A" + n1Fact);
        perm = nFact / nrFact;
        comb = nFact / (rFact * nrFact);
        permDupl = n;
        for(int i = r-1; i > 0; i--) {
            permDupl *= n;
        }
        combDupl = nr1Fact / (rFact * n1Fact);
        permCirc = n1Fact;
        System.out.println(perm);
        System.out.println(comb);
        System.out.println(permDupl);
        System.out.println(combDupl);
        System.out.println(permCirc);
        System.out.println();
        
    }
}
