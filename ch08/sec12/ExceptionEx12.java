package ch08.sec12;

public class ExceptionEx12 {

    public static void main(String[] args) throws Exception {
        // main 메서드에서 method1()을 호출
        // method1은 method2를 호출하고 method2에서 던지는 예외를 다시 던짐
        method1();  // method1을 호출하며 예외를 던짐
    }

    static void method1() throws Exception {
        // method1에서 method2를 호출
        // method2에서 발생한 예외를 method1로 전파
        method2();  // method2를 호출하면서 예외를 던짐
    }

    static void method2() throws Exception {
        // method2에서 예외를 던짐
        // 이 예외는 method1로, 그리고 method1은 이를 main으로 전파
        throw new Exception();  // 예외 발생
    }
}



//에러내용 순서 Exception in thread "main" java.lang.Exception
//at ch08.sec12.ExceptionEx12.method2(ExceptionEx12.java:14)
//at ch08.sec12.ExceptionEx12.method1(ExceptionEx12.java:11)
//at ch08.sec12.ExceptionEx12.main(ExceptionEx12.java:6)
// 밑에서 부터 해결 
