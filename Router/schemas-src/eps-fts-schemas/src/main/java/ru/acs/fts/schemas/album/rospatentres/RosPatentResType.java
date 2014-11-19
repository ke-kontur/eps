
package ru.acs.fts.schemas.album.rospatentres;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ���������� �������� ������ � ������ ������������/�� ������� ������������� � �� �������� ������/�� ���������� ������������ ���� ������������� ������� ��
 */
public class RosPatentResType extends BaseDocType
{
    private String docSign;
    private String objectDescription;
    private String objectType;
    private String objectNum;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. �������� 1 - �� ���������� �������� ������ � ������ ������������; 2 - �� ������� ������������� � �� �������� ������; 3 - �� ���������� ������������ ���� ������������� ������� ��
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. �������� 1 - �� ���������� �������� ������ � ������ ������������; 2 - �� ������� ������������� � �� �������� ������; 3 - �� ���������� ������������ ���� ������������� ������� ��
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ObjectDescription' element value. �������� �������
     * 
     * @return value
     */
    public String getObjectDescription() {
        return objectDescription;
    }

    /** 
     * Set the 'ObjectDescription' element value. �������� �������
     * 
     * @param objectDescription
     */
    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    /** 
     * Get the 'ObjectType' element value. ��� �������
     * 
     * @return value
     */
    public String getObjectType() {
        return objectType;
    }

    /** 
     * Set the 'ObjectType' element value. ��� �������
     * 
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /** 
     * Get the 'ObjectNum' element value. ����� �������
     * 
     * @return value
     */
    public String getObjectNum() {
        return objectNum;
    }

    /** 
     * Set the 'ObjectNum' element value. ����� �������
     * 
     * @param objectNum
     */
    public void setObjectNum(String objectNum) {
        this.objectNum = objectNum;
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
