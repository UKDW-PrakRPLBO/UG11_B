package com.ug11.channelsahamukdw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChannelTest {
    private Channel channel;

    @Before
    public void setup() {
        channel = new Channel();
    }

    @Test
    public void testLogin_ValidEmail_Success() {
        String validEmail = "john.doe@students.ukdw.ac.id";

        try {
            channel.login(validEmail);
            Assert.assertEquals("JOHN", channel.getNamaDepan());
            Assert.assertEquals("DOE", channel.getNamaBelakang());
            Assert.assertEquals(validEmail, channel.getEmail());
        } catch (EmailException e) {
            Assert.fail("Exception thrown: " + e.getErrorMessage());
        }
    }

    @Test
    public void testLogin_InvalidEmail_ExceptionThrown() throws EmailException {
        String invalidEmail = "john.doe@gmail.com";
        channel.login(invalidEmail);
    }

    @Test
    public void testLogin_InvalidUsername_ExceptionThrown() throws EmailException {
        String invalidEmail = "johndoe@students.ukdw.ac.id";
        channel.login(invalidEmail);
    }

    @Test
    public void testBagikanIde_NoTaggedStock() {
        String ide = "This is a sample idea without any tagged stocks";

        channel.bagikanIde(ide);

        Assert.assertEquals(0, channel.getTotalTag());
    }

    @Test
    public void testBagikanIde_SingleTaggedStock() {
        String ide = "This is a sample idea with #stock1 tagged";

        channel.bagikanIde(ide);

        Assert.assertEquals(1, channel.getTotalTag());
    }

    @Test
    public void testBagikanIde_MultipleTaggedStocks() {
        String ide = "This is a sample idea with #stock1 and #stock2 tagged";

        channel.bagikanIde(ide);

        Assert.assertEquals(2, channel.getTotalTag());
    }

}
