<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>新增电子文档</title>
</head>
<script src="${pageContext.request.contextPath}/statics/js/jquery-1.8.3.js"></script>
<script>
    $(function () {
        $("#myform").submit(function () {
            var title = $("#title").val();
            var summary = $("#summary").val();
            var uploaduser = $("#uploaduser").val();
            var createdate = $("#createdate").val();
            var time = /^[1-9][0-9]{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
            if(title=="" || title==null){
                alert("文档名称不能为空")
                return false;
            }
            if(summary=="" || summary==null){
                alert("文档摘要不能为空")
                return false;
            }
            if(uploaduser=="" || uploaduser==null){
                alert("上传人不能为空")
                return false;
            }
            if(createdate=="" || createdate==null){
                alert("上传时间不能为空")
            }
            if(!createdate.test(createdate)){
                alert("上传时间必须符合日期格式。如：2013-01-01");
                return false;
            }
        });
    })
</script>
<div align="center" id="myform">
    <form action="${pageContext.request.contextPath}/edocentry/add" method="post">
        <table border="1px" cellspacing="0px" cellpadding="0px" width="500px">
            <tr>
                <td colspan="2" align="center" style="padding: 10px;font-size: 25px">增加电子文档</td>
            </tr>
            <tr>
                <td>文档名称<span style="width:20px">(*)</span></td>
                <td><input type="text" name="title" id="title"/></td>
            </tr>
            <tr>
                <td>文档分类：</td>
                <td>
                    <select name="categoryId">
                        <option value="">全部</option>
                        <c:forEach var="cat" items="${categoryList}">
                            <option value="${cat.id}">${cat.name}</option>
                        </c:forEach>
                    </select>
                </td>
            <tr>
                <td>文档摘要:</td>
                <td>
                    <textarea name="summary" style="overflow-y: scroll;height: 50px;width: 300px" id="summary"></textarea>
                </td>
            </tr>
            <tr>
                <td>上传人</td>
                <td><input type="text" name="uploaduser" id="uploaduser"/></td>
            </tr>
            <tr>
            <td>上传时间(*)</td>
            <td><input type="text" name="createdate" id="createdate"/>(yyyy-MM-dd)</td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="提交"/>
                    <input type="button" value="返回" onclick="javascript:history.back(-1)"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</html>