package com.adamtharani.nextdate;

import org.junit.Test;

import static org.junit.Assert.*;


public class NextDateTest {

    @Test
    public void testInvalidMonthDayYear1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(0, 0, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalidDayButValidMonthYear1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(0, 1, 2018);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalidDayButValidMonthYear2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(0, 2, 2000);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalidDayButValidMonthYear3() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(0, 6, 2212);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalidMonthDayYear2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(0, 13, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthYear1() {
        NextDate nextDate = new NextDate(1, 1, 2000);
        assertEquals("2/1/2000", nextDate.getNextDate());
    }

    @Test
    public void testValidDayMonthYear2() {
        NextDate nextDate = new NextDate(1, 2, 2212);
        assertEquals("2/2/2212", nextDate.getNextDate());
    }

    @Test
    public void testValidDayMonthButInvalidYear1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(1, 6, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayButInvalidMonthYear() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(1, 13, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayYearButInvalidMonth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(1, 0, 1812);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testVaildDayMonthButInvalidYear2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(15, 2, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testVaildDayMonthButInvalidYear3() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(15, 2, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayYearButInvalidMonth2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(15, 13, 1812);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayYearButInvalidMonth3() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(15, 0, 2000);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthYear3() {
        NextDate nextDate = new NextDate(15, 1, 2212);
        assertEquals("16/1/2212", nextDate.getNextDate());
    }

    @Test
    public void testValidDayMonthYear4() {
        NextDate nextDate = new NextDate(28, 6, 1812);
        assertEquals("29/6/1812", nextDate.getNextDate());
    }

    @Test
    public void testValidDayButInvalidMonthYear4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(28, 13, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthYear5() {
        NextDate nextDate = new NextDate(28, 1, 2000);
        assertEquals("29/1/2000", nextDate.getNextDate());
    }

    @Test
    public void testValidDayYearButInvalidMonth4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(28, 0, 2212);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthButInvalidYear4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(28, 1, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthButInvalidYear5() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(28, 2, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayYearButInvalidMonth5() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(30, 13, 1812);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayYearButInvalidMonth6() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(30, 0, 2000);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthYear6() {
        NextDate nextDate = new NextDate(30, 1, 2212);
        assertEquals("31/1/2212", nextDate.getNextDate());
    }

    @Test
    public void testValidDayButInvalidMonthYear5() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(30, 0, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidDayMonthYear() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(31, 6, 1812);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(30, 6, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(31, 0, 2212);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid3() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(31, 1, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(31, 2, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testValidMonthYearButInvalidDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(31, 6, 1812);
        });
    }

    @Test
    public void testInvalid5() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(31, 13, 2000);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid6() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 13, 2000);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid7() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 1, 1811);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid8() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 0, 1812);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid9() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 2, 1812);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid10() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 6, 2000);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid11() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 13, 2212);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testInvalid12() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NextDate nextDate = new NextDate(32, 0, 2213);
        });
        String expectedMessage = "Invalid";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


}