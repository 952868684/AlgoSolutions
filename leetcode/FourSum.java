public class FourSum {
    
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue;
            for (int j = i + 1; j < num.length; j++) {
                if (j > i + 1 && num[j] == num[j - 1])
                    continue;
                int k = j + 1;
                int p = num.length - 1;
                while (k < p) {
                    int sum = num[i] + num[j] + num[k] + num[p];
                    if (sum > target) 
                        p--;
                    else if (sum < target)
                        k++;
                    else {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        list.add(num[p]);
                        res.add(list);
                        do {
                            k++;
                        } while (k < p && num[k] == num[k - 1]);
                        do {
                            p--;
                        } while (k < p && num[p] == num[p + 1]);
                    }
                }
            }
        }
        return res;
    }

}
