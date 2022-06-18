<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>yang淘淘</title>
    <style type="text/css">
        body {
            background: #2E323B;
        }

        .piao {
            text-align: center;
            border-bottom-left-radius: 20px;
            border-bottom-right-radius: 20px;
            width: 238px;
            padding: 6px;
            line-height: 20px;
            background: #5f5f6d;
        }
    </style>
</head>
<body>
<table bgcolor="0" align="center">
    <tr>
        <c:forEach items="${filmVOList}" var="film" begin="0" end="3">
            <td>
                <div style="width: 250px; margin:10px;">
                    <a href="filmInfo?filmId=${film.filmId}">
                        <img src="${pageContext.request.contextPath}${film.imgPath}"
                             style="width: 250px;height: 380px"/>
                    </a>

                    <div class="piao">
                        <p style="color: white; top: 50px;">${film.name}</p>

                        <p style="color: white; top: 50px;">导演:${film.director}</p>
                    </div>
                </div>
            </td>
        </c:forEach>
    </tr>
    <tr>
        <c:forEach items="${filmVOList}" var="film" begin="4" end="7">
            <td>
                <div style="width: 250px; margin:10px;">
                    <a href="filmInfo?filmId=${film.filmId}">
                        <img src="${pageContext.request.contextPath}${film.imgPath}"
                             style="width: 250px;height: 380px"/>
                    </a>
                    <div class="piao">
                        <p style="color: white; top: 50px;">${film.name}</p>
                        <p style="color: white; top: 50px;">导演:${film.director}</p>
                    </div>
                </div>
            </td>
        </c:forEach>
    </tr>
</table>







<%--<table bgcolor="#f5f5dc" align="center">--%>
<%--<tr>--%>
<%--    <c:forEach items="${filmVOList}" var="film" begin="0" end="1">--%>
<%--        <td>--%>
<%--            <img src="${pageContext.request.contextPath}${film.imgPath}" style="width: 250px;height: 300px">--%>
<%--            <p style="color: aqua ; top: 50px;" >${film.name}</p>--%>
<%--        </td>--%>

<%--    </c:forEach>--%>
<%--</tr>--%>
<%--</table>--%>



</body>
</html>
