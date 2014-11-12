<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<style>
			* { font-family: Tahoma, Verdana, Arial; }
			
			ul { list-style: disc; margin-left: 5px; padding-left: 5px; }
			ul li { margin-left: 15px; padding-left: 5px; font-weight: bold; }
			
			table { margin-bottom: 20px; width: 100%; border: 1px solid #ccc; }
			table td { padding: 4px 10px; border: 1px solid #ccc; border-collapse: collapse; }
			table thead td { text-align: center; font-weight: bold; background-color: #efefef; }
			
			.on { background-color: #D7F9D9; border-bottom: 1px solid #1F6F23; }
			.off { background-color: #F9E7E8; border-bottom: 1px solid #ff0000; }
			
		</style>
	</head>
	<body>
		<h1>Balancer</h1>
		<hr />
		<c:forEach var="balancer" items="${balancers}" >
			<h2>${balancer.name}</h2>
			<ul>		
				<li>${balancer.useHeartbeat}</li>
				<li>${balancer.useListenerContainer}</li>
			</ul>
			<table cellspacing="0" cellpadding="0" >
				<thead>
					<tr>
						<td>Версия</td>
						<td>Цель</td>
						<td>Загрузка</td>
						<td>Коды ТО</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${balancer.items}" >
						<tr>
							<c:if test="${item.first}" >
								<td rowspan="${item.rowspan}" >${item.version}</td>
							</c:if>
							<td class="${item.style}">${item.destination}</td>
							<td class="${item.style}">${item.load}</td>
							<td class="${item.style}">${item.codes}</td>							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:forEach>
	</body>
</html>