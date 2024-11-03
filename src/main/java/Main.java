package recurcia2;

public class homework {
	//ex14
	public static int sum(int [] arr, int n) {
		if(n==0)
			return arr[0];
		return sum(arr,n-1)+arr[n];
		
	}
	//ex15
	public static int positivenum(int [] arr, int n) {
        if (n < 0) {
            return 0;
        }
        if (arr[n] > 0) {
            return 1 + positivenum(arr, n - 1);
        } else {
            return positivenum(arr, n - 1);
        }
	}
	//ex16
	public static int placeArr(int [] arr, int n,int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == n) {
            return index;
        }
        return placeArr(arr, n, index + 1);
	}
	//ex17
	public static boolean AscendingOrder(int [] arr, int index) {		
	    if (index == arr.length - 1) 
	         return true;
	    if (arr[index] > arr[index + 1]) 
	        return false;			
            return AscendingOrder(arr, index + 1);
	
	}
	//ex18
    public static boolean hasNoPrimes(int[] arr, int index) {
        if (index >= arr.length) {
            return true;
        }
        if (isPrime(arr[index])) {
            return false;
        }
        return hasNoPrimes(arr, index + 1);
    }
	
	
	
	
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
	
	
}
