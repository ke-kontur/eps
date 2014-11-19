
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � �����, �����������  ������� � ��������
 */
public class PersonInfType extends PersonBaseType
{
    private String signatureFlag;

    /** 
     * Get the 'SignatureFlag' element value. �������, �������������� ���� ������� ���: 0 - �� ��������� 1 - ���������
     * 
     * @return value
     */
    public String getSignatureFlag() {
        return signatureFlag;
    }

    /** 
     * Set the 'SignatureFlag' element value. �������, �������������� ���� ������� ���: 0 - �� ��������� 1 - ���������
     * 
     * @param signatureFlag
     */
    public void setSignatureFlag(String signatureFlag) {
        this.signatureFlag = signatureFlag;
    }
}
