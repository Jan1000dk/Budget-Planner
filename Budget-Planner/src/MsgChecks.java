import java.util.ArrayList;

public class MsgChecks {

    public ArrayList<String> yesMsg() {
        ArrayList<String> yesMsg = new ArrayList<String>();
        yesMsg.add("yes");
        yesMsg.add("Yes");
        yesMsg.add("ja");
        yesMsg.add("yes");
        return yesMsg;
    }

    //For when you have to use a no message
    public ArrayList<String> noMsg() {
        ArrayList<String> yesMsg = new ArrayList<String>();
        yesMsg.add("no");
        yesMsg.add("No");
        yesMsg.add("Nej");
        yesMsg.add("nej");
        return yesMsg;
    }
}
