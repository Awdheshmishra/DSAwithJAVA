package BinarySearch;
public class first {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,343,654};//binary search ke array sorted order me hona chaiye
        int n = arr.length;
        int target = 500;
        int lo = 0, hi = n-1;
        boolean flag = false;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){//equal
                flag = true; break;
            }
            else if (arr[mid]>target) hi = mid -1;//greater
            else if (arr[mid]<target) lo = mid +1;//lesser
        }
        if(flag == true) System.out.println("Target element found");
        else System.out.println("Target element not found");
    }
}

//binary search se no. of comparison kam ho jate hain
