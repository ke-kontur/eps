
package ru.acs.fts.schemas.album.esadoutp;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Предварительное уведомление о декларировании товаров
 */
public class ESADoutPType extends BaseDocType
{
    private String customsProcedure;
    private String customsModeCode;
    private String transitDirectionCode;
    private String declarationKind;
    private String PIURN;
    private String formKind;
    private ESADGoodsShipmentPType ESADGoodsShipmentP;
    private String documentModeID;

    /** 
     * Get the 'CustomsProcedure' element value. Таможенная процедура. ИМ, ЭК. ВТТ, МТТ. Левый подраздел гр.1 ДТ.
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Таможенная процедура. ИМ, ЭК. ВТТ, МТТ. Левый подраздел гр.1 ДТ.
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенного режима.  гр. 1. средний подраздел ДТ. Первый символ кода гр. 37.
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенного режима.  гр. 1. средний подраздел ДТ. Первый символ кода гр. 37.
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'TransitDirectionCode' element value. Направление перемещения при транзите.  ИМ, ЭК, ПР. Гр. 1 ДТ. правый подраздел. 
     * 
     * @return value
     */
    public String getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /** 
     * Set the 'TransitDirectionCode' element value. Направление перемещения при транзите.  ИМ, ЭК, ПР. Гр. 1 ДТ. правый подраздел. 
     * 
     * @param transitDirectionCode
     */
    public void setTransitDirectionCode(String transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

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
     * Get the 'PI_URN' element value. Уникальный идентификатор предварительной информации
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. Уникальный идентификатор предварительной информации
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'FormKind' element value. Тип формы
     * 
     * @return value
     */
    public String getFormKind() {
        return formKind;
    }

    /** 
     * Set the 'FormKind' element value. Тип формы
     * 
     * @param formKind
     */
    public void setFormKind(String formKind) {
        this.formKind = formKind;
    }

    /** 
     * Get the 'ESADGoodsShipmentP' element value. Сведения о товарной партии.
     * 
     * @return value
     */
    public ESADGoodsShipmentPType getESADGoodsShipmentP() {
        return ESADGoodsShipmentP;
    }

    /** 
     * Set the 'ESADGoodsShipmentP' element value. Сведения о товарной партии.
     * 
     * @param ESADGoodsShipmentP
     */
    public void setESADGoodsShipmentP(ESADGoodsShipmentPType ESADGoodsShipmentP) {
        this.ESADGoodsShipmentP = ESADGoodsShipmentP;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
