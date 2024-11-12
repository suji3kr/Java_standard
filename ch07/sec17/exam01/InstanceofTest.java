package ch07.sec17.exam01;

public class InstanceofTest {

    public static void main(String[] args) {

        // FireEngine 객체 생성
        FireEngine fe = new FireEngine();
        
        // 객체가 FireEngine 타입인지 확인
        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }
        
        // 객체가 Car 타입인지 확인 (FireEngine은 Car를 상속받기 때문에 true)
        if (fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }
        
        // 객체가 Object 타입인지 확인 (모든 클래스는 Object를 상속받기 때문에 true)
        if (fe instanceof Object) {
            System.out.println("This is a Object instance.");
        }
        
        // 객체의 실제 클래스 이름을 출력
        System.out.println(fe.getClass().getName());
    }

}

// Car 클래스 정의 
class Car {}

// FireEngine 클래스 정의 //Car 클래스를 상속받음
class FireEngine extends Car {}
