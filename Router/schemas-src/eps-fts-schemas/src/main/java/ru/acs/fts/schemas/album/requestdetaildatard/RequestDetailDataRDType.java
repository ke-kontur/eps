
package ru.acs.fts.schemas.album.requestdetaildatard;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ ��������� ������ ��������������� ���������
 */
public class RequestDetailDataRDType extends BaseDocType
{
    private String BDRDID;
    private String documentCode;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
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
