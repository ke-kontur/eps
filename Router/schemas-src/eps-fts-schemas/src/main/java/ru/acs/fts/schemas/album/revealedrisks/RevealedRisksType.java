
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����� �� ���������� ������
 */
public class RevealedRisksType extends BaseDocType
{
    private String GTDDocumentID;
    private List<RevealledRisksType> revealledRiskList = new ArrayList<RevealledRisksType>();
    private List<RiskInfType> riskInfList = new ArrayList<RiskInfType>();
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��, � ������� ��������� ���������� �����. ����������� ��� ������������� ����������� ����� ��������������.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��, � ������� ��������� ���������� �����. ����������� ��� ������������� ����������� ����� ��������������.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the list of 'RevealledRisks' element items. �� - ���������� �����
     * 
     * @return list
     */
    public List<RevealledRisksType> getRevealledRiskList() {
        return revealledRiskList;
    }

    /** 
     * Set the list of 'RevealledRisks' element items. �� - ���������� �����
     * 
     * @param list
     */
    public void setRevealledRiskList(List<RevealledRisksType> list) {
        revealledRiskList = list;
    }

    /** 
     * Get the list of 'RiskInf' element items. ����������� ���������� ��� �� ����������� ������
     * 
     * @return list
     */
    public List<RiskInfType> getRiskInfList() {
        return riskInfList;
    }

    /** 
     * Set the list of 'RiskInf' element items. ����������� ���������� ��� �� ����������� ������
     * 
     * @param list
     */
    public void setRiskInfList(List<RiskInfType> list) {
        riskInfList = list;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ��.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
