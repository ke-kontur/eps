<?xml version="1.0" encoding="UTF-8"?>
<!--
This file was generated by kgn
-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:CategoryCust="urn:customs.ru:Categories:3.0.0" xmlns:cat_ru="urn:customs.ru:CommonAggregateTypes:5.0.7" xmlns:clt_ru="urn:customs.ru:CommonLeafTypes:5.0.7" xmlns:catExch_ru="urn:customs.ru:Information:ExchangeDocuments:ExchangeCommonAggregateTypes:5.0.8" xmlns:cltExch_ru="urn:customs.ru:Information:ExchangeDocuments:ExchangeCommonLeafTypes:5.0.8" xmlns:n="urn:customs.ru:Information:ExchangeDocuments:Result:5.0.9" exclude-result-prefixes="xs xsi xsl" xmlns="urn:customs.ru:Information:ExchangeDocuments:Result:5.0.9">
    <xsl:namespace-alias stylesheet-prefix="n" result-prefix="#default"/>
    <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">
        <n:Result>
            <xsl:attribute name="xsi:schemaLocation">
                <xsl:value-of select="'urn:customs.ru:Information:ExchangeDocuments:Result:5.0.9'"/>
            </xsl:attribute>
            <xsl:variable name="var1_instance" select="."/>
            <xsl:for-each select="$var1_instance/n:Result">
                <xsl:attribute name="DocumentModeID">
                    <xsl:value-of select="string(@DocumentModeID)"/>
                </xsl:attribute>
                <cat_ru:DocumentID>
                    <xsl:value-of select="string(cat_ru:DocumentID)"/>
                </cat_ru:DocumentID>
                <xsl:for-each select="cat_ru:RefDocumentID">
                    <cat_ru:RefDocumentID>
                        <xsl:value-of select="string(.)"/>
                    </cat_ru:RefDocumentID>
                </xsl:for-each>
                <xsl:for-each select="n:Response">
                    <n:Response>
                        <xsl:for-each select="n:RefDocumentID">
                            <n:RefDocumentID>
                                <xsl:value-of select="string(.)"/>
                            </n:RefDocumentID>
                        </xsl:for-each>
                        <xsl:for-each select="n:CreateDate">
                            <n:CreateDate>
                                <xsl:value-of select="string(.)"/>
                            </n:CreateDate>
                        </xsl:for-each>
                        <xsl:for-each select="n:CreateTime">
                            <n:CreateTime>
                                <xsl:value-of select="string(.)"/>
                            </n:CreateTime>
                        </xsl:for-each>
                        <xsl:for-each select="n:ResultInformation">
                            <n:ResultInformation>
                                <xsl:for-each select="n:ResultSource">
                                    <n:ResultSource>
                                        <xsl:value-of select="string(.)"/>
                                    </n:ResultSource>
                                </xsl:for-each>
                                <n:ResultCode>
                                    <xsl:value-of select="string(n:ResultCode)"/>
                                </n:ResultCode>
                                <xsl:for-each select="n:ResultDescription">
                                    <n:ResultDescription>
                                        <xsl:value-of select="string(.)"/>
                                    </n:ResultDescription>
                                </xsl:for-each>
                                <xsl:for-each select="n:ResultCategory">
                                    <n:ResultCategory>
                                        <xsl:value-of select="string(.)"/>
                                    </n:ResultCategory>
                                </xsl:for-each>
                                <xsl:for-each select="n:RefLineID">
                                    <n:RefLineID>
                                        <xsl:value-of select="string(.)"/>
                                    </n:RefLineID>
                                </xsl:for-each>
                                <xsl:for-each select="n:ItemInfo">
                                    <n:ItemInfo>
                                        <n:RefItem>
                                            <xsl:value-of select="string(n:RefItem)"/>
                                        </n:RefItem>
                                        <xsl:for-each select="n:RecommendValue">
                                            <n:RecommendValue>
                                                <xsl:value-of select="string(.)"/>
                                            </n:RecommendValue>
                                        </xsl:for-each>
                                    </n:ItemInfo>
                                </xsl:for-each>
                                <xsl:for-each select="n:EADInfo">
                                    <n:EADInfo>
                                        <xsl:for-each select="n:ArchDeclID">
                                            <n:ArchDeclID>
                                                <xsl:value-of select="string(.)"/>
                                            </n:ArchDeclID>
                                        </xsl:for-each>
                                        <xsl:for-each select="n:ArchID">
                                            <n:ArchID>
                                                <xsl:value-of select="string(.)"/>
                                            </n:ArchID>
                                        </xsl:for-each>
                                        <xsl:for-each select="n:ArchDocID">
                                            <n:ArchDocID>
                                                <xsl:value-of select="string(.)"/>
                                            </n:ArchDocID>
                                        </xsl:for-each>
                                        <xsl:for-each select="n:ArchDocStatus">
                                            <n:ArchDocStatus>
                                                <xsl:value-of select="string(.)"/>
                                            </n:ArchDocStatus>
                                        </xsl:for-each>
                                    </n:EADInfo>
                                </xsl:for-each>
                                <xsl:for-each select="n:ProcInformation">
                                    <n:ProcInformation>
                                        <xsl:for-each select="n:ProcState">
                                            <n:ProcState>
                                                <xsl:value-of select="string(.)"/>
                                            </n:ProcState>
                                        </xsl:for-each>
                                        <n:ProcessID>
                                            <xsl:value-of select="string(n:ProcessID)"/>
                                        </n:ProcessID>
                                        <xsl:for-each select="n:StateDescription">
                                            <n:StateDescription>
                                                <xsl:value-of select="string(.)"/>
                                            </n:StateDescription>
                                        </xsl:for-each>
                                        <xsl:for-each select="n:EventList">
                                            <n:EventList>
                                                <n:MessageCode>
                                                    <xsl:value-of select="string(n:MessageCode)"/>
                                                </n:MessageCode>
                                                <xsl:for-each select="n:MessageDescription">
                                                    <n:MessageDescription>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:MessageDescription>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:ProcState">
                                                    <n:ProcState>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:ProcState>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:RecvDateTime">
                                                    <n:RecvDateTime>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:RecvDateTime>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:SendDateTime">
                                                    <n:SendDateTime>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:SendDateTime>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:DocumentCode">
                                                    <n:DocumentCode>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:DocumentCode>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:DocumentDescription">
                                                    <n:DocumentDescription>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:DocumentDescription>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:MessageID">
                                                    <n:MessageID>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:MessageID>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:MsgInitialEnvelopeID">
                                                    <n:MsgInitialEnvelopeID>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:MsgInitialEnvelopeID>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:MsgPreparationDateTime">
                                                    <n:MsgPreparationDateTime>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:MsgPreparationDateTime>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:MsgDocumentID">
                                                    <n:MsgDocumentID>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:MsgDocumentID>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:MsgRefDocumentID">
                                                    <n:MsgRefDocumentID>
                                                        <xsl:value-of select="string(.)"/>
                                                    </n:MsgRefDocumentID>
                                                </xsl:for-each>
                                                <xsl:for-each select="n:DocumentResult">
                                                    <n:DocumentResult>
                                                        <n:ResultCode>
                                                            <xsl:value-of select="string(n:ResultCode)"/>
                                                        </n:ResultCode>
                                                        <xsl:for-each select="n:DocumentID">
                                                            <n:DocumentID>
                                                                <xsl:value-of select="string(.)"/>
                                                            </n:DocumentID>
                                                        </xsl:for-each>
                                                    </n:DocumentResult>
                                                </xsl:for-each>
                                            </n:EventList>
                                        </xsl:for-each>
                                    </n:ProcInformation>
                                </xsl:for-each>
                            </n:ResultInformation>
                        </xsl:for-each>
                    </n:Response>
                </xsl:for-each>
            </xsl:for-each>
        </n:Result>
    </xsl:template>
</xsl:stylesheet>
