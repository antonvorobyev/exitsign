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
 * Enumeration class collecting basic exit statuses.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public class BasicExitStatus extends ExitStatus {

  /**
   * Successful termination.
   */
  public static final ExitStatus SUCCESS;

  /**
   * Unsuccessful termination.
   */
  public static final ExitStatus FAILURE;

  static {
    ExitStatusBuilder builder = ExitStatusBuilderFactory.createBuilder();

    SUCCESS = builder.code(0).meaning("Successful termination").build();
    FAILURE = builder.code(1).meaning("Unsuccessful termination").build();
  }

  /**
   * Protected constructor, use on of the static methods to obtain a {@link ExitStatusBuilder}
   * instance and obtain a ExitStatus from that.
   */
  protected BasicExitStatus() {
    super();
  }

  /**
   * Protected constructor, use on of the static methods to obtain a {@link ExitStatusBuilder}
   * instance and obtain a ExitStatus from that.
   *
   * @param code a numeric code of the exit status
   */
  protected BasicExitStatus(int code) {
    super(code);
  }

  /**
   * Protected constructor, use on of the static methods to obtain a {@link ExitStatusBuilder}
   * instance and obtain a ExitStatus from that.
   *
   * @param code    a numeric code of the exit status
   * @param meaning a meaning description of the exit status
   */
  protected BasicExitStatus(int code, String meaning) {
    super(code, meaning);
  }

  /**
   * Protected constructor, use on of the static methods to obtain a {@link ExitStatusBuilder}
   * instance and obtain a ExitStatus from that.
   *
   * @param code    a numeric code of the exit status
   * @param meaning a meaning description of the exit status
   * @param comment a commentary on the exit status
   */
  protected BasicExitStatus(int code, String meaning, String comment) {
    super(code, meaning, comment);
  }

  /**
   * Create a new ExitStatusBuilder for successful exit status, set meaning description using the
   * supplied value.
   *
   * @param meaning the meaning description of exit status
   * @return a new ExitStatusBuilder
   */
  public static ExitStatusBuilder success(String meaning) {
    ExitStatusBuilder builder = fromStatus(SUCCESS).meaning(meaning);
    return builder;
  }


  /**
   * Create a new ExitStatusBuilder for unsuccessful exit status, set meaning description using the
   * supplied value.
   *
   * @param meaning the meaning description of exit status
   * @return a new ExitStatusBuilder
   */
  public static ExitStatusBuilder failure(String meaning) {
    ExitStatusBuilder builder = fromStatus(FAILURE).meaning(meaning);
    return builder;
  }

}
