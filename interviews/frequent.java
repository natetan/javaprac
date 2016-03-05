/*
 * Given a list of ints, find the most frequently occurring number.
 *
 * I use a map here, since it is the most efficient.
 * This is an O(n) solution.
 */

public int frequent(int[] list) {
	Map<Integer, Integer> map = HashMap<Integer, Integer>();
	for (int num : list) {
		if (map.containsKey(num)) {
			map.put(num, map.get(num) + 1);
		} else {
			map.put(num, 1);
		}
	}
	int max = 0;
	int count = 0;
	for (int num : map.keySet()) {
		if (map.get(num) > count) {
			count = map.get(num);
			max = num;
		}
	}
	return max;
}
