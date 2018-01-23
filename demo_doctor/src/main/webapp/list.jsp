<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index_work.css" type="text/css"></link>

</head>
<body>
<center>

     <table border="2px">
          <tr>
              <td>就诊编号</td>
               <td>就诊姓名</td>
                <td>就诊状态</td>
                <td>
                                       病理分析
                </td>
                <td>
                     主治医生操作
                  
                </td>
               
          </tr>
          <c:forEach items="${list1}" var="l">
              <tr>
                   <td>${l.uid }</td>
                   <td>${l.uname}</td>
                   
                   <td>
                <c:if test="${l.zt==1}">挂号中....</c:if>
                 <c:if test="${l.zt==2}">挂号成功</c:if>
               <c:if test="${l.zt==3}">挂号失败</c:if>
               <c:if test="${l.zt==4}">等待主治医生审核</c:if>
               
             
             </td>
             <td>
                ${l.bqy}
             
             </td>
             <td>
              <a href="update1?uid=${l.uid}">接诊</a>
                <a href="update2?uid=${l.uid}">拒绝接诊</a>
                  <a href="update3?uid=${l.uid}">等待接诊</a>
                  
             
             </td>
             
                  
              </tr> 
          
          
          </c:forEach>
     
     </table>


</center>
</body>
</html>