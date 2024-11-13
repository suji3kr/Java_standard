package ch08.sec21;

public class NewExceptionTest {

    public static void main(String[] args) {
        // try-catch 블록을 사용하여 예외를 처리
        try {
            // 설치를 시작하고, 파일을 복사하는 작업을 순차적으로 수행
            startInstall();  // 설치 시작
            copyFiles();     // 파일 복사 (구현되지 않음)
            
        } catch (SpaceException e) {
            // SpaceException이 발생한 경우
            System.out.println("에러 메시지: " + e.getMessage());  // 예외 메시지 출력
            e.printStackTrace();  // 예외의 스택 트레이스를 출력
            System.out.println("공간을 확보하여 다시 설치 하시기 바랍니다.");  // 사용자에게 공간 확보 안내
            
        } catch (MemoryException me) {
            // MemoryException이 발생한 경우
            System.out.println("에러 메시지: " + me.getMessage());  // 예외 메시지 출력
            me.printStackTrace();  // 예외의 스택 트레이스를 출력
            System.gc();  // 가비지 컬렉션을 시도하여 메모리 정리
            System.out.println("다시 설치를 시도하세요.");  // 사용자에게 재시도 안내
        } finally {
            // 예외 발생 여부와 관계없이 항상 실행되는 블록
            deleteTempFile();  // 임시 파일 삭제 (구현되지 않음)
        }
    }

    // 설치를 시작하는 메서드, 공간이 부족하면 SpaceException을 던짐
    static void startInstall() throws SpaceException, MemoryException {
        // 충분한 공간이 있는지 확인
        if (!enoughSpace()) {
            // 공간이 부족하면 SpaceException을 던짐
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        // 다시 한번 충분한 공간을 확인 (같은 조건이므로 두 번째 예외도 발생)
        if (!enoughSpace()) {
            // 공간이 부족하면 SpaceException을 던짐
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
    }

    // 파일 복사 메서드 (구현되지 않음)
    static void copyFiles() { }

    // 임시 파일 삭제 메서드 (구현되지 않음)
    static void deleteTempFile() { }

    // 공간이 충분한지 확인하는 메서드
    static boolean enoughSpace() {
        return false;  // 항상 false를 반환하여 공간 부족 예외를 발생시킴
    }

    // 메모리가 충분한지 확인하는 메서드
    static boolean enoughMemory() {
        return true;  // 항상 true를 반환, 메모리 부족 예외는 발생하지 않음
    }
}

// 사용자 정의 예외 클래스: 공간 부족 예외
class SpaceException extends Exception {
    // 생성자: 예외 메시지를 받아서 부모 클래스인 Exception에 전달
    SpaceException(String msg) {
        super(msg);  // 부모 클래스 Exception에 메시지를 전달
    }
}    

// 사용자 정의 예외 클래스: 메모리 부족 예외
class MemoryException extends Exception {
    // 생성자: 예외 메시지를 받아서 부모 클래스인 Exception에 전달
    MemoryException(String msg) {
        super(msg);  // 부모 클래스 Exception에 메시지를 전달
    }
}



