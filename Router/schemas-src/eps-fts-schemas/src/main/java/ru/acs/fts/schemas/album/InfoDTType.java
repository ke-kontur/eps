
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPreferenciiType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;

/** 
 * Информация из ДТ
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InfoDTType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:date" name="DataVer"/>
 *         &lt;xs:element type="xs:string" name="FrontierCustomsCode" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="LNP" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="CustomsProcedure"/>
 *         &lt;xs:element type="xs:string" name="ElectronicDocumentSign" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="DeclarationKind" minOccurs="0"/>
 *         &lt;xs:element name="GoodsShipment">
 *           &lt;xs:complexType>
 *             &lt;xs:sequence>
 *               &lt;xs:element type="xs:string" name="TotalGoodsNumber"/>
 *               &lt;xs:element type="xs:string" name="TotalPackageNumber" minOccurs="0"/>
 *               &lt;xs:element name="Consignor" minOccurs="0">
 *                 &lt;!-- Reference to inner class Consignor -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="Consignee" minOccurs="0">
 *                 &lt;!-- Reference to inner class Consignee -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="FinancialAdjustingResponsiblePerson" minOccurs="0">
 *                 &lt;!-- Reference to inner class FinancialAdjustingResponsiblePerson -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="Declarant" minOccurs="0">
 *                 &lt;!-- Reference to inner class Declarant -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="DTFilledPerson" minOccurs="0">
 *                 &lt;!-- Reference to inner class DTFilledPerson -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="DTGoodsLocation" minOccurs="0" maxOccurs="unbounded">
 *                 &lt;!-- Reference to inner class DTGoodsLocation -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="DTConsigment" minOccurs="0">
 *                 &lt;!-- Reference to inner class DTConsigment -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="DTMainContractTerms" minOccurs="0">
 *                 &lt;!-- Reference to inner class DTMainContractTerms -->
 *               &lt;/xs:element>
 *               &lt;xs:element name="DTGoods" maxOccurs="unbounded">
 *                 &lt;!-- Reference to inner class DTGoods -->
 *               &lt;/xs:element>
 *             &lt;/xs:sequence>
 *           &lt;/xs:complexType>
 *         &lt;/xs:element>
 *         &lt;xs:element type="ns1:GTDIDType" name="DTNumber"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="R101000E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InfoDTType extends BaseDocType
{
    private LocalDate dataVer;
    private String frontierCustomsCode;
    private String LNP;
    private String customsProcedure;
    private String electronicDocumentSign;
    private String declarationKind;
    private String goodsShipmentTotalGoodsNumber;
    private String goodsShipmentTotalPackageNumber;
    private Consignor consignor;
    private Consignee consignee;
    private FinancialAdjustingResponsiblePerson financialAdjustingResponsiblePerson;
    private Declarant declarant;
    private DTFilledPerson DTFilledPerson1;
    private List<DTGoodsLocation> DTGoodsLocationList = new ArrayList<DTGoodsLocation>();
    private DTConsigment DTConsigment1;
    private DTMainContractTerms DTMainContractTerms1;
    private List<DTGoods> DTGoodList = new ArrayList<DTGoods>();
    private GTDIDType DTNumber;
    private String documentModeID;

    /** 
     * Get the 'DataVer' element value. Дата введения в действие версии внутреннего формата эДТ
     * 
     * @return value
     */
    public LocalDate getDataVer() {
        return dataVer;
    }

    /** 
     * Set the 'DataVer' element value. Дата введения в действие версии внутреннего формата эДТ
     * 
     * @param dataVer
     */
    public void setDataVer(LocalDate dataVer) {
        this.dataVer = dataVer;
    }

    /** 
     * Get the 'FrontierCustomsCode' element value. Код приграничного таможенного органа
     * 
     * @return value
     */
    public String getFrontierCustomsCode() {
        return frontierCustomsCode;
    }

    /** 
     * Set the 'FrontierCustomsCode' element value. Код приграничного таможенного органа
     * 
     * @param frontierCustomsCode
     */
    public void setFrontierCustomsCode(String frontierCustomsCode) {
        this.frontierCustomsCode = frontierCustomsCode;
    }

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица, принявшего решение по товарам ДТ
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица, принявшего решение по товарам ДТ
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'CustomsProcedure' element value. ИМ, ЭК. ТТ. Первый подраздел гр.1 ДТ
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ИМ, ЭК. ТТ. Первый подраздел гр.1 ДТ
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования ДТ в форме электронного документа
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования ДТ в форме электронного документа
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'DeclarationKind' element value. Код особенности декларирования товаров по Классификатору особенностей таможенного декларирования товаров. Гр.7 ДТ
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Код особенности декларирования товаров по Классификатору особенностей таможенного декларирования товаров. Гр.7 ДТ
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'TotalGoodsNumber' element value. Всего наименований товаров.
     * 
     * @return value
     */
    public String getGoodsShipmentTotalGoodsNumber() {
        return goodsShipmentTotalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. Всего наименований товаров.
     * 
     * @param goodsShipmentTotalGoodsNumber
     */
    public void setGoodsShipmentTotalGoodsNumber(
            String goodsShipmentTotalGoodsNumber) {
        this.goodsShipmentTotalGoodsNumber = goodsShipmentTotalGoodsNumber;
    }

    /** 
     * Get the 'TotalPackageNumber' element value. Общее количество грузовых мест.
     * 
     * @return value
     */
    public String getGoodsShipmentTotalPackageNumber() {
        return goodsShipmentTotalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. Общее количество грузовых мест.
     * 
     * @param goodsShipmentTotalPackageNumber
     */
    public void setGoodsShipmentTotalPackageNumber(
            String goodsShipmentTotalPackageNumber) {
        this.goodsShipmentTotalPackageNumber = goodsShipmentTotalPackageNumber;
    }

    /** 
     * Get the 'Consignor' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public Consignor getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения о товарной партии
     * 
     * @param consignor
     */
    public void setConsignor(Consignor consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public Consignee getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о товарной партии
     * 
     * @param consignee
     */
    public void setConsignee(Consignee consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'FinancialAdjustingResponsiblePerson' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public FinancialAdjustingResponsiblePerson getFinancialAdjustingResponsiblePerson() {
        return financialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'FinancialAdjustingResponsiblePerson' element value. Сведения о товарной партии
     * 
     * @param financialAdjustingResponsiblePerson
     */
    public void setFinancialAdjustingResponsiblePerson(
            FinancialAdjustingResponsiblePerson financialAdjustingResponsiblePerson) {
        this.financialAdjustingResponsiblePerson = financialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public Declarant getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о товарной партии
     * 
     * @param declarant
     */
    public void setDeclarant(Declarant declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'DTFilledPerson' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public DTFilledPerson getDTFilledPerson1() {
        return DTFilledPerson1;
    }

    /** 
     * Set the 'DTFilledPerson' element value. Сведения о товарной партии
     * 
     * @param DTFilledPerson1
     */
    public void setDTFilledPerson1(DTFilledPerson DTFilledPerson1) {
        this.DTFilledPerson1 = DTFilledPerson1;
    }

    /** 
     * Get the list of 'DTGoodsLocation' element items. Сведения о товарной партии
     * 
     * @return list
     */
    public List<DTGoodsLocation> getDTGoodsLocationList() {
        return DTGoodsLocationList;
    }

    /** 
     * Set the list of 'DTGoodsLocation' element items. Сведения о товарной партии
     * 
     * @param list
     */
    public void setDTGoodsLocationList(List<DTGoodsLocation> list) {
        DTGoodsLocationList = list;
    }

    /** 
     * Get the 'DTConsigment' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public DTConsigment getDTConsigment1() {
        return DTConsigment1;
    }

    /** 
     * Set the 'DTConsigment' element value. Сведения о товарной партии
     * 
     * @param DTConsigment1
     */
    public void setDTConsigment1(DTConsigment DTConsigment1) {
        this.DTConsigment1 = DTConsigment1;
    }

    /** 
     * Get the 'DTMainContractTerms' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public DTMainContractTerms getDTMainContractTerms1() {
        return DTMainContractTerms1;
    }

    /** 
     * Set the 'DTMainContractTerms' element value. Сведения о товарной партии
     * 
     * @param DTMainContractTerms1
     */
    public void setDTMainContractTerms1(DTMainContractTerms DTMainContractTerms1) {
        this.DTMainContractTerms1 = DTMainContractTerms1;
    }

    /** 
     * Get the list of 'DTGoods' element items. Сведения о товарной партии
     * 
     * @return list
     */
    public List<DTGoods> getDTGoodList() {
        return DTGoodList;
    }

    /** 
     * Set the list of 'DTGoods' element items. Сведения о товарной партии
     * 
     * @param list
     */
    public void setDTGoodList(List<DTGoods> list) {
        DTGoodList = list;
    }

    /** 
     * Get the 'DTNumber' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. Регистрационный номер ДТ
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
    /** 
     * Сведения об отправителе товаров
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Consignor" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OrganizationInfoType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns1:AddressType" name="Address" minOccurs="0"/>
     *         &lt;/xs:sequence>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Consignor extends OrganizationInfoType
    {
        private AddressType address;

        /** 
         * Get the 'Address' element value. Адрес организации
         * 
         * @return value
         */
        public AddressType getAddress() {
            return address;
        }

        /** 
         * Set the 'Address' element value. Адрес организации
         * 
         * @param address
         */
        public void setAddress(AddressType address) {
            this.address = address;
        }
    }
    /** 
     * Сведения о получателе товаров
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Consignee" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OrganizationInfoType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns1:AddressType" name="Address" minOccurs="0"/>
     *         &lt;/xs:sequence>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Consignee extends OrganizationInfoType
    {
        private AddressType address;

        /** 
         * Get the 'Address' element value. Адрес организации
         * 
         * @return value
         */
        public AddressType getAddress() {
            return address;
        }

        /** 
         * Set the 'Address' element value. Адрес организации
         * 
         * @param address
         */
        public void setAddress(AddressType address) {
            this.address = address;
        }
    }
    /** 
     * Лицо, ответственное за финансовое урегулирование
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FinancialAdjustingResponsiblePerson" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OrganizationInfoType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns1:AddressType" name="Address" minOccurs="0"/>
     *         &lt;/xs:sequence>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FinancialAdjustingResponsiblePerson
            extends
                OrganizationInfoType
    {
        private AddressType address;

        /** 
         * Get the 'Address' element value. Адрес организации
         * 
         * @return value
         */
        public AddressType getAddress() {
            return address;
        }

        /** 
         * Set the 'Address' element value. Адрес организации
         * 
         * @param address
         */
        public void setAddress(AddressType address) {
            this.address = address;
        }
    }
    /** 
     * Сведения о декларанте товаров
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Declarant" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OrganizationInfoType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns1:AddressType" name="Address" minOccurs="0"/>
     *         &lt;/xs:sequence>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Declarant extends OrganizationInfoType
    {
        private AddressType address;

        /** 
         * Get the 'Address' element value. Адрес организации
         * 
         * @return value
         */
        public AddressType getAddress() {
            return address;
        }

        /** 
         * Set the 'Address' element value. Адрес организации
         * 
         * @param address
         */
        public void setAddress(AddressType address) {
            this.address = address;
        }
    }
    /** 
     * Сведения о лице, заполнившем декларацию. Гр. 54/ гр 50 ТД 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTFilledPerson" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="CustomsRepresCertificate" minOccurs="0">
     *         &lt;!-- Reference to inner class CustomsRepresCertificate -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class DTFilledPerson
    {
        private CustomsRepresCertificate customsRepresCertificate;

        /** 
         * Get the 'CustomsRepresCertificate' element value.
         * 
         * @return value
         */
        public CustomsRepresCertificate getCustomsRepresCertificate() {
            return customsRepresCertificate;
        }

        /** 
         * Set the 'CustomsRepresCertificate' element value.
         * 
         * @param customsRepresCertificate
         */
        public void setCustomsRepresCertificate(
                CustomsRepresCertificate customsRepresCertificate) {
            this.customsRepresCertificate = customsRepresCertificate;
        }
        /** 
         * Документ, свидетельствующий о включении лица  в Реестр таможенных представителей
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CustomsRepresCertificate" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="PrDocumentNumber" minOccurs="0"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class CustomsRepresCertificate
        {
            private String prDocumentNumber;

            /** 
             * Get the 'PrDocumentNumber' element value. Номер документа, свидетельствующего о включении лица  в Реестр таможенных представителей. 
             * 
             * @return value
             */
            public String getPrDocumentNumber() {
                return prDocumentNumber;
            }

            /** 
             * Set the 'PrDocumentNumber' element value. Номер документа, свидетельствующего о включении лица  в Реестр таможенных представителей. 
             * 
             * @param prDocumentNumber
             */
            public void setPrDocumentNumber(String prDocumentNumber) {
                this.prDocumentNumber = prDocumentNumber;
            }
        }
    }
    /** 
     * Местонахождение товаров. Гр. 30 ДТ
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTGoodsLocation" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="CustomsOffice" minOccurs="0"/>
     *       &lt;xs:element name="GoodsLocationWarehouse" minOccurs="0">
     *         &lt;!-- Reference to inner class GoodsLocationWarehouse -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class DTGoodsLocation
    {
        private String customsOffice;
        private GoodsLocationWarehouse goodsLocationWarehouse;

        /** 
         * Get the 'CustomsOffice' element value. Код таможенного органа
         * 
         * @return value
         */
        public String getCustomsOffice() {
            return customsOffice;
        }

        /** 
         * Set the 'CustomsOffice' element value. Код таможенного органа
         * 
         * @param customsOffice
         */
        public void setCustomsOffice(String customsOffice) {
            this.customsOffice = customsOffice;
        }

        /** 
         * Get the 'GoodsLocationWarehouse' element value.
         * 
         * @return value
         */
        public GoodsLocationWarehouse getGoodsLocationWarehouse() {
            return goodsLocationWarehouse;
        }

        /** 
         * Set the 'GoodsLocationWarehouse' element value.
         * 
         * @param goodsLocationWarehouse
         */
        public void setGoodsLocationWarehouse(
                GoodsLocationWarehouse goodsLocationWarehouse) {
            this.goodsLocationWarehouse = goodsLocationWarehouse;
        }
        /** 
         * Сведения о местонахождении товаров: таможенный склад, склад временного хранения, свободный склад, склад получателя, иные
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsLocationWarehouse" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="PrDocumentNumber" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="DocumentModeCode" minOccurs="0"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class GoodsLocationWarehouse
        {
            private String prDocumentNumber;
            private String documentModeCode;

            /** 
             * Get the 'PrDocumentNumber' element value. Номер документа
             * 
             * @return value
             */
            public String getPrDocumentNumber() {
                return prDocumentNumber;
            }

            /** 
             * Set the 'PrDocumentNumber' element value. Номер документа
             * 
             * @param prDocumentNumber
             */
            public void setPrDocumentNumber(String prDocumentNumber) {
                this.prDocumentNumber = prDocumentNumber;
            }

            /** 
             * Get the 'DocumentModeCode' element value. Тип документа:1-Лицензия 2-Свидетельство
             * 
             * @return value
             */
            public String getDocumentModeCode() {
                return documentModeCode;
            }

            /** 
             * Set the 'DocumentModeCode' element value. Тип документа:1-Лицензия 2-Свидетельство
             * 
             * @param documentModeCode
             */
            public void setDocumentModeCode(String documentModeCode) {
                this.documentModeCode = documentModeCode;
            }
        }
    }
    /** 
     * Сведения о перевозке товаров
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTConsigment" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="ContainerIndicator" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="DispatchCountryCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="DestinationCountryCode" minOccurs="0"/>
     *       &lt;xs:element name="BorderCustomsOffice" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class BorderCustomsOffice -->
     *       &lt;/xs:element>
     *       &lt;xs:element type="ns:DTTransportType" name="DTDepartureArrivalTransport" minOccurs="0"/>
     *       &lt;xs:element type="ns:DTTransportType" name="DTBorderTransport" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class DTConsigment
    {
        private String containerIndicator;
        private String dispatchCountryCode;
        private String destinationCountryCode;
        private List<BorderCustomsOffice> borderCustomsOfficeList = new ArrayList<BorderCustomsOffice>();
        private DTTransportType DTDepartureArrivalTransport;
        private DTTransportType DTBorderTransport;

        /** 
         * Get the 'ContainerIndicator' element value. Признак контейнерных перевозок. Гр.19 
         * 
         * @return value
         */
        public String getContainerIndicator() {
            return containerIndicator;
        }

        /** 
         * Set the 'ContainerIndicator' element value. Признак контейнерных перевозок. Гр.19 
         * 
         * @param containerIndicator
         */
        public void setContainerIndicator(String containerIndicator) {
            this.containerIndicator = containerIndicator;
        }

        /** 
         * Get the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по  классификатору стран мира .гр 15, подраздел a 
         * 
         * @return value
         */
        public String getDispatchCountryCode() {
            return dispatchCountryCode;
        }

        /** 
         * Set the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по  классификатору стран мира .гр 15, подраздел a 
         * 
         * @param dispatchCountryCode
         */
        public void setDispatchCountryCode(String dispatchCountryCode) {
            this.dispatchCountryCode = dispatchCountryCode;
        }

        /** 
         * Get the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по классификатору стран мира / 00 (неизвестна). Гр 17, подраздел a
         * 
         * @return value
         */
        public String getDestinationCountryCode() {
            return destinationCountryCode;
        }

        /** 
         * Set the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по классификатору стран мира / 00 (неизвестна). Гр 17, подраздел a
         * 
         * @param destinationCountryCode
         */
        public void setDestinationCountryCode(String destinationCountryCode) {
            this.destinationCountryCode = destinationCountryCode;
        }

        /** 
         * Get the list of 'BorderCustomsOffice' element items.
         * 
         * @return list
         */
        public List<BorderCustomsOffice> getBorderCustomsOfficeList() {
            return borderCustomsOfficeList;
        }

        /** 
         * Set the list of 'BorderCustomsOffice' element items.
         * 
         * @param list
         */
        public void setBorderCustomsOfficeList(List<BorderCustomsOffice> list) {
            borderCustomsOfficeList = list;
        }

        /** 
         * Get the 'DTDepartureArrivalTransport' element value. Транспортные средства при прибытии/убытии. Гр. 18, 26
         * 
         * @return value
         */
        public DTTransportType getDTDepartureArrivalTransport() {
            return DTDepartureArrivalTransport;
        }

        /** 
         * Set the 'DTDepartureArrivalTransport' element value. Транспортные средства при прибытии/убытии. Гр. 18, 26
         * 
         * @param DTDepartureArrivalTransport
         */
        public void setDTDepartureArrivalTransport(
                DTTransportType DTDepartureArrivalTransport) {
            this.DTDepartureArrivalTransport = DTDepartureArrivalTransport;
        }

        /** 
         * Get the 'DTBorderTransport' element value. Транспортные средства на границе. Гр. 21, 25  ДТ
         * 
         * @return value
         */
        public DTTransportType getDTBorderTransport() {
            return DTBorderTransport;
        }

        /** 
         * Set the 'DTBorderTransport' element value. Транспортные средства на границе. Гр. 21, 25  ДТ
         * 
         * @param DTBorderTransport
         */
        public void setDTBorderTransport(DTTransportType DTBorderTransport) {
            this.DTBorderTransport = DTBorderTransport;
        }
        /** 
         * Таможенный орган въезда/выезда. Гр.29
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BorderCustomsOffice" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="Code"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class BorderCustomsOffice
        {
            private String code;

            /** 
             * Get the 'Code' element value. Код таможенного органа
             * 
             * @return value
             */
            public String getCode() {
                return code;
            }

            /** 
             * Set the 'Code' element value. Код таможенного органа
             * 
             * @param code
             */
            public void setCode(String code) {
                this.code = code;
            }
        }
    }
    /** 
     * Условия сделки
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTMainContractTerms" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="ContractCurrencyCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="ContractCurrencyRate" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="TotalInvoiceAmount" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="TradeCountryCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="DealFeatureCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="DealNatureCode" minOccurs="0"/>
     *       &lt;xs:element name="DTDeliveryTerms" minOccurs="0">
     *         &lt;!-- Reference to inner class DTDeliveryTerms -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class DTMainContractTerms
    {
        private String contractCurrencyCode;
        private String contractCurrencyRate;
        private String totalInvoiceAmount;
        private String tradeCountryCode;
        private String dealFeatureCode;
        private String dealNatureCode;
        private DTDeliveryTerms DTDeliveryTerms1;

        /** 
         * Get the 'ContractCurrencyCode' element value. Трехзначный буквенный в графе 22 код валюты цены договора/ платежа (оценки). По Классификатору валют. 
         * 
         * @return value
         */
        public String getContractCurrencyCode() {
            return contractCurrencyCode;
        }

        /** 
         * Set the 'ContractCurrencyCode' element value. Трехзначный буквенный в графе 22 код валюты цены договора/ платежа (оценки). По Классификатору валют. 
         * 
         * @param contractCurrencyCode
         */
        public void setContractCurrencyCode(String contractCurrencyCode) {
            this.contractCurrencyCode = contractCurrencyCode;
        }

        /** 
         * Get the 'ContractCurrencyRate' element value. Курс валюты цены договора/ платежа (оценки).
         * 
         * @return value
         */
        public String getContractCurrencyRate() {
            return contractCurrencyRate;
        }

        /** 
         * Set the 'ContractCurrencyRate' element value. Курс валюты цены договора/ платежа (оценки).
         * 
         * @param contractCurrencyRate
         */
        public void setContractCurrencyRate(String contractCurrencyRate) {
            this.contractCurrencyRate = contractCurrencyRate;
        }

        /** 
         * Get the 'TotalInvoiceAmount' element value. Общая стоимость товаров. Гр 22 подраздел 2. 
         * 
         * @return value
         */
        public String getTotalInvoiceAmount() {
            return totalInvoiceAmount;
        }

        /** 
         * Set the 'TotalInvoiceAmount' element value. Общая стоимость товаров. Гр 22 подраздел 2. 
         * 
         * @param totalInvoiceAmount
         */
        public void setTotalInvoiceAmount(String totalInvoiceAmount) {
            this.totalInvoiceAmount = totalInvoiceAmount;
        }

        /** 
         * Get the 'TradeCountryCode' element value. Буквенный код торгующей страны по классификатору стран мира. Гр.11, 1-й подраздел ДТ
         * 
         * @return value
         */
        public String getTradeCountryCode() {
            return tradeCountryCode;
        }

        /** 
         * Set the 'TradeCountryCode' element value. Буквенный код торгующей страны по классификатору стран мира. Гр.11, 1-й подраздел ДТ
         * 
         * @param tradeCountryCode
         */
        public void setTradeCountryCode(String tradeCountryCode) {
            this.tradeCountryCode = tradeCountryCode;
        }

        /** 
         * Get the 'DealFeatureCode' element value. Код особенности сделки (договора). В соответствии с Классификатором особенности внешнеэкономической сделки, используемым в государствах-членах Таможенного союза. Гр. 24 ДТ
         * 
         * @return value
         */
        public String getDealFeatureCode() {
            return dealFeatureCode;
        }

        /** 
         * Set the 'DealFeatureCode' element value. Код особенности сделки (договора). В соответствии с Классификатором особенности внешнеэкономической сделки, используемым в государствах-членах Таможенного союза. Гр. 24 ДТ
         * 
         * @param dealFeatureCode
         */
        public void setDealFeatureCode(String dealFeatureCode) {
            this.dealFeatureCode = dealFeatureCode;
        }

        /** 
         * Get the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами в соответствии с Классификатором характера сделки, используемым в государствах-членах Таможенного союза. Гр.24 ДТ
         * 
         * @return value
         */
        public String getDealNatureCode() {
            return dealNatureCode;
        }

        /** 
         * Set the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами в соответствии с Классификатором характера сделки, используемым в государствах-членах Таможенного союза. Гр.24 ДТ
         * 
         * @param dealNatureCode
         */
        public void setDealNatureCode(String dealNatureCode) {
            this.dealNatureCode = dealNatureCode;
        }

        /** 
         * Get the 'DTDeliveryTerms' element value.
         * 
         * @return value
         */
        public DTDeliveryTerms getDTDeliveryTerms1() {
            return DTDeliveryTerms1;
        }

        /** 
         * Set the 'DTDeliveryTerms' element value.
         * 
         * @param DTDeliveryTerms1
         */
        public void setDTDeliveryTerms1(DTDeliveryTerms DTDeliveryTerms1) {
            this.DTDeliveryTerms1 = DTDeliveryTerms1;
        }
        /** 
         * Условия поставки товаров. Гр. 20 ДТ
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTDeliveryTerms" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="DeliveryTermsStringCode" minOccurs="0"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class DTDeliveryTerms
        {
            private String deliveryTermsStringCode;

            /** 
             * Get the 'DeliveryTermsStringCode' element value. Код условий поставки в соответствии с Классификатором условий поставки.
             * 
             * @return value
             */
            public String getDeliveryTermsStringCode() {
                return deliveryTermsStringCode;
            }

            /** 
             * Set the 'DeliveryTermsStringCode' element value. Код условий поставки в соответствии с Классификатором условий поставки.
             * 
             * @param deliveryTermsStringCode
             */
            public void setDeliveryTermsStringCode(
                    String deliveryTermsStringCode) {
                this.deliveryTermsStringCode = deliveryTermsStringCode;
            }
        }
    }
    /** 
     * Товарная часть Гр. 31-47.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:ns1="urn:customs.ru:CUESADCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTGoods" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="GoodsNumeric"/>
     *       &lt;xs:element type="xs:string" name="GoodsDescription"/>
     *       &lt;xs:element type="xs:string" name="GrossWeightQuantity" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="NetWeightQuantity" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="CustomsCost" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="StatisticalCost" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="GoodsTNVEDCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="GoodsClassificationCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="OriginCountryCode" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="CustomsCostCorrectMethod" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="GoodsAddTNVEDCode" minOccurs="0"/>
     *       &lt;xs:element name="GoodsGroupInformation" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class GoodsGroupInformation -->
     *       &lt;/xs:element>
     *       &lt;xs:element type="ns1:CUPreferenciiType" name="Preferencii" minOccurs="0"/>
     *       &lt;xs:element name="DTPresentedDocument" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class DTPresentedDocument -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="DTCustomsPaymentCalculation" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class DTCustomsPaymentCalculation -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="SupplementaryGoodsQuantity" minOccurs="0">
     *         &lt;!-- Reference to inner class SupplementaryGoodsQuantity -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="GoodsPackaging" minOccurs="0">
     *         &lt;!-- Reference to inner class GoodsPackaging -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="DTContainer" minOccurs="0">
     *         &lt;!-- Reference to inner class DTContainer -->
     *       &lt;/xs:element>
     *       &lt;xs:element type="ns1:ESADCustomsProcedureType" name="DTCustomsProcedure" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class DTGoods
    {
        private String goodsNumeric;
        private String goodsDescription;
        private String grossWeightQuantity;
        private String netWeightQuantity;
        private String customsCost;
        private String statisticalCost;
        private String goodsTNVEDCode;
        private String goodsClassificationCode;
        private String originCountryCode;
        private String customsCostCorrectMethod;
        private String goodsAddTNVEDCode;
        private List<GoodsGroupInformation> goodsGroupInformationList = new ArrayList<GoodsGroupInformation>();
        private CUPreferenciiType preferencii;
        private List<DTPresentedDocument> DTPresentedDocumentList = new ArrayList<DTPresentedDocument>();
        private List<DTCustomsPaymentCalculation> DTCustomsPaymentCalculationList = new ArrayList<DTCustomsPaymentCalculation>();
        private SupplementaryGoodsQuantity supplementaryGoodsQuantity;
        private GoodsPackaging goodsPackaging;
        private DTContainer DTContainer1;
        private ESADCustomsProcedureType DTCustomsProcedure;

        /** 
         * Get the 'GoodsNumeric' element value. Порядковый номер декларируемого  товара / номер товара по списку/ номер корректируемого товара.  Гр.32
         * 
         * @return value
         */
        public String getGoodsNumeric() {
            return goodsNumeric;
        }

        /** 
         * Set the 'GoodsNumeric' element value. Порядковый номер декларируемого  товара / номер товара по списку/ номер корректируемого товара.  Гр.32
         * 
         * @param goodsNumeric
         */
        public void setGoodsNumeric(String goodsNumeric) {
            this.goodsNumeric = goodsNumeric;
        }

        /** 
         * Get the 'GoodsDescription' element value. Наименование (торговое, коммерческое или иное традиционное наименование) товаров/ "Товары согласно прилагаемому Списку". Гр.31 первый подраздел
         * 
         * @return value
         */
        public String getGoodsDescription() {
            return goodsDescription;
        }

        /** 
         * Set the 'GoodsDescription' element value. Наименование (торговое, коммерческое или иное традиционное наименование) товаров/ "Товары согласно прилагаемому Списку". Гр.31 первый подраздел
         * 
         * @param goodsDescription
         */
        public void setGoodsDescription(String goodsDescription) {
            this.goodsDescription = goodsDescription;
        }

        /** 
         * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг). Гр. 35
         * 
         * @return value
         */
        public String getGrossWeightQuantity() {
            return grossWeightQuantity;
        }

        /** 
         * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг). Гр. 35
         * 
         * @param grossWeightQuantity
         */
        public void setGrossWeightQuantity(String grossWeightQuantity) {
            this.grossWeightQuantity = grossWeightQuantity;
        }

        /** 
         * Get the 'NetWeightQuantity' element value. Вес товара, нетто (кг). Гр.38
         * 
         * @return value
         */
        public String getNetWeightQuantity() {
            return netWeightQuantity;
        }

        /** 
         * Set the 'NetWeightQuantity' element value. Вес товара, нетто (кг). Гр.38
         * 
         * @param netWeightQuantity
         */
        public void setNetWeightQuantity(String netWeightQuantity) {
            this.netWeightQuantity = netWeightQuantity;
        }

        /** 
         * Get the 'CustomsCost' element value. Таможенная стоимость товара. Гр.45 ДТ/ гр 45 КТС левый подраздел 
         * 
         * @return value
         */
        public String getCustomsCost() {
            return customsCost;
        }

        /** 
         * Set the 'CustomsCost' element value. Таможенная стоимость товара. Гр.45 ДТ/ гр 45 КТС левый подраздел 
         * 
         * @param customsCost
         */
        public void setCustomsCost(String customsCost) {
            this.customsCost = customsCost;
        }

        /** 
         * Get the 'StatisticalCost' element value. Статистическая стоимость товара. Гр. 46 ДТ/КТС
         * 
         * @return value
         */
        public String getStatisticalCost() {
            return statisticalCost;
        }

        /** 
         * Set the 'StatisticalCost' element value. Статистическая стоимость товара. Гр. 46 ДТ/КТС
         * 
         * @param statisticalCost
         */
        public void setStatisticalCost(String statisticalCost) {
            this.statisticalCost = statisticalCost;
        }

        /** 
         * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС. Гр.33 первый раздел
         * 
         * @return value
         */
        public String getGoodsTNVEDCode() {
            return goodsTNVEDCode;
        }

        /** 
         * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС. Гр.33 первый раздел
         * 
         * @param goodsTNVEDCode
         */
        public void setGoodsTNVEDCode(String goodsTNVEDCode) {
            this.goodsTNVEDCode = goodsTNVEDCode;
        }

        /** 
         * Get the 'GoodsClassificationCode' element value. Особенность классификации кода: 1 - общий "О", 2 - товар списка. В остальных случаях не заполняется
         * 
         * @return value
         */
        public String getGoodsClassificationCode() {
            return goodsClassificationCode;
        }

        /** 
         * Set the 'GoodsClassificationCode' element value. Особенность классификации кода: 1 - общий "О", 2 - товар списка. В остальных случаях не заполняется
         * 
         * @param goodsClassificationCode
         */
        public void setGoodsClassificationCode(String goodsClassificationCode) {
            this.goodsClassificationCode = goodsClassificationCode;
        }

        /** 
         * Get the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира / "EU" / 00 (неизвестна)  Гр.34 в ДТ/КТС
         * 
         * @return value
         */
        public String getOriginCountryCode() {
            return originCountryCode;
        }

        /** 
         * Set the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира / "EU" / 00 (неизвестна)  Гр.34 в ДТ/КТС
         * 
         * @param originCountryCode
         */
        public void setOriginCountryCode(String originCountryCode) {
            this.originCountryCode = originCountryCode;
        }

        /** 
         * Get the 'CustomsCostCorrectMethod' element value. Код метода определения таможенной стоимости. В соответствии с Классификатором методов определения таможенной стоимости. Гр. 43 в ДТ/КТС. 
         * 
         * @return value
         */
        public String getCustomsCostCorrectMethod() {
            return customsCostCorrectMethod;
        }

        /** 
         * Set the 'CustomsCostCorrectMethod' element value. Код метода определения таможенной стоимости. В соответствии с Классификатором методов определения таможенной стоимости. Гр. 43 в ДТ/КТС. 
         * 
         * @param customsCostCorrectMethod
         */
        public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
            this.customsCostCorrectMethod = customsCostCorrectMethod;
        }

        /** 
         * Get the 'GoodsAddTNVEDCode' element value. Код  товара в соответствии с Классификатором дополнительной таможенной информации для РФ и РК
         * 
         * @return value
         */
        public String getGoodsAddTNVEDCode() {
            return goodsAddTNVEDCode;
        }

        /** 
         * Set the 'GoodsAddTNVEDCode' element value. Код  товара в соответствии с Классификатором дополнительной таможенной информации для РФ и РК
         * 
         * @param goodsAddTNVEDCode
         */
        public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
            this.goodsAddTNVEDCode = goodsAddTNVEDCode;
        }

        /** 
         * Get the list of 'GoodsGroupInformation' element items.
         * 
         * @return list
         */
        public List<GoodsGroupInformation> getGoodsGroupInformationList() {
            return goodsGroupInformationList;
        }

        /** 
         * Set the list of 'GoodsGroupInformation' element items.
         * 
         * @param list
         */
        public void setGoodsGroupInformationList(
                List<GoodsGroupInformation> list) {
            goodsGroupInformationList = list;
        }

        /** 
         * Get the 'Preferencii' element value. Преференции в соответствии с Классификатором льгот по уплате таможенных платежей. Гр.36
         * 
         * @return value
         */
        public CUPreferenciiType getPreferencii() {
            return preferencii;
        }

        /** 
         * Set the 'Preferencii' element value. Преференции в соответствии с Классификатором льгот по уплате таможенных платежей. Гр.36
         * 
         * @param preferencii
         */
        public void setPreferencii(CUPreferenciiType preferencii) {
            this.preferencii = preferencii;
        }

        /** 
         * Get the list of 'DTPresentedDocument' element items.
         * 
         * @return list
         */
        public List<DTPresentedDocument> getDTPresentedDocumentList() {
            return DTPresentedDocumentList;
        }

        /** 
         * Set the list of 'DTPresentedDocument' element items.
         * 
         * @param list
         */
        public void setDTPresentedDocumentList(List<DTPresentedDocument> list) {
            DTPresentedDocumentList = list;
        }

        /** 
         * Get the list of 'DTCustomsPaymentCalculation' element items.
         * 
         * @return list
         */
        public List<DTCustomsPaymentCalculation> getDTCustomsPaymentCalculationList() {
            return DTCustomsPaymentCalculationList;
        }

        /** 
         * Set the list of 'DTCustomsPaymentCalculation' element items.
         * 
         * @param list
         */
        public void setDTCustomsPaymentCalculationList(
                List<DTCustomsPaymentCalculation> list) {
            DTCustomsPaymentCalculationList = list;
        }

        /** 
         * Get the 'SupplementaryGoodsQuantity' element value.
         * 
         * @return value
         */
        public SupplementaryGoodsQuantity getSupplementaryGoodsQuantity() {
            return supplementaryGoodsQuantity;
        }

        /** 
         * Set the 'SupplementaryGoodsQuantity' element value.
         * 
         * @param supplementaryGoodsQuantity
         */
        public void setSupplementaryGoodsQuantity(
                SupplementaryGoodsQuantity supplementaryGoodsQuantity) {
            this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
        }

        /** 
         * Get the 'GoodsPackaging' element value.
         * 
         * @return value
         */
        public GoodsPackaging getGoodsPackaging() {
            return goodsPackaging;
        }

        /** 
         * Set the 'GoodsPackaging' element value.
         * 
         * @param goodsPackaging
         */
        public void setGoodsPackaging(GoodsPackaging goodsPackaging) {
            this.goodsPackaging = goodsPackaging;
        }

        /** 
         * Get the 'DTContainer' element value.
         * 
         * @return value
         */
        public DTContainer getDTContainer1() {
            return DTContainer1;
        }

        /** 
         * Set the 'DTContainer' element value.
         * 
         * @param DTContainer1
         */
        public void setDTContainer1(DTContainer DTContainer1) {
            this.DTContainer1 = DTContainer1;
        }

        /** 
         * Get the 'DTCustomsProcedure' element value. Процедура.Гр 37
         * 
         * @return value
         */
        public ESADCustomsProcedureType getDTCustomsProcedure() {
            return DTCustomsProcedure;
        }

        /** 
         * Set the 'DTCustomsProcedure' element value. Процедура.Гр 37
         * 
         * @param DTCustomsProcedure
         */
        public void setDTCustomsProcedure(
                ESADCustomsProcedureType DTCustomsProcedure) {
            this.DTCustomsProcedure = DTCustomsProcedure;
        }
        /** 
         * Характеристика товаров в группе
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsGroupInformation" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="Manufacturer" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="TradeMark" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="GoodsMark" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="GoodsModel" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="GoodsMarking" minOccurs="0"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class GoodsGroupInformation
        {
            private String manufacturer;
            private String tradeMark;
            private String goodsMark;
            private String goodsModel;
            private String goodsMarking;

            /** 
             * Get the 'Manufacturer' element value. Сведения о производителе
             * 
             * @return value
             */
            public String getManufacturer() {
                return manufacturer;
            }

            /** 
             * Set the 'Manufacturer' element value. Сведения о производителе
             * 
             * @param manufacturer
             */
            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            /** 
             * Get the 'TradeMark' element value. Тов. знак, место происхождения, объект авторского права, смежных прав, патент и т.д.
             * 
             * @return value
             */
            public String getTradeMark() {
                return tradeMark;
            }

            /** 
             * Set the 'TradeMark' element value. Тов. знак, место происхождения, объект авторского права, смежных прав, патент и т.д.
             * 
             * @param tradeMark
             */
            public void setTradeMark(String tradeMark) {
                this.tradeMark = tradeMark;
            }

            /** 
             * Get the 'GoodsMark' element value. Марка товара
             * 
             * @return value
             */
            public String getGoodsMark() {
                return goodsMark;
            }

            /** 
             * Set the 'GoodsMark' element value. Марка товара
             * 
             * @param goodsMark
             */
            public void setGoodsMark(String goodsMark) {
                this.goodsMark = goodsMark;
            }

            /** 
             * Get the 'GoodsModel' element value. Модель товара
             * 
             * @return value
             */
            public String getGoodsModel() {
                return goodsModel;
            }

            /** 
             * Set the 'GoodsModel' element value. Модель товара
             * 
             * @param goodsModel
             */
            public void setGoodsModel(String goodsModel) {
                this.goodsModel = goodsModel;
            }

            /** 
             * Get the 'GoodsMarking' element value. Артикул товара
             * 
             * @return value
             */
            public String getGoodsMarking() {
                return goodsMarking;
            }

            /** 
             * Set the 'GoodsMarking' element value. Артикул товара
             * 
             * @param goodsMarking
             */
            public void setGoodsMarking(String goodsMarking) {
                this.goodsMarking = goodsMarking;
            }
        }
        /** 
         * Представленные документы. Гр. 44.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTPresentedDocument" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="PrDocumentNumber" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="PresentedDocumentModeCode"/>
         *       &lt;xs:element type="xs:date" name="PrDocumentDate" minOccurs="0"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class DTPresentedDocument
        {
            private String prDocumentNumber;
            private String presentedDocumentModeCode;
            private LocalDate prDocumentDate;

            /** 
             * Get the 'PrDocumentNumber' element value. Номер документа.
             * 
             * @return value
             */
            public String getPrDocumentNumber() {
                return prDocumentNumber;
            }

            /** 
             * Set the 'PrDocumentNumber' element value. Номер документа.
             * 
             * @param prDocumentNumber
             */
            public void setPrDocumentNumber(String prDocumentNumber) {
                this.prDocumentNumber = prDocumentNumber;
            }

            /** 
             * Get the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
             * 
             * @return value
             */
            public String getPresentedDocumentModeCode() {
                return presentedDocumentModeCode;
            }

            /** 
             * Set the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
             * 
             * @param presentedDocumentModeCode
             */
            public void setPresentedDocumentModeCode(
                    String presentedDocumentModeCode) {
                this.presentedDocumentModeCode = presentedDocumentModeCode;
            }

            /** 
             * Get the 'PrDocumentDate' element value. Дата документа.
             * 
             * @return value
             */
            public LocalDate getPrDocumentDate() {
                return prDocumentDate;
            }

            /** 
             * Set the 'PrDocumentDate' element value. Дата документа.
             * 
             * @param prDocumentDate
             */
            public void setPrDocumentDate(LocalDate prDocumentDate) {
                this.prDocumentDate = prDocumentDate;
            }
        }
        /** 
         *  Исчисление таможенных платежей
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTCustomsPaymentCalculation" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="PaymentModeCode"/>
         *       &lt;xs:element type="xs:string" name="PaymentAmount" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="PaymentCurrencyCode" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="Rate" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="RateTypeCode" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="PaymentCode" minOccurs="0"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class DTCustomsPaymentCalculation
        {
            private String paymentModeCode;
            private String paymentAmount;
            private String paymentCurrencyCode;
            private String rate;
            private String rateTypeCode;
            private String paymentCode;

            /** 
             * Get the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
             * 
             * @return value
             */
            public String getPaymentModeCode() {
                return paymentModeCode;
            }

            /** 
             * Set the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
             * 
             * @param paymentModeCode
             */
            public void setPaymentModeCode(String paymentModeCode) {
                this.paymentModeCode = paymentModeCode;
            }

            /** 
             * Get the 'PaymentAmount' element value. Сумма платежа
             * 
             * @return value
             */
            public String getPaymentAmount() {
                return paymentAmount;
            }

            /** 
             * Set the 'PaymentAmount' element value. Сумма платежа
             * 
             * @param paymentAmount
             */
            public void setPaymentAmount(String paymentAmount) {
                this.paymentAmount = paymentAmount;
            }

            /** 
             * Get the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа.
             * 
             * @return value
             */
            public String getPaymentCurrencyCode() {
                return paymentCurrencyCode;
            }

            /** 
             * Set the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа.
             * 
             * @param paymentCurrencyCode
             */
            public void setPaymentCurrencyCode(String paymentCurrencyCode) {
                this.paymentCurrencyCode = paymentCurrencyCode;
            }

            /** 
             * Get the 'Rate' element value. Ставка / ставка рефинансирования
             * 
             * @return value
             */
            public String getRate() {
                return rate;
            }

            /** 
             * Set the 'Rate' element value. Ставка / ставка рефинансирования
             * 
             * @param rate
             */
            public void setRate(String rate) {
                this.rate = rate;
            }

            /** 
             * Get the 'RateTypeCode' element value. Вид ставки (адвалорная -"%",признак сборов для РК - "S", специфическая - "*")
             * 
             * @return value
             */
            public String getRateTypeCode() {
                return rateTypeCode;
            }

            /** 
             * Set the 'RateTypeCode' element value. Вид ставки (адвалорная -"%",признак сборов для РК - "S", специфическая - "*")
             * 
             * @param rateTypeCode
             */
            public void setRateTypeCode(String rateTypeCode) {
                this.rateTypeCode = rateTypeCode;
            }

            /** 
             * Get the 'PaymentCode' element value. Код в соответствии с Классификатором особенностей уплаты таможенных и иных платежей, взимание которых возложено на таможенные органы
             * 
             * @return value
             */
            public String getPaymentCode() {
                return paymentCode;
            }

            /** 
             * Set the 'PaymentCode' element value. Код в соответствии с Классификатором особенностей уплаты таможенных и иных платежей, взимание которых возложено на таможенные органы
             * 
             * @param paymentCode
             */
            public void setPaymentCode(String paymentCode) {
                this.paymentCode = paymentCode;
            }
        }
        /** 
         * Количество товара в дополнительной единице измерения.  Гр.41
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SupplementaryGoodsQuantity" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="GoodsQuantity"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class SupplementaryGoodsQuantity
        {
            private String goodsQuantity;

            /** 
             * Get the 'GoodsQuantity' element value. Количество товара в единице измерения.
             * 
             * @return value
             */
            public String getGoodsQuantity() {
                return goodsQuantity;
            }

            /** 
             * Set the 'GoodsQuantity' element value. Количество товара в единице измерения.
             * 
             * @param goodsQuantity
             */
            public void setGoodsQuantity(String goodsQuantity) {
                this.goodsQuantity = goodsQuantity;
            }
        }
        /** 
         * Сведения о грузовых местах, поддонах и упаковке товаров
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsPackaging" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="xs:string" name="PakageQuantity" minOccurs="0"/>
         *       &lt;xs:element type="xs:string" name="PackingCode" minOccurs="0" maxOccurs="unbounded"/>
         *       &lt;xs:element type="xs:string" name="PalleteCode" minOccurs="0" maxOccurs="unbounded"/>
         *       &lt;xs:element type="xs:string" name="UnitPackCode" minOccurs="0" maxOccurs="unbounded"/>
         *       &lt;xs:element type="xs:string" name="CargoInfoCode" minOccurs="0" maxOccurs="unbounded"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class GoodsPackaging
        {
            private String pakageQuantity;
            private List<String> packingCodeList = new ArrayList<String>();
            private List<String> palleteCodeList = new ArrayList<String>();
            private List<String> unitPackCodeList = new ArrayList<String>();
            private List<String> cargoInfoCodeList = new ArrayList<String>();

            /** 
             * Get the 'PakageQuantity' element value. Общее количество грузовых мест, занятых товаром.
             * 
             * @return value
             */
            public String getPakageQuantity() {
                return pakageQuantity;
            }

            /** 
             * Set the 'PakageQuantity' element value. Общее количество грузовых мест, занятых товаром.
             * 
             * @param pakageQuantity
             */
            public void setPakageQuantity(String pakageQuantity) {
                this.pakageQuantity = pakageQuantity;
            }

            /** 
             * Get the list of 'PackingCode' element items.
             * 
             * @return list
             */
            public List<String> getPackingCodeList() {
                return packingCodeList;
            }

            /** 
             * Set the list of 'PackingCode' element items.
             * 
             * @param list
             */
            public void setPackingCodeList(List<String> list) {
                packingCodeList = list;
            }

            /** 
             * Get the list of 'PalleteCode' element items.
             * 
             * @return list
             */
            public List<String> getPalleteCodeList() {
                return palleteCodeList;
            }

            /** 
             * Set the list of 'PalleteCode' element items.
             * 
             * @param list
             */
            public void setPalleteCodeList(List<String> list) {
                palleteCodeList = list;
            }

            /** 
             * Get the list of 'UnitPackCode' element items.
             * 
             * @return list
             */
            public List<String> getUnitPackCodeList() {
                return unitPackCodeList;
            }

            /** 
             * Set the list of 'UnitPackCode' element items.
             * 
             * @param list
             */
            public void setUnitPackCodeList(List<String> list) {
                unitPackCodeList = list;
            }

            /** 
             * Get the list of 'CargoInfoCode' element items.
             * 
             * @return list
             */
            public List<String> getCargoInfoCodeList() {
                return cargoInfoCodeList;
            }

            /** 
             * Set the list of 'CargoInfoCode' element items.
             * 
             * @param list
             */
            public void setCargoInfoCodeList(List<String> list) {
                cargoInfoCodeList = list;
            }
        }
        /** 
         * Сведения о контейнерах.элемент 3 Гр 31
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTContainer" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element name="ContainerNumber" minOccurs="0" maxOccurs="unbounded">
         *         &lt;!-- Reference to inner class ContainerNumber -->
         *       &lt;/xs:element>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class DTContainer
        {
            private List<ContainerNumber> containerNumberList = new ArrayList<ContainerNumber>();

            /** 
             * Get the list of 'ContainerNumber' element items.
             * 
             * @return list
             */
            public List<ContainerNumber> getContainerNumberList() {
                return containerNumberList;
            }

            /** 
             * Set the list of 'ContainerNumber' element items.
             * 
             * @param list
             */
            public void setContainerNumberList(List<ContainerNumber> list) {
                containerNumberList = list;
            }
            /** 
             * Номер контейнера
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ContainerNumber" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:sequence>
             *       &lt;xs:element type="xs:string" name="ContainerIdentificator"/>
             *     &lt;/xs:sequence>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class ContainerNumber
            {
                private String containerIdentificator;

                /** 
                 * Get the 'ContainerIdentificator' element value. Номер (идентификатор) контейнера
                 * 
                 * @return value
                 */
                public String getContainerIdentificator() {
                    return containerIdentificator;
                }

                /** 
                 * Set the 'ContainerIdentificator' element value. Номер (идентификатор) контейнера
                 * 
                 * @param containerIdentificator
                 */
                public void setContainerIdentificator(
                        String containerIdentificator) {
                    this.containerIdentificator = containerIdentificator;
                }
            }
        }
    }
}
