﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <script language="JavaScript" src="js/jquery.js"></script>

    <script type="text/javascript">
        $(function () {
            //导航切换
            $(".menuson li").click(function () {
                $(".menuson li.active").removeClass("active")
                $(this).addClass("active");
            });

            $('.title').click(function () {
                var $ul = $(this).next('ul');
                $('dd').find('ul').slideUp();
                if ($ul.is(':visible')) {
                    $(this).next('ul').slideUp();
                } else {
                    $(this).next('ul').slideDown();
                }
            });
        })
    </script>


</head>

<body style="background:#f0f9fd;">
<div class="lefttop"><span></span>功能菜单</div>

<dl class="leftmenu">

    <dd>
        <div class="title">
            <span><img src="images/leftico01.png"/></span>就业喜报管理
        </div>
        <ul class="menuson">
            <li><cite></cite><a href="addjob.html" target="rightFrame">新增就业</a><i></i></li>
            <li><cite></cite><a href="#" target="rightFrame">喜报列表</a><i></i></li>
        </ul>
    </dd>
    <dd>
        <div class="title">
            <span><img src="images/leftico02.png"/></span>格智新闻管理
        </div>
        <ul class="menuson">
            <li><cite></cite><a href="#" target="rightFrame">新增新闻</a><i></i></li>
            <li><cite></cite><a href="#" target="rightFrame">新闻列表</a><i></i></li>
        </ul>
    </dd>
    <dd>
        <div class="title">
            <span><img src="images/leftico02.png"/></span>部门管理
        </div>
        <ul class="menuson">
            <li><cite></cite><a href="/Section/addSection" target="rightFrame">新增部门</a><i></i></li>
            <li><cite></cite><a href="/Section/selectSectionAll" target="rightFrame">部门列表</a><i></i></li>
        </ul>
    </dd>
    <dd>
        <div class="title">
            <span><img src="images/leftico02.png"/></span>员工管理
        </div>
        <ul class="menuson">
            <li><cite></cite><a href="addjob.html" target="rightFrame">新增员工</a><i></i></li>
            <li><cite></cite><a href="#" target="rightFrame">删除员工</a><i></i></li>
            <li><cite></cite><a href="#" target="rightFrame">修改员工</a><i></i></li>
            <li><cite></cite><a href="#" target="rightFrame">员工列表</a><i></i></li>
        </ul>
    </dd>
</dl>
</body>
</html>
