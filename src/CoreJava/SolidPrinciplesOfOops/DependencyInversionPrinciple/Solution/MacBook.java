package CoreJava.SolidPrinciplesOfOops.DependencyInversionPrinciple.Solution;

import CoreJava.SolidPrinciplesOfOops.DependencyInversionPrinciple.Problem.WiredKeyBoard;
import CoreJava.SolidPrinciplesOfOops.DependencyInversionPrinciple.Problem.WiredMouse;

/**
 * D - Dependency Inversion Principle
 * Class should depend on Interfaces rather than Concrete Classes.
 * Here MacBook class uses WiredKeyBoard and WiredMouse Concrete Classes and So it
 * is not following Dependency Inversion Principle.
 * Solution is instead of WiredKeyBoard and WiredMouse Concrete Classes uses KeyBoard and Mouse Interfaces.
 */

public class MacBook {
    private final KeyBoard keyBoard;
    private final Mouse mouse;

    public MacBook(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
