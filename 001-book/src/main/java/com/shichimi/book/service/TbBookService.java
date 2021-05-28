package com.shichimi.book.service;

import com.shichimi.book.entity.TbBook;
import com.shichimi.book.vo.TbBookVO;

import java.util.List;

/**
 * 图书表(TbBook)表服务接口
 *
 * @author makejava
 * @since 2021-05-27 20:15:13
 */
public interface TbBookService {

    /**
     * 通过ID查询单条数据
     *
     * @param idBook 主键
     * @return 实例对象
     */
    TbBook queryById(String idBook);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbBook> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbBook 实例对象
     * @return 实例对象
     */
    TbBook insert(TbBook tbBook);

    /**
     * 修改数据
     *
     * @param tbBook 实例对象
     * @return 实例对象
     */
    TbBook update(TbBook tbBook);

    /**
     * 通过主键删除数据
     *
     * @param idBook 主键
     * @return 是否成功
     */
    boolean deleteById(String idBook);

    /**根据实例对象查询所有符合的对象的集合
     * @param tbBook 实例对象
     * @return 符合的对象的集合
     */
    List<TbBook> queryAll(TbBook tbBook);


    /**
     * 根据实例对象模糊搜索所有符合对象的集合
     * @param tbBook 实例对象
     * @return 符合模糊搜索的对象的集合
     */
    List<TbBook> queryAllByFuzzy(TbBook tbBook);

    /**
     * 根据实例对象和价格区间搜索
     * @param tbBookVO VO对象
     * @return 符合模糊搜索的对象的集合
     */
    List<TbBook> queryByFuzzyAndPrice(TbBookVO tbBookVO);
}
