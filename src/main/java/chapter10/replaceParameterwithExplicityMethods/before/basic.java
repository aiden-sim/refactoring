package chapter10.replaceParameterwithExplicityMethods.before;

/**
 * 매개변수를 메서드로 전환
 */
public class Basic {
    int _height = 0;
    int _width = 0;

    void setValue(String name, int value) {
        if (name.equals("height")) {
            _height = value;
            return;
        }

        if (name.equals("width")) {
            _width = value;
            return;
        }
    }
}
