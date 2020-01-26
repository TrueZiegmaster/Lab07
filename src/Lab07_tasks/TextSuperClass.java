package Lab07_tasks;

public class TextSuperClass {
    private String Text;

    public TextSuperClass(){
    }

    public TextSuperClass(String input){
        Text = input;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nText: " + Text + "\n";
    }
}
