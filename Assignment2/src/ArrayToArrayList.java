import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public List<Integer> convertArrayToArrayList(int[] array) {
    	System.out.println("\nOriginal Array: " + Arrays.toString(array));
        List<Integer> arrayList = new ArrayList<>();
        
        for (int value : array) {
            arrayList.add(value);
        }
        
        return arrayList;
    }

}