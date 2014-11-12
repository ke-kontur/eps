
package ru.acs.fts.schemas.album.correctiondecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Решение по направлению, принятое структурным отделом таможни
 */
public class CorrectionDecisionType extends BaseDocType
{
    private String DTReference;
    private String coordReqNumber;
    private List<String> resolutionCustInspectorList = new ArrayList<String>();
    private List<RefDocumentListType> refDocumentList = new ArrayList<RefDocumentListType>();
    private List<MeasureDecisionsType> measureDecisionList = new ArrayList<MeasureDecisionsType>();
    private GTDIDType DTNumber;
    private String documentModeID;

    /** 
     * Get the 'DTReference' element value. Ссылка на DocumentID того состояния ДТ, при котором было сформировано Направление на согласование мер по минимизации риска
     * 
     * @return value
     */
    public String getDTReference() {
        return DTReference;
    }

    /** 
     * Set the 'DTReference' element value. Ссылка на DocumentID того состояния ДТ, при котором было сформировано Направление на согласование мер по минимизации риска
     * 
     * @param DTReference
     */
    public void setDTReference(String DTReference) {
        this.DTReference = DTReference;
    }

    /** 
     * Get the 'CoordReqNumber' element value. Порядковый номер Направления, сформированного по ДТ в процессе ее оформления
     * 
     * @return value
     */
    public String getCoordReqNumber() {
        return coordReqNumber;
    }

    /** 
     * Set the 'CoordReqNumber' element value. Порядковый номер Направления, сформированного по ДТ в процессе ее оформления
     * 
     * @param coordReqNumber
     */
    public void setCoordReqNumber(String coordReqNumber) {
        this.coordReqNumber = coordReqNumber;
    }

    /** 
     * Get the list of 'ResolutionCustInspector' element items. Заключение инспектора таможни
     * 
     * @return list
     */
    public List<String> getResolutionCustInspectorList() {
        return resolutionCustInspectorList;
    }

    /** 
     * Set the list of 'ResolutionCustInspector' element items. Заключение инспектора таможни
     * 
     * @param list
     */
    public void setResolutionCustInspectorList(List<String> list) {
        resolutionCustInspectorList = list;
    }

    /** 
     * Get the list of 'RefDocumentList' element items. Набор ссылок на документы, которыми руководствовался инспектор таможни при принятии решения по мере
     * 
     * @return list
     */
    public List<RefDocumentListType> getRefDocumentList() {
        return refDocumentList;
    }

    /** 
     * Set the list of 'RefDocumentList' element items. Набор ссылок на документы, которыми руководствовался инспектор таможни при принятии решения по мере
     * 
     * @param list
     */
    public void setRefDocumentList(List<RefDocumentListType> list) {
        refDocumentList = list;
    }

    /** 
     * Get the list of 'MeasureDecisions' element items. Решения по мерам по минимизации риска, принятые инспекторами структурных или координирующего подразделений таможни
     * 
     * @return list
     */
    public List<MeasureDecisionsType> getMeasureDecisionList() {
        return measureDecisionList;
    }

    /** 
     * Set the list of 'MeasureDecisions' element items. Решения по мерам по минимизации риска, принятые инспекторами структурных или координирующего подразделений таможни
     * 
     * @param list
     */
    public void setMeasureDecisionList(List<MeasureDecisionsType> list) {
        measureDecisionList = list;
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
