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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PosixExitStatusTest extends ExitStatusTest {


  @Override
  public ExitStatus newStatus() {
    return new PosixExitStatus();
  }

  @Override
  public ExitStatus newStatus(int code) {
    return new PosixExitStatus(code);
  }

  @Override
  public ExitStatus newStatus(int code, String meaning) {
    return new PosixExitStatus(code, meaning);
  }

  @Override
  public ExitStatus newStatus(int code, String meaning, String comment) {
    return new PosixExitStatus(code, meaning, comment);
  }

  @Test
  public void errorShouldCreateBuilderWithErrorStatusCodeAndSuppliedMeaning() throws Exception {
    String meaning = "mean 14";

    ExitStatusBuilder builder = PosixExitStatus.error(meaning);

    assertThat(builder, instanceOf(ExitStatusBuilder.class));

    ExitStatus status = builder.build();
    assertEquals(PosixExitStatus.ERROR.code(), status.code());
    assertEquals(meaning, status.meaning());
  }

  @Test
  public void okShouldCreateBuilderWithOkStatusCodeAndSuppliedMeaning() throws Exception {
    String meaning = "mean 14";

    ExitStatusBuilder builder = PosixExitStatus.ok(meaning);

    assertThat(builder, instanceOf(ExitStatusBuilder.class));

    ExitStatus status = builder.build();
    assertEquals(PosixExitStatus.OK.code(), status.code());
    assertEquals(meaning, status.meaning());
  }

}
