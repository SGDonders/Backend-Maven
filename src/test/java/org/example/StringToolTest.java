package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolTest {
    @Test
    void shouldReverseString(){

        //arange
        String s = "Hallo NOVI!";

        //act
        String result = StringTool.reverse(s);

        //assert
        assertEquals("!IVON ollaH", result);
    }

}