package com.shichimi.book.dao;

import com.shichimi.book.entity.TbBook;
import com.shichimi.book.vo.TbBookVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图书表(TbBook)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-27 20:15:12
 */
public interface TbBookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param idBook 主键
     * @return 实例对象
     */
    TbBook queryById(String idBook);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbBook> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbBook 实例对象
     * @return 对象列表
     */
    List<TbBook> queryAll(TbBook tbBook);

    /**
     * 新增数据
     *
     * @param tbBook 实例对象
     * @return 影响行数
     */
    int insert(TbBook tbBook);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbBook> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbBook> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbBook> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbBook> entities);

    /**
     * 修改数据
     *
     * @param tbBook 实例对象
     * @return 影响行数
     */
    int update(TbBook tbBook);

    /**
     * 通过主键删除数据
     *
     * @param idBook 主键
     * @return 影响行数
     */
    int deleteById(String idBook);

    /**
     * 模糊搜索
     * @param tbBook 实例对象
     * @return 实例对象的集合
     */
    List<TbBook> queryAllByFuzzy(TbBook tbBook);

    /**
     * 包含价格区间的模糊搜索
     * @param tbBookVO VO对象
     * @return 实例对象的集合
     */
    List<TbBook> queryByFuzzyAndPrice(TbBookVO tbBookVO);
}

