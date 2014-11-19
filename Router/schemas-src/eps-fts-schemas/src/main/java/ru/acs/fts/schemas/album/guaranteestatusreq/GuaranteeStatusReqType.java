
package ru.acs.fts.schemas.album.guaranteestatusreq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ ������� �������� ������ � ����������� � �������� ��������������.
 */
public class GuaranteeStatusReqType extends BaseDocType
{
    private String GRN;
    private GuaranteeIDType guaranteeID;
    private String documentModeID;

    /** 
     * Get the 'GRN' element value. C�������� ����� �������� � �������� 
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. C�������� ����� �������� � �������� 
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'GuaranteeID' element value. ���������� �������������
     * 
     * @return value
     */
    public GuaranteeIDType getGuaranteeID() {
        return guaranteeID;
    }

    /** 
     * Set the 'GuaranteeID' element value. ���������� �������������
     * 
     * @param guaranteeID
     */
    public void setGuaranteeID(GuaranteeIDType guaranteeID) {
        this.guaranteeID = guaranteeID;
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
