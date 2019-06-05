package com.wh.springboothello01.dao;

import com.wh.springboothello01.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: Magic Woo
 * Date: 2019/6/4
 * Time: 9:56
 * version 1.0
 */
public interface TeacherDao extends JpaRepository<Teacher,Integer> {

}
