
import cn.nenu.controller.AccountController;
import cn.nenu.dao.AccountDaoImpl;
import cn.nenu.model.Account;
import cn.nenu.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    //controller层测试
    //存钱相关测试，
    @Test
    public void run1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //基于注解的DI不指定 value 属性，bean的id是类名的首字母小写。
        AccountController accountController = ac.getBean("accountController", AccountController.class);
        Account account1 = ac.getBean("account1", Account.class);
        System.out.println("account1:" + account1);
        int money = 30;
        accountController.deposit(account1, money);
    }
    //取钱相关测试
    @Test
    public void run2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountController accountController = ac.getBean("accountController", AccountController.class);
        Account account2 = ac.getBean("account2", Account.class);
        System.out.println("account2:" + account2);
        int money = 20;
        accountController.withdraw(account2, money);
    }

    //dao层测试
    @Test
    public void run3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountDaoImpl accountDaoImpl = (AccountDaoImpl) ac.getBean("accountDaoImpl");
        Account account2 = ac.getBean("account2", Account.class);
        System.out.println("account2:" + account2);
        int money = 20;
        //取钱测试
        accountDaoImpl.withdraw(account2, money);
        System.out.println("account2:" + account2);
        //存钱测试
        accountDaoImpl.deposit(account2, money);
        System.out.println("account2:" + account2);
    }

    //service层测试
    @Test
    public void run4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        Account account2 = ac.getBean("account2", Account.class);
        System.out.println("account2:" + account2);
        int money = 20;
        accountService.depositAmount(account2, money);
        accountService.withdrawAmount(account2, money);
    }
}
