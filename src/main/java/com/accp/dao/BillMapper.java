package com.accp.dao;

import com.accp.entity.Bill;
import com.accp.entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface BillMapper {
    int update(Bill bill);
    int delete(Integer id);

    /**
     * 按供应商ID或商品名称或是否支付查询
     * @param bill
     * @return
     */
    List<Bill> listByParam(Bill bill);
    /**
     * 查询所有订单
     * @return
     */
    List<Bill> selectAll();

    Bill selectById(@Param("id") Integer id);

    List<Bill> selectByProviderId(Integer[] ids);

    List<Bill> selectByProviderIdAndCode(Map map);

    List<Bill> listByPager(Pager<Bill> pager);

    Integer totalRows(Pager<Bill> pager);

    Integer insert(Bill bill);

}
