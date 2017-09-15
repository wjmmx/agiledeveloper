package lsp;

public class AreaCalculator {
    public static int CalculateArea(Rectangle r) {
        return r.getWidth() * r.getHeight();
    }

    public static int CalculateArea(Square s) {
        return s.getWidth() * s.getHeight();
    }
}
