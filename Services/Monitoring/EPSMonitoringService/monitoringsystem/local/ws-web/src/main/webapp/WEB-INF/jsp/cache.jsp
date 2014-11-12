<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<form:form action="update.do" method="GET">
	<table width="100%">
		<tr>
			<td width="100%" align="center">
				<input type="submit" value="Обновить кэш" />
			</td>
		</tr>
	</table>
</form:form> 
<c:out value="${monitoringInfo}" escapeXml="false"/>
