class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        while (j < n) {
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);

            if (mp.size() <= 2) {
                count = Math.max(count, j - i + 1);
            } else {
                while (mp.size() > 2) {
                    mp.put(fruits[i], mp.get(fruits[i]) - 1);
                    if (mp.get(fruits[i]) == 0) {
                        mp.remove(fruits[i]);
                    }
                    i++;
                }
            }

            j++;
        }

        return count;
    }
}