package ch08;

public class ExeptionEx3 {

    public static void main(String[] args) {
        int number = 100;   // 나눌 값 (100)
        int result = 0;     // 나눈 결과 저장할 변수
        
        // 10번 반복하는 for 루프
        for(int i = 0; i < 10; i++) {
            try {
                // Math.random()은 0.0 (포함)과 1.0 (미포함) 사이의 값을 반환
                // Math.random() * 10은 0.0 이상 10.0 미만의 값을 반환
                // 그 값을 int로 변환하여 0에서 9 사이의 무작위 값으로 나눔
                result = number / (int)(Math.random() * 10); // 7번째 라인
                
                // 연산이 성공적으로 완료되면 그 결과 출력
                System.out.println(result);
            } catch (ArithmeticException e) {
                // 0으로 나누는 경우 예외가 발생하면 catch 블록으로 넘어옴
                // 0으로 나누면 ArithmeticException이 발생하므로 0을 출력
                System.out.println("0");
            } // try-catch 블록 끝
        } // for 루프 끝
    }

}
