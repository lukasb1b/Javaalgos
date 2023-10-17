public final class recursiveSearchSortedArray {
  public static boolean recursiveSearch( final int[] array, final int key) {
    return recursiveSearch(array, key, 0, array.length - 1);
}

private static boolean recursiveSearch( final int[] array, final int key, final int start, final int end) {
    if (start > end) {
        return false;
    }

    int mid = start + (end - start) / 2;

    if (array[mid] == key) {
        return true;
    } else if (array[mid] < key) {
        return recursiveSearch(array, key, mid + 1, end);
    } else {
        return recursiveSearch(array, key, start, mid - 1);
    }
}

}
