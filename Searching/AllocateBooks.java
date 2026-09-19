package Searching;

public class AllocateBooks {
  
}
public class Solution {
    
    public int books(int[] A, int B) {
        if (B > A.length) return -1;

        int low = 0, high = 0;
        
        for (int pages : A) {
            low = Math.max(low, pages);
            high += pages;
        }

        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isValid(A, B, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean isValid(int[] A, int B, int maxPages) {
        int students = 1;
        int pages = 0;

        for (int book : A) {
            if (pages + book > maxPages) {
                students++;
                pages = book;

                if (students > B) return false;
            } else {
                pages += book;
            }
        }

        return true;
    }
}