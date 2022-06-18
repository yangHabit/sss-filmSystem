<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>电影详情</title>
</head>


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>

<style type="text/css">
    body {
        background: #2E323B;
    }

    #register table tr {
        height: 50px;
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
        <div class="container" style="margin-top: 20px;">
            <div>
                <strong id="biaoti" style="font-size: 26px;">${film.name}</strong>
            </div>
            <img style="float: left; display: block; height: 350px; width: 250px; margin-right: 20px;"
                 src="${pageContext.request.contextPath}${vo.imgPath}"/>
            <div>
                <div style="padding-top: 15px;padding-right: 20px;line-height: 25px;">
                    <p>导演: ${vo.director}</p>
                    <p>主演: ${vo.player}</p>
                    <p>类型: ${vo.type}</p>
                    <p>片长: ${vo.length}分钟</p>
                    <p>国家: ${vo.country}</p>
                    <p>剧情简介: ${vo.synopsis}</p>

                    <strong>
                        <a href="play?filmId=${vo.filmId}">查看排片信息</a>
                    </strong>

                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>













<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>电影详情</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--    <p > ${vo.filmName}</p>--%>
<%--    <p>${vo.director}</p>--%>
<%--    <p>${vo.player}</p>--%>
<%--    <p>${vo.type}</p>--%>
<%--    <p>${vo.length}</p>--%>
<%--    <p>${vo.country}</p>--%>
<%--    <p>${vo.synopsis}</p>--%>
<%--</body>--%>
<%--</html>--%>
