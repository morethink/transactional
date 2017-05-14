package net.morethink.dao;

import net.morethink.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by think on 2017/2/8.
 */

@Repository
public interface AccountDao {

    int out(Account account);

    int in(Account account);
}
