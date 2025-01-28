import edu.wpi.first.wpilibj.XboxController;

public class XBoxV1 {
    // The port the controller is plugged into (0-5), change accordingly
    int PORT = 0;

    // Fill with appropriate code
    public void doSomethingWithX(double x) {}
    public void doSomethingWithY(double y) {}
    public void doSomethingWithBA(boolean pressed) {}
    public void doSomethingWithBY(boolean pressed) {}

    public void main(String[] args) {
        XboxController xbox = new XboxController(PORT);

        doSomethingWithX(xbox.getLeftX());
        doSomethingWithY(xbox.getLeftY());

        // Use either pressed/released functions depending on needs
        boolean bA = xbox.getAButtonPressed() || xbox.getAButtonReleased();
        boolean bY = xbox.getYButtonPressed() || xbox.getYButtonRelease();

        doSomethingWithBA(bA);
        doSomethingWithBY(bY);
    }
}
