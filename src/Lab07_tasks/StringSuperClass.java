package Lab07_tasks;

public class StringSuperClass {
    private String Text;

    public StringSuperClass(){
    }

    public StringSuperClass(String input){
        Set(input);
    }

    public void Set(){
        Text = "";
    }

    public void Set(String input){
        Text = input;
    }

    public int Length(){
        return Text.length();
    }
}
