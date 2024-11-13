//// package ch08;
//
//public class ExeptionEx2 {
//
//    public static void main(String[] args) {
//        int number = 100;  // 나누어질 값, 100으로 고정
//        int result = 0;    // 나눈 결과를 저장할 변수
//
//        // 10번 반복하는 for 루프
//        for(int i = 0; i < 10; i++) {
//            // Math.random()은 0.0 (포함)과 1.0 (미포함) 사이의 값을 반환
//            // Math.random() * 10은 0.0 이상 10.0 미만의 값을 반환
//            // 그 값을 int로 형변환하면 0부터 9 사이의 무작위 값이 나옴
//            // 예를 들어 Math.random()이 0.0이라면 결과는 0이 되어 0으로 나누는 상황이 발생
//            result = number / (int)(Math.random() * 10); // 7번째 라인
//            
//            // 나눗셈 결과를 출력
//            System.out.println(result);
//        }
//
//    }
//
//}

//에러 예시
