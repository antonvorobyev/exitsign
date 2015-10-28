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
 * An implementation of {@link ExitStatusBuilder}.
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public final class ExitStatusBuilderImpl extends ExitStatusBuilder {

  /**
   * Holder for numeric code of exit status.
   */
  private int code;

  /**
   * Holder for meaning string of exit status.
   */
  private String meaning;

  /**
   * Holder for commentary string of exit status.
   */
  private String comment;

  /**
   * Protected constructor, for instantiating recommended to use {@link ExitStatusBuilderFactory}.
   *
   * <pre>
   * void do(...) {
   *      ...
   *      ExitStatusBuilder b = ExitStatusBuildFactory.createBuilder();
   *      ...
   * }
   * </pre>
   */
  protected ExitStatusBuilderImpl() {
  }

  private ExitStatusBuilderImpl(ExitStatusBuilderImpl that) {
    this.code = that.code;
    this.meaning = that.meaning;
    this.comment = that.comment;
  }

  @Override
  public ExitStatus build() {
    final ExitStatus s = new ExitStatusImpl(code, meaning, comment);
    reset();
    return s;
  }

  @Override
  public ExitStatusBuilderImpl clone() {
    return new ExitStatusBuilderImpl(this);
  }

  @Override
  public ExitStatusBuilderImpl code(int code) {
    this.code = code;
    return this;
  }

  @Override
  public ExitStatusBuilderImpl meaning(String meaning) {
    this.meaning = meaning;
    return this;
  }

  @Override
  public ExitStatusBuilderImpl comment(String comment) {
    this.comment = comment;
    return this;
  }

  private void reset() {
    code = 0;
    meaning = null;
    comment = null;
  }

}
