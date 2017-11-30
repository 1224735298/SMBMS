package com.accp.biz;

import com.accp.entity.Bill;
import com.accp.entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillBiz  {
    /**
     * 查询所有订单
     * @return
     */
    List<Bill> listAll();

    /**
     * 按供应商ID或商品名称或是否支付查询
     * @return
     */
    List<Bill> listByParam(Bill bill);

    /**
     * 按ID查询
     * @param id
     * @return
     */
    Bill getById(@Param("id") Integer id);

    /**
     * 修改Bill
     * @param bill
     * @return
     */
    Boolean modify(Bill bill);

    /**
     *删除Bill按I
     * @param id
     * @return
     */
    Boolean del(Integer id);

    List<Bill> listByProviderId(Integer[] ids);

    /**
     * 分页查询
     * @param pager
     * @return
     */
    Pager<Bill> listByPager(Pager<Bill> pager);

    /**
     * 新增
     * @param bill
     * @return
     */
    Boolean add(Bill bill);
}
