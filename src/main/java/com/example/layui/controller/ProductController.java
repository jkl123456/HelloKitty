package com.example.layui.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.layui.entity.Product;
import com.example.layui.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductMapper productMapper;

    @RequestMapping("/list")
    @ResponseBody
    public String list(){

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("id", 737);
        List list = productMapper.selectList(queryWrapper);
        String s = JSON.toJSONString(list);

        return s;
    }
}
