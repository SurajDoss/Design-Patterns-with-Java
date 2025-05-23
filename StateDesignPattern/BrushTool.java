package StateDesignPattern;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Diplay Brush");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw brush");
    }
}
