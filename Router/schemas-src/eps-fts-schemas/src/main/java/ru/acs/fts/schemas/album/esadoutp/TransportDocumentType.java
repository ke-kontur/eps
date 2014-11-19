
package ru.acs.fts.schemas.album.esadoutp;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ������������ ����������
 */
public class TransportDocumentType extends DocumentBaseType
{
    private String holder;

    /** 
     * Get the 'Holder' element value. ��������� ���������
     * 
     * @return value
     */
    public String getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. ��������� ���������
     * 
     * @param holder
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }
}
