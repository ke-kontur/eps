
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * ���������� � ����������� ������ �� �������� ������
 */
public class SCVVConsignmentType extends SCVVShipmentFactInfoType
{
    private GTDInqType DTID;

    /** 
     * Get the 'DTID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDInqType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. ��������������� ����� ��.
     * 
     * @param DTID
     */
    public void setDTID(GTDInqType DTID) {
        this.DTID = DTID;
    }
}
