package com.shichimi.book.service.impl;

import com.shichimi.book.entity.TbBook;
import com.shichimi.book.dao.TbBookDao;
import com.shichimi.book.service.TbBookService;
import com.shichimi.book.vo.TbBookVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图书表(TbBook)表服务实现类
 *
 * @author makejava
 * @since 2021-05-27 20:15:13
 */
@Service("tbBookService")
public class TbBookServiceImpl implements TbBookService {
    @Resource
    private TbBookDao tbBookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param idBook 主键
     * @return 实例对象
     */
    @Override
    public TbBook queryById(String idBook) {
        return this.tbBookDao.queryById(idBook);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbBook> queryAllByLimit(int offset, int limit) {
        return this.tbBookDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbBook 实例对象
     * @return 实例对象
     */
    @Override
    public TbBook insert(TbBook tbBook) {
        this.tbBookDao.insert(tbBook);
        return tbBook;
    }

    /**
     * 修改数据
     *
     * @param tbBook 实例对象
     * @return 实例对象
     */
    @Override
    public TbBook update(TbBook tbBook) {
        this.tbBookDao.update(tbBook);
        return this.queryById(tbBook.getIdBook());
    }

    /**
     * 通过主键删除数据
     *
     * @param idBook 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String idBook) {
        return this.tbBookDao.deleteById(idBook) > 0;
    }

    @Override
    public List<TbBook> queryAll(TbBook tbBook) {
        return tbBookDao.queryAll(tbBook);
    }

    @Override
    public List<TbBook> queryAllByFuzzy(TbBook tbBook) {
        return tbBookDao.queryAllByFuzzy(tbBook);
    }

    @Override
    public List<TbBook> queryByFuzzyAndPrice(TbBookVO tbBookVO) {
        return tbBookDao.queryByFuzzyAndPrice(tbBookVO);
    }
}
