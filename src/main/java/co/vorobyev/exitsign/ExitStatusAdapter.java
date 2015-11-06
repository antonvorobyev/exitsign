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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Adapter class provides mapping of standard exit statuses
 * to environment specific.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public final class ExitStatusAdapter {

  /**
   * Standard to Windows mappings of exit statuses.
   */
  private static final Map<ExitStatus, ExitStatus> WIN;

  /**
   * Standard to POSIX mappings of exit statuses.
   */
  private static final Map<ExitStatus, ExitStatus> POSIX;

  static {
    Map<ExitStatus, ExitStatus> win = new HashMap<ExitStatus, ExitStatus>();
    win.put(StandardExitStatus.INVALID_ARGUMENT, WinExitStatus.INVALID_COMMAND_LINE);
    win.put(StandardExitStatus.SUCCESS, WinExitStatus.SUCCESS);

    WIN = Collections.unmodifiableMap(win);

    Map<ExitStatus, ExitStatus> posix = new HashMap<ExitStatus, ExitStatus>();
    posix.put(StandardExitStatus.INVALID_ARGUMENT, PosixExitStatus.USAGE);
    posix.put(StandardExitStatus.SUCCESS, PosixExitStatus.OK);

    POSIX = Collections.unmodifiableMap(posix);
  }


  /**
   * Private constructor, use this class as utility.
   */
  private ExitStatusAdapter() {
    throw new AssertionError();
  }

  /**
   * Adapts incoming exit status to environment specific.
   *
   * @param status the adaptable exit status
   * @return an adapted exit status
   * @throws IllegalArgumentException if mapping not exits
   */
  protected static ExitStatus adapt(ExitStatus status) {
    String os = System.getProperty("os.name");

    ExitStatus adaptedStatus;
    if (os.startsWith("Windows")) {
      adaptedStatus = WIN.get(status);
    } else {
      adaptedStatus = POSIX.get(status);
    }

    if (adaptedStatus == null) {
      throw new IllegalArgumentException();
    } else {
      return adaptedStatus;
    }

  }


}
