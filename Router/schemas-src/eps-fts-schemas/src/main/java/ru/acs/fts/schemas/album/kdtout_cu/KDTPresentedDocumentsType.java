
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;

/** 
 * �������������� ���������. ��. 44
 */
public class KDTPresentedDocumentsType extends CUESADPresentedDocumentsType
{
    private String regNumberDocument;

    /** 
     * Get the 'RegNumberDocument' element value. ��������������� ����� ����������� ���������, � ������� �� ��� ������������� ������������. ��� ��  
     * 
     * @return value
     */
    public String getRegNumberDocument() {
        return regNumberDocument;
    }

    /** 
     * Set the 'RegNumberDocument' element value. ��������������� ����� ����������� ���������, � ������� �� ��� ������������� ������������. ��� ��  
     * 
     * @param regNumberDocument
     */
    public void setRegNumberDocument(String regNumberDocument) {
        this.regNumberDocument = regNumberDocument;
    }
}
