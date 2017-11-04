package b3ls;

import org.junit.Test;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class MyPojoTest {

    @Test
    public void shouldFullyTestPojo() {
        final Class<?> classUnderTest = MyPojo.class;
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
    }
}