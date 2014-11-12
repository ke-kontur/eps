
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

/** 
 * ������ ��� ��������������� ����� (�����, �������������)
 */
public class IdentityMarkType
{
    private String identityNumber;
    private String markDescription;

    /** 
     * Get the 'IdentityNumber' element value. ����������
     * 
     * @return value
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /** 
     * Set the 'IdentityNumber' element value. ����������
     * 
     * @param identityNumber
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    /** 
     * Get the 'MarkDescription' element value. �������� � ������������� 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. �������� � ������������� 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }
}
