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
 * Constant class collecting exit status codes.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public final class ExitStatus {

    /**
     * Don't create instance of this class, it is constant class.
     */
    private ExitStatus() {
        throw new AssertionError();
    }

    /**
     * Exit code returned when execution finishes successfully
     */
    public static final int SUCCESS = 0;

    /**
     * Exit code returned when execution finishes failingly
     */
    public static final int FAILURE = 1;

}
