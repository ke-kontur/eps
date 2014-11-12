
package ru.acs.fts.schemas.album.addinfoforeigntradecontract;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Дополнительные сведения по внешнеторговым контрактам.
 */
public class AddInfoForeignTradeContractType extends BaseDocType
{
    private String GTDDocumentId;
    private CustomsPersonType customsPerson;
    private PersonSignatureType declarantSignature;
    private GTDIDType gtdRegNumber;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'GTDDocumentId' element value. Уникальный идентификатор ДТ. Используется для привязки к ДТ
     * 
     * @return value
     */
    public String getGTDDocumentId() {
        return GTDDocumentId;
    }

    /** 
     * Set the 'GTDDocumentId' element value. Уникальный идентификатор ДТ. Используется для привязки к ДТ
     * 
     * @param GTDDocumentId
     */
    public void setGTDDocumentId(String GTDDocumentId) {
        this.GTDDocumentId = GTDDocumentId;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'DeclarantSignature' element value. Подпись лица, составившего ДТ
     * 
     * @return value
     */
    public PersonSignatureType getDeclarantSignature() {
        return declarantSignature;
    }

    /** 
     * Set the 'DeclarantSignature' element value. Подпись лица, составившего ДТ
     * 
     * @param declarantSignature
     */
    public void setDeclarantSignature(PersonSignatureType declarantSignature) {
        this.declarantSignature = declarantSignature;
    }

    /** 
     * Get the 'GtdRegNumber' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGtdRegNumber() {
        return gtdRegNumber;
    }

    /** 
     * Set the 'GtdRegNumber' element value. Регистрационный номер ДТ
     * 
     * @param gtdRegNumber
     */
    public void setGtdRegNumber(GTDIDType gtdRegNumber) {
        this.gtdRegNumber = gtdRegNumber;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
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
