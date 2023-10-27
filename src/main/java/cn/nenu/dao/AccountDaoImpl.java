package cn.nenu.dao;

import cn.nenu.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao{

	@Override
	public float deposit(Account account, float amount) {
		 account.setBalance(account.getBalance()+amount);
		 System.out.println("AccountDaoImpl.deposit().....");
		return account.getBalance();
	}

	@Override
	public float withdraw(Account account, float amount) {
		account.setBalance(account.getBalance()-amount);
		System.out.println("AccountDaoImpl.deposit().....");
		return account.getBalance();
	}

}
