package studio.geek.service;

import net.morethink.service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import studio.geek.action.BaseActionTest;

/**
 * @author 李文浩
 * @version 2017/4/8.
 */
public class AccountServiceTest extends BaseActionTest {


    @Autowired
    private AccountService accountService;

    @Test
    public void testSaveAssociation() {
        accountService.transfer("aaa","bbb", 10);
    }

//    @Test
//    public void testDeleteAssociation() {
//        associationService.deleteAssociation("文学社1");
//
//    }
//
//    @Test
//    public void testGetAssociation() {
//        associationService.getAssociation("文学社1");
//
//    }


}
