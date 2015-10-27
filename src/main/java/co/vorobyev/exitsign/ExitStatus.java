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
 * Basic class for different utility exit classes.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public abstract class ExitStatus {

    /** Numeric code of exit status. */
    private int code;

    /** Meaning of exit status. */
    private String meaning;

    /** Comment on exit status. */
    private String comment;

    /**
     * Protected constructor, use on of the static methods to obtain a
     * {@link ExitStatusBuilder} instance and obtain a ExitStatus from that.
     */
    protected ExitStatus(){}

    /**
     * Protected constructor, use on of the static methods to obtain a
     * {@link ExitStatusBuilder} instance and obtain a ExitStatus from that.
     *
     * @param code a numeric code of the exit status
     */
    protected ExitStatus(int code) {
        this(code, null);
    }

    /**
     * Protected constructor, use on of the static methods to obtain a
     * {@link ExitStatusBuilder} instance and obtain a ExitStatus from that.
     *
     * @param code a numeric code of the exit status
     * @param meaning a meaning description of the exit status
     */
    protected ExitStatus(int code, String meaning) {
        this(code, meaning, null);
    }

    /**
     * Protected constructor, use on of the static methods to obtain a
     * {@link ExitStatusBuilder} instance and obtain a ExitStatus from that.
     *
     * @param code a numeric code of the exit status
     * @param meaning a meaning description of the exit status
     * @param comment a commentary on the exit status
     */
    protected ExitStatus(int code, String meaning, String comment) {
        this.code = code;
        this.meaning = meaning;
        this.comment = comment;
    }

    /**
     * Get the status code associated with the exit status.
     *
     * @return the numeric code of the exit status
     */
    public int code() {
        return code;
    }

    /**
     * Get the meaning description associated with the exit status.
     *
     * @return the meaning description of the exit status
     */
    public String meaning() {
        return meaning;
    }

    /**
     * Get the commentary associated with the exit status.
     *
     * @return the commentary on the exit status
     */
    public String comment() {
        return comment;
    }

    /**
     * Create a new ExitStatusBuilder by performing a shallow copy of an
     * existing ExitStatus.
     *
     * @param status a ExitStatus from which the status code, meaning
     *               description and commentary will be copied
     * @return a new ExitStatusBuilder
     */
    public static ExitStatusBuilder fromStatus(ExitStatus status) {
        ExitStatusBuilder b = code(status.code());
        b.meaning(status.meaning());
        b.comment(status.comment());

        return b;
    }

    /**
     * Create a new ExitStatusBuilder with supplied status.
     *
     * @param status the exit status
     * @return a new ExitStatusBuilder
     * @throws IllegalArgumentException if status is null
     */
    public static ExitStatusBuilder code(ExitStatus status) {
        ExitStatusBuilder b = ExitStatusBuilder.newInstance();
        b.code(status);

        return b;
    }

    /**
     * Create a new ExitStatusBuilder with the supplied code.
     *
     * @param code the numeric code of exit status
     * @return a new ExitStatusBuilder
     */
    public static ExitStatusBuilder code(int code) {
        ExitStatusBuilder b = ExitStatusBuilder.newInstance();
        b.code(code);

        return b;
    }

}
