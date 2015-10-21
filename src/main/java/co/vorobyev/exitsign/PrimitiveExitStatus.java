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
 * Enumeration class collecting primitive exit statuses.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public enum PrimitiveExitStatus implements ExitStatus {

    /** Successful termination. */
    SUCCESS(0, "Successful termination", ""),

    /** Unsuccessful termination. */
    FAILURE(1, "Failed execution", "");

    /** Numeric code of exit status. */
    private final int code;

    /** Meaning of exit status. */
    private final String meaning;

    /** Comment on exit status. */
    private final String comment;

    PrimitiveExitStatus(int code, String meaning, String comment) {
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
