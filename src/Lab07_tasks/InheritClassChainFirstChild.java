package Lab07_tasks;

public class InheritClassChainFirstChild extends InheritClassChainParent {
    public String StringValue;

    public InheritClassChainFirstChild(){

    }

    public InheritClassChainFirstChild(char value, String text){
        CharValue = value;
        StringValue = text;
    }

    public InheritClassChainFirstChild(InheritClassChainFirstChild obj){
        CharValue = obj.CharValue;
        StringValue = obj.StringValue;
    }
}
