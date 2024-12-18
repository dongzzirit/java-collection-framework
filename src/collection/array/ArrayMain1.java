package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("=== index 입력 : O(1)");
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        // 참조값
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("=== index 변경 : O(1)");
        arr[2] = 20;
        System.out.println(Arrays.toString(arr));

        System.out.println("=== index 조회 : O(1)");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("=== 배열 검색 : O(n)");
        System.out.println(Arrays.toString(arr));

        int value = 20;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾았습니다.");
                return;
            }
        }

    }


}
