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
 * A class used to build ExitStatus instances that contain metadata instead of or in addition to an
 * entity.
 *
 * <pre>
 * ExitStatus do(...) {
 *      String meaning = "Division by zero";
 *      return StandardExitStatus.failure(meaning).build();
 * }
 * </pre>
 */
public abstract class ExitStatusBuilder {

  /**
   * Protected constructor, use one of the static methods of <code>Response</code> to obtain an
   * instance.
   */
  protected ExitStatusBuilder() {
  }

  /**
   * Create a new builder instance.
   *
   * @return a new ExitStatusBuilder
   */
  protected static ExitStatusBuilder newInstance() {
    ExitStatusBuilder builder = ExitStatusBuilderFactory.createBuilder();
    return builder;
  }

  /**
   * Create a ExitStatus instance from the current ExitStatusBuilder.
   *
   * @return a ExitStatus instance.
   */
  public abstract ExitStatus build();

  /**
   * Create a copy of the ExitStatusBuilder preserving its state.
   *
   * @return a copy of the ExitStatusBuilder
   */
  @Override
  public abstract ExitStatusBuilder clone();

  /**
   * Set the status code on the ExitStatusBuilder.
   *
   * @param code the numeric code of exit status
   * @return the update ExitStatusBuilder.
   * @throws IllegalArgumentException if status is invalid.
   */
  public abstract ExitStatusBuilder code(int code);

  /**
   * Set the status on the ExitStatusBuilder.
   *
   * @param status the exit status
   * @return the updated ExitStatusBuilder
   * @throws IllegalArgumentException if status is null
   */
  public ExitStatusBuilder code(ExitStatus status) {
    if (status == null) {
      throw new IllegalArgumentException();
    }

    return code(status.code());
  }

  /**
   * Set the meaning description on the ExitStatusBuilder.
   *
   * @param meaning the exit status meaning description
   * @return the updated ExitStatusBuilder
   */
  public abstract ExitStatusBuilder meaning(String meaning);

  /**
   * Set the meaning description on the ExitStatusBuilder.
   *
   * @param status the exit status
   * @return the updated ExitStatusBuilder
   * @throws IllegalArgumentException if status is null
   */
  public ExitStatusBuilder meaning(ExitStatus status) {
    if (status == null) {
      throw new IllegalArgumentException();
    }

    return meaning(status.meaning());
  }

  /**
   * Set the commentary on the ExitStatusBuilder.
   *
   * @param comment the commentary on the exit status
   * @return the updated ExitStatusBuilder
   */
  public abstract ExitStatusBuilder comment(String comment);

}
