package Practice;

public class reversedArray {
    public static int[] main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrReverse = new int[arr.length];

        int count = arr.length - 1;
        int newIndex = 0;
        while (count >= 0) {
            arrReverse[newIndex] = arr[count];
            --count;
            ++newIndex;
        }
        return arrReverse;
    }
}
