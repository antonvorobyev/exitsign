package co.vorobyev.exitsign;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ExitStatusBuilderFactoryTest {

  @Test
  public void createBuilderShouldCreateBuilder() throws Exception {
    ExitStatusBuilder builder = ExitStatusBuilderFactory.createBuilder();

    assertNotNull(builder);
    assertThat(builder, instanceOf(ExitStatusBuilder.class));
  }

  @Test
  public void createBuilderShouldCreateNewBuilderAfterRepeating() throws Exception {
    ExitStatusBuilder builder0 = ExitStatusBuilderFactory.createBuilder();
    ExitStatusBuilder builder1 = ExitStatusBuilderFactory.createBuilder();

    assertNotSame(builder0, builder1);
  }


}
