<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index_work.css" type="text/css"></link>
</head>
<body>

               <form action="update" method="post">
                <input type="hidden" name="uid" value="${uid }">
                <input type="text" name="bqy" />
                <input type="submit" value="提交">
               </form>
</body>
</html>