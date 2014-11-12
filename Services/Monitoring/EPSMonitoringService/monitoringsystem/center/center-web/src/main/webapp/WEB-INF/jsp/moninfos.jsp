<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>

<h2>Monitoring info:</h2>


<display:table name="monitoringInfList" pagesize="10" requestURI="" class="list" cellspacing="0" cellpadding="0"  export="true">
    <display:setProperty name="export.pdf" value="true" />
    <display:column property="systemName" title="System" />
    <display:column property="systemId" />
    <display:column property="severity" />
    <display:column property="updateDate" />
    <display:column property="error" title="error"/>
    <display:column paramProperty="id" title="XML" href="moninfo.do" paramId="id">XML</display:column>
</display:table>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
