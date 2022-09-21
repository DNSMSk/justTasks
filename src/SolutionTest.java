public class SolutionTest {

    public static int SquareDigit(int n) {
        int res = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            int j = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            res = Integer.parseInt(String.valueOf(res) + (j * j));
        }
        return (res);
    }

    public static int persistence(int n) {
        boolean is = true;
        long sum = 1;
        int count = 0;
        while (is) {
            if (String.valueOf(n).length() <= 1) {
                sum = n;
                is = false;
                System.out.println("Cycle ended");
            } else {
                count++;
                sum = n;
                n = 1;
                for (int i = 0; i < String.valueOf(sum).length(); i++) {
                    n = (Integer.parseInt("" + String.valueOf(sum).charAt(i)) * n);
                }
            }
        }
        return count;
    }

    public static int kata(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j1 = 0; j1 < i; j1++) {
                sum1 = sum1 + arr[j1];
            }
            for (int j2 = arr.length - 1; j2 > i; j2--) {
                sum2 = sum2 + arr[j2];
            }
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }

    public static int solution(int number) {
        int ans = 0;
        if (number <= 0) {
            ans = -1;
        } else {
            for (int i = number - 1; i > 0; i--) {
                if (i % 3 == 0 || i % 5 == 0) {
                    ans += i;
                }
            }
        }

        return ans;
    }

    public static int[] deleteNth(Integer[] elements, int maxOccurrences) {
        int countOfRepeats = 0;
        int countOfDeletes = 0;
        int countOfAllDeletes = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            countOfAllDeletes+=countOfDeletes;
            countOfDeletes=0;
            countOfRepeats = 0;
            for (int j = i + 1; j <= elements.length - 1-countOfAllDeletes; j++) {
//                System.out.println(Arrays.toString(elements));
                if (elements[i]==(elements[j])) {
                    countOfRepeats++;
                    if (countOfRepeats >= maxOccurrences) {
                        countOfDeletes++;
                    }
                } else {
                    elements[j - countOfDeletes] = elements[j];

                }

            }
        }
        int[] newar = new int[elements.length - countOfAllDeletes];
        for (int i = 0; i < newar.length; i++) {
            newar[i] = elements[i];
        }
//        System.out.println(Arrays.toString(newar));
        return newar;
    }

    public static int maxmin(int n) {
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);
        return 0;
    }
}

