package session10;

import java.util.List;

public class JavaReadXmlSaxEx2 {

    public static void main(String[] args) {

        MyRunner2 runner = new MyRunner2();
        List<User2> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}