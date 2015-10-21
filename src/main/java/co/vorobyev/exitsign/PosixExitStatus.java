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
 * Enumeration class collecting exit statuses peculiar to
 * POSIX software.
 *
 * It is is mirror of constants from {@code sysexits.h}.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public enum PosixExitStatus implements ExitStatus {

    /** Successful termination. */
    OK(0, "Successful termination", ""),

    /**
     * Miscellaneous errors, such as "divide by zero" and
     * other impermissible operations
     * */
    ERROR(1, "General errors", ""),

    /**
     * The command was used incorrectly, e.g., with the wrong
     * number of arguments, a bad flag, a bad syntax in a
     * parameter, or whatever.
     * */
    USAGE(64, "Command line usage error", ""),

    /**
     * The input data was incorrect in some way. This should only
     * be used for user's data & not system files.
     */
    DATA(65, "Data format error", ""),

    /**
     * An input file (not a system file) did not exist or was
     * not readable. This could also include errors like
     * "No message" to a mailer (if it cared to catch it).
     */
    NOINPUT(66, "Cannot open input", ""),

    /**
     * The user specified did not exist.  This might be used
     * for mail addresses or remote logins.
     */
    NOUSER(67, "Addressee unknown", ""),

    /**
     * The host specified did not exist.  This is used in mail
     * addresses or network requests.
     */
    NOHOST(68, "Host name unknown", ""),

    /**
     * A service is unavailable. This can occur if a support
     * program or file does not exist. This can also be used as
     * a catchall message when something you wanted to do doesn't
     * work, but you don't know why.
     */
    UNAVAILABLE(69, "Service unavailable", ""),

    /**
     * An internal software error has been detected. This should
     * be limited to non-operating system related errors as possible.
     */
    SOFTWARE(70, "Internal software error", ""),

    /**
     * An operating system error has been detected. This isintended
     * to be used for such things as "cannot fork", "cannot create
     * pipe", or the like.  It includes things like getuid returning
     * a user that does not exist in the passwd file.
     */
    OS(71, "System error (e.g. can't fork)", ""),

    /**
     * Some system file (e.g., /etc/passwd, /etc/utmp, etc.) does
     * not exist, cannot be opened, or has some sort of error
     * (e.g., syntax error).
     */
    OSFILE(72, "Critical OS file missing", ""),

    /**
     * A (user specified) output file cannot be created.
     */
    CANTCREAT(73, "Can't create (user) output file", ""),

    /**
     * An error occurred while doing I/O on some file.
     */
    IO(74, "Input/output error", ""),

    /**
     * Temporary failure, indicating something that us not really an
     * error.  In sendmail, this means that a mailer (e.g.) could not
     * create a connection, and the request should be reattempted later.
     */
    TEMPFAIL(75, "Temp failure; user is invited to retry", ""),

    /**
     * The remote system returned something that was "not possible"
     * during a protocol exchange.
     */
    PROTOCOL(76, "Remote error in protocol", ""),

    /**
     * You did not have sufficient permission to perform the operation.
     * This is not intended for file system problems, which should use
     * NOINPUT or CANTCREAT, but rather for higher level permissions.
     */
    NOPERM(77, "Permission denied", ""),

    /**
     * Configuration errors.
     */
    CONFIG(78, "Configuration error", "");

    /** Numeric code of exit status. */
    private final int code;

    /** Meaning of exit status. */
    private final String meaning;

    /** Comment on exit status. */
    private final String comment;


    PosixExitStatus(int code, String meaning, String comment) {
        this.code = code;
        this.meaning = meaning;
        this.comment = comment;
    }

    /** {@inheritDoc} */
    public int code() { return code; }

    /** {@inheritDoc} */
    public String meaning() { return meaning; }

    /** {@inheritDoc} */
    public String comment() { return comment; }

}
