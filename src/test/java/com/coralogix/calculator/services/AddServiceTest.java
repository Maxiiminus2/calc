package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {

    @Test
    public void addIntegers() {
        // given
        AddService service = new AddService();

        // when
        Result result = service.add(1, 3);

        // then
        assertEquals(result.getResult(), 4);
    }

    @Test
    public void addIntegers2() {
        //given
        AddService service = new AddService();

        //when
        Result result = service.add(1, -4);

        //then
        assertEquals(result.getResult(), -2);
    }
}
