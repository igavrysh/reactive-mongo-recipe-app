package guru.springframework.converters;

import guru.springframework.commands.UnitOfMeasureCommand;
import guru.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitOfMeasureCommandToUnitOfMeasureTest {

    public static final String DESCRIPTION = "description";
    public static final String ID_VALUE = new String("1");

    UnitOfMeasureCommandToUnitOfMeasure converter;

    @Before
    public void setUp() throws Exception {
        converter = new UnitOfMeasureCommandToUnitOfMeasure();
    }

    @Test
    public void testNullParameter() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new UnitOfMeasureCommand()));
    }

    @Test
    public void convert() {
        // given
        UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(ID_VALUE);
        command.setDescription(DESCRIPTION);

        // when
        UnitOfMeasure uom = converter.convert(command);

        // then
        assertNotNull(uom);
        assertEquals(ID_VALUE, uom.getId());
        assertEquals(DESCRIPTION, uom.getDescription());
    }
}