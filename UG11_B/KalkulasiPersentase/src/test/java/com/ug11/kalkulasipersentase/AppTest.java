package com.ug11.kalkulasipersentase;

import org.junit.Test;
import org.junit.Assert;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AppTest {
    @Test
    public void testApp_MainMethod_1() {
        String inputText = "Saham #BBRI naik sebanyak 4.25% disusul dengan saham #BBCA yang naik sebanyak 1.25%";
        String expectedOutput = "Rincian perhitungan: 4.25% + 1.25%"+System.lineSeparator()+"Total kenaikan (Dalam Persen): 5.5%"+System.lineSeparator();

        InputStream sysInBackup = System.in;
        PrintStream sysOutBackup = System.out;
        try {
            ByteArrayInputStream inContent = new ByteArrayInputStream(inputText.getBytes());
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();

            System.setIn(inContent);
            System.setOut(new PrintStream(outContent));

            App.main(new String[]{});

            Assert.assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setIn(sysInBackup);
            System.setOut(sysOutBackup);
        }
    }

    @Test
    public void testApp_MainMethod_2() {
        String inputText = "Non farm payroll kembali meningkat sebesar 253 ribu, naik dari bulan sebelumnya sebesar 165 ribu. Adapun unemployment rate juga masih solid di level 3.41% lebih rendah dari posisi Maret sebesar 3.50%";
        String expectedOutput = "Rincian perhitungan: 3.41% + 3.50%"+System.lineSeparator()+"Total kenaikan (Dalam Persen): 6.91%"+System.lineSeparator();

        InputStream sysInBackup = System.in;
        PrintStream sysOutBackup = System.out;
        try {
            ByteArrayInputStream inContent = new ByteArrayInputStream(inputText.getBytes());
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();

            System.setIn(inContent);
            System.setOut(new PrintStream(outContent));

            App.main(new String[]{});

            Assert.assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setIn(sysInBackup);
            System.setOut(sysOutBackup);
        }
    }
}

