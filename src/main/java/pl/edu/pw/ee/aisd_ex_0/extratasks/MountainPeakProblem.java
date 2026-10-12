package pl.edu.pw.ee.aisd_ex_0.extratasks;

/*

Dany jest całkowity ciąg liczb arr o długości n, w którym wartości rosną do elementu szczytowego, a następnie maleją.

Zwróć indeks elementu szczytowego.


Przykład 1:

Wejście: arr = [2, 5, 2]
Wyjście: 1

Przykład 2:

Wejście: arr = [0, 3, 2, 1]
Wyjście: 1

Przykład 3:

Wejście: arr = [0, 12, 7, 4]
Wyjście: 1

*/
public class MountainPeakProblem {

    public int peakProblem(int[] arr) {
    	int peak = 0;
        int current = 0;
        while(current < arr.length){
            if(arr[current] > arr[peak]) peak = current;
            else current++;
        }
        return peak;
    }
}
