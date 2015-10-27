/*
Copyright 2015 Anton Vorobyev
Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

package co.vorobyev.exitsign;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.util.Arrays;

/** imports statically exit statuses */
import static co.vorobyev.exitsign.StandardExitStatus.*;

/**
 * Integration test as example demonstrating exit status usage.
 *
 * @since 0.1
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
            return Arrays.equals(args, validArgs);
        }

        /**
         * Executes app with propounded arguments.
         *
         * @param args app arguments.
         */
        public static void main(String... args) {
            ExitStatus exitStatus;

            if (isValid(args))
                exitStatus = SUCCESS;
            else
                exitStatus = FAILURE;

            System.exit(exitStatus.code());
        }

    }


    @Test
    public void appShouldExitSuccessfulyWhenValidArgs() throws Exception {
        exit.expectSystemExitWithStatus(SUCCESS.code());
        App.main(validArgs);
    }

    @Test
    public void appShouldExitFailureWhenInvalidArgs() throws Exception {
        exit.expectSystemExitWithStatus(FAILURE.code());
        App.main(invalidArgs);
    }

}
