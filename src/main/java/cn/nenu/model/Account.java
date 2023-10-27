package cn.nenu.model;


import java.util.Date;

public class Account {
    //账户id
    private Integer accountId;
    //姓名
    private String name;
    //余额
    private float balance;
    //开户日期
    private Date date;

    public Account() {
    }

    public Account(Integer accountId, String name, float balance, Date date) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
        this.date = date;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
