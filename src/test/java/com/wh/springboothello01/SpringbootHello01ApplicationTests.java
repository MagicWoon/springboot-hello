package com.wh.springboothello01;

import com.wh.springboothello01.dao.TeacherDao;
import com.wh.springboothello01.entity.TUsers;
import com.wh.springboothello01.entity.Teacher;
import com.wh.springboothello01.mapper.TUsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
/**
* 测试类
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHello01ApplicationTests {
    @Autowired
    private TUsersMapper usersMapper;
    @Autowired
    private TeacherDao teacherDao;

    @Test
    public void contextLoads() {
        TUsers users = usersMapper.selectByPrimaryKey(2);
        System.out.println(users);
    }

    @Test
    public void jpaAddTest(){
        Teacher teacher = new Teacher(3,"ww","hhh",18);
        teacherDao.save(teacher);
    }

    @Test
    public void jpaGetTest(){
        Optional<Teacher> teacher = teacherDao.findById(2);
        System.out.println(teacher.get());
    }

    @Test
    public void dataCheckTest(){
        TUsers user = new TUsers();
        user.setUsername("");
        user.setPassword("1212");
        usersMapper.insert(user);
    }
}
