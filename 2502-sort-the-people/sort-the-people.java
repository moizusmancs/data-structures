class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        mergeSort(names, heights, 0, heights.length - 1);
        return names;
        
    }

    // \U0001f512 Custom merge sort (descending by height)
    private static void mergeSort(String[] names, int[] heights, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(names, heights, left, mid);
            mergeSort(names, heights, mid + 1, right);

            merge(names, heights, left, mid, right);
        }
    }

    // \U0001f512 Merge function
    private static void merge(String[] names, int[] heights, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] Lh = new int[n1];
        int[] Rh = new int[n2];
        String[] Ln = new String[n1];
        String[] Rn = new String[n2];

        // Copy into temp arrays
        for (int i = 0; i < n1; i++) {
            Lh[i] = heights[left + i];
            Ln[i] = names[left + i];
        }
        for (int j = 0; j < n2; j++) {
            Rh[j] = heights[mid + 1 + j];
            Rn[j] = names[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // \U0001f53d Sort in DESCENDING order by height
        while (i < n1 && j < n2) {
            if (Lh[i] >= Rh[j]) {
                heights[k] = Lh[i];
                names[k] = Ln[i];
                i++;
            } else {
                heights[k] = Rh[j];
                names[k] = Rn[j];
                j++;
            }
            k++;
        }

        // Copy leftovers
        while (i < n1) {
            heights[k] = Lh[i];
            names[k] = Ln[i];
            i++;
            k++;
        }

        while (j < n2) {
            heights[k] = Rh[j];
            names[k] = Rn[j];
            j++;
            k++;
        }
    }

}