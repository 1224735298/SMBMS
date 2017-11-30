package com.accp.biz.impl;

import com.accp.biz.BillBiz;
import com.accp.dao.BillMapper;
import com.accp.entity.Bill;
import com.accp.entity.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("billBiz")
public class BillBizImpl implements BillBiz {

    @Resource(name = "billMapper")
    private BillMapper billMapper;

    /**
     * 查询所有订单
     * @return
     */
    public List<Bill> listAll() {
        
        return billMapper.selectAll();
    }

    /**
     * 按供应商ID或商品名称或是否支付查询
     * @return
     */
    public List<Bill> listByParam(Bill bill) {
        
        return billMapper.listByParam(bill);
    }

    /**
     * 按供应商ID查询
     * @param id
     * @return
     */
    public Bill getById(Integer id) {
        
        return billMapper.selectById(id);
    }
    /**
     * 修改Bill
     * @param bill
     * @return
     */
    public Boolean modify(Bill bill) {
        
        return billMapper.update(bill)>0;
    }

    /**
     * 删除按Id
     * @param id
     * @return
     */
    public Boolean del(Integer id) {
        
        return billMapper.delete(id)>0;
    }

    public List<Bill> listByProviderId(Integer[] ids) {
        
        return billMapper.selectByProviderId(ids);
    }

    public Pager<Bill> listByPager(Pager<Bill> pager) {
        
        pager.setTotalRows(billMapper.totalRows(pager));
        pager.setQis((pager.getPageNo()-1)*5);
        pager.setTotalPage((pager.getTotalRows()+pager.getPageSize()-1)/pager.getPageSize());
        pager.setDatas(billMapper.listByPager(pager));
        return pager;
    }

    /**
     * 新增
     * @param bill
     * @return
     */
    public Boolean add(Bill bill){
        
        return billMapper.insert(bill)>0;
    }
}
