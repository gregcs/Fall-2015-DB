<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>기본 에러 화면</title>
</head>
<body>
<table width="100%" border="1" cellspacing="0" cellpadding="0" align="center">
<tr>
	<td align="center">
	Message: ${exception.message}
	</td>
</tr>
</table>
</body>
</html>