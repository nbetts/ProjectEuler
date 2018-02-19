package problem2;

public class Problem2 {
    public static void main(String[] args) {
        int upperBound = 4000000;
        int previousFibonacciValue = 0;
        int currentFibonacciValue = 1;
        int temp, sum = 0;
        
        while (currentFibonacciValue < upperBound) {
            temp = currentFibonacciValue;
            currentFibonacciValue = currentFibonacciValue + previousFibonacciValue;
            previousFibonacciValue = temp;
            
            if ((currentFibonacciValue & 1) == 0) {
                sum += currentFibonacciValue;
            }
        }
        
        System.out.println(sum);
    }
}
