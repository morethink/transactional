package net.morethink.dao;

import net.morethink.entity.Account;

/**
 * Created by think on 2017/2/8.
 */
public interface AccountDao {

    int out(Account account);

    int in(Account account);
}
