<%@page import="myweb.EntryItem"%>
<%@page import="myweb.EntryList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	EntryList el = new EntryList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<thead>
			<tr>
				<th>メンバーID</th>
				<th>名前</th>
				<th>誕生日</th>
				<th>性別</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (EntryItem item : el.getItems()) {
			%>
			<tr>
				<td><%=item.getMid()%></td>
				<td><%=item.getNam()%></td>
				<td><%=item.getBirth()%></td>
				<td><%=item.getSex()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>