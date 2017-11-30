package com.accp.biz.impl;

import com.accp.biz.RoleBiz;
import com.accp.dao.RoleMapper;
import com.accp.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("roleBiz")
public class RoleBizImpl implements RoleBiz {
    @Resource(name = "roleMapper")
    private RoleMapper roleMapper;
    public List<Role> listAll() {
        return roleMapper.listByName(null);
    }
}
