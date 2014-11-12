
package ru.acs.fts.schemas.album.rospatentres;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения из Госреестра товарных знаков и знаков обслуживания/из Перечня общеизвестных в РФ товарных знаков/из Госреестра наименований мест происхождений товаров РФ
 */
public class RosPatentResType extends BaseDocType
{
    private String docSign;
    private String objectDescription;
    private String objectType;
    private String objectNum;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Сведения 1 - из Госреестра товарных знаков и знаков обслуживания; 2 - из Перечня общеизвестных в РФ товарных знаков; 3 - из Госреестра наименований мест происхождений товаров РФ
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Сведения 1 - из Госреестра товарных знаков и знаков обслуживания; 2 - из Перечня общеизвестных в РФ товарных знаков; 3 - из Госреестра наименований мест происхождений товаров РФ
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ObjectDescription' element value. Описание объекта
     * 
     * @return value
     */
    public String getObjectDescription() {
        return objectDescription;
    }

    /** 
     * Set the 'ObjectDescription' element value. Описание объекта
     * 
     * @param objectDescription
     */
    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    /** 
     * Get the 'ObjectType' element value. Тип объекта
     * 
     * @return value
     */
    public String getObjectType() {
        return objectType;
    }

    /** 
     * Set the 'ObjectType' element value. Тип объекта
     * 
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /** 
     * Get the 'ObjectNum' element value. Номер объекта
     * 
     * @return value
     */
    public String getObjectNum() {
        return objectNum;
    }

    /** 
     * Set the 'ObjectNum' element value. Номер объекта
     * 
     * @param objectNum
     */
    public void setObjectNum(String objectNum) {
        this.objectNum = objectNum;
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
