<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:minf="urn:customs.ru:MonitoringInfo:1.0.0" xmlns:clt_ru="urn:customs.ru:CommonLeafTypes:4.2.0" xmlns:cat_ru="urn:customs.ru:CommonAggregateTypes:4.2.0" exclude-result-prefixes="minf clt_ru cat_ru">
	<!-- Версия 1.0 от 2.11.2009.  -->
	<!-- Для  xmlns:minf="urn:customs.ru:MonitoringInfo:1.0.0"  -->
	<xsl:output method="html" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:apply-templates/>
	</xsl:template>
	<xsl:template name="russian_date_time">
		<xsl:param name="dateIn"/>
		<xsl:choose>
			<xsl:when test="substring($dateIn,5,1)='-' and substring($dateIn,8,1)='-'">
				<xsl:value-of select="substring($dateIn,9,2)"/>.<xsl:value-of select="substring($dateIn,6,2)"/>.<xsl:value-of select="substring($dateIn,1,4)"/>
				<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
				<xsl:value-of select="substring($dateIn,12,8)"/>
				(<xsl:value-of select="substring($dateIn,24,6)"/>)
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$dateIn"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="minf:MonitoringInfo">
		<html>
			<head>
				<title>Информация о работоспособности системы</title>
				<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8"/>
				<style type="text/css">
					body {
						text-align: center;
							background: #cccccc;
							}
							
						div.page {
							width: 95%;
							height: {297}mm;
							margin-top: 6pt;
							margin-bottom: 6pt;
							padding:	10mm;
							padding-left:	10mm;
							background: white;
							border: solid 1pt #000000;
							}
						
						div.goods {
							background: #ffffff;
							}
							
						.bordered {
							border: solid 1pt #000000;
							padding-top:4pt;
							padding-bottom:4pt;
							font-family: Arial;
							font-size: 9pt;
							font-weight: bold;
							}
							
						.underlined {
							border-bottom: solid 0.5pt #000000;
							font-weight: bold;
							}
							
						p.NumberDate {
							font-weight: bold;
							}
							
						.graph {
							font-family: Arial;
							font-size: 7pt;
							}
						.graphColumn {
							font-family: Arial;
							font-size: 6.5pt;
							}
						.graphTitleIt {
							font-family: Arial;
							font-size: 7pt;
							font-weight: italian;
							}
						td {
							font-family: Arial;
							font-size: 10pt;
							padding-left: 4pt;
							}
		
						.graphMain {
							font-family: Arial;
							font-size: 11pt;
							font-weight: bold;
							}
							
						.graphNum {
							font-family: Arial;
							font-size: 7pt;
							font-weight: bold;
							}
							
						.graphNo {
							font-size: 7pt;
							font-weight: bold;
							}
							
						.imgState {
							float: left;
							}

						.sysName {
							text-align:left;
							font-size: 12pt;
							margin-left: 0pt;
							margin-top: 2pt;
							margin-bottom: 5pt;
							color: darkgray;
							width:100%;
							border-bottom:solid 0pt #000000;
							}
							
						.subSysName {
							text-align:left;
							font-size: 12pt;
							margin-left: 0pt;
							margin-top: 5pt;
							margin-bottom: 2pt;
							color: black;
							width:100%;
							border-bottom:solid 1pt #000000;
							}
							
							
							.hdGroup {
								font-weight: normal;
								margin-top: 4pt;
							}
							
							.itGroup {
								margin-left: 20pt;
							}
							.INFO_List {
								color:green;
								font-size: 15pt;
								padding-right: 2pt;
							}
							
							.ERROR_List {
								color:red;
								font-size: 15pt;
								padding-right: 2pt;
							}
							
							.WARNING_List {
								color:yellow;
								font-size: 15pt;
								padding-right: 2pt;
							}
							
							.UNAVAILABLE_List {
								color:gray;
								font-size: 15pt;
								padding-right: 2pt;
							}
							.hr {							
							border-bottom:dotted 1pt #000000;
							}
	

							
					</style>
			</head>
			<body>
				<div class="page">
					<table cellpadding="0" cellspacing="0" style="width:100%;border-bottom:solid 0pt #000000;">
						<tbody>
							<xsl:if test="minf:systemName">
								<tr>
									<td colspan="2">
									<div class="sysName">
										<big><xsl:attribute name="class"><xsl:value-of select="translate(string(concat(&apos;&apos;,minf:severity,&apos;_List&apos;)), '&#x5c;', '/')"/></xsl:attribute>&#9679;</big>
										<b>
											<xsl:value-of select="minf:systemName"/>
											<xsl:if test="minf:systemId">
												 (<xsl:value-of select="minf:systemId"/>)
											</xsl:if>
										</b>
										
										</div>
									</td>
								</tr>
							</xsl:if>
							<xsl:if test="minf:HostInfos">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;">
											<div class="subSysName">Хосты</div>
											<xsl:call-template name="common_tr">
												<xsl:with-param name="path" select="minf:HostInfos"/>
											</xsl:call-template>
											</td>
										</tr>
										<xsl:for-each select="minf:HostInfos/minf:HostInfo">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											
											<xsl:call-template name="common_tr">
												<xsl:with-param name="path" select="."/>
											</xsl:call-template>
											
											<tr>
												<td style="width:{90}mm;">Доступность хоста</td>
												<td style="width:{90}mm;">
													<xsl:choose>
														<xsl:when test="(number(minf:available)=1) or (minf:available='t') or (minf:available='true')">Доступeн</xsl:when>
														<xsl:otherwise>Не доступeн</xsl:otherwise>
													</xsl:choose>
												</td>
											</tr>
											
											<tr>
												<td style="width:{90}mm;">
													<div class="hdGroup">Проверка TCP-портов</div>
												</td>
												<td style="width:{90}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											
											<xsl:for-each select="minf:portOpenCheck">											
												
												<tr>
													<td style="width:{90}mm;">
														<div class="itGroup"><xsl:value-of select="minf:name"/></div>
													</td>
													<td style="width:{90}mm;">
														<xsl:choose>
															<xsl:when test="(number(minf:open)=1) or (minf:open='t') or (minf:open='true')">Порт открыт</xsl:when>
															<xsl:otherwise>Порт закрыт</xsl:otherwise>
														</xsl:choose>
													</td>
												</tr>												
												
												
											</xsl:for-each>
											
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:DatabaseInfos">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;">
											<div class="subSysName">Базы данных</div>
											<xsl:call-template name="common_tr">
											<xsl:with-param name="path" select="minf:DatabaseInfos"/>
										</xsl:call-template>
											</td>
										</tr>
										<xsl:for-each select="minf:DatabaseInfos/minf:DbInfo">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<div class="hr"> </div>
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											
											<xsl:call-template name="common_tr">
												<xsl:with-param name="path" select="."/>
											</xsl:call-template>
											<xsl:if test="minf:Available">
												<tr>
													<td style="width:{90}mm;">Доступность БД</td>
													<td style="width:{90}mm;">
														<xsl:choose>
															<xsl:when test="(number(minf:Available/minf:available)=1) or (minf:Available/minf:available='t') or (minf:Available/minf:available='true')">Доступна</xsl:when>
															<xsl:otherwise>Не доступна</xsl:otherwise>
														</xsl:choose>
													</td>
												</tr>
											</xsl:if>
											<xsl:if test="minf:DbFileSize">
												<tr>
													<td style="width:{90}mm;">
														<div class="hdGroup">Информация о табличном пространстве</div>
													</td>
													<td style="width:{90}mm;">
														<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
													</td>
												</tr>
												<xsl:call-template name="common_tr">
													<xsl:with-param name="path" select="minf:DbFileSize"/>
												</xsl:call-template>
												<xsl:for-each select="minf:DbFileSize">												  
													<xsl:if test="minf:tablespace">
														<tr>
															<td style="width:{90}mm;"><div class="itGroup">Наименование</div></td>
															<td style="width:{90}mm;">
																<xsl:value-of select="minf:tablespace"/>
															</td>
														</tr>
													</xsl:if>
													<xsl:if test="minf:availablePercent">
														<tr>
															<td style="width:{90}mm;"><div class="itGroup">Свободно, %</div></td>
															<td style="width:{90}mm;">
																<xsl:value-of select="minf:availablePercent"/>
															</td>
														</tr>
													</xsl:if>
													<xsl:if test="minf:maxSpace">
														<tr>
															<td style="width:{90}mm;"><div class="itGroup">Максимальный размер, Мб</div></td>
															<td style="width:{90}mm;">
																<xsl:value-of select="minf:maxSpace"/>
															</td>
														</tr>
													</xsl:if>
													<xsl:if test="minf:usedSpace">
														<tr>
															<td style="width:{90}mm;"><div class="itGroup">Используемое пространство, Мб</div></td>
															<td style="width:{90}mm;">
																<xsl:value-of select="minf:usedSpace"/>
															</td>
														</tr>
													</xsl:if>
													<tr>
														<td style="width:{90}mm;">
															<div class="hdGroup"></div>
														</td>
														<td style="width:{90}mm;">
															<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
														</td>
													</tr>
												</xsl:for-each>
											</xsl:if>
											<xsl:if test="minf:DbContentChecks">											
												<tr>
													<td style="width:{90}mm;">
														<div class="hdGroup">Проверки содержимого БД</div>
													</td>
													<td style="width:{90}mm;">
														<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
													</td>
												</tr>																							
												<xsl:for-each select="minf:DbContentChecks/minf:DbContentCheck">													
													<xsl:call-template name="common_tr">
														<xsl:with-param name="path" select="."/>
													</xsl:call-template>
													<xsl:if test="minf:correct">
														<tr>
															<td style="width:{90}mm;"><div class="itGroup">Проверка</div></td>
															<td style="width:{90}mm;">
																<xsl:choose>
																	<xsl:when test="(number(minf:correct)=1) or (minf:correct='t') or (minf:correct='true')">Пройдена</xsl:when>
																	<xsl:otherwise>Не пройдена</xsl:otherwise>
																</xsl:choose>
															</td>
														</tr>
													</xsl:if>
													<xsl:if test="minf:incorrectnessDescription">
														<tr>
															<td style="width:{90}mm;"><div class="itGroup">Описание ошибки</div></td>
															<td style="width:{90}mm;">
																<xsl:value-of select="minf:incorrectnessDescription"/>
															</td>
														</tr>
													</xsl:if>
												</xsl:for-each>	
											</xsl:if>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>							
							<xsl:if test="minf:MqMonitoringInfo">
								<table style="width:100%;border:solid 0pt #000000;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;">
											<div class="subSysName">Транспортная подсистема</div>
										<xsl:call-template name="common">
											<xsl:with-param name="path" select="minf:MqMonitoringInfo"/>
										</xsl:call-template>
											</td>
										</tr>
										<xsl:for-each select="minf:MqMonitoringInfo/minf:QueueManagerInfo">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											<xsl:if test="minf:queueManagerName">
											<tr>
												<td colspan="2" style="width:{180}mm;">
																	<div class="hdGroup">Менеджер очередей <xsl:value-of select="minf:queueManagerName"/></div>
																	<xsl:call-template name="common">
																		<xsl:with-param name="path" select="."/>
																	</xsl:call-template>
												</td>
											</tr>
											</xsl:if>
											<xsl:if test="minf:host">
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Хост</div></td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:host"/>
													</td>
												</tr>
											</xsl:if>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Доступность</div></td>
												<td style="width:{90}mm;">
													<xsl:choose>
														<xsl:when test="(number(minf:available)=1) or (minf:available='t') or (minf:available='true')">Доступен</xsl:when>
														<xsl:otherwise>Не доступен</xsl:otherwise>
													</xsl:choose>
												</td>
											</tr>
											<xsl:for-each select="minf:QueueStatus">
												<tr>
													<td style="width:{90}mm;" >
														<div class="hdGroup"><xsl:call-template name="common">
															<xsl:with-param name="path" select="."/>
														</xsl:call-template>
														<xsl:value-of select="minf:queueName"/></div>
													</td>
													<td style="width:{90}mm;">
														<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
													</td>
												</tr>
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Доступность очереди</div></td>
													<td style="width:{90}mm;">
														<xsl:choose>
															<xsl:when test="(number(minf:available)=1) or (minf:available='t') or (minf:available='true')">Доступна</xsl:when>
															<xsl:otherwise>Не доступна</xsl:otherwise>
														</xsl:choose>
													</td>
												</tr>
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Глубина очереди</div></td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:depth"/>
													</td>
												</tr>
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Превышение допустимого количества сообщений</div></td>
													<td style="width:{90}mm;">
														<xsl:choose>
															<xsl:when test="(number(minf:exceededDepth)=1) or (minf:exceededDepth='t') or (minf:exceededDepth='true')">Есть</xsl:when>
															<xsl:otherwise>Нет</xsl:otherwise>
														</xsl:choose>
													</td>
												</tr>
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Превышение интервала считывания</div></td>
													<td style="width:{90}mm;">
														<xsl:choose>
															<xsl:when test="(number(minf:exceededInterval)=1) or (minf:exceededInterval='t') or (minf:exceededInterval='true')">Есть</xsl:when>
															<xsl:otherwise>Нет</xsl:otherwise>
														</xsl:choose>
													</td>
												</tr>
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Интервал считывания</div></td>
													<td style="width:{90}mm;">
														<xsl:call-template name="format_time_interval">
															<xsl:with-param name="interval" select="minf:interval"/>
															<xsl:with-param name="measure" select="'sec'"/>
														</xsl:call-template>														
													</td>
												</tr>
												<xsl:for-each select="minf:Error">
													<tr>
														<td style="width:{90}mm;"><div class="itGroup">Ошибка при работе с очередью</div></td>
														<td style="width:{90}mm;">
															<xsl:value-of select="."/>
														</td>
													</tr>
												</xsl:for-each>
											</xsl:for-each>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:SytemServicesInfo">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;"><div class="subSysName">Информация мониторинга системных сервисов</div>
													<xsl:call-template name="common">
														<xsl:with-param name="path" select="minf:SytemServicesInfo"/>
													</xsl:call-template>
											</td>
										</tr>
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
										<xsl:for-each select="minf:SytemServicesInfo/minf:Service">
											<tr>
												<td colspan="2"><div class="hdItem">
											<xsl:call-template name="common">
												<xsl:with-param name="path" select="."/>
											</xsl:call-template>
												Информация о службе <xsl:value-of select="minf:serviceName"/>
												</div>
												</td>
											</tr>
											<xsl:if test="minf:host">
												<tr>
													<td style="width:{90}mm;">
														<div class="itGroup">Хост</div>
													</td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:host"/>
													</td>
												</tr>
											</xsl:if>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Сервис запущен</div></td>
												<td style="width:{90}mm;">
													<xsl:choose>
														<xsl:when test="(number(minf:running)=1) or (minf:running='t') or (minf:running='true')">Да</xsl:when>
														<xsl:otherwise>Нет</xsl:otherwise>
													</xsl:choose>
												</td>
											</tr>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:SignaturesInfo">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;"><div class="subSysName">Информация мониторинга серверов ЭЦП</div>
													<xsl:call-template name="common">
														<xsl:with-param name="path" select="minf:SignaturesInfo"/>
													</xsl:call-template>
											</td>
										</tr>
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
										<xsl:for-each select="minf:SignaturesInfo/minf:SignatureInfo">
											<tr>
												<td colspan="2">
												<div class="hdItem">
													<xsl:call-template name="common">
														<xsl:with-param name="path" select="."/>
													</xsl:call-template>													
												</div>
												</td>
											</tr>
											<xsl:if test="minf:host">
												<tr>
													<td style="width:{90}mm;">
														<div class="itGroup">Хост</div>
													</td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:host"/>
													</td>
												</tr>
											</xsl:if>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Сервер доступен</div></td>
												<td style="width:{90}mm;">
													<xsl:choose>
														<xsl:when test="(number(minf:available)=1) or (minf:available='t') or (minf:available='true')">Да</xsl:when>
														<xsl:otherwise>Нет</xsl:otherwise>
													</xsl:choose>
												</td>
											</tr>
											<xsl:if test="./minf:CertificateInfo">
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Сертификаты:</div></td>
												</tr>
											<xsl:for-each select="./minf:CertificateInfo">
												
												<tr>
													<td colspan="2"> 
												<div class="itGroup">
													<xsl:call-template name="common">
														<xsl:with-param name="path" select="."/>
													</xsl:call-template>
													</div>	
													</td>
												</tr>												
												
												<!-- 
												 <tr>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:name"/>
													</td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:severity"/>
													</td>
												</tr>
												-->
											</xsl:for-each>
											</xsl:if>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:EventLogInfos">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;">
											<div class="subSysName">Системные журналы</div>
											<xsl:call-template name="common">
												<xsl:with-param name="path" select="minf:EventLogInfos"/>
											</xsl:call-template>											
											</td>
										</tr>
										<xsl:for-each select="minf:EventLogInfos/minf:EventLogCheck">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											
											<xsl:call-template name="common_tr">
												<xsl:with-param name="path" select="."/>
											</xsl:call-template>
											
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Источник</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:sourceName"/>
												</td>
											</tr>
											
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Журнал</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:logName"/>
												</td>
											</tr>											
											
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Интервал</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:interval"/>
													<xsl:text disable-output-escaping="yes"> д.</xsl:text> 
												</td>
											</tr>
											
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Ошибок</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:errorCount"/>
												</td>
											</tr>
											
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Порог срабатывания</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:maxErrorCount"/>
												</td>
											</tr>
											
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:SystemInfo">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;" ><div class="subSysName">Системная информация</div>
											<xsl:call-template name="common">
												<xsl:with-param name="path" select="minf:SystemInfo"/>
											</xsl:call-template>
										</td></tr>
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
										<xsl:if test="minf:SystemInfo/minf:MemoryInfo">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<div class="hdGroup"><xsl:call-template name="common">
														<xsl:with-param name="path" select="minf:SystemInfo/minf:MemoryInfo"/>
													</xsl:call-template>
													Оперативная память</div>
												</td>
											</tr>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Свободно, Мб</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:SystemInfo/minf:MemoryInfo/minf:freeMemoryMb"/>
												</td>
											</tr>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Общий объем памяти, Мб</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:SystemInfo/minf:MemoryInfo/minf:totalMemoryMb"/>
												</td>
											</tr>
										</xsl:if>
										<xsl:for-each select="minf:SystemInfo/minf:DiskInfo">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<div class="hdGroup">
													<xsl:call-template name="common">
														<xsl:with-param name="path" select="."/>
													</xsl:call-template>													
													Информация о диске <xsl:value-of select="minf:diskName"/></div>
												</td>
											</tr>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Свободно, Мб</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:freeSizeMb"/>
												</td>
											</tr>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Общий объем, Мб</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:totalSizeMb"/>
												</td>
											</tr>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:FunctionServicesInfo">
								<table style="width:100%;border:solid 1pt #000000;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;"><div  class="subSysName">
										<xsl:call-template name="common">
											<xsl:with-param name="path" select="minf:FunctionServicesInfo"/>
										</xsl:call-template>
											Информация мониторинга функциональных сервисов
											</div></td>
										</tr>
										<xsl:for-each select="minf:FunctionServicesInfo/minf:Service">
											<tr>
												<td style="width:{90}mm;" class="underlined"><div class="hdGroup">Информация о сервисе </div><xsl:value-of select="minf:serviceName"/>
												</td>
												<td style="width:{90}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											<xsl:if test="minf:serviceName">
												<tr>
													<td style="width:{90}mm;">Наименование сервиса</td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:serviceName"/>
													</td>
												</tr>
											</xsl:if>
											<xsl:call-template name="common">
												<xsl:with-param name="path" select="."/>
											</xsl:call-template>
											<xsl:if test="minf:host">
												<tr>
													<td style="width:{90}mm;">Хост</td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:host"/>
													</td>
												</tr>
											</xsl:if>
											<tr>
												<td style="width:{90}mm;">Сервис запущен</td>
												<td style="width:{90}mm;">
													<xsl:choose>
														<xsl:when test="(number(minf:running)=1) or (minf:running='t') or (minf:running='true')">Да</xsl:when>
														<xsl:otherwise>Нет</xsl:otherwise>
													</xsl:choose>
												</td>
											</tr>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:MessagesProcessingInfo">
								<table style="width:100%;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;"><div class="subSysName">Информация мониторинга процессов обмена сообщениями</div></td>
										</tr>
										<xsl:call-template name="common_tr">
												<xsl:with-param name="path" select="minf:MessagesProcessingInfo"/>
										</xsl:call-template>

										<xsl:for-each select="minf:MessagesProcessingInfo/minf:MessageProcessingInfo">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
												</td>
											</tr>
											<tr>
												<td colspan="2" style="width:{180}mm;">
															<div class="hdGroup">Информация о передаче сообщений <xsl:value-of select="minf:MessageKind"/></div>
												</td>
											</tr>
											<xsl:call-template name="common_tr">
												<xsl:with-param name="path" select="."/>
											</xsl:call-template>
											<tr>
												<td style="width:{90}mm;"><div class="itGroup">Вид сообщения</div></td>
												<td style="width:{90}mm;">
													<xsl:value-of select="minf:MessageKind"/>
												</td>
											</tr>
											<xsl:if test="minf:MessageDescription">
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Описание вида сообщения</div></td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:MessageDescription"/>
													</td>
												</tr>
											</xsl:if>
											<xsl:if test="minf:SuccessCount">
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Количество успешно обработанных сообщений</div></td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:SuccessCount"/>
													</td>
												</tr>
											</xsl:if>
											<xsl:if test="minf:FlkErrCount">
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Количество сообщений, не прошедших ФЛК</div></td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:FlkErrCount"/>
													</td>
												</tr>
											</xsl:if>
											<xsl:if test="minf:ErrCount">
												<tr>
													<td style="width:{90}mm;"><div class="itGroup">Количество сообщений, обработанных с технической ошибкой</div></td>
													<td style="width:{90}mm;">
														<xsl:value-of select="minf:ErrCount"/>
													</td>
												</tr>
											</xsl:if>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
							<xsl:if test="minf:Error">
								<table style="width:100%;border:solid 1pt #000000;" cellpadding="0" cellspacing="0">
									<tbody>
										<tr>
											<td colspan="2" style="width:{180}mm;" align="center" class="graphMain">Информация об ошибках</td>
										</tr>
										<xsl:for-each select="minf:Error">
											<tr>
												<td colspan="2" style="width:{180}mm;">
													<xsl:value-of select="."/>
												</td>
											</tr>
										</xsl:for-each>
									</tbody>
								</table>
							</xsl:if>
                            <xsl:if test="minf:POP3MonitoringInfo">
                                <table style="width:100%;border:solid 0pt #000000;" cellpadding="0" cellspacing="0">
                                    <tbody>
                                        <tr>
                                            <td colspan="2" style="width:{180}mm;">
                                                <div class="subSysName">POP3-сервер</div>
                                                <xsl:call-template name="common">
                                                    <xsl:with-param name="path" select="minf:POP3MonitoringInfo"/>
                                                </xsl:call-template>
                                            </td>
                                        </tr>
                                        <xsl:for-each select="minf:POP3MonitoringInfo/minf:MailboxInfo">
                                            <tr>
                                                <td colspan="2" style="width:{180}mm;">
                                                    <xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
                                                </td>
                                            </tr>
                                            <xsl:if test="minf:mailboxName">
                                                <tr>
                                                    <td colspan="2" style="width:{180}mm;">
                                                        <div class="hdGroup">
                                                            <xsl:call-template name="common">
                                                                <xsl:with-param name="path" select="."/>
                                                            </xsl:call-template>
                                                            Почтовый ящик <xsl:value-of select="minf:mailboxName"/>
                                                        </div>

                                                    </td>
                                                </tr>
                                            </xsl:if>
                                            <xsl:if test="minf:messagesCount">
                                                <tr>
                                                    <td style="width:{90}mm;"><div class="itGroup">Сообщений в ящике</div></td>
                                                    <td style="width:{90}mm;">
                                                        <xsl:value-of select="minf:messagesCount"/>
                                                    </td>
                                                </tr>
                                            </xsl:if>
                                            <xsl:if test="minf:oldestMessageDateTime">
                                                <tr>
                                                    <td style="width:{90}mm;"><div class="itGroup">Последнее считывание</div></td>
                                                    <td style="width:{90}mm;">
                                                        <xsl:call-template name="russian_date_time">
                                                            <xsl:with-param name="dateIn" select="minf:oldestMessageDateTime"/>
                                                        </xsl:call-template>
                                                    </td>
                                                </tr>
                                            </xsl:if>
                                        </xsl:for-each>
                                    </tbody>
                                </table>
                            </xsl:if>
						</tbody>
					</table>
				</div>
			</body>
		</html>
	</xsl:template>
	
	<xsl:template name="common_tr">
		<xsl:param name="path"/>
			<tr><td colspan="2">
										<xsl:call-template name="common">
											<xsl:with-param name="path" select="$path"/>
										</xsl:call-template>
		</td></tr>
	</xsl:template>
	
	<xsl:template name="format_time_interval">
		<xsl:param name="interval"/>
		<xsl:param name="measure"/>	
			
			<xsl:variable name="msInSecond">
				<xsl:choose>
					<xsl:when test="$measure = 'sec'">1</xsl:when>
					<xsl:otherwise>1000</xsl:otherwise>
				</xsl:choose>
			</xsl:variable>		
						
			<xsl:variable name="msInMinute" select="$msInSecond*60"/>
			<xsl:variable name="msInHour" select="$msInMinute*60"/>
			<xsl:variable name="msInDay" select="$msInHour*24"/>
		    <xsl:variable name="days" select="($interval - ($interval mod $msInDay)) div $msInDay"/>
		    <xsl:variable name="interval_without_days" select="$interval - $msInDay*$days"/>		
		    <xsl:variable name="hours" select="($interval_without_days - ($interval_without_days mod $msInHour)) div $msInHour"/>
		    <xsl:variable name="interval_without_hours" select="$interval_without_days - $msInHour*$hours"/>
		    <xsl:variable name="minutes" select="($interval_without_hours - ($interval_without_hours mod $msInMinute)) div $msInMinute"/>
		    <xsl:variable name="interval_without_minutes" select="$interval_without_hours - $msInMinute*$minutes"/>   
		    <xsl:variable name="seconds" select="($interval_without_minutes - ($interval_without_minutes mod $msInSecond)) div $msInSecond"/>
		      	    
			<xsl:if test="$days &gt; 0">			    
				<xsl:value-of select="$days" />
				<xsl:text disable-output-escaping="yes"> д. </xsl:text> 
			</xsl:if>
			<xsl:if test="$hours &gt; 0">			    
				<xsl:value-of select="$hours" /> 
				<xsl:text disable-output-escaping="yes"> ч. </xsl:text>
			</xsl:if>
			<xsl:if test="$minutes &gt; 0">			    
				<xsl:value-of select="$minutes" /> 
				<xsl:text disable-output-escaping="yes"> мин. </xsl:text>	
			</xsl:if>
			<xsl:value-of select="$seconds" />
			<xsl:text disable-output-escaping="yes"> сек.</xsl:text>
	</xsl:template>	
	
	
	<xsl:template name="common">
		<xsl:param name="path"/>
		<xsl:if test="$path/minf:severity">
										<big>
											<xsl:attribute name="class"><xsl:value-of select="translate(string(concat(&apos;&apos;,$path/minf:severity,&apos;_List&apos;)), '&#x5c;', '/')"/></xsl:attribute>&#9679;</big>
					<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
					
		</xsl:if>
		<b>
		<xsl:if test="$path/minf:name">
					 <xsl:value-of select="$path/minf:name"/>. 
		</xsl:if>
		</b>
		<xsl:if test="$path/minf:description">
					  (<xsl:value-of select="$path/minf:description"/>) 
		</xsl:if>
		<xsl:if test="$path/minf:updateTime"> Обновлено: 
					<xsl:call-template name="russian_date_time">
						<xsl:with-param name="dateIn" select="$path/minf:updateTime"/>
					</xsl:call-template>
		</xsl:if>
		<i><xsl:if test="$path/minf:additionalInfo">
					 <xsl:value-of select="$path/minf:additionalInfo"/>
		</xsl:if></i>
	</xsl:template>
	
	
</xsl:stylesheet>