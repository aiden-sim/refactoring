package chapter10.replaceExceptionwithTest.after;

import java.util.EmptyStackException;
import java.util.Stack;

public class ResoucrePool {
    Stack _available;
    Stack _allocated;

    Resource getResource() {
        Resource result;
        if (_available.isEmpty()) {
            result = new Resource();
            _allocated.push(result);
            return result;
        } else {
            result = (Resource) _available.pop();
            _allocated.push(result);
            return result;

            /**
             * 테스트 후 예외가 발생하지 않으면 try 절을 완전히 삭제
             */
            /*
            try {
                result = (Resource) _available.pop();
                _allocated.push(result);
                return result;
            } catch (EmptyStackException e) {
                Assert.shouldNeverReachHere("pop 실행 시에 available이 비어 있음");
                result = new Resource();
                _allocated.push(result);
                return result;
            }*/
        }
    }
}

class Assert {
    static void shouldNeverReachHere(String message) {
        throw new RuntimeException(message);
    }
}