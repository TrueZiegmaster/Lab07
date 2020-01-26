package Lab07_tasks;

public class ClassTreeParent {
    protected String StringValue;

    public ClassTreeParent(){

    }

    public ClassTreeParent(String text){
        StringValue = text;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nStringValue: " + StringValue + "\n";
    }
}
