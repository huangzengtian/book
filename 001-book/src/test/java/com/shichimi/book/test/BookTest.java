package com.shichimi.book.test;

import com.shichimi.book.entity.TbBook;
import com.shichimi.book.service.TbBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Huang Zengtian on 2021/5/27 18:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BookTest {
    @Autowired
    private TbBookService tbBookService;

    @Test
    public void test01() {
        List<TbBook> tbBookList = tbBookService.queryAll(new TbBook());
        System.out.println(tbBookList);
    }

    @Test
    public void test02() {
        TbBook tbBook = new TbBook();
        tbBook.setAuthor("罗");
        List<TbBook> tbBookList = tbBookService.queryAllByFuzzy(tbBook);
        System.out.println(tbBookList);
    }
}
