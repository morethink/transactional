package net.morethink.service;

import net.morethink.dao.AccountDao;
import net.morethink.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
public class AccountService {

    public AccountService(){
        System.out.println("AccountService ");
    }
    @Autowired
    private AccountDao accountDao;

    /**
     * 完成转钱业务,transfer方法开启事务
     *
     * @param out
     * @param in
     * @param money
     */

    public void transfer(String out, String in, double money) {
        Account account = new Account();
        account.setName(out);
        account.setMoney(money);
        accountDao.out(account);
        int i = 1 / 0;
        account.setName(in);
        accountDao.in(account);
    }

    /**
     * 完成转钱业务,transferProxy方法没有开启事务
     *
     * @param out
     * @param in
     * @param money
     */
    public void transferProxy(String out, String in, double money) {
        System.out.println("调用transfer方法 开始");
        transfer(out, in, money);
        System.out.println("调用transfer方法 结束");
    }
}
