package co.vorobyev.exitsign;

import org.junit.Test;

public class ExitStatusImplTest extends ExitStatusTest {

    @Override
    public ExitStatus newStatus() {
        return new ExitStatusImpl();
    }

    @Override
    public ExitStatus newStatus(int code) {
        return new ExitStatusImpl(code);
    }

    @Override
    public ExitStatus newStatus(int code, String meaning) {
        return new ExitStatusImpl(code, meaning);
    }

    @Override
    public ExitStatus newStatus(int code, String meaning, String comment) {
        return new ExitStatusImpl(code, meaning, comment);
    }

}
