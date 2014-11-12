
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Ответ сервиса СУР
 */
public class SEMSURResponseType extends BaseDocType
{
    private GTDIDType gtdRegNumber;
    private List<RiskProfileType> riskProfileRegNumberList = new ArrayList<RiskProfileType>();
    private String documentModeID;

    /** 
     * Get the 'GtdRegNumber' element value. Номер декларации
     * 
     * @return value
     */
    public GTDIDType getGtdRegNumber() {
        return gtdRegNumber;
    }

    /** 
     * Set the 'GtdRegNumber' element value. Номер декларации
     * 
     * @param gtdRegNumber
     */
    public void setGtdRegNumber(GTDIDType gtdRegNumber) {
        this.gtdRegNumber = gtdRegNumber;
    }

    /** 
     * Get the list of 'RiskProfileRegNumber' element items. ИД профиля риска
     * 
     * @return list
     */
    public List<RiskProfileType> getRiskProfileRegNumberList() {
        return riskProfileRegNumberList;
    }

    /** 
     * Set the list of 'RiskProfileRegNumber' element items. ИД профиля риска
     * 
     * @param list
     */
    public void setRiskProfileRegNumberList(List<RiskProfileType> list) {
        riskProfileRegNumberList = list;
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
