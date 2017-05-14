package net.morethink.action;

import net.morethink.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李文浩
 * @version 2017/5/14.
 */
@RestController
public class AccountAction {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/transfer")
    public String transfer(String out, String in, double money) {
        accountService.transfer(out, in, money);

        return "transfer";
    }

    @RequestMapping("/transferProxy")
    public String transferProxy(String out, String in, double money) {
        accountService.transferProxy(out, in, money);
        return "transfer";
    }
}
