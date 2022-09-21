import java.util.ArrayList;
import java.util.Arrays;

public class SolutionTest {

    public static void main(String[] args) {
//        System.out.println(SquareDigit(2));
//        System.out.println(persistence(999));
//        System.out.println(kata(new int [] {1,2,3,4,3,2,1}));
//        System.out.println(solution(100));
        System.out.println(deleteNth(new Integer[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3));
//        maxmin(1000);

    }

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

    public static Integer[] deleteNth(Integer[] elements, int maxOccurrences) {
        boolean isItDone = false;
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(elements));
        ArrayList<Integer> id = new ArrayList<Integer>();
        int n = 0;
        int counter = 0;
        int countodDel = 0;
        while (!isItDone) {
            counter = 0;
            for (int i = n; i < elements.length; i++) {
                if (elements[n].equals(elements[i])) {
                    counter++;
                    System.out.println(numbers);
//                    System.out.println(Arrays.toString(elements));
                    if (counter >= maxOccurrences) {
                        id.add(i);
//                        numbers.remove(i - countodDel);
//                        countodDel++;


                    } /*else {
                        numbers.add(elements[i]);
                        System.out.println(numbers);
                    }*/
                }
            }
            System.out.println(id);
            n++;
            for (int i =0;i< id.size();i++){
                numbers.remove((id.get(i)));
            }
            id.clear();
            if (n == elements.length) {

                isItDone = true;
            }
        }
        System.out.println(id);
        System.out.println(Arrays.toString(elements));
        System.out.println(numbers);
        return null;
    }

    public static int maxmin(int n){
        double[] array = new double[n];
        for(int i = 0; i<array.length;i++){
            array[i]=Math.random();
        }
        double min = array[0];
        double max = array[0];
        for(int i = 0; i<array.length;i++){
            if (max<array[i]){max=array[i];}
            if (min>array[i]){min=array[i];}
        System.out.println(array[i]);}
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
        return 0;
        double maxa = Arrays.stream(array).min();
    }
}

