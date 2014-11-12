
package ru.acs.fts.schemas.album.kdtout_cu;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * Электронная копия корректировки декларации на товары
 */
public class KDToutCUType extends BaseDocType
{
    private String KDTNumber;
    private String customsProcedure;
    private String customsModeCode;
    private String declarationKind;
    private String subsoilSign;
    private String languageCUESAD;
    private String electronicDocumentSign;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private KDTGoodsShipmentType KDToutGoodsShipment;
    private GTDIDType gtdRegistryNumber;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private KDTFilledInfoType KDTFilledInfo;
    private ChangeCodeType changeCode;
    private String documentModeID;

    /** 
     * Get the 'KDTNumber' element value. Номер КДТ по порядку
     * 
     * @return value
     */
    public String getKDTNumber() {
        return KDTNumber;
    }

    /** 
     * Set the 'KDTNumber' element value. Номер КДТ по порядку
     * 
     * @param KDTNumber
     */
    public void setKDTNumber(String KDTNumber) {
        this.KDTNumber = KDTNumber;
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
     * Get the 'CustomsModeCode' element value. Код таможенной процедуры в соответствии с классификатором видов таможенных процедур гр. 1. второй подраздел ДТ. Первый элемент первого подраздела гр. 37/«00» – для припасов
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенной процедуры в соответствии с классификатором видов таможенных процедур гр. 1. второй подраздел ДТ. Первый элемент первого подраздела гр. 37/«00» – для припасов
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'DeclarationKind' element value. Код особенности декларирования товаров по классификатору особенностей таможенного декларирования товаров
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Код особенности декларирования товаров по классификатору особенностей таможенного декларирования товаров
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'SubsoilSign' element value. Признак недропользователя. Для РК
     * 
     * @return value
     */
    public String getSubsoilSign() {
        return subsoilSign;
    }

    /** 
     * Set the 'SubsoilSign' element value. Признак недропользователя. Для РК
     * 
     * @param subsoilSign
     */
    public void setSubsoilSign(String subsoilSign) {
        this.subsoilSign = subsoilSign;
    }

    /** 
     * Get the 'LanguageCUESAD' element value. Код языка заполнения документа
     * 
     * @return value
     */
    public String getLanguageCUESAD() {
        return languageCUESAD;
    }

    /** 
     * Set the 'LanguageCUESAD' element value. Код языка заполнения документа
     * 
     * @param languageCUESAD
     */
    public void setLanguageCUESAD(String languageCUESAD) {
        this.languageCUESAD = languageCUESAD;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования КДТ в форме электронного документа "ЭД"
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования КДТ в форме электронного документа "ЭД"
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
     * Get the 'KDToutGoodsShipment' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public KDTGoodsShipmentType getKDToutGoodsShipment() {
        return KDToutGoodsShipment;
    }

    /** 
     * Set the 'KDToutGoodsShipment' element value. Сведения о товарной партии
     * 
     * @param KDToutGoodsShipment
     */
    public void setKDToutGoodsShipment(KDTGoodsShipmentType KDToutGoodsShipment) {
        this.KDToutGoodsShipment = KDToutGoodsShipment;
    }

    /** 
     * Get the 'GtdRegistryNumber' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGtdRegistryNumber() {
        return gtdRegistryNumber;
    }

    /** 
     * Set the 'GtdRegistryNumber' element value. Регистрационный номер ДТ
     * 
     * @param gtdRegistryNumber
     */
    public void setGtdRegistryNumber(GTDIDType gtdRegistryNumber) {
        this.gtdRegistryNumber = gtdRegistryNumber;
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
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа. Код документа в Альбоме форматов
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа. Код документа в Альбоме форматов
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
