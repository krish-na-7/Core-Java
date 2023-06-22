package CoreJava.SolidPrinciplesOfOops.DependencyInversionPrinciple.Problem;

/**
 * D - Dependency Inversion Principle
 * Class should depend on Interfaces rather than Concrete Classes.
 * Here MacBook class uses WiredKeyBoard and WiredMouse Concrete Classes and So it
 * is not following Dependency Inversion Principle.
 * Solution is instead of WiredKeyBoard and WiredMouse Concrete Classes uses KeyBoard and Mouse Interfaces.
 */

public class MacBook {
    private final WiredKeyBoard keyBoard;
    private final WiredMouse mouse;

    public MacBook(WiredKeyBoard keyBoard, WiredMouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
