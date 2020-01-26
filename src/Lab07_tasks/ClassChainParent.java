package Lab07_tasks;

public class ClassChainParent {
    public int IntValue;

    public ClassChainParent(){

    }
    public ClassChainParent(int input){
        Set(input);
    }

    public void Set(int input){
        IntValue = input;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nIntValue: " + IntValue + "\n";
    }
}
