
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
    private int docIDSelect = -1;
    private static final int DOC_IDDT_REG_NUM_CHOICE = 0;
    private static final int DOC_IDMPO_REG_NUM_CHOICE = 1;
    private GTDIDType docIDDTRegNum;
    private MPORegNumType docIDMPORegNum;
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
     * Get the list of 'RevealledRisks' element items. ���������� �����
     * 
     * @return list
     */
    public List<RevealledRisksType> getRevealledRiskList() {
        return revealledRiskList;
    }

    /** 
     * Set the list of 'RevealledRisks' element items. ���������� �����
     * 
     * @param list
     */
    public void setRevealledRiskList(List<RevealledRisksType> list) {
        revealledRiskList = list;
    }

    /** 
     * Get the list of 'RiskInf' element items. ����������� ���������� ��� �� ����������� ������ (������)
     * 
     * @return list
     */
    public List<RiskInfType> getRiskInfList() {
        return riskInfList;
    }

    /** 
     * Set the list of 'RiskInf' element items. ����������� ���������� ��� �� ����������� ������ (������)
     * 
     * @param list
     */
    public void setRiskInfList(List<RiskInfType> list) {
        riskInfList = list;
    }

    private void setDocIDSelect(int choice) {
        if (docIDSelect == -1) {
            docIDSelect = choice;
        } else if (docIDSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearDocIDSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearDocIDSelect() {
        docIDSelect = -1;
    }

    /** 
     * Check if DocIDDTRegNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocIDDTRegNum() {
        return docIDSelect == DOC_IDDT_REG_NUM_CHOICE;
    }

    /** 
     * Get the 'DTRegNum' element value. ��������������� ����� �� / ������� ��������-������
     * 
     * @return value
     */
    public GTDIDType getDocIDDTRegNum() {
        return docIDDTRegNum;
    }

    /** 
     * Set the 'DTRegNum' element value. ��������������� ����� �� / ������� ��������-������
     * 
     * @param docIDDTRegNum
     */
    public void setDocIDDTRegNum(GTDIDType docIDDTRegNum) {
        setDocIDSelect(DOC_IDDT_REG_NUM_CHOICE);
        this.docIDDTRegNum = docIDDTRegNum;
    }

    /** 
     * Check if DocIDMPORegNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocIDMPORegNum() {
        return docIDSelect == DOC_IDMPO_REG_NUM_CHOICE;
    }

    /** 
     * Get the 'MPORegNum' element value. ��������������� ����� ���
     * 
     * @return value
     */
    public MPORegNumType getDocIDMPORegNum() {
        return docIDMPORegNum;
    }

    /** 
     * Set the 'MPORegNum' element value. ��������������� ����� ���
     * 
     * @param docIDMPORegNum
     */
    public void setDocIDMPORegNum(MPORegNumType docIDMPORegNum) {
        setDocIDSelect(DOC_IDMPO_REG_NUM_CHOICE);
        this.docIDMPORegNum = docIDMPORegNum;
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
