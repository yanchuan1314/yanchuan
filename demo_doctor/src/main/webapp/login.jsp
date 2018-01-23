<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/index_work.css" type="text/css"></link>
 <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
function login() {
	
	 $.ajax({
		 
		 url:"<%=request.getContextPath()%>/login",
		 data:$("#form").serialize(),
		 dataType:"json",
		 type:"post",
		 success:function(obj){
			 alert(obj.cool);
			 if(obj.cool=='success'){
				 alert("登录成功");
				 location.href="/list";
			 }else{
				 alert("登录失败");
				 location.href="/tologin";
			 }
		 }
	 })
}
</script>

</head>
<body>
<center>

      <form action="" method="post" id="form">
         	账号:<input type="text" name="username"><br>
         	密码:<input type="password" name="did"><br>
         		<input type="button" value="登录" onclick="login()">
       </form>


</center>

</body>
</html>