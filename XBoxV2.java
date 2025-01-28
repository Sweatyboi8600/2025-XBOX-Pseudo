// Alternatively we can initiate event listeners
import edu.wpi.first.wpilibj.event.EventLoop;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.event.BooleanEvent;

public class XBoxV2 {
    // The port the controller is plugged into (0-5), change accordingly
    public int PORT = 0;

    // Fill with appropriate code
    public void doSomethingWithX(double x) {}
    public void doSomethingWithY(double y) {}
    public void doSomethingWithBA(boolean pressed) {}
    public void doSomethingWithBY(boolean pressed) {}

    public void main(String[] args) {
        XboxController xbox = new XboxController(PORT);

        Runnable buttonAPressCallback = () -> doSomethingWithBA(xbox.getAButtonPressed());
        Runnable buttonYPressCallback = () -> doSomethingWithBY(xbox.getYButtonPressed());

        BooleanEvent buttonAPressEvent = xbox.a(new EventLoop().bind(buttonAPressCallback));
        BooleanEvent buttonYPressEvent = xbox.a(new EventLoop().bind(buttonYPressCallback));
    };
}
