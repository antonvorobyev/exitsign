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
 * Factory class for internal usages. Creates new instances
 * of ExitStatusBuilder.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public final class ExitStatusBuilderFactory {

    /**
     * Private constructor, use this class as utility.
     */
    private ExitStatusBuilderFactory() {
        throw new AssertionError();
    }

    /**
     * Create new instance of {@link ExitStatusBuilder}.
     *
     * @return an instance of ExitStatusBuilder
     */
    protected static ExitStatusBuilder createBuilder() {
        return new ExitStatusBuilderImpl();
    }



}
