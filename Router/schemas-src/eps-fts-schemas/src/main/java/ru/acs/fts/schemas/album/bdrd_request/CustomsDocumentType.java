
package ru.acs.fts.schemas.album.bdrd_request;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ��������
 */
public class CustomsDocumentType extends GTDIDType
{
    private String docKind;

    /** 
     * Get the 'DocKind' element value. ��� �������������� ���������: 1 - �� (���������� �� ������); 2 - �� (���������� ����������); 3 - �� (��������� � ��������); 4 - �� (��������� �� ������)
     * 
     * @return value
     */
    public String getDocKind() {
        return docKind;
    }

    /** 
     * Set the 'DocKind' element value. ��� �������������� ���������: 1 - �� (���������� �� ������); 2 - �� (���������� ����������); 3 - �� (��������� � ��������); 4 - �� (��������� �� ������)
     * 
     * @param docKind
     */
    public void setDocKind(String docKind) {
        this.docKind = docKind;
    }
}
