package co.vorobyev.exitsign;

/**
 * Constant class collecting exit status codes.
 *
 * @author Anton Vorobyev, <anton@vorobyev.co>
 */
public final class ExitStatus {

    /** Don't create instance of this class, it is constant class. */
    private ExitStatus() {
        throw new AssertionError();
    }

    /** Exit code returned when execution finishes successfully */
    public static final int OK = 0;

}
