package pl.edu.pw.ee.aisd_ex_0.extratasks;

/*
Wybieram liczbę od 1 do n. Musisz zgadnąć, którą liczbę wybrałem.
Za każdym razem, gdy zgadniesz błędnie, powiem ci, czy liczba, którą wybrałem, jest większa (zwraca 1) czy mniejsza (zwracam -1) od Twojego zgadnięcia.
Wywołujesz wcześniej zdefiniowane API int guess(int num).
*/

public class HotOrColdProblem {

    public int guessNumber(int n) {
    	int L = 1;
        int R = n;

        while (L <= R) {
            int MID = L + (R - L) / 2;
            int result = guess(MID);

            if (result == 0) {
                return MID;
            } else if (result == 1) {
                L = MID + 1;
            } else {
                R = MID - 1;
            }
        }

        return -1;
    }
    private int secretNumber = 7;

    private int guess(int num) {
        if (num > secretNumber) return -1;
        if (num < secretNumber) return 1;
        return 0;
    }
}
