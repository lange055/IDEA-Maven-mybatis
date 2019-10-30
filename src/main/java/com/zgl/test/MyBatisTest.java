package com.zgl.test;

import com.zgl.mapper.UserMapper;
import com.zgl.model.User;
import com.zgl.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyBatisTest {
    @Test
    public void test_selectAllUser() throws Exception {

        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        //创建SqlSession对象
        SqlSession session = factory.openSession();

       /* User u = new User();
        u.setId(4);

       List<User> users = session.selectList("user.GetUserByID", u);
        for (User user : users) {
            System.out.println(user);
        }*/

        /*UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.testMap();
        for (User user : userList) {
            System.out.println(user);
        }*/

        /*动态sql语句查询
        User u = new User();
        u.setId(4);
        UserMapper mapper = session.getMapper(UserMapper.class);
        ArrayList<User> users = mapper.selectByAll(u);

        System.out.println(users);*/

        /*//修改
        User u = new User();
        u.setId(4);
        u.setUsername("zzy");
        u.setPassword("666");
        UserMapper mapper = session.getMapper(UserMapper.class);
        Integer integer = mapper.updateUser(u);

        System.out.println(integer);
        session.commit();*/

       /* //删除
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(6);

        Integer integer = mapper.deleteUser(list);
        System.out.println(integer);

        session.commit();*/

        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = new LinkedList<>();
        User u = new User();

        u.setUsername("zzy");
        u.setPassword("9999");
        list.add(u);
        Integer integer = mapper.addList(list);
        System.out.println(integer);
        session.commit();
        session.close();

    }
}
