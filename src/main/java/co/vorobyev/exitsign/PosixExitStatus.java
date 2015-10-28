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

/**
 * Enumeration class collecting exit statuses peculiar to POSIX software.
 *
 * <p>In fact it is a wrapper-collector of default ExitStatus implementation.</p>
 *
 * <p>It is is mirror of constants from {@code sysexits.h}.</p>
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public class PosixExitStatus extends ExitStatus {

  /**
   * Successful termination.
   */
  public static final ExitStatus OK;

  /**
   * Miscellaneous errors, such as "divide by zero" and other impermissible operations.
   */
  public static final ExitStatus ERROR;

  /**
   * The command was used incorrectly, e.g., with the wrong number of arguments, a bad flag, a bad
   * syntax in a parameter, or whatever.
   */
  public static final ExitStatus USAGE;

  /**
   * The input data was incorrect in some way. This should only be used for user's data and not
   * system files.
   */
  public static final ExitStatus DATA;

  /**
   * An input file (not a system file) did not exist or was not readable. This could also include
   * errors like "No message" to a mailer (if it cared to catch it).
   */
  public static final ExitStatus NOINPUT;

  /**
   * The user specified did not exist.  This might be used for mail addresses or remote logins.
   */
  public static final ExitStatus NOUSER;

  /**
   * The host specified did not exist.  This is used in mail addresses or network requests.
   */
  public static final ExitStatus NOHOST;

  /**
   * A service is unavailable. This can occur if a support program or file does not exist. This can
   * also be used as a catchall message when something you wanted to do doesn't work, but you don't
   * know why.
   */
  public static final ExitStatus UNAVAILABLE;

  /**
   * An internal software error has been detected. This should be limited to non-operating system
   * related errors as possible.
   */
  public static final ExitStatus SOFTWARE;

  /**
   * An operating system error has been detected. This isintended to be used for such things as
   * "cannot fork", "cannot create pipe", or the like.  It includes things like getuid returning a
   * user that does not exist in the passwd file.
   */
  public static final ExitStatus OS;

  /**
   * Some system file (e.g., /etc/passwd, /etc/utmp, etc.) does not exist, cannot be opened, or has
   * some sort of error (e.g., syntax error).
   */
  public static final ExitStatus OSFILE;

  /**
   * A (user specified) output file cannot be created.
   */
  public static final ExitStatus CANTCREAT;

  /**
   * An error occurred while doing I/O on some file.
   */
  public static final ExitStatus IO;

  /**
   * Temporary failure, indicating something that us not really an error.  In sendmail, this means
   * that a mailer (e.g.) could not create a connection, and the request should be reattempted
   * later.
   */
  public static final ExitStatus TEMPFAIL;

  /**
   * The remote system returned something that was "not possible" during a protocol exchange.
   */
  public static final ExitStatus PROTOCOL;

  /**
   * You did not have sufficient permission to perform the operation. This is not intended for file
   * system problems, which should use NOINPUT or CANTCREAT, but rather for higher level
   * permissions.
   */
  public static final ExitStatus NOPERM;

  /**
   * Configuration errors.
   */
  public static final ExitStatus CONFIG;

  static {
    ExitStatusBuilder builder = ExitStatusBuilderFactory.createBuilder();

    OK = builder.code(0).meaning("Successful termination").build();
    ERROR = builder.code(1).meaning("Successful termination").build();
    USAGE = builder.code(64).meaning("Command line usage error").build();
    DATA = builder.code(65).meaning("Data format error").build();
    NOINPUT = builder.code(66).meaning("Cannot open input").build();
    NOUSER = builder.code(67).meaning("Addressee unknown").build();
    NOHOST = builder.code(68).meaning("Host name unknown").build();
    UNAVAILABLE = builder.code(69).meaning("Service unavailable").build();
    SOFTWARE = builder.code(70).meaning("Internal software error").build();
    OS = builder.code(71).meaning("System error (e.g. can't fork)").build();
    OSFILE = builder.code(72).meaning("Critical OS file missing").build();
    CANTCREAT = builder.code(73).meaning("Can't create (user) output file").build();
    IO = builder.code(74).meaning("Input/output error").build();
    TEMPFAIL = builder.code(75).meaning("Temp failure; user is invited to retry").build();
    PROTOCOL = builder.code(76).meaning("Remote error in protocol").build();
    NOPERM = builder.code(77).meaning("Permission denied").build();
    CONFIG = builder.code(78).meaning("Configuration error").build();
  }

  /**
   * Protected constructor, use on of the static methods to obtain a {@link ExitStatusBuilder}
   * instance and obtain a ExitStatus from that.
   */
  protected PosixExitStatus() {
  }

  public PosixExitStatus(int code) {
    super(code);
  }

  public PosixExitStatus(int code, String meaning) {
    super(code, meaning);
  }

  public PosixExitStatus(int code, String meaning, String comment) {
    super(code, meaning, comment);
  }

  /**
   * Create a new ExitStatusBuilder for successful exit status, set meaning description using the
   * supplied value.
   *
   * @param meaning the meaning description of exit status
   * @return a new ExitStatusBuilder
   */
  public static ExitStatusBuilder ok(String meaning) {
    ExitStatusBuilder builder = fromStatus(OK).meaning(meaning);
    return builder;
  }

  /**
   * Create a new ExitStatusBuilder for erroneous exit status, set meaning description using the
   * supplied value.
   *
   * @param meaning the meaning description of exit status
   * @return a new ExitStatusBuilder
   */
  public static ExitStatusBuilder error(String meaning) {
    ExitStatusBuilder builder = fromStatus(ERROR).meaning(meaning);
    return builder;
  }

}

