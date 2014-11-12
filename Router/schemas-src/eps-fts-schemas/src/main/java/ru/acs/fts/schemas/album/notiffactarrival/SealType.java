
package ru.acs.fts.schemas.album.notiffactarrival;

/** 
 * �������� � ��������� �������������
 */
public class SealType
{
    private String identNumber;
    private String identKind;
    private String identDesc;
    private String quantity;

    /** 
     * Get the 'IdentNumber' element value. ����� ����������� �������� �������������
     * 
     * @return value
     */
    public String getIdentNumber() {
        return identNumber;
    }

    /** 
     * Set the 'IdentNumber' element value. ����� ����������� �������� �������������
     * 
     * @param identNumber
     */
    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
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

    /** 
     * Get the 'Quantity' element value. ����������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
