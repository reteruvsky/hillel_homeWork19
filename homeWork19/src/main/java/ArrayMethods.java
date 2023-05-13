public class ArrayMethods {

    public int maxIndex(int[] array) {
        int index = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > index) {
                index = array[i];
            }
        }

        return index;
    }

    public int minIndex(int[] array) {
        int index = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < index) {
                index = array[i];
            }
        }

        return index;
    }
}
