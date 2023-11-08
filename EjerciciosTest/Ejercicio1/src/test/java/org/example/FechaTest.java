package org.example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FechaTest {
    FechaPropia fecha1;


    @Test
    public void testSumarDias(){
        FechaPropia fecha = new FechaPropia("2019-01-01");
        fecha.sumarDias(1);
        assertEquals("2019-01-02", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.sumarDias(15);
        assertEquals("2019-01-16", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.sumarDias(40);
        assertEquals("2019-02-10", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.sumarDias(80);
        assertEquals("2019-03-22", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.sumarDias(180);
        assertEquals("2019-06-30", fecha.toString());

        fecha = new FechaPropia("2019-02-27");
        fecha.sumarDias(1);
        assertEquals("2019-02-28", fecha.toString());

        fecha = new FechaPropia("2019-02-28");
        fecha.sumarDias(1);
        assertEquals("2019-03-01", fecha.toString());

        fecha = new FechaPropia("2019-03-01");
        fecha.sumarDias(1);
        assertEquals("2019-03-02", fecha.toString());

        fecha = new FechaPropia("2019-03-01");
        fecha.sumarDias(15);
        assertEquals("2019-03-16", fecha.toString());

        fecha = new FechaPropia("2019-03-01");
        fecha.sumarDias(40);
        assertEquals("2019-04-10", fecha.toString());

        fecha = new FechaPropia("2019-03-01");
        fecha.sumarDias(80);
        assertEquals("2019-05-20", fecha.toString());

        fecha = new FechaPropia("2019-03-01");
        fecha.sumarDias(180);
        assertEquals("2019-08-28", fecha.toString());

        fecha = new FechaPropia("2020-01-01");
        fecha.sumarDias(1);
        assertEquals("2020-01-02", fecha.toString());

        fecha = new FechaPropia("2020-01-01");
        fecha.sumarDias(15);
        assertEquals("2020-01-16", fecha.toString());

        fecha = new FechaPropia("2020-01-01");
        fecha.sumarDias(40);
        assertEquals("2020-02-10", fecha.toString());

        fecha = new FechaPropia("2020-01-01");
        fecha.sumarDias(80);
        assertEquals("2020-03-21", fecha.toString());

        fecha = new FechaPropia("2020-01-01");
        fecha.sumarDias(180);
        assertEquals("2020-06-29", fecha.toString());

        fecha = new FechaPropia("2020-02-27");
        fecha.sumarDias(1);
        assertEquals("2020-02-28", fecha.toString());

        fecha = new FechaPropia("2020-02-28");
        fecha.sumarDias(1);
        assertEquals("2020-02-29", fecha.toString());

        fecha = new FechaPropia("2020-02-29");
        fecha.sumarDias(1);
        assertEquals("2020-03-01", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.sumarDias(1);
        assertEquals("2020-03-02", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.sumarDias(15);
        assertEquals("2020-03-16", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.sumarDias(40);
        assertEquals("2020-04-10", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.sumarDias(80);
        assertEquals("2020-05-20", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.sumarDias(180);
        assertEquals("2020-08-28", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.sumarDias(1);
        assertEquals("2020-12-16", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.sumarDias(15);
        assertEquals("2020-12-30", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.sumarDias(40);
        assertEquals("2021-01-24", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.sumarDias(80);
        assertEquals("2021-03-05", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.sumarDias(180);
        assertEquals("2021-06-13", fecha.toString());
    }

    @Test
    public void testRestarDias() {
        FechaPropia fecha = new FechaPropia("2019-01-01");
        fecha.restarDias(1);
        assertEquals("2018-12-31", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.restarDias(15);
        assertEquals("2018-12-17", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.restarDias(40);
        assertEquals("2018-11-22", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.restarDias(80);
        assertEquals("2018-10-13", fecha.toString());

        fecha = new FechaPropia("2019-01-01");
        fecha.restarDias(180);
        assertEquals("2018-07-05", fecha.toString());

        fecha = new FechaPropia("2019-02-27");
        fecha.restarDias(1);
        assertEquals("2019-02-26", fecha.toString());

        fecha = new FechaPropia("2019-02-28");
        fecha.restarDias(1);
        assertEquals("2019-02-27", fecha.toString());

        fecha = new FechaPropia("2020-02-29");
        fecha.restarDias(1);
        assertEquals("2020-02-28", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.restarDias(1);
        assertEquals("2020-02-29", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.restarDias(15);
        assertEquals("2020-02-15", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.restarDias(40);
        assertEquals("2020-01-21", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.restarDias(80);
        assertEquals("2019-12-12", fecha.toString());

        fecha = new FechaPropia("2020-03-01");
        fecha.restarDias(180);
        assertEquals("2019-09-03", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.restarDias(1);
        assertEquals("2020-12-14", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.restarDias(15);
        assertEquals("2020-11-30", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.restarDias(40);
        assertEquals("2020-11-05", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.restarDias(80);
        assertEquals("2020-09-26", fecha.toString());

        fecha = new FechaPropia("2020-12-15");
        fecha.restarDias(180);
        assertEquals("2020-06-18", fecha.toString());
    }

}

