public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] a_arr = a.split("\\+|i");
        String[] b_arr = b.split("\\+|i");
        
        int a_real = Integer.parseInt(a_arr[0]);
        int a_img = Integer.parseInt(a_arr[1]);
        int b_real = Integer.parseInt(b_arr[0]);
        int b_img = Integer.parseInt(b_arr[1]);
        
        return String.format("%1$d+%2$di",a_real*b_real - a_img*b_img, a_img*b_real + a_real*b_img);
    }
}