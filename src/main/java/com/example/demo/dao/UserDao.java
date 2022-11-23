package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;


/*核心:定义数据接口,继承BaseMapper<User>*/
@Mapper
public interface UserDao extends BaseMapper<User> {

}
