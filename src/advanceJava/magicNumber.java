package advanceJava;
//amazon question
/*
  Magic Numbers
1 = 0 0 1 ->  5 * 1 = 5
2 = 0 1 0 ->  5 * 5 = 25
3 = 0 1 1 -> 5 * 5 + 5 * 1 =  30
.
.

 */
public class magicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;
        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base ;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
