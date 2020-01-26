package Lab07_tasks;

public class ClassTreeFirstChild extends ClassTreeParent {
    protected int IntValue;

    public ClassTreeFirstChild(String text, int input){
        StringValue = text;
        IntValue = input;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nStringValue: " + StringValue + "\nIntValue: " + IntValue + "\n";
    }
}
