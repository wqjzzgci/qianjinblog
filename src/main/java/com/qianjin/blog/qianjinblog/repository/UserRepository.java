package com.qianjin.blog.qianjinblog.repository;

import com.qianjin.blog.qianjinblog.domain.User;
import org.springframework.data.repository.CrudRepository;


public interface  UserRepository extends CrudRepository<User,Long> {

}
