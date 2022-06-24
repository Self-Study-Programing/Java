package binarySearch;

public class Search implements Searcher{
    @Override
    public int search(int[] sortedValues, int value) {
        int left = 0;
        int right = sortedValues.length;
        int mid = 0;

        while (left < right) {
            mid = (left + right) / 2;

            if(sortedValues[mid] == value) {
                return mid;
            }

            if (sortedValues[mid] < value) left = mid + 1;
            else right = mid;
        }

        return -1;
    }
}
