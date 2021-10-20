package mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nari.ProcurementBiddingApplication;
import org.nari.mapper.UserMapper;
import org.nari.model.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProcurementBiddingApplication.class)
public class UserTest {
    @Resource
    UserMapper userMapper;

    @Test
    public void testUpdate(){
        User user = new User();
        user.setUserId("qwer");
        user.setPassword("1253123");
        user.setMail("1324");
        user.setRole(1);
        userMapper.updateById(user);
    }
}
