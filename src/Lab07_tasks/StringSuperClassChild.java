package Lab07_tasks;

public class StringSuperClassChild extends StringSuperClass {
    private String Text1;
    public int IntValue;

    public StringSuperClassChild(String input){
        super(input);
    }

    public StringSuperClassChild(String input, int value){
        Set(input, value);
    }

    @Override
    public void Set(){
    }

    public void Set(String input){
        Text1 = input;
    }

    public void Set(int value){
        IntValue = value;
    }

    public void Set(String input, int value){
        Text1 = input;
        IntValue = value;
    }
}
