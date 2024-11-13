package ch05;

public class ArrayEx {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length-1; i++) {
            boolean changed = false; //자리바꿈이 발생했는지 체크

            for (int j = 0; j < numArr.length - 1 - i; i++) {
                if (numArr[j] > numArr[j + 1]) {     //옆의 값이 작으면 서로 바꾼다
                    int temp = numArr[j];            //Bubble sort 정렬 j: [j +1]바로 옆 바꿈 반복
                    numArr[j] = numArr[j + 1];               //우측 최대값 부터 시작해서 왼쪽에 최소값으로 정렬
                    numArr[j + 1] = temp;
                    changed = true; //자리 바꿈 -> true
                }                                               //번외) select sort 정렬 i: [j]좌측 최대값부터 시작해서 오른쪽 최소값으로 정렬
            } // end for j
            if (!changed) break;

            for (int k = 0; k<numArr.length;k++)
                System.out.print(numArr[k]);
            System.out.println();
        } //end for i
    }// main 끝
}