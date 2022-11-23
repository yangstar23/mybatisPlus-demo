package com.example.demo.entity;

import lombok.Data;
/*制作实体类与表结构(类名与表名对应,属性名与字段名对应)*/

/*@Data自动帮你写setter getter*/
@Data
public class User {
   private Integer id           ;
   private String username     ;
   private String password     ;
   private String gender       ;
   private String addr         ;

}
