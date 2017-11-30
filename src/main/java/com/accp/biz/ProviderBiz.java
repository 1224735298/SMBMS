package com.accp.biz;

import com.accp.entity.Pager;
import com.accp.entity.Provider;

import java.util.List;

public interface ProviderBiz {


    /**
     * 查询所有供应商或者加上条件
     * @return
     */
    List<Provider> listByParam(Provider provider);

    /**
     * 更改Provider
     * @param provider
     * @return
     */
    Boolean modify(Provider provider);

    /**
     * 按ID查询Provider
     * @param id
     * @return
     */
    Provider getProviderById(Integer id);

    /**
     * 按ID删除
     * @param id
     * @return
     */
    Boolean del(Integer id);

    /**
     * 分页查询
     * @param pager
     * @return
     */
    Pager<Provider> listByPager(Pager<Provider> pager);

    /**
     * 新增
     * @param provider
     * @return
     */
    Boolean add(Provider provider);
 }
