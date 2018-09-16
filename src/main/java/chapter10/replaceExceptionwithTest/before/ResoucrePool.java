package chapter10.replaceExceptionwithTest.before;

import java.util.EmptyStackException;
import java.util.Stack;

public class ResoucrePool {
    Stack _available;
    Stack _allocated;

    Resource getResource() {
        Resource result;
        try {
            result = (Resource) _available.pop();
            _allocated.push(result);
            return result;
        } catch (EmptyStackException e) {
            result = new Resource();
            _allocated.push(result);
            return result;
        }
    }
}
