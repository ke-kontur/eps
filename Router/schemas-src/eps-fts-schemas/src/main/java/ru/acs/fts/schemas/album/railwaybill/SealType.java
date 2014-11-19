
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * ���������� � ����� �����,  ���������� �� ����� ��� ���������
 */
public class SealType
{
    private String sealID;
    private String sealQuantity;
    private String identKind;
    private String identDesc;

    /** 
     * Get the 'SealID' element value. ����� ������
     * 
     * @return value
     */
    public String getSealID() {
        return sealID;
    }

    /** 
     * Set the 'SealID' element value. ����� ������
     * 
     * @param sealID
     */
    public void setSealID(String sealID) {
        this.sealID = sealID;
    }

    /** 
     * Get the 'SealQuantity' element value. ���������� �����,  ���������� �� ����� ��� ���������
     * 
     * @return value
     */
    public String getSealQuantity() {
        return sealQuantity;
    }

    /** 
     * Set the 'SealQuantity' element value. ���������� �����,  ���������� �� ����� ��� ���������
     * 
     * @param sealQuantity
     */
    public void setSealQuantity(String sealQuantity) {
        this.sealQuantity = sealQuantity;
    }

    /** 
     * Get the 'IdentKind' element value. ��� ������� �������������: 1 - ������, 2 - ������, 3 - ����
     * 
     * @return value
     */
    public String getIdentKind() {
        return identKind;
    }

    /** 
     * Set the 'IdentKind' element value. ��� ������� �������������: 1 - ������, 2 - ������, 3 - ����
     * 
     * @param identKind
     */
    public void setIdentKind(String identKind) {
        this.identKind = identKind;
    }

    /** 
     * Get the 'IdentDesc' element value. ���������� �� �������� �������������
     * 
     * @return value
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /** 
     * Set the 'IdentDesc' element value. ���������� �� �������� �������������
     * 
     * @param identDesc
     */
    public void setIdentDesc(String identDesc) {
        this.identDesc = identDesc;
    }
}
