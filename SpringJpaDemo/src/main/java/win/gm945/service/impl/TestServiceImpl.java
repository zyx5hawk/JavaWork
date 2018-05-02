package win.gm945.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import win.gm945.dao.UserDao;
import win.gm945.service.TestService;
import win.gm945.vo.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gm on 17-4-2.
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Value("gaoming")
    private String name;

    @Autowired
    private UserDao dao;

    public void print() {
        System.out.println("----hello world---" + name);
        List<User> users = (List<User>)dao.getListByage(23);
        for(User user:users){
            System.out.println(user);
        }
    }

	public void Save() {
		User model=new User();
		model.setName("ÕÔÓ­ÐÂ");
		model.setAge(34);
		
		dao.save(model);
		
	}
}
