package co.vorobyev.exitsign;

public class ExitStatusBuilderImplTest extends ExitStatusBuilderTest {

  @Override
  public ExitStatusBuilder newBuilder() {
    return new ExitStatusBuilderImpl();
  }
}
