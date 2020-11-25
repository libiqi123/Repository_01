import com.xiyou3g.pojo.User;
import com.xiyou3g.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user2 =(User) Context.getBean("user2");
        user2.show();
        User user3=(User) Context.getBean("User3");
        user3.show();
    }
}
