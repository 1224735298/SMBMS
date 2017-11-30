package com.accp.biz;

import com.accp.entity.Pager;
import com.accp.entity.User;

public interface UserBiz {

    User login(String userName, String userPwd);

    Pager<User> listByPager(Pager<User> pager);

    Boolean remove(Integer id);

    /**
     * 新增
     * @param user
     * @return
     */
    Boolean add(User user);

    /**
     * 根据Code查询用户
     * @param userCode
     * @return
     */
    User listByuserCode(String userCode);

    /**
     * 根据Id查询用户
     * @param id
     * @return
     */
    User listById(Integer id);

    /**
     * 修改用户
     * @param user
     * @return
     */
    Boolean modify(User user);
}
