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
    public ArrayList<String> editMsg() {
        ArrayList<String> editMsg = new ArrayList<String>();
        editMsg.add("edit");
        editMsg.add("Edit");
        return editMsg;
    }

    public ArrayList<String> viewMsg() {
        ArrayList<String> viewMsg = new ArrayList<String>();
        viewMsg.add("view");
        viewMsg.add("View");
        return viewMsg;
    }

    public ArrayList<String> newMsg() {
        ArrayList<String> newMsg = new ArrayList<String>();
        newMsg.add("new");
        newMsg.add("New");
        return newMsg;
    }

}
