package win.gm945.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import win.gm945.vo.User;
import java.util.List;


public interface UserDao extends JpaRepository<User, Integer> {
    List<User> getListByage(Integer age);
    @Query(value = "select * from user_t a where time>now()", nativeQuery = true)  
    List<User> getListByTime();   
  
    @Query(value="select * from user_t where age>1?",nativeQuery = true)  
    List<User> getListByAge(Integer age);  
}