package Array2;

public class Array {
    public void delete(int[] a, int index) {

    }

    public void ShiftLeft_Delete(int[] a, int index) {
        for (int i = index; i < a.length - 1; i++)
            a[i] = a[i + 1];

        a[a.length - 1] = Integer.MIN_VALUE;
    }

}