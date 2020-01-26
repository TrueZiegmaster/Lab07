package Lab07_tasks;

public class InheritClassChainSecondChild extends InheritClassChainFirstChild {
    public int IntValue;

    public InheritClassChainSecondChild(char value, String text, int input){
        IntValue = input;
        StringValue = text;
        CharValue = value;
    }

    public InheritClassChainSecondChild(InheritClassChainSecondChild obj){
        IntValue = obj.IntValue;
        StringValue = obj.StringValue;
        CharValue = obj.CharValue;
    }
}
