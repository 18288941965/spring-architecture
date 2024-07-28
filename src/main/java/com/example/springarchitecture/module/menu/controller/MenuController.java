package com.example.springarchitecture.module.menu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    // 创建
    @PostMapping
    public void createMenu() {

    }

    // 删除
    @DeleteMapping
    public void deleteMenu() {

    }

    // 更新
    @PutMapping
    public void updateMenu() {

    }

    // 根据id查询
    @GetMapping
    public void getMenuById() {

    }

    // 全量查询
    @PostMapping("/search")
    public void searchMenus () {

    }

    // 分页查询
    @PostMapping("/search/paginated")
    public void searchMenusWithPagination () {

    }
}
