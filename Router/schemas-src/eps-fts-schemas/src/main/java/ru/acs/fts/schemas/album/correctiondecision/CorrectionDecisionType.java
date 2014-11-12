
package ru.acs.fts.schemas.album.correctiondecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������� �� �����������, �������� ����������� ������� �������
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
     * Get the 'DTReference' element value. ������ �� DocumentID ���� ��������� ��, ��� ������� ���� ������������ ����������� �� ������������ ��� �� ����������� �����
     * 
     * @return value
     */
    public String getDTReference() {
        return DTReference;
    }

    /** 
     * Set the 'DTReference' element value. ������ �� DocumentID ���� ��������� ��, ��� ������� ���� ������������ ����������� �� ������������ ��� �� ����������� �����
     * 
     * @param DTReference
     */
    public void setDTReference(String DTReference) {
        this.DTReference = DTReference;
    }

    /** 
     * Get the 'CoordReqNumber' element value. ���������� ����� �����������, ��������������� �� �� � �������� �� ����������
     * 
     * @return value
     */
    public String getCoordReqNumber() {
        return coordReqNumber;
    }

    /** 
     * Set the 'CoordReqNumber' element value. ���������� ����� �����������, ��������������� �� �� � �������� �� ����������
     * 
     * @param coordReqNumber
     */
    public void setCoordReqNumber(String coordReqNumber) {
        this.coordReqNumber = coordReqNumber;
    }

    /** 
     * Get the list of 'ResolutionCustInspector' element items. ���������� ���������� �������
     * 
     * @return list
     */
    public List<String> getResolutionCustInspectorList() {
        return resolutionCustInspectorList;
    }

    /** 
     * Set the list of 'ResolutionCustInspector' element items. ���������� ���������� �������
     * 
     * @param list
     */
    public void setResolutionCustInspectorList(List<String> list) {
        resolutionCustInspectorList = list;
    }

    /** 
     * Get the list of 'RefDocumentList' element items. ����� ������ �� ���������, �������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @return list
     */
    public List<RefDocumentListType> getRefDocumentList() {
        return refDocumentList;
    }

    /** 
     * Set the list of 'RefDocumentList' element items. ����� ������ �� ���������, �������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @param list
     */
    public void setRefDocumentList(List<RefDocumentListType> list) {
        refDocumentList = list;
    }

    /** 
     * Get the list of 'MeasureDecisions' element items. ������� �� ����� �� ����������� �����, �������� ������������ ����������� ��� ��������������� ������������� �������
     * 
     * @return list
     */
    public List<MeasureDecisionsType> getMeasureDecisionList() {
        return measureDecisionList;
    }

    /** 
     * Set the list of 'MeasureDecisions' element items. ������� �� ����� �� ����������� �����, �������� ������������ ����������� ��� ��������������� ������������� �������
     * 
     * @param list
     */
    public void setMeasureDecisionList(List<MeasureDecisionsType> list) {
        measureDecisionList = list;
    }

    /** 
     * Get the 'DTNumber' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. ��������������� ����� ��
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
