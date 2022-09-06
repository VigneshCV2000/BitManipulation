public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,5,2,3,4,1};
        int ans=0;
        for(int i=0;i< arr.length;i++){
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}
