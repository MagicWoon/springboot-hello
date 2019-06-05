package com.wh.springboothello01.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * User: Magic Woo
 * Date: 2019/6/4
 * Time: 9:53
 * version 1.0
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="t_teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(message ="id不能为空")
    private Integer id;
    @NotNull(message ="姓名不能为空")
    private String name;
    @NotNull(message ="密码不能为空")
    private String password;
    @Min(18)
    private Integer age;
}
