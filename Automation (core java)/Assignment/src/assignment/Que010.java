package assignment;

public class Que010 {
	//que10.WAP to find the index of an array element. 
    public static int findIndex(int[] arr, int t) {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
//que10.WAP to find the index of an array element. 
	  int[] Array = {1,2,3,4,5};
      int target = 4;
      System.out.println("Index position of " + target + " is: " + findIndex(Array, target));
   
   
}

}
