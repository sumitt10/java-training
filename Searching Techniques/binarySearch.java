public class binarySearch {
    public int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch.binarySearch(sortedArray, target);
        System.out.println("Index of " + target + ": " + result);
    }
}