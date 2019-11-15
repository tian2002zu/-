<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>新增电子文档</title>
</head>
<script>
    $(function () {

    })
</script>
<div align="center">
    <form method="post">
        <table border="1px" cellspacing="0px" cellpadding="0px" width="500px">
            <tr>
                <td colspan="2" align="center" style="padding: 10px;font-size: 25px">增加电子文档</td>
            </tr>
            <tr>
                <td>文档名称<span style="width:20px">(*)</span></td>
                <td><input type="text" name="title"/></td>
            </tr>
            <tr>
                <td>文档分类:</td>
                <td>
                    <textarea name="sumary" style="overflow-y: scroll;height: 50px;width: 300px"></textarea>
                </td>
            </tr>
            <tr>
                <td>上传人</td>
                <td><input type="text" name="summary"/></td>
            </tr>
            <tr>
            <td>上传时间(*)</td>
            <td><input type="text" name="time"/>(yyyy-MM-dd)</td>
            </tr>
            <tr align="center">
                <td><input type="submit" name="tijiao" value="提交"/><input type="button" name="fanhui" value="返回"/></td>
            </tr>
        </table>
    </form>
</div>
</html>