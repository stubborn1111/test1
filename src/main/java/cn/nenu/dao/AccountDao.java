package cn.nenu.dao;


import cn.nenu.model.Account;

public interface AccountDao {
	//存钱
	 public float deposit(Account account, float amount);

	 //取钱
	public float withdraw(Account account,float amount);

}
