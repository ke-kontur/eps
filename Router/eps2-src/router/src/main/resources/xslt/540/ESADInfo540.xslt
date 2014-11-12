<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:catESAD_cu="urn:customs.ru:CUESADCommonAggregateTypesCust:5.4.0" xmlns:cat_ru="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ESADout_CU="urn:customs.ru:Information:CustomsDocuments:ESADout_CU:5.4.0" xmlns:clt_ru="urn:customs.ru:CommonLeafTypes:5.4.0" xmlns:cltESAD_cu="urn:customs.ru:CUESADCommonLeafTypes:5.4.0" xmlns:goom="urn:customs.ru:Information:CustomsDocuments:GTDOutCustomsMark:5.4.0" exclude-result-prefixes="xs xsi ESADout_CU goom">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:variable name="GTD" select="//goom:GTDOutCustomsMark"/>
		<xsl:for-each select="//ESADout_CU:ESADout_CU">
			<esif:ESADInfo DocumentModeID="1006151E" xmlns:esif="urn:customs.ru:Information:CustomsDocuments:ESADInfo:5.4.0" xmlns:clt_ru="urn:customs.ru:CommonLeafTypes:5.4.0" xmlns:cltESAD_cu="urn:customs.ru:CUESADCommonLeafTypes:5.4.0">
				<cat_ru:DocumentID/>
				<!--cat_ru:RefDocumentID><xsl:value-of select="cat_ru:DocumentID"/></cat_ru:RefDocumentID-->
				<esif:GTDID>
					<cat_ru:CustomsCode>
						<xsl:value-of select="$GTD/goom:GTDID/cat_ru:CustomsCode"/>
					</cat_ru:CustomsCode>
					<cat_ru:RegistrationDate>
						<xsl:value-of select="$GTD/goom:GTDID/cat_ru:RegistrationDate"/>
					</cat_ru:RegistrationDate>
					<cat_ru:GTDNumber>
						<xsl:value-of select="$GTD/goom:GTDID/cat_ru:GTDNumber"/>
					</cat_ru:GTDNumber>
				</esif:GTDID>
				<xsl:for-each select="ESADout_CU:ESADout_CUGoodsShipment/ESADout_CU:ESADout_CUConsignor">
					<esif:Consigner>
						<xsl:if test="cat_ru:OrganizationName">
							<cat_ru:OrganizationName>
								<xsl:value-of select="cat_ru:OrganizationName"/>
							</cat_ru:OrganizationName>
						</xsl:if>
						<xsl:if test="cat_ru:ShortName">
							<cat_ru:ShortName>
								<xsl:value-of select="cat_ru:ShortName"/>
							</cat_ru:ShortName>
						</xsl:if>
						<xsl:if test="cat_ru:OrganizationLanguage">
							<cat_ru:OrganizationLanguage>
								<xsl:value-of select="cat_ru:OrganizationLanguage"/>
							</cat_ru:OrganizationLanguage>
						</xsl:if>
						<xsl:if test="cat_ru:RFOrganizationFeatures | cat_ru:RKOrganizationFeatures | cat_ru:RBOrganizationFeatures">
							<xsl:choose>
								<xsl:when test="cat_ru:RFOrganizationFeatures">
									<xsl:variable name="RF" select="cat_ru:RFOrganizationFeatures"/>
									<cat_ru:RFOrganizationFeatures>
										<xsl:if test="$RF/cat_ru:OGRN">
											<cat_ru:OGRN>
												<xsl:value-of select="$RF/cat_ru:OGRN"/>
											</cat_ru:OGRN>
										</xsl:if>
										<xsl:if test="$RF/cat_ru:INN">
											<cat_ru:INN>
												<xsl:value-of select="$RF/cat_ru:INN"/>
											</cat_ru:INN>
										</xsl:if>
										<xsl:if test="$RF/cat_ru:KPP">
											<cat_ru:KPP>
												<xsl:value-of select="$RF/cat_ru:KPP"/>
											</cat_ru:KPP>
										</xsl:if>
									</cat_ru:RFOrganizationFeatures>
								</xsl:when>
								<xsl:when test="cat_ru:RKOrganizationFeatures">
									<xsl:variable name="RK" select="cat_ru:RKOrganizationFeatures"/>
									<cat_ru:RKOrganizationFeatures>
										<xsl:if test="$RK/cat_ru:BIN">
											<cat_ru:BIN>
												<xsl:value-of select="$RK/cat_ru:BIN"/>
											</cat_ru:BIN>
										</xsl:if>
										<xsl:if test="$RK/cat_ru:IIN">
											<cat_ru:IIN>
												<xsl:value-of select="$RK/cat_ru:IIN"/>
											</cat_ru:IIN>
										</xsl:if>
										<xsl:if test="$RK/cat_ru:ITN">
											<cat_ru:ITN>
												<cat_ru:CategoryCode>
													<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:CategoryCode"/>
												</cat_ru:CategoryCode>
												<cat_ru:KATOCode>
													<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:KATOCode"/>
												</cat_ru:KATOCode>
												<cat_ru:RNN>
													<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:RNN"/>
												</cat_ru:RNN>
												<xsl:if test="$RK/cat_ru:ITN/cat_ru:ITNReserv">
													<cat_ru:ITNReserv>
														<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:ITNReserv"/>
													</cat_ru:ITNReserv>
												</xsl:if>
											</cat_ru:ITN>
										</xsl:if>
									</cat_ru:RKOrganizationFeatures>
								</xsl:when>
								<xsl:otherwise>
									<xsl:variable name="RB" select="cat_ru:RBOrganizationFeatures"/>
									<cat_ru:RBOrganizationFeatures>
										<xsl:if test="$RB/cat_ru:UNP">
											<cat_ru:UNP>
												<xsl:value-of select="$RB/cat_ru:UNP"/>
											</cat_ru:UNP>
										</xsl:if>
										<xsl:if test="$RB/cat_ru:RBIdentificationNumber">
											<cat_ru:RBIdentificationNumber>
												<xsl:value-of select="$RB/cat_ru:RBIdentificationNumber"/>
											</cat_ru:RBIdentificationNumber>
										</xsl:if>
									</cat_ru:RBOrganizationFeatures>
								</xsl:otherwise>
							</xsl:choose>
						</xsl:if>
						<xsl:for-each select="cat_ru:Address">
							<esif:Address>
								<xsl:if test="cat_ru:PostalCode">
									<cat_ru:PostalCode>
										<xsl:value-of select="cat_ru:PostalCode"/>
									</cat_ru:PostalCode>
								</xsl:if>
								<xsl:if test="cat_ru:CountryCode">
									<cat_ru:CountryCode>
										<xsl:value-of select="cat_ru:CountryCode"/>
									</cat_ru:CountryCode>
								</xsl:if>
								<xsl:if test="cat_ru:CounryName">
									<cat_ru:CounryName>
										<xsl:value-of select="cat_ru:CounryName"/>
									</cat_ru:CounryName>
								</xsl:if>
								<xsl:if test="cat_ru:Region">
									<cat_ru:Region>
										<xsl:value-of select="cat_ru:Region"/>
									</cat_ru:Region>
								</xsl:if>
								<xsl:if test="cat_ru:City">
									<cat_ru:City>
										<xsl:value-of select="cat_ru:City"/>
									</cat_ru:City>
								</xsl:if>
								<xsl:if test="cat_ru:StreetHouse">
									<cat_ru:StreetHouse>
										<xsl:value-of select="cat_ru:StreetHouse"/>
									</cat_ru:StreetHouse>
								</xsl:if>
							</esif:Address>
						</xsl:for-each>
					</esif:Consigner>
				</xsl:for-each>
				<xsl:for-each select="ESADout_CU:ESADout_CUGoodsShipment/ESADout_CU:ESADout_CUConsignee">
					<esif:Consignee>
						<xsl:if test="cat_ru:OrganizationName">
							<cat_ru:OrganizationName>
								<xsl:value-of select="cat_ru:OrganizationName"/>
							</cat_ru:OrganizationName>
						</xsl:if>
						<xsl:if test="cat_ru:ShortName">
							<cat_ru:ShortName>
								<xsl:value-of select="cat_ru:ShortName"/>
							</cat_ru:ShortName>
						</xsl:if>
						<xsl:if test="cat_ru:OrganizationLanguage">
							<cat_ru:OrganizationLanguage>
								<xsl:value-of select="cat_ru:OrganizationLanguage"/>
							</cat_ru:OrganizationLanguage>
						</xsl:if>
						<xsl:if test="cat_ru:RFOrganizationFeatures | cat_ru:RKOrganizationFeatures | cat_ru:RBOrganizationFeatures">
							<xsl:choose>
								<xsl:when test="cat_ru:RFOrganizationFeatures">
									<xsl:variable name="RF" select="cat_ru:RFOrganizationFeatures"/>
									<cat_ru:RFOrganizationFeatures>
										<xsl:if test="$RF/cat_ru:OGRN">
											<cat_ru:OGRN>
												<xsl:value-of select="$RF/cat_ru:OGRN"/>
											</cat_ru:OGRN>
										</xsl:if>
										<xsl:if test="$RF/cat_ru:INN">
											<cat_ru:INN>
												<xsl:value-of select="$RF/cat_ru:INN"/>
											</cat_ru:INN>
										</xsl:if>
										<xsl:if test="$RF/cat_ru:KPP">
											<cat_ru:KPP>
												<xsl:value-of select="$RF/cat_ru:KPP"/>
											</cat_ru:KPP>
										</xsl:if>
									</cat_ru:RFOrganizationFeatures>
								</xsl:when>
								<xsl:when test="cat_ru:RKOrganizationFeatures">
									<xsl:variable name="RK" select="cat_ru:RKOrganizationFeatures"/>
									<cat_ru:RKOrganizationFeatures>
										<xsl:if test="$RK/cat_ru:BIN">
											<cat_ru:BIN>
												<xsl:value-of select="$RK/cat_ru:BIN"/>
											</cat_ru:BIN>
										</xsl:if>
										<xsl:if test="$RK/cat_ru:IIN">
											<cat_ru:IIN>
												<xsl:value-of select="$RK/cat_ru:IIN"/>
											</cat_ru:IIN>
										</xsl:if>
										<xsl:if test="$RK/cat_ru:ITN">
											<cat_ru:ITN>
												<cat_ru:CategoryCode>
													<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:CategoryCode"/>
												</cat_ru:CategoryCode>
												<cat_ru:KATOCode>
													<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:KATOCode"/>
												</cat_ru:KATOCode>
												<cat_ru:RNN>
													<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:RNN"/>
												</cat_ru:RNN>
												<xsl:if test="$RK/cat_ru:ITN/cat_ru:ITNReserv">
													<cat_ru:ITNReserv>
														<xsl:value-of select="$RK/cat_ru:ITN/cat_ru:ITNReserv"/>
													</cat_ru:ITNReserv>
												</xsl:if>
											</cat_ru:ITN>
										</xsl:if>
									</cat_ru:RKOrganizationFeatures>
								</xsl:when>
								<xsl:otherwise>
									<xsl:variable name="RB" select="cat_ru:RBOrganizationFeatures"/>
									<cat_ru:RBOrganizationFeatures>
										<xsl:if test="$RB/cat_ru:UNP">
											<cat_ru:UNP>
												<xsl:value-of select="$RB/cat_ru:UNP"/>
											</cat_ru:UNP>
										</xsl:if>
										<xsl:if test="$RB/cat_ru:RBIdentificationNumber">
											<cat_ru:RBIdentificationNumber>
												<xsl:value-of select="$RB/cat_ru:RBIdentificationNumber"/>
											</cat_ru:RBIdentificationNumber>
										</xsl:if>
									</cat_ru:RBOrganizationFeatures>
								</xsl:otherwise>
							</xsl:choose>
						</xsl:if>
						<xsl:for-each select="cat_ru:Address">
							<esif:Address>
								<xsl:if test="cat_ru:PostalCode">
									<cat_ru:PostalCode>
										<xsl:value-of select="cat_ru:PostalCode"/>
									</cat_ru:PostalCode>
								</xsl:if>
								<xsl:if test="cat_ru:CountryCode">
									<cat_ru:CountryCode>
										<xsl:value-of select="cat_ru:CountryCode"/>
									</cat_ru:CountryCode>
								</xsl:if>
								<xsl:if test="cat_ru:CounryName">
									<cat_ru:CounryName>
										<xsl:value-of select="cat_ru:CounryName"/>
									</cat_ru:CounryName>
								</xsl:if>
								<xsl:if test="cat_ru:Region">
									<cat_ru:Region>
										<xsl:value-of select="cat_ru:Region"/>
									</cat_ru:Region>
								</xsl:if>
								<xsl:if test="cat_ru:City">
									<cat_ru:City>
										<xsl:value-of select="cat_ru:City"/>
									</cat_ru:City>
								</xsl:if>
								<xsl:if test="cat_ru:StreetHouse">
									<cat_ru:StreetHouse>
										<xsl:value-of select="cat_ru:StreetHouse"/>
									</cat_ru:StreetHouse>
								</xsl:if>
							</esif:Address>
						</xsl:for-each>
					</esif:Consignee>
				</xsl:for-each>
				<xsl:for-each select="ESADout_CU:ESADout_CUGoodsShipment/ESADout_CU:ESADout_CUGoods">
					<esif:GoodsList>
						<xsl:for-each select="catESAD_cu:GoodsDescription">
							<esif:GoodsDescription>
								<xsl:value-of select=". "/>
							</esif:GoodsDescription>
						</xsl:for-each>
						<xsl:if test="catESAD_cu:GoodsTNVEDCode">
							<esif:GoodsTNVEDCode>
								<xsl:value-of select="catESAD_cu:GoodsTNVEDCode"/>
							</esif:GoodsTNVEDCode>
						</xsl:if>
						<xsl:if test="catESAD_cu:GrossWeightQuantity">
							<esif:GrossWeightQuantity>
								<xsl:value-of select="catESAD_cu:GrossWeightQuantity"/>
							</esif:GrossWeightQuantity>
						</xsl:if>
						<xsl:for-each select="ESADout_CU:ESADGoodsPackaging">
							<esif:GoodsPackaging>
								<xsl:if test="catESAD_cu:PakageQuantity">
									<catESAD_cu:PakageQuantity>
										<xsl:value-of select="catESAD_cu:PakageQuantity"/>
									</catESAD_cu:PakageQuantity>
								</xsl:if>
								<xsl:if test="catESAD_cu:PakageTypeCode">
									<catESAD_cu:PakageTypeCode>
										<xsl:value-of select="catESAD_cu:PakageTypeCode"/>
									</catESAD_cu:PakageTypeCode>
								</xsl:if>
								<xsl:if test="catESAD_cu:PakagePartQuantity">
									<catESAD_cu:PakagePartQuantity>
										<xsl:value-of select="catESAD_cu:PakagePartQuantity"/>
									</catESAD_cu:PakagePartQuantity>
								</xsl:if>
								<xsl:if test="catESAD_cu:RBCargoKind">
									<catESAD_cu:RBCargoKind>
										<xsl:value-of select="catESAD_cu:RBCargoKind"/>
									</catESAD_cu:RBCargoKind>
								</xsl:if>
								<xsl:if test="catESAD_cu:PackageCode">
									<catESAD_cu:PackageCode>
										<xsl:value-of select="catESAD_cu:PackageCode"/>
									</catESAD_cu:PackageCode>
								</xsl:if>
								<xsl:for-each select="catESAD_cu:PackingInformation">
									<catESAD_cu:PackingInformation>
										<catESAD_cu:PackingCode>
											<xsl:value-of select="catESAD_cu:PackingCode"/>
										</catESAD_cu:PackingCode>
										<xsl:if test="catESAD_cu:PakingQuantity">
											<catESAD_cu:PakingQuantity>
												<xsl:value-of select="catESAD_cu:PakingQuantity"/>
											</catESAD_cu:PakingQuantity>
										</xsl:if>
									</catESAD_cu:PackingInformation>
								</xsl:for-each>
								<xsl:for-each select="catESAD_cu:PalleteInformation">
									<catESAD_cu:PalleteInformation>
										<catESAD_cu:PalleteQuantity>
											<xsl:value-of select="catESAD_cu:PalleteQuantity"/>
										</catESAD_cu:PalleteQuantity>
										<xsl:if test="catESAD_cu:PalleteDescriptio">
											<catESAD_cu:PalleteDescription>
												<xsl:value-of select="catESAD_cu:PalleteDescriptio"/>
											</catESAD_cu:PalleteDescription>
										</xsl:if>
										<xsl:if test="catESAD_cu:PalleteCode">
											<catESAD_cu:PalleteCode>
												<xsl:value-of select="catESAD_cu:PalleteCode"/>
											</catESAD_cu:PalleteCode>
										</xsl:if>
									</catESAD_cu:PalleteInformation>
								</xsl:for-each>
								<xsl:for-each select="catESAD_cu:UnitPackInfo">
									<catESAD_cu:UnitPackInfo>
										<catESAD_cu:PackingCode>
											<xsl:value-of select="catESAD_cu:PackingCode"/>
										</catESAD_cu:PackingCode>
										<xsl:if test="catESAD_cu:PakingQuantity">
											<catESAD_cu:PakingQuantity>
												<xsl:value-of select="catESAD_cu:PakingQuantity"/>
											</catESAD_cu:PakingQuantity>
										</xsl:if>
									</catESAD_cu:UnitPackInfo>
								</xsl:for-each>
								<xsl:for-each select="catESAD_cu:CargoInfo">
									<catESAD_cu:CargoInfo>
										<catESAD_cu:PackingCode>
											<xsl:value-of select="catESAD_cu:PackingCode"/>
										</catESAD_cu:PackingCode>
										<xsl:if test="catESAD_cu:PakingQuantity">
											<catESAD_cu:PakingQuantity>
												<xsl:value-of select="catESAD_cu:PakingQuantity"/>
											</catESAD_cu:PakingQuantity>
										</xsl:if>
									</catESAD_cu:CargoInfo>
								</xsl:for-each>
							</esif:GoodsPackaging>
						</xsl:for-each>
						<xsl:for-each select="ESADout_CU:SupplementaryGoodsQuantity">
							<esif:SupplementaryQuantity>
								<cat_ru:GoodsQuantity>
									<xsl:value-of select="cat_ru:GoodsQuantity"/>
								</cat_ru:GoodsQuantity>
								<xsl:if test="cat_ru:MeasureUnitQualifierName">
									<cat_ru:MeasureUnitQualifierName>
										<xsl:value-of select="cat_ru:MeasureUnitQualifierName"/>
									</cat_ru:MeasureUnitQualifierName>
								</xsl:if>
								<xsl:if test="cat_ru:MeasureUnitQualifierCode">
									<cat_ru:MeasureUnitQualifierCode>
										<xsl:value-of select="cat_ru:MeasureUnitQualifierCode"/>
									</cat_ru:MeasureUnitQualifierCode>
								</xsl:if>
							</esif:SupplementaryQuantity>
						</xsl:for-each>
						<xsl:for-each select="ESADout_CU:ESADContainer">
							<esif:Container>
								<xsl:if test="catESAD_cu:ContainerQuantity">
									<catESAD_cu:ContainerQuantity>
										<xsl:value-of select="catESAD_cu:ContainerQuantity"/>
									</catESAD_cu:ContainerQuantity>
								</xsl:if>
								<xsl:if test="catESAD_cu:ContainerKind">
									<catESAD_cu:ContainerKind>
										<xsl:value-of select="catESAD_cu:ContainerKind"/>
									</catESAD_cu:ContainerKind>
								</xsl:if>
								<xsl:for-each select="catESAD_cu:ContainerNumber">
									<catESAD_cu:ContainerNumber>
										<catESAD_cu:ContainerIdentificaror>
											<xsl:value-of select="catESAD_cu:ContainerIdentificaror"/>
										</catESAD_cu:ContainerIdentificaror>
										<xsl:if test="catESAD_cu:FullIndicator">
											<catESAD_cu:FullIndicator>
												<xsl:if test="catESAD_cu:FullIndicator"/>
												<xsl:value-of select="catESAD_cu:FullIndicator"/>
											</catESAD_cu:FullIndicator>
										</xsl:if>
									</catESAD_cu:ContainerNumber>
								</xsl:for-each>
							</esif:Container>
						</xsl:for-each>
					</esif:GoodsList>
				</xsl:for-each>
				<xsl:for-each select="ESADout_CU:ESADout_CUGoodsShipment/ESADout_CU:ESADout_CUGoods/ESADout_CU:ESADout_CUPresentedDocument">
					<xsl:if test="substring(catESAD_cu:PresentedDocumentModeCode, 1, 2) =  '03' ">
						<esif:SupportingDocuments>
							<xsl:if test="cat_ru:PrDocumentName">
								<cat_ru:PrDocumentName>
									<xsl:value-of select="cat_ru:PrDocumentName"/>
								</cat_ru:PrDocumentName>
							</xsl:if>
							<xsl:if test="cat_ru:PrDocumentNumber">
								<cat_ru:PrDocumentNumber>
									<xsl:value-of select="cat_ru:PrDocumentNumber"/>
								</cat_ru:PrDocumentNumber>
							</xsl:if>
							<xsl:if test="cat_ru:PrDocumentDate">
								<cat_ru:PrDocumentDate>
									<xsl:value-of select="cat_ru:PrDocumentDate"/>
								</cat_ru:PrDocumentDate>
							</xsl:if>
							<esif:PresentedDocumentModeCode>
								<xsl:value-of select="catESAD_cu:PresentedDocumentModeCode"/>
							</esif:PresentedDocumentModeCode>
							<xsl:if test="catESAD_cu:DocumentBeginActionsDate">
								<esif:DocumentBeginActionsDate>
									<xsl:value-of select="catESAD_cu:DocumentBeginActionsDate"/>
								</esif:DocumentBeginActionsDate>
							</xsl:if>
							<xsl:if test="catESAD_cu:DocumentEndActionsDate">
								<esif:DocumentEndActionsDate>
									<xsl:value-of select="catESAD_cu:DocumentEndActionsDate"/>
								</esif:DocumentEndActionsDate>
							</xsl:if>
						</esif:SupportingDocuments>
					</xsl:if>
				</xsl:for-each>
				<xsl:for-each select="ESADout_CU:ESADout_CUGoodsShipment/ESADout_CU:ESADout_CUGoods/ESADout_CU:ESADout_CUPresentedDocument">
					<xsl:if test="substring(catESAD_cu:PresentedDocumentModeCode, 1, 2) =  '02'">
						<esif:TransportDocuments>
							<xsl:if test="cat_ru:PrDocumentName">
								<cat_ru:PrDocumentName>
									<xsl:value-of select="cat_ru:PrDocumentName"/>
								</cat_ru:PrDocumentName>
							</xsl:if>
							<xsl:if test="cat_ru:PrDocumentNumber">
								<cat_ru:PrDocumentNumber>
									<xsl:value-of select="cat_ru:PrDocumentNumber"/>
								</cat_ru:PrDocumentNumber>
							</xsl:if>
							<xsl:if test="cat_ru:PrDocumentDate">
								<cat_ru:PrDocumentDate>
									<xsl:value-of select="cat_ru:PrDocumentDate"/>
								</cat_ru:PrDocumentDate>
							</xsl:if>
							<esif:PresentedDocumentModeCode>
								<xsl:value-of select="catESAD_cu:PresentedDocumentModeCode"/>
							</esif:PresentedDocumentModeCode>
							<xsl:if test="catESAD_cu:DocumentBeginActionsDate">
								<esif:DocumentBeginActionsDate>
									<xsl:value-of select="catESAD_cu:DocumentBeginActionsDate"/>
								</esif:DocumentBeginActionsDate>
							</xsl:if>
							<xsl:if test="catESAD_cu:DocumentEndActionsDate">
								<esif:DocumentEndActionsDate>
									<xsl:value-of select="catESAD_cu:DocumentEndActionsDate"/>
								</esif:DocumentEndActionsDate>
							</xsl:if>
						</esif:TransportDocuments>
					</xsl:if>
				</xsl:for-each>
			</esif:ESADInfo>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
