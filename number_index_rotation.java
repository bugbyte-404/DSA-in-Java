// Java code to rotate an array 
// and answer the index query 
import java.util.*; 
  
class GFG 
{ 
    // Function to compute the element at 
    // given index 
    static int findElement(int[] arr, int[][] ranges, 
                            int rotations, int index) 
    { 
        for (int i = rotations - 1; i >= 0; i--) { 
  
            // Range[left...right] 
            int left = ranges[i][0]; 
            int right = ranges[i][1]; 
  
            // Rotation will not have any effect 
            if (left <= index && right >= index) { 
                if (index == left) 
                    index = right; 
                else
                    index--; 
            } 
        } 
  
        // Returning new element 
        return arr[index]; 
    } 
  
    // Driver 
    public static void main (String[] args) { 
        int[] arr = { 1, 2, 3, 4, 5 }; 
  
        // No. of rotations 
        int rotations = 2; 
      
        // Ranges according to 0-based indexing 
        int[][] ranges = { { 0, 2 }, { 0, 3 } }; 
  
        int index = 1; 
        System.out.println(findElement(arr, ranges, 
                                 rotations, index)); 
    } 
} 
  
