import com.xiyou3g.pojo.Fuck;
import com.xiyou3g.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Sprig的上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //对象都在Spring中管理，使用时应从Spring中直接取出即可
        Hello hello = (Hello) context.getBean("Hello");
        System.out.println(hello.toString());

        Fuck fuck=(Fuck) context.getBean("Fuck");

        System.out.println(fuck);
    }
}
