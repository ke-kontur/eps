
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPresentedDocumentsType;

/** 
 * �� � ��. ���������� ������. �������������� ��������� ��. 44.
 */
public class ESADinPresentedDocumentType extends CUPresentedDocumentsType
{
    private String BDRDID;

    /** 
     * Get the 'BDRDID' element value. ���������� ������������� ��������������� ���������
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ���������� ������������� ��������������� ���������
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }
}
