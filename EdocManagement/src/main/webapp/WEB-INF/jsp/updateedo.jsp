<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>修改电子文档</title>
</head>
<div align="center">
    <form action="${pageContext.request.contextPath}/edocentry/update" method="post">
        <table border="1px" cellspacing="0px" cellpadding="0px" width="500px">
            <tr>
                <td colspan="2" align="center" style="padding: 10px;font-size: 25px">修改电子文档</td>
            </tr>
            <tr>
                <td>文档编号</td>
                <td><input type="hidden" value="${edocEntry.id}" name="id" /></td>
            </tr>
            <tr>
                <td>文档名称<span style="color: red">(*)</span></td>
                <td><input type="text" name="title" value="${edocEntry.title}"/></td>
            </tr>
            <tr>
                <td>文档分类：</td>
                <td>
                    <select name="categoryId">
                        <c:forEach var="categoryList" items="${categoryList}">
                        <option value="${categoryList.id}">${categoryList.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>上传人</td>
                <td><input type="text" name="uploaduser" value="${edocEntry.uploaduser}"/></td>
            </tr>
            <tr>
                <td>上传时间<span style="color: red">(*)</span></td>
                <td><input type="text" name="createdate" value="${edocEntry.createdate}"/>(yyyy-MM-dd)</td>
            </tr>
            <tr align="center" align="center">
                <td>
                <input type="submit" value="提交"/>
                <input type="button" value="返回"  onclick="javascript:history.back(-1)" />
                </td>
            </tr>
        </table>
    </form>
</div>
</html>