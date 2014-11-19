
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * Корректировка декларации на товары.Внутренний формат
 */
public class KTDinType extends BaseDocType
{
    private String declarationKind;
    private String COMPLECTBL;
    private String g0131;
    private String KTDNumber;
    private String customsModeCode;
    private String electronicDocumentSign;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private String customsProcedure;
    private DocumentBaseType reason;
    private KTDinGoodsShipmentType KTDinGoodsShipment;
    private List<KTDinCommonOfficialMarkType> KTDinCommonOfficialMarkList = new ArrayList<KTDinCommonOfficialMarkType>();
    private GTDIDType GTDNumber;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private ChangeCodeType changeCode;
    private KDTFilledInfoType KDTFilledInfo;
    private String documentModeID;

    /** 
     * Get the 'DeclarationKind' element value. Вид таможенной декларации по Классификатору видов таможенных деклараций.
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Вид таможенной декларации по Классификатору видов таможенных деклараций.
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'COMPLECTBL' element value. Резерв. Признак использования для ДТ комплектов бланков. 1 -КДТ1, 2 - КДТ2
     * 
     * @return value
     */
    public String getCOMPLECTBL() {
        return COMPLECTBL;
    }

    /** 
     * Set the 'COMPLECTBL' element value. Резерв. Признак использования для ДТ комплектов бланков. 1 -КДТ1, 2 - КДТ2
     * 
     * @param COMPLECTBL
     */
    public void setCOMPLECTBL(String COMPLECTBL) {
        this.COMPLECTBL = COMPLECTBL;
    }

    /** 
     * Get the 'G0131' element value. Резерв. Дополнительный признак.
     * 
     * @return value
     */
    public String getG0131() {
        return g0131;
    }

    /** 
     * Set the 'G0131' element value. Резерв. Дополнительный признак.
     * 
     * @param g0131
     */
    public void setG0131(String g0131) {
        this.g0131 = g0131;
    }

    /** 
     * Get the 'KTDNumber' element value. Номер КДТ по порядку
     * 
     * @return value
     */
    public String getKTDNumber() {
        return KTDNumber;
    }

    /** 
     * Set the 'KTDNumber' element value. Номер КДТ по порядку
     * 
     * @param KTDNumber
     */
    public void setKTDNumber(String KTDNumber) {
        this.KTDNumber = KTDNumber;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенной процедуры в соответствии с Классификатором видов таможенных процедур.  гр. 1. второй подраздел ДТ. Первый элемент первого подраздела гр. 37./ "00" - для припасов
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенной процедуры в соответствии с Классификатором видов таможенных процедур.  гр. 1. второй подраздел ДТ. Первый элемент первого подраздела гр. 37./ "00" - для припасов
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования КДТ в форме электронного документа "ЭД". 
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования КДТ в форме электронного документа "ЭД". 
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'RegNumberDoc' element value. Исходящий номер регистрации документов в соответствии с системой (регламентом) учета исходящих документов декларанта или таможенного представителя  в Республике Беларусь
     * 
     * @return value
     */
    public String getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. Исходящий номер регистрации документов в соответствии с системой (регламентом) учета исходящих документов декларанта или таможенного представителя  в Республике Беларусь
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(String regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'ExecutionDate' element value. Дата составления (представления)
     * 
     * @return value
     */
    public LocalDate getExecutionDate() {
        return executionDate;
    }

    /** 
     * Set the 'ExecutionDate' element value. Дата составления (представления)
     * 
     * @param executionDate
     */
    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    /** 
     * Get the 'SecurityLabelCode' element value. Код защитной наклейки для РК
     * 
     * @return value
     */
    public String getSecurityLabelCode() {
        return securityLabelCode;
    }

    /** 
     * Set the 'SecurityLabelCode' element value. Код защитной наклейки для РК
     * 
     * @param securityLabelCode
     */
    public void setSecurityLabelCode(String securityLabelCode) {
        this.securityLabelCode = securityLabelCode;
    }

    /** 
     * Get the 'CustomsProcedure' element value. ИМ, ЭК. Левый подраздел гр.1 КДТ
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ИМ, ЭК. Левый подраздел гр.1 КДТ
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'Reason' element value. Резерв. Основание для внесения изменений: мотивированное обращение декларанта (таможенного представителя)/решение начальника таможенного поста/решение начальника таможни или лица, им уполномоченного/решение начальник структурного подразделения таможни/решение вышестоящего таможенного органа (РТУ, ФТС России)/ решение начальник структурного  подразделения РТУ, ФТС России
     * 
     * @return value
     */
    public DocumentBaseType getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Резерв. Основание для внесения изменений: мотивированное обращение декларанта (таможенного представителя)/решение начальника таможенного поста/решение начальника таможни или лица, им уполномоченного/решение начальник структурного подразделения таможни/решение вышестоящего таможенного органа (РТУ, ФТС России)/ решение начальник структурного  подразделения РТУ, ФТС России
     * 
     * @param reason
     */
    public void setReason(DocumentBaseType reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'KTDinGoodsShipment' element value. КДТ. Внутренний формат. Сведения о товарной партии
     * 
     * @return value
     */
    public KTDinGoodsShipmentType getKTDinGoodsShipment() {
        return KTDinGoodsShipment;
    }

    /** 
     * Set the 'KTDinGoodsShipment' element value. КДТ. Внутренний формат. Сведения о товарной партии
     * 
     * @param KTDinGoodsShipment
     */
    public void setKTDinGoodsShipment(KTDinGoodsShipmentType KTDinGoodsShipment) {
        this.KTDinGoodsShipment = KTDinGoodsShipment;
    }

    /** 
     * Get the list of 'KTDinCommonOfficialMark' element items. КДТ. Внутренний формат. Служебные отметки по КДТ.
     * 
     * @return list
     */
    public List<KTDinCommonOfficialMarkType> getKTDinCommonOfficialMarkList() {
        return KTDinCommonOfficialMarkList;
    }

    /** 
     * Set the list of 'KTDinCommonOfficialMark' element items. КДТ. Внутренний формат. Служебные отметки по КДТ.
     * 
     * @param list
     */
    public void setKTDinCommonOfficialMarkList(
            List<KTDinCommonOfficialMarkType> list) {
        KTDinCommonOfficialMarkList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Регистрационный номер ДТ.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'FilledPerson' element value. Сведения о лице, заполнившем документ (ДТ)
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. Сведения о лице, заполнившем документ (ДТ)
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CUESADCustomsRepresentativeType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
    }

    /** 
     * Get the 'ChangeCode' element value. Код изменений гр 45а при отсутствии изменений и (или) дополнении сведений в отношении товаров
     * 
     * @return value
     */
    public ChangeCodeType getChangeCode() {
        return changeCode;
    }

    /** 
     * Set the 'ChangeCode' element value. Код изменений гр 45а при отсутствии изменений и (или) дополнении сведений в отношении товаров
     * 
     * @param changeCode
     */
    public void setChangeCode(ChangeCodeType changeCode) {
        this.changeCode = changeCode;
    }

    /** 
     * Get the 'KDTFilledInfo' element value. Сведения о заполнении КДТ
     * 
     * @return value
     */
    public KDTFilledInfoType getKDTFilledInfo() {
        return KDTFilledInfo;
    }

    /** 
     * Set the 'KDTFilledInfo' element value. Сведения о заполнении КДТ
     * 
     * @param KDTFilledInfo
     */
    public void setKDTFilledInfo(KDTFilledInfoType KDTFilledInfo) {
        this.KDTFilledInfo = KDTFilledInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
