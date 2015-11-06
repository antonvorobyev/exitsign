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

import static co.vorobyev.exitsign.ExitStatusAdapter.adapt;

import co.vorobyev.exitsign.StandardExitStatus;
import co.vorobyev.exitsign.WinExitStatus;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.util.Arrays;

// TODO: Adapt google checkstyle rules for using @SuppressWarnings of "abbreviationaswordinname".

/**
 * This is integration test of adaptive exit status usage.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class AdaptiveExitStatusIT {

  /**
   * Utility constant imitating valid arguments.
   */
  public static final String[] validArgs = {"valid"};

  /**
   * Utility constant imitating invalid arguments.
   */
  public static final String[] invalidArgs = {"invalid"};

  /**
   * Holder of success status specified by environment.
   */
  public static ExitStatus successStatus;

  /**
   * Holder of invalid command line arguments status specified
   * by environment.
   */
  public static ExitStatus invalidArgsStatus;

  @Rule
  public final ExpectedSystemExit exit = ExpectedSystemExit.none();

  /**
   * Prepares testing environment.
   */
  @BeforeClass
  public static void beforeClass() {

    if (System.getProperty("os.name").startsWith("Windows")) {
      successStatus = WinExitStatus.SUCCESS;
      invalidArgsStatus = WinExitStatus.INVALID_COMMAND_LINE;
    } else {
      successStatus = PosixExitStatus.OK;
      invalidArgsStatus = PosixExitStatus.USAGE;
    }

  }

  @Test
  public void appShouldExitSuccessfulyWhenValidArgs() throws Exception {
    exit.expectSystemExitWithStatus(successStatus.code());
    App.main(validArgs);
  }

  @Test
  public void appShouldExitWithInvalidCommandLineWhenInvalidArgs() throws Exception {
    exit.expectSystemExitWithStatus(invalidArgsStatus.code());
    App.main(invalidArgs);
  }

  /**
   * This is example class that demonstrates 'main class' with using exit statuses.
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

      if (isValid(args)) {
        exitStatus = StandardExitStatus.SUCCESS;
      } else {
        exitStatus = StandardExitStatus.INVALID_ARGUMENT;
      }

      System.exit(adapt(exitStatus).code());
    }

  }

}
