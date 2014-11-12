<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>

<h2>Statistika obrabotki soobschenii:</h2>



<display:table name="messageProcessingStatList" pagesize="40" requestURI="" class="list" cellspacing="0" cellpadding="0"  export="true">
    <display:setProperty name="export.pdf" value="true" />
  <display:column property="system.connection.name" />
    <display:column property="system.name" />
  <display:column property="messageKind.code" />  
  <display:column property="messageKind.description" />
  <display:column property="statDate" />
  <display:column property="success" />
  <display:column property="flkError" />
  <display:column property="error" />
  <display:column property="error" title="error"/>  
</display:table>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
