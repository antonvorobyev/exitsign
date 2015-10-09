package co.vorobyev.exitsign;

/**
 * Constant class collecting exit status codes.
 *
 * @since 0.1
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 *
 */
public final class ExitStatus {

    /** Don't create instance of this class, it is constant class. */
    private ExitStatus() {
        throw new AssertionError();
    }

    /** Exit code returned when execution finishes successfully */
    public static final int SUCCESS = 0;

    /** Exit code returned when execution finishes successfully, synonym of SUCCESS */
    public static final int OK = 0;

    /** Exit code returned when execution finishes failingly */
    public static final int FAILURE = 1;

    /** Exit code returned when execution finishes failingly, synonym of FAILURE */
    public static final int BAD = 1;


}
