<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19414
  Date: 2018/9/23
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>员工列表</title>
    <%
        pageContext.setAttribute("appPath",request.getContextPath());
    %>
    <%--
    web相对路径
    不以/开头的相对路径，以当前资源路径为基准，经常出问题
    /开头，以服务器路径为基准
    --%>
    <script src="/resources/js/jquery.min.js"></script>
    <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 员工Modal -->
<div class="modal fade" id="userAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">员工添加</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
        <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="userAddModalBtn">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="userTable">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>姓名</th>
                        <th>手机号</th>
                        <th>token串</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <%--显示分页信息--%>
    <div class="row">
        <%--分页文字信息--%>
        <div class="col-md-6" id="pageInfoArea">
        </div>
            <%--分页条信息--%>
        <div class="col-md-6" id="pageNavArea">

        </div>
    </div>
</div>
    <script>

        <%--页面加载完成以后，发送ajax请求要到json数据--%>
        $(function () {
            to_page(1);
        });
        function to_page(pn) {
            $.ajax({
                url:"/api/user/list",
                data:"pageNum="+pn,
                type:"post",
                success:function (data) {
                    // console.log(data);
                    /*
                    1.解析并显示员工数据
                    2.显示分页信息
                     */
                    buildUserTable(data);
                    buildPageInfo(data);
                    buildPageNav(data);
                }

            })
        }
        function buildUserTable(data) {
            $("#userTable tbody").empty();
            var e = data.extend.pageInfo.list;
            console.log(data.extend);
            $.each(e,function (index,item) {
                console.log(item.name);
                var userIdTd = $("<td></td>").append(item.id);
                var userNameTd = $("<td></td>").append(item.name);
                var userPhoneTd = $("<td></td>").append(item.phone);
                var tokenStrTd = $("<td></td>").append(item.token.tokenStr);
                /*
                <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑</button>
                 */
                var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm")
                    .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
                var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm")
                    .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
                var btnTd = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
                $("<tr></tr>").append(userIdTd)
                    .append(userNameTd)
                    .append(userPhoneTd)
                    .append(tokenStrTd)
                    .append(btnTd)
                    .appendTo("#userTable tbody");
            })
        }

        function buildPageInfo(data) {
            $("#pageInfoArea").empty();
            $("#pageInfoArea").append("当前"+ data.extend.pageInfo.pageNum+"页,总"
                + data.extend.pageInfo.pages+
                "页,总"+ data.extend.pageInfo.total+"记录");
        }

        function buildPageNav(data) {
            $("#pageNavArea").empty();
           // var firstPageLi = $("<li></li>").append('<a href="/user/list?pageNum=1">首页</a>');
            var ul = $("<ul></ul>").addClass("pagination");
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
            var prePageLi = $("<li></li>").append($("<a></a>").append($("<span></span>").append("&laquo;")));
            if (data.extend.pageInfo.hasPreviousPage == false) {
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            }
            ul.append(firstPageLi).append(prePageLi);
            var postPageLi = $("<li></li>").append($("<a></a>").append($("<span></span>").append("&raquo;")));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
            if (data.extend.pageInfo.hasNextPage == false) {
                postPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            }
            $.each(data.extend.pageInfo.navigatepageNums,function (index,item) {
                var numLi = $("<li></li>").append($("<a></a>").append(item).attr("href","#"));
                if (data.extend.pageInfo.pageNum == item) {
                    numLi.addClass("active");
                }
                numLi.click(function () {
                    to_page(item);
                })
                ul.append(numLi);
            });
            ul.append(postPageLi).append(lastPageLi);
            $("<nav></nav>").append(ul)
                .appendTo("#pageNavArea");
            firstPageLi.click(function () {
                to_page(1);
            })
            prePageLi.click(function () {
                to_page(data.extend.pageInfo.pageNum - 1);
            })
            postPageLi.click(function () {
                to_page(data.extend.pageInfo.pageNum + 1);
            })
            lastPageLi.click(function () {
                to_page(data.extend.pageInfo.pages);
            })
        }

        $("#userAddModalBtn").click(function(){
            $('#userAddModal').modal({
                backdrop:"static"
            });
        });
    </script>
</body>
</html>
