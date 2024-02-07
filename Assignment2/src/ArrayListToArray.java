import java.util.List;
import java.util.Arrays;

class ArrayListToArray {

    public void convertArrayListToArray(List<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Converted Array: " + Arrays.toString(array));
    }
}