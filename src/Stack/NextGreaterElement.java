package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = {1,3,2,4};
        System.out.println(Arrays.toString(nextLargerElement(arr,arr.length)));
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        long[] ans = new long[n];
        Stack<Long> st = new Stack<>();
        for (int i = n-1; i >=0; i--) {
            if(st.empty()){
                ans[i]=-1;
            }
            else if (st.size()>0 && st.peek()>arr[i]){
                ans[i] = st.peek();
            }
            else if (st.size()>0 && st.peek()<=arr[i]){
                while (st.size()>0 && st.peek()<=arr[i]){
                      st.pop();
                }
                if(st.size()==0){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}


//[3, 4, 4, -1]