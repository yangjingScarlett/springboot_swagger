package com.yang.spring.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangjing
 * @explain
 * 1.@Api：修饰整个类，描述Controller的作用
 * 2.@ApiOperation：描述一个类的一个方法，或者说一个接口
 * 3.@ApiParam：单个参数描述
 * 4.@ApiModel：用对象来接收参数
 * 5.@ApiProperty：用对象接收参数时，描述对象的一个字段
 */
@RestController
@RequestMapping("/user")
public class SwaggerController {

    @ApiOperation(value = "获得大写的helloworld", notes = "简单的springmvc请求")
    @RequestMapping("/")
    public String home() {
        return "HELLO, WORLD!";
    }

    @ApiOperation(value = "获得A+B", notes = "根据url的classNo和url的studentName获得请求参数的字符串相加，RestFul风格的请求")
    @ApiImplicitParams({@ApiImplicitParam(name = "classNo", value = "班级编号", required = true, dataType = "String")})
    @RequestMapping(value = "/class/{classNo}/to/{studentName}", method = RequestMethod.GET)
    public String world(@PathVariable("classNo") String classNo, @PathVariable("studentName") String studentName) {
        return classNo + " " + studentName;
    }
}
