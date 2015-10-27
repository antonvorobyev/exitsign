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

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public abstract class ExitStatusTest {

    public abstract ExitStatus newStatus();

    public abstract ExitStatus newStatus(int code);

    public abstract ExitStatus newStatus(int code, String meaning);

    public abstract ExitStatus newStatus(int code, String meaning, String comment);

    @Test
    public void constructShouldNotInitializeWhenNoParams() {
        ExitStatus status = newStatus();

        assertEquals(0, status.code());
        assertNull(status.meaning());
        assertNull(status.comment());
    }

    @Test
    public void constructShouldInitializeCodeWhenItIsPropogated () {
        int code = 14;

        ExitStatus status = newStatus(code);

        assertEquals(code, status.code());
        assertNull(status.meaning());
        assertNull(status.comment());
    }

    @Test
    public void constructShouldInitializeMeaningWhenItIsPropogated () {
        int code = 14;
        String meaning = "mean 14";

        ExitStatus status = newStatus(code, meaning);

        assertEquals(code, status.code());
        assertEquals(meaning, status.meaning());
        assertNull(status.comment());
    }

    @Test
    public void constructShouldInitializeCommentWhenItIsPropogated () {
        int code = 14;
        String meaning = "mean 14";
        String comment = "comment 14";

        ExitStatus status = newStatus(code, meaning, comment);

        assertEquals(code, status.code());
        assertEquals(meaning, status.meaning());
        assertEquals(comment, status.comment());
    }

    @Test
    public void codeShouldCreateBuilderWithSuppliedCodeFromStatus() throws Exception {
        int code = 14;
        ExitStatus status = newStatus(code);

        ExitStatusBuilder builder = ExitStatus.code(status);

        assertThat(builder, instanceOf(ExitStatusBuilder.class));
        assertEquals(code, builder.build().code());
    }

    @Test
    public void codeShouldCreateBuilderWithSuppliedCode() throws Exception {
        int code = 14;

        ExitStatusBuilder builder = ExitStatus.code(code);

        assertThat(builder, instanceOf(ExitStatusBuilder.class));
        assertEquals(code, builder.build().code());
    }

    @Test
    public void fromStatusShouldCreateBuilderWithSuppliedParams() throws Exception {
        int code = 14;
        String meaning = "mean 14";
        String comment = "comment 14";

        ExitStatus status = newStatus(code, meaning, comment);

        ExitStatusBuilder builder = ExitStatus.fromStatus(status);

        assertThat(builder, instanceOf(ExitStatusBuilder.class));
        assertEquals(code, builder.build().code());
    }

}