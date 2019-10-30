package com.zgl.mapper;

import com.zgl.model.User;
import java.util.List;

public interface UserMapper {


    public List<User> selectByAll(User u);

    public Integer updateUser(User u);

    public Integer deleteUser(List<Integer> list);

    public Integer addList(List<User> u);
}
