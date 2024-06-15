public class MedianOfTwoSortedArrays {
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;
        
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;
            
            // If partitionX is 0 it means nothing is there on left side. Use -INF for maxX
            // If partitionX is length of input then there is nothing on right side. Use +INF for minX
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];
            
            // Similarly for partitionY
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (maxX <= minY && maxY <= minX) {
                // We have partitioned array at the correct place
                // Now we get max of left elements and min of right elements to get the median
                // in case of even length combined array size
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double)Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                // We are too far on the right side for partitionX. Go on the left side.
                high = partitionX - 1;
            } else {
                // We are too far on the left side for partitionX. Go on the right side.
                low = partitionX + 1;
            }
        }
        
        // Only we reach here when input arrays are not sorted
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 9};
        int[] b = {2, 6, 7};
        System.out.println("The median is: " + findMedianSortedArrays(a, b));
    }
}
