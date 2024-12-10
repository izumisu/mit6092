class Marathon {
    public static int miniTime (int[] times) {

        int miniValue = Integer.MAX_VALUE;
        int miniIndex = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < miniValue) {
                miniValue = times[i];
                miniIndex = i;
            }
        }
        return miniIndex;
    }

    public static int miniTimeSeconds (int[] times) {
        int miniValue = Integer.MAX_VALUE;
        int miniIndexSecond = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < miniValue) {
                if (times[i] == 243) {
                    break;
                }
                miniValue = times[i];
                miniIndexSecond = i;
            }
        }
        return miniIndexSecond;
    }
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };


        int index = miniTime(times);
        System.out.println("First mini: " + names[index] + ": " + times[index]);

        int indexSecond = miniTimeSeconds(times);
        System.out.println("Second mini: " + names[indexSecond] + ": " + times[indexSecond]);
    }
}
