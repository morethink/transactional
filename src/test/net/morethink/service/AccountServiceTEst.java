package net.morethink.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by think on 2017/1/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcher-servlet.xml"})
public class AccountServiceTest {


    @Autowired
    private AccountService accountService;


    @Test
    public void testTransfer() {
        accountService.transfer("aaa", "bbb", 100);

    }

    @Test
    public void testTransferProxy() {
        accountService.transferProxy("aaa", "bbb", 100);
    }
}
