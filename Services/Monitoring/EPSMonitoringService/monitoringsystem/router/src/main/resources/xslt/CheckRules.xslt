<?xml version="1.0" encoding="UTF-8"?>
<?altova_samplexml file:///C:/Share/1/dz2-env.xml?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="no"/>
	<xsl:variable name="Rules" select="document('c:\Public\users\fmv\Views\MonitoringCenter3\Router\JavaRouter\conf\Rules.xml')/Rules"/>
	<xsl:template match="/">
		<xsl:apply-templates/>
	</xsl:template>
	<xsl:template match="Data">
		<Data>
			<xsl:variable name="body">
			<RouteRule>
				<xsl:apply-templates select="$Rules/Rule[(string(Input/Queue) = '' or string(current()/Queue) = '' or Input/Queue = current()/Queue) and (string(Input/QueueManager) = '' or string(current()/QueueManager) = '' or Input/QueueManager = current()/QueueManager) and (string(Input/ReplyToQueue) = '' or string(current()/ReplyToQueue) = '' or Input/ReplyToQueue = current()/ReplyToQueue) and (string(Input/ReplyToQueueManager) = '' or string(current()/ReplyToQueueManager) = '' or Input/ReplyToQueueManager = current()/ReplyToQueueManager) and (string(Input/Format) = '' or string(current()/Format) = '' or Input/Format = current()/Format) and (string(Input/MsgType) = '' or string(current()/MsgType) = '' or Input/MsgType = current()/MsgType) and (string(Input/Sender) = '' or string(current()/Sender) = '' or Input/Sender = current()/Sender) and (string(Input/Receiver) = '' or string(current()/Receiver) = '' or Input/Receiver = current()/Receiver) and (string(Input/SoftKind) = '' or string(current()/SoftKind) = '' or Input/SoftKind = current()/SoftKind) and (string(Input/SoftVersion) = '' or string(current()/SoftVersion) = '' or Input/SoftVersion = current()/SoftVersion) and (string(Input/MessageKind) = '' or string(current()/MessageKind) = '' or Input/MessageKind = current()/MessageKind)][1]"/>
				</RouteRule>
			</xsl:variable>
			<xsl:choose>
				<xsl:when test="$body != ''">
					<xsl:copy-of select="$body"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:copy-of select="$Rules//Default/*"/>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:copy-of select="$Rules//Table"/>
		</Data>
	</xsl:template>
	<xsl:template match="Rule">
		<xsl:copy-of select="Output/*"/>
	</xsl:template>
</xsl:stylesheet>
