package DAA;

public class DisplayPrimeIndex {
    static void dipslayPrime(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                 System.out.println("At this index in array is prime number -> " + i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        dipslayPrime(arr);
    }
}
