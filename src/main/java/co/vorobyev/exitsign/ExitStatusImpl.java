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
 * A default implementation of {@link ExitStatus}.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public class ExitStatusImpl extends ExitStatus {

    /**
     * Constructs ExitStatus instance.
     *
     * @param code a numeric code of exit status
     * @param meaning a meaning description of exit status
     * @param comment a commentary string on exit status
     */
    public ExitStatusImpl(int code, String meaning, String comment) {
        super(code, meaning, comment);
    }

    public ExitStatusImpl(int code) {
        super(code);
    }

    public ExitStatusImpl(int code, String meaning) {
        super(code, meaning);
    }

    public ExitStatusImpl() {
        super();
    }
}
