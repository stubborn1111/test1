package cn.nenu.service;

import cn.nenu.dao.AccountDaoImpl;
import cn.nenu.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountDaoImpl adi;

    public Account  depositAmount(Account account, float amount) {
        System.out.println("AccountService depositAmount().....");
        adi.deposit(account, amount);
        return account;
    }

    public Account  withdrawAmount(Account account, float amount) {
        System.out.println("AccountService withdrawAmount().....");
        adi.withdraw(account, amount);
        return account;
    }
}
