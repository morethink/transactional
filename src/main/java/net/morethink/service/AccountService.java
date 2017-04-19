package net.morethink.service;

import net.morethink.dao.AccountDao;
import net.morethink.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountService {


    @Autowired
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void transfer(String out, String in, double money) {
        System.out.println("transfer");
        Account account = new Account();
        account.setName(out);
        account.setMoney(money);
        accountDao.out(account);
        if (1 == 1) {
            throw new RuntimeException();
        }
        account.setName(in);
        accountDao.in(account);

    }

}
