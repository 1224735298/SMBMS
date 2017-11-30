package com.accp.biz.impl;

import com.accp.biz.ProviderBiz;
import com.accp.dao.ProviderMapper;
import com.accp.entity.Pager;
import com.accp.entity.Provider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("providerBiz")
public class ProviderBizImpl implements ProviderBiz {
    @Resource(name = "providerMapper")
    private ProviderMapper providerMapper;
    /**
     * 查询所有供应商或者按参数查询
     * @return
     */
    public List<Provider> listByParam(Provider provider) {
       
        return providerMapper.listByParam(provider);
    }
    /**
     * 更改Provider
     * @param provider
     * @return
     */
    public Boolean modify(Provider provider) {

        return providerMapper.update(provider)>0;
    }

    /**
     * 按ID查询
     * @param id
     * @return
     */
    public Provider getProviderById(Integer id) {

        return providerMapper.getProviderById(id);
    }

    /**
     * 按ID删除
     * @param id
     * @return
     */
    public Boolean del(Integer id) {

        return providerMapper.delete(id)>0;
    }

    /**
     * 分页查询
     * @param pager
     * @return
     */
    public Pager<Provider> listByPager(Pager<Provider> pager) {

        pager.setTotalRows(providerMapper.totalRows(pager));
        pager.setQis((pager.getPageNo()-1)*pager.getPageSize());
        pager.setTotalPage((pager.getTotalRows()+pager.getPageSize()-1)/pager.getPageSize());
        pager.setDatas(providerMapper.listByPager(pager));
        return pager;
    }

    /**
     * 新增
     * @param provider
     * @return
     */
    public Boolean add(Provider provider){
        return providerMapper.insert(provider)>0;
    }
}
