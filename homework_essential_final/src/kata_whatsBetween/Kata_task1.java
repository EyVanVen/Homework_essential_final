package kata_whatsBetween;

import java.util.Arrays;

class Kata_task1 {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(Between(-2, 2)));

        }

        public static int[] Between(int a, int b) {
            int [] arr = new int[b - a + 1];
            for(int i = 0; i < arr.length; i++){
                arr[i] = a;
                a++;
            }
            return arr;
        }
    }
