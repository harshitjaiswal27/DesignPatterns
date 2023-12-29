package behavioral_patterns.memento_pattern;

public class TextEditorOriginator {
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public Memento takeSnapshot(){
        return new Memento(text);
    }
    public void restore(Memento memento){
        this.text = memento.text;
    }
    public static class Memento{
        private final String text;
        private Memento(String text){
            this.text = text;
        }
        private String getText(){ 
            return text;
        }
    }
}
