package chapter10.replaceConstructorwithFactoryMethod.after.example3;

/**
 * 메서드를 사용하는 하위클래스 작성
 */
public class Person {
    static Person createMale() {
        return new Male();
    }

    static Person createFemale() {
        return new Female();
    }
}

class Male extends Person {

}

class Female extends Person {

}
