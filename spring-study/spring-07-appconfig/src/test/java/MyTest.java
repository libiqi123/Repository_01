import com.xiyou3g.config.BeansConfig;
import com.xiyou3g.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        User user = context.getBean("User", User.class);
        System.out.println(user.getName());
    }
}
