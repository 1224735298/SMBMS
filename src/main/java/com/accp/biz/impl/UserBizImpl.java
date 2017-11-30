package com.accp.biz.impl;

import com.accp.biz.UserBiz;
import com.accp.dao.UserMapper;
import com.accp.entity.Pager;
import com.accp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userBiz")
public class UserBizImpl implements UserBiz  {

    @Resource(name = "userMapper")
    private UserMapper userMapper;
    public User login(String userName, String userPwd) {
        return userMapper.queryUser(new User(userName, userPwd));
    }
    /**
     * 分页查询
     * @param pager
     * @return
     */
    public Pager<User> listByPager(Pager<User> pager) {
        pager.setTotalRows( userMapper.totalRows(pager));
        pager.setTotalPage((pager.getTotalRows()+pager.getPageSize()-1)/pager.getPageSize());
        pager.setQis((pager.getPageNo()-1)*pager.getPageSize());
        pager.setDatas(userMapper.listByPager(pager));
        return pager;
    }

    /**
     * 按ID删除
     * @param id
     * @return
     */
    public Boolean remove(Integer id) {
        return userMapper.delete(id)>0;
    }

    /**
     * 新增
     * @param user
     * @return
     */
    public Boolean add(User user){
        return userMapper.insert(user)>0;
    }

    /**
     * 根据Code查询用户
     * @param userCode
     * @return
     */
    public User listByuserCode(String userCode){
        return userMapper.listByuserCode(userCode);
    }

    /**
     * 根据Id查询用户
     * @param id
     * @return
     */
    public User listById(Integer id){
        return userMapper.listById(id);
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    public Boolean modify(User user){
        return userMapper.update(user)>0;
    }
}
