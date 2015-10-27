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

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BasicExitStatusTest extends ExitStatusTest {


    @Override
    public ExitStatus newStatus() {
        return new BasicExitStatus();
    }

    @Override
    public ExitStatus newStatus(int code) {
        return new BasicExitStatus(code);
    }

    @Override
    public ExitStatus newStatus(int code, String meaning) {
        return new BasicExitStatus(code, meaning);
    }

    @Override
    public ExitStatus newStatus(int code, String meaning, String comment) {
        return new BasicExitStatus(code, meaning, comment);
    }

    @SuppressWarnings("Duplicates")
    @Test
    public void failureShouldCreateBuilderWithFailureStatusCodeAndSuppliedMeaning() throws Exception {
        String meaning = "mean 14";

        ExitStatusBuilder builder = BasicExitStatus.failure(meaning);

        assertThat(builder, instanceOf(ExitStatusBuilder.class));

        ExitStatus status = builder.build();
        assertEquals(BasicExitStatus.FAILURE.code(), status.code());
        assertEquals(meaning, status.meaning());
    }

    @SuppressWarnings("Duplicates")
    @Test
    public void successShouldCreateBuilderWithSuccessStatusCodeAndSuppliedMeaning() throws Exception {
        String meaning = "mean 14";

        ExitStatusBuilder builder = BasicExitStatus.success(meaning);

        assertThat(builder, instanceOf(ExitStatusBuilder.class));

        ExitStatus status = builder.build();
        assertEquals(BasicExitStatus.SUCCESS.code(), status.code());
        assertEquals(meaning, status.meaning());
    }


}
