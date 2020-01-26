package Lab07_tasks;

public class ClassChainSecondChild extends ClassChainFirstChild {
    public String StringValue;

    public ClassChainSecondChild(){
    }

    public ClassChainSecondChild(int input, char value){
        super(input, value);
    }

    public ClassChainSecondChild(int input, char value, String text){
        Set(input, value, text);
    }

    public void Set(int input, char value, String text){
        IntValue = input;
        CharValue = value;
        StringValue = text;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nIntValue: " + IntValue + "\nCharValue: " + CharValue +"\nStringValue: " + StringValue + "\n";
    }
}
