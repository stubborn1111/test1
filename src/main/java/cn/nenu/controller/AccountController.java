package cn.nenu.controller;

import cn.nenu.model.Account;
import cn.nenu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {
    @Autowired
    private AccountService as;

    public void deposit(Account account, float amount) {
        System.out.println("AccountController Deposit().....");
        as.depositAmount(account, amount);
    }

    public void withdraw(Account account, float amount) {
        System.out.println("AccountController withdraw().....");
        as.withdrawAmount(account, amount);
    }
}
