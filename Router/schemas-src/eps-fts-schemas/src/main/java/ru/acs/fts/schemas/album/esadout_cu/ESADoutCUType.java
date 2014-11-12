
package ru.acs.fts.schemas.album.esadout_cu;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * Электронная копия декларации на товары (транзитной декларации)
 */
public class ESADoutCUType extends BaseDocType
{
    private String customsProcedure;
    private String customsModeCode;
    private String customsModeCodeMPO;
    private String transitDirectionCode;
    private String electronicDocumentSign;
    private String declarationKind;
    private String subsoilSign;
    private String sealNumber;
    private String sealQuantity;
    private String languageCUESAD;
    private String recipientCountryCode;
    private String movementCode;
    private String executionPlace;
    private String railwayStationCode;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private ESADoutCUGoodsShipmentType ESADoutCUGoodsShipment;
    private RBTechMarKType RBTechMarK;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType CUESADCustomsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'CustomsProcedure' element value. ИМ, ЭК, ТТ. Первый подраздел гр.1 ДТ/ТД
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ИМ, ЭК, ТТ. Первый подраздел гр.1 ДТ/ТД
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
     * Get the 'CustomsModeCodeMPO' element value. МПО гр. 1. второй подраздел ТД
     * 
     * @return value
     */
    public String getCustomsModeCodeMPO() {
        return customsModeCodeMPO;
    }

    /** 
     * Set the 'CustomsModeCodeMPO' element value. МПО гр. 1. второй подраздел ТД
     * 
     * @param customsModeCodeMPO
     */
    public void setCustomsModeCodeMPO(String customsModeCodeMPO) {
        this.customsModeCodeMPO = customsModeCodeMPO;
    }

    /** 
     * Get the 'TransitDirectionCode' element value.  ИМ, ЭК, ТР, ВТ, ТС. Гр. 1 ТД. Третий подраздел
     * 
     * @return value
     */
    public String getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /** 
     * Set the 'TransitDirectionCode' element value.  ИМ, ЭК, ТР, ВТ, ТС. Гр. 1 ТД. Третий подраздел
     * 
     * @param transitDirectionCode
     */
    public void setTransitDirectionCode(String transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования ДТ в форме электронного документа. ЭД. Гр. 1 ДТ. Третий подраздел
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования ДТ в форме электронного документа. ЭД. Гр. 1 ДТ. Третий подраздел
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'DeclarationKind' element value. Код особенности декларирования товаров по классификатору особенностей таможенного декларирования товаров. Гр.7 ДТ
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Код особенности декларирования товаров по классификатору особенностей таможенного декларирования товаров. Гр.7 ДТ
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
     * Get the 'SealNumber' element value. Номер пломбиратора в ТД
     * 
     * @return value
     */
    public String getSealNumber() {
        return sealNumber;
    }

    /** 
     * Set the 'SealNumber' element value. Номер пломбиратора в ТД
     * 
     * @param sealNumber
     */
    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    /** 
     * Get the 'SealQuantity' element value. Количество наложенных пломб в ТД
     * 
     * @return value
     */
    public String getSealQuantity() {
        return sealQuantity;
    }

    /** 
     * Set the 'SealQuantity' element value. Количество наложенных пломб в ТД
     * 
     * @param sealQuantity
     */
    public void setSealQuantity(String sealQuantity) {
        this.sealQuantity = sealQuantity;
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
     * Get the 'RecipientCountryCode' element value. Код страны, в сооветствии с классификатором стран мира, таможенного органа, которому представляется документ
     * 
     * @return value
     */
    public String getRecipientCountryCode() {
        return recipientCountryCode;
    }

    /** 
     * Set the 'RecipientCountryCode' element value. Код страны, в сооветствии с классификатором стран мира, таможенного органа, которому представляется документ
     * 
     * @param recipientCountryCode
     */
    public void setRecipientCountryCode(String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }

    /** 
     * Get the 'MovementCode' element value. Код цели перемещения в ТД
     * 
     * @return value
     */
    public String getMovementCode() {
        return movementCode;
    }

    /** 
     * Set the 'MovementCode' element value. Код цели перемещения в ТД
     * 
     * @param movementCode
     */
    public void setMovementCode(String movementCode) {
        this.movementCode = movementCode;
    }

    /** 
     * Get the 'ExecutionPlace' element value. Место представления ТД
     * 
     * @return value
     */
    public String getExecutionPlace() {
        return executionPlace;
    }

    /** 
     * Set the 'ExecutionPlace' element value. Место представления ТД
     * 
     * @param executionPlace
     */
    public void setExecutionPlace(String executionPlace) {
        this.executionPlace = executionPlace;
    }

    /** 
     * Get the 'RailwayStationCode' element value. Код ж/д станции. Гр.50 ТД
     * 
     * @return value
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /** 
     * Set the 'RailwayStationCode' element value. Код ж/д станции. Гр.50 ТД
     * 
     * @param railwayStationCode
     */
    public void setRailwayStationCode(String railwayStationCode) {
        this.railwayStationCode = railwayStationCode;
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
     * Get the 'ESADout_CUGoodsShipment' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public ESADoutCUGoodsShipmentType getESADoutCUGoodsShipment() {
        return ESADoutCUGoodsShipment;
    }

    /** 
     * Set the 'ESADout_CUGoodsShipment' element value. Сведения о товарной партии
     * 
     * @param ESADoutCUGoodsShipment
     */
    public void setESADoutCUGoodsShipment(
            ESADoutCUGoodsShipmentType ESADoutCUGoodsShipment) {
        this.ESADoutCUGoodsShipment = ESADoutCUGoodsShipment;
    }

    /** 
     * Get the 'RBTechMarK' element value. Технические отметки для РБ
     * 
     * @return value
     */
    public RBTechMarKType getRBTechMarK() {
        return RBTechMarK;
    }

    /** 
     * Set the 'RBTechMarK' element value. Технические отметки для РБ
     * 
     * @param RBTechMarK
     */
    public void setRBTechMarK(RBTechMarKType RBTechMarK) {
        this.RBTechMarK = RBTechMarK;
    }

    /** 
     * Get the 'FilledPerson' element value. Сведения о лице, заполнившем документ
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. Сведения о лице, заполнившем документ
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
    }

    /** 
     * Get the 'CUESADCustomsRepresentative' element value. Таможенный представитель
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCUESADCustomsRepresentative() {
        return CUESADCustomsRepresentative;
    }

    /** 
     * Set the 'CUESADCustomsRepresentative' element value. Таможенный представитель
     * 
     * @param CUESADCustomsRepresentative
     */
    public void setCUESADCustomsRepresentative(
            CUESADCustomsRepresentativeType CUESADCustomsRepresentative) {
        this.CUESADCustomsRepresentative = CUESADCustomsRepresentative;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа. (Код документа в Альбоме форматов для РФ)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа. (Код документа в Альбоме форматов для РФ)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
