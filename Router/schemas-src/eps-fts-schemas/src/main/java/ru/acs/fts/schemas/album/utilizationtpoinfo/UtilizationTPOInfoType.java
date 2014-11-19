
package ru.acs.fts.schemas.album.utilizationtpoinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� �� ����������� ��� �� �������������� �����.
 */
public class UtilizationTPOInfoType extends BaseDocType
{
    private String codeReasonFreePayment;
    private TPOIDType TPOID;
    private GTDIDType cardNumber;
    private String documentModeID;

    /** 
     * Get the 'CodeReasonFreePayment' element value. ��� ������������ �� ������ �� �������������� ������
     * 
     * @return value
     */
    public String getCodeReasonFreePayment() {
        return codeReasonFreePayment;
    }

    /** 
     * Set the 'CodeReasonFreePayment' element value. ��� ������������ �� ������ �� �������������� ������
     * 
     * @param codeReasonFreePayment
     */
    public void setCodeReasonFreePayment(String codeReasonFreePayment) {
        this.codeReasonFreePayment = codeReasonFreePayment;
    }

    /** 
     * Get the 'TPOID' element value. ���������������� ��������� ��������� ���
     * 
     * @return value
     */
    public TPOIDType getTPOID() {
        return TPOID;
    }

    /** 
     * Set the 'TPOID' element value. ���������������� ��������� ��������� ���
     * 
     * @param TPOID
     */
    public void setTPOID(TPOIDType TPOID) {
        this.TPOID = TPOID;
    }

    /** 
     * Get the 'CardNumber' element value. ������� ����� ��������
     * 
     * @return value
     */
    public GTDIDType getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. ������� ����� ��������
     * 
     * @param cardNumber
     */
    public void setCardNumber(GTDIDType cardNumber) {
        this.cardNumber = cardNumber;
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
