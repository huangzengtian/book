package com.shichimi.book.controller;

import com.shichimi.book.entity.TbBook;
import com.shichimi.book.service.TbBookService;
import com.shichimi.book.vo.ResultVO;
import com.shichimi.book.vo.TbBookVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 图书表(TbBook)表控制层
 *
 * @author makejava
 * @since 2021-05-27 20:15:13
 */
@CrossOrigin
@RestController
@RequestMapping("tbBook")
public class TbBookController {
    /**
     * 服务对象
     */
    @Resource
    private TbBookService tbBookService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @PostMapping("/selectOne")
    public ResultVO selectOne(@RequestBody Map<String, String> paramMap) {
        String id = paramMap.get("id");
        TbBook tbBook = this.tbBookService.queryById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("tbBook", tbBook);
        return ResultVO.success("查询成功", map);
    }

    @PostMapping("/selectAllByFuzzy")
    public ResultVO selectAll(@RequestBody TbBook tbBook) {
        List<TbBook> tbBookList = this.tbBookService.queryAllByFuzzy(tbBook);
        return ResultVO.success("查询成功", tbBookList);
    }

    @PostMapping("/selectByFuzzyAndPrice")
    public ResultVO selectByFuzzyAndPrice(@RequestBody TbBookVO tbBookVO) {
        List<TbBook> tbBookList = this.tbBookService.queryByFuzzyAndPrice(tbBookVO);
        return ResultVO.success("查询成功", tbBookList);
    }

}
