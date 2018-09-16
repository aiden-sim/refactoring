package chapter10.removeSettingMethod.before;

public class Account {
    private String _id;

    Account(String id) {
        setId(id);
    }

    void setId(String arg) {
        _id = arg;
    }
}
