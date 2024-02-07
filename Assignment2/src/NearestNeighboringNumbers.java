public class NearestNeighboringNumbers {

    public void findIndexWithSmallestDistance(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }

        int minDistance = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int currentDistance = Math.abs(array[i + 1] - array[i]);

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                index = i;
            }
        }
        System.out.println("\n\nNumbers with the smallest distances : "+array[index]+" and "+array[index+1]);

    }

}
