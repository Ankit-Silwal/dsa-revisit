import java.util.*;

public class SubSequenceWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        Arrays.sort(arr);
        System.out.println(subsetduplicate(arr));
    }

    static List<List<Integer>> subsetduplicate(int[] arr) {
        return solve(new ArrayList<>(), arr);
    }

    static List<List<Integer>> solve(List<Integer> p, int[] up) {
        if (up.length == 0) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(p));
            return res;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> take = new ArrayList<>(p);
        take.add(up[0]);
 
        ans.addAll(solve(take, Arrays.copyOfRange(up, 1, up.length)));
        int i = 1;
        while (i < up.length && up[i] == up[0]) {
            i++;
        }

        ans.addAll(solve(new ArrayList<>(p), Arrays.copyOfRange(up, i, up.length)));
        return ans;
    }
}
