class Solution {
    public int largestInteger(int num) {

        ArrayList<Integer> evenhold = new ArrayList<>();
        ArrayList<Integer> oddhold = new ArrayList<>();

        int original = num;

        // Store digits
        ArrayList<Integer> hold = new ArrayList<>();

        while (num > 0) {
            hold.add(num % 10);
            num = num / 10;
        }

        // Separate digits according to digit parity
        for (int i = 0; i < hold.size(); i++) {
            if (hold.get(i) % 2 == 0) {
                evenhold.add(hold.get(i));
            } else {
                oddhold.add(hold.get(i));
            }
        }

        Collections.sort(evenhold, Collections.reverseOrder());
        Collections.sort(oddhold, Collections.reverseOrder());

        int evenIndex = 0;
        int oddIndex = 0;
        int result = 0;
        for (int i = hold.size() - 1; i >= 0; i--) {
            int digit = hold.get(i);
            if (digit % 2 == 0) {
                result = result * 10 + evenhold.get(evenIndex++);
            } else {
                result = result * 10 + oddhold.get(oddIndex++);
            }
        }

        return result;
    }
}