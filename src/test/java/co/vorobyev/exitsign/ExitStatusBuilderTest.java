package co.vorobyev.exitsign;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public abstract class ExitStatusBuilderTest {

  public static ExitStatus status7;
  public static ExitStatusBuilder builder;

  @BeforeClass
  public static void beforeClass() throws Exception {
    status7 = new ExitStatusImpl(7, "good fortune", "you are lucky");
  }

  public abstract ExitStatusBuilder newBuilder();

  @Before
  public void before() {
    builder = newBuilder();
  }

  @Test
  public void newInstanceShouldCreateBuilder() throws Exception {
    ExitStatusBuilder builder = newBuilder();

    assertNotNull(builder);
    assertThat(builder, instanceOf(ExitStatusBuilder.class));
  }

  @Test
  public void buildShouldCreateStatusWithDefaultValuesWhenNoSuppliedParams() throws Exception {
    ExitStatus status = builder.build();

    assertNotNull(status);

    assertEquals(0, status.code());
    assertNull(status.meaning());
    assertNull(status.comment());
  }

  @Test
  public void buildShouldCreateStatusWithSuppliedCode() throws Exception {
    int code = 14;

    ExitStatus status = builder.code(code).build();

    assertNotNull(status);

    assertEquals(code, status.code());
    assertNull(status.meaning());
    assertNull(status.comment());
  }

  @Test
  public void buildShouldCreateStatusWithSuppliedMeaning() throws Exception {
    String meaning = "mean";

    ExitStatus status = builder.meaning(meaning).build();

    assertNotNull(status);

    assertEquals(0, status.code());
    assertEquals(meaning, status.meaning());
    assertNull(status.comment());
  }

  @Test
  public void buildShouldCreateStatusWithSuppliedComment() throws Exception {
    String comment = "commentary";

    ExitStatus status = builder.comment(comment).build();

    assertNotNull(status);

    assertEquals(0, status.code());
    assertNull(status.meaning());
    assertEquals(comment, status.comment());
  }

  @Test
  public void buildShouldCreateStatusWithSuppliedCodeFromAnotherStatus() throws Exception {
    ExitStatus status = builder.code(status7).build();

    assertNotNull(status);

    assertEquals(status7.code(), status.code());
    assertNull(status.meaning());
    assertNull(status.comment());
  }

  @Test
  public void buildShouldCreateStatusWithSuppliedMeaningFromAnotherStatus() throws Exception {
    ExitStatus status = builder.meaning(status7).build();

    assertNotNull(status);

    assertEquals(0, status.code());
    assertEquals(status7.meaning(), status.meaning());
    assertNull(status.comment());
  }

  @Test
  public void cloneShould() throws Exception {
    ExitStatusBuilder cloned = builder.meaning(status7).clone();

    assertNotNull(cloned);

    assertThat(cloned, instanceOf(ExitStatusBuilder.class));

    assertNotSame(builder, cloned);

    ExitStatus status = cloned.build();

    assertEquals(0, status.code());
    assertEquals(status7.meaning(), status.meaning());
    assertNull(status.comment());
  }


}
