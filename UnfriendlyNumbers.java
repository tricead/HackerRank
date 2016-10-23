public class Solution {


    static int unfriendlyNumbers(long[] a,long k) {

       /* Given  friendly number and  unfriendly numbers, determine how many numbers are divisors of the friendly number but not the unfriendly numbers.
        */
        
        int kInt = (int) k;
        Set<Long> kDivisors = new HashSet<Long>();
        Set<Long> unfriendlyDivisors = new HashSet<Long>();

        for(int j = 0; j < a.length; j++) {
            for(int i = 1; i <= k; i++){
                if(a[j] % i == 0 && k % i == 0) {
                    Long sLong = new Long(i);
                    unfriendlyDivisors.add(sLong);
                }
                if(k % i == 0) {
                    Long iLong = new Long(i);
                    kDivisors.add(iLong);
                }
            }
        }

        return kDivisors.size() - unfriendlyDivisors.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        long _k = Integer.parseInt(n_split[1]);

        long[] _a = new long[_a_size];
        long _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = unfriendlyNumbers(_a,_k);
        System.out.println(res);
    }
}
