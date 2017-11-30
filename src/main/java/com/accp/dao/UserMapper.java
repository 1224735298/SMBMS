package com.accp.dao;

import com.accp.entity.Pager;
import com.accp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> listAll();
    int removeByRoleId(@Param("roleId") Integer roleId);

    /**
     * 用户登陆
     * @param user
     * @return
     */
    User queryUser(User user);

    /**
     * 分页查询
     * @param pager
     * @return
     */
    List<User> listByPager(Pager<User> pager);

    Integer totalRows(Pager<User> pager);

    /**
     * 按ID删除用户
     * @param id
     * @return
     */
    Integer delete(Integer id);

    Integer insert(User user);

    User listByuserCode(@Param("userCode") String userCode);

    User listById(@Param("id") Integer id);

    Integer update(User user);


}
