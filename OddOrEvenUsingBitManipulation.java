public class OddOrEvenUsingBitManipulation {
    public static void oddOrEven(int n)
    {
        int ans=n&1;
        if(ans==1){
            System.out.println(n+" is Odd");
        }
        else {
            System.out.println(n+" is even");
        }
    }
    public static void main(String[] args) {
        int n=5;
        int m=4;
        oddOrEven(n);
        oddOrEven(m);
    }
}
