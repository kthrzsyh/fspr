package session10;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler2 extends DefaultHandler {

    private List<User2> users2 = new ArrayList<>(); // menampung element yg ada di xml
    private User2 user2;

    private boolean bfn = false;
    private boolean bln = false;

    @Override
    public void startElement(String uri, String localName,
            String qName, Attributes attributes) throws SAXException {

        if ("user".equals(qName)) {

            user2 = new User2();

            int id = Integer.valueOf(attributes.getValue("id"));
            user2.setId(id);
        }

        switch (qName) {

            case "firstname":
                bfn = true;
                break;

            case "lastname":
                bln = true;
                break;

        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (bfn) {
            user2.setFirstName(new String(ch, start, length));
            bfn = false;
        }

        if (bln) {
            user2.setLastName(new String(ch, start, length));
            bln = false;
        }
    }

    @Override
    public void endElement(String uri, String localName,
            String qName) throws SAXException {

        if ("firstname".equals(qName)) {
            users2.add(user2);
        }
    }

    public List<User2> getUsers2() {

        return users2;
    }
}