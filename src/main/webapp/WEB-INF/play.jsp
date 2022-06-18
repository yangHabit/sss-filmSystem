<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>排片详情</title>
</head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>

<style type="text/css">
    body {
        background: #2E323B;
    }

    .detailed {
        background: white;
        border-radius: 20px;
        padding-bottom: 50px;
        margin-top: 20px;
    }

</style>
<body>


<div class="container">
    <div class="container detailed">

        <h2> 排片情况如下</h2>
        <br>
        <table class="table table-hover">
            <thead>
            <tr>
                <th>放映时间</th>
                <th>语言版本</th>
                <th>放映厅</th>
                <th>票价</th>
                <th>选座购票</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${playVOS}" var="playVo">
                <tr>
                    <td> ${playVo.playTimeStr}</td>
                    <td> ${playVo.lanType}</td>
                    <td> ${playVo.roomName}</td>
                    <td> ${playVo.price}</td>
                    <td>
                        <a href="seat?playId=${playVo.playId}">选座购票</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
    </div>
</div>
</body>
</html>









<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>排片详情</title>--%>
<%--</head>--%>
<%--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>--%>
<%--<body>--%>
<%--<h2>排片情况如下：</h2><br>--%>

<%--<div class="container">--%>
<%--<table>--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th>放映时间</th>--%>
<%--        <th>语言版本</th>--%>
<%--        <th>放映厅</th>--%>
<%--        <th>票价</th>--%>
<%--        <th>选座购票</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${playVOS}" var="playVO">--%>
<%--        <tr>--%>
<%--            <td>${playVO.playTime}</td>--%>
<%--            <td>${playVO.lanType}</td>--%>
<%--            <td>${playVO.roomName}</td>--%>
<%--            <td>${playVO.price}</td>--%>
<%--            <td>--%>
<%--                <a href="seat?playId=${playVO.playId}">选座购票</a>--%>
<%--            </td>--%>
<%--        </tr>--%>


<%--    </c:forEach>--%>
<%--    </tbody>--%>

<%--</table>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>