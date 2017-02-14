import com.greatcqi.testframework.model.basicInfo.UserInfoModel;
import com.greatcqi.testframework.service.basicInfo.UserInfoService;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by XieChen on 2017/2/12.
 */
public class UserServiceTest {
    private UserInfoService service = null;
    private String loginName = null, loginPassword = null;

    @Before
    public void validation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        service = context.getBean(UserInfoService.class);
        assertNotNull(service);

        loginName = RandomStringUtils.randomAlphanumeric(10);
        loginPassword = RandomStringUtils.randomAlphanumeric(10);
    }

    @Test
    public void testRegisterUser() {
        UserInfoModel model = new UserInfoModel();
        model.setLoginName(loginName);
        model.setLoginPassword(loginPassword);

        service.registerUser(model);
        model = service.getByLoginName(loginName);
        assertNotNull(model);
        assertEquals(loginPassword, model.getLoginPassword());

        service.delete(model.getId());
        model = service.getByLoginName(loginName);
        assertNull(model);
    }
}
