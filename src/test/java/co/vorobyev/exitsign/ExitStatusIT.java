package co.vorobyev.exitsign;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/** imports statically exit statuses */
import java.util.Arrays;

import static co.vorobyev.exitsign.ExitStatus.*;

/**
 * Integration test as example demonstrating exit status usage.
 *
 * @since 0.1
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 *
 */
public class ExitStatusIT {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    /** Utility constant imitating valid arguments */
    public static final String[] validArgs = { "valid" };

    /** Utility constant imitating invalid arguments */
    public static final String[] invalidArgs = { "invalid" };

    /**
     * This is example class that demonstrates 'main class' with using exit statuses.
     *
     */
    public static class App {

        /**
         * Validates application arguments.
         *
         * @param args application arguments.
         * @return true if arguments is valid else false.
         */
        private static boolean isValid(String[] args) {
            if (Arrays.equals(args, validArgs))
                return true;
            else
                return false;
        }

        /**
         * Executes app with propounded arguments.
         *
         * @param args app arguments.
         */
        public static void main(String... args) {
            int exitStatus;

            if (isValid(args))
                exitStatus = SUCCESS;
            else
                exitStatus = FAILURE;

            System.exit(exitStatus);
        }

    }


    @Test
    public void appShouldExitSuccessfulyWhenValidArgs() throws Exception {
        exit.expectSystemExitWithStatus(SUCCESS);
        App.main(validArgs);
    }

    @Test
    public void appShouldExitFailureWhenInvalidArgs() throws Exception {
        exit.expectSystemExitWithStatus(FAILURE);
        App.main(invalidArgs);
    }

}
