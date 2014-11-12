
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PrecedingDocumentType;

/** 
 * ESAD. �������������� ���������.
 */
public class ESADPrecedingDocumentType extends PrecedingDocumentType
{
    private String addNumberPart;

    /** 
     * Get the 'AddNumberPart' element value. �������������� �������� - �������������� ������������ ������ (����������� ��� �������� ������ ������������� � ������ ���������� ���������� ("��")) 
     * 
     * @return value
     */
    public String getAddNumberPart() {
        return addNumberPart;
    }

    /** 
     * Set the 'AddNumberPart' element value. �������������� �������� - �������������� ������������ ������ (����������� ��� �������� ������ ������������� � ������ ���������� ���������� ("��")) 
     * 
     * @param addNumberPart
     */
    public void setAddNumberPart(String addNumberPart) {
        this.addNumberPart = addNumberPart;
    }
}
