package com.example.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {


    /*注入dao接口,测试功能*/
    @Autowired
    private UserDao userDao;
    /*查询所有用户*/
    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }


    /*测试新增操作*/
    @Test
    void testSave(){
        //创建一个user对象
        User user=new User();
        //设置user的各个属性
        user.setUsername("yangstar");
        user.setPassword("m4a11234");
        user.setAddr("云南大学");
        user.setId(4);
        user.setGender("男");
        //执行insert
        userDao.insert(user);
    }


    /*删除操作*/
    @Test
    void testDelet(){
        userDao.deleteById(4);
    }

    /*更新操作*/
    @Test
    void testUpdata(){
        User user=new User();
        user.setId(1);
        user.setUsername("张三");

        userDao.updateById(user);
    }

    /*查找id是2的东西*/
    //User(id=2, username=李四, password=234, gender=女, addr=天津)
    @Test
    void testGet(){
        User user=new User();
        user=userDao.selectById(2);

        System.out.println(user);
    }

    /*分页功能*/
    @Test
    void testGetByPage(){
        IPage page=new Page(2,2);
        userDao.selectPage(page,null);
        System.out.println("当前页码是:"+page.getCurrent());
        System.out.println("每页显示数量:"+page.getSize());
        System.out.println("一共有:"+page.getPages()+"页");
        System.out.println("一共有:"+page.getTotal()+"条数据");
        System.out.println("数据是:"+page.getRecords());
    }

}
