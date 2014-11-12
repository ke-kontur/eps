
package ru.acs.fts.schemas.album.ktsout_cu;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;

/** 
 * ���. �������������� ���������
 */
public class KTSoutPresentedDocumentsType extends CUESADPresentedDocumentsType
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
