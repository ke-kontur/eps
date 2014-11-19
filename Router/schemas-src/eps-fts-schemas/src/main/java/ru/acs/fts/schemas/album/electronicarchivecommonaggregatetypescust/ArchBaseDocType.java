
package ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust;

/** 
 * ������� ��� ��������� �� ������
 */
public class ArchBaseDocType extends ArchBaseType
{
    private String archDocID;
    private String archDocumentID;

    /** 
     * Get the 'ArchDocID' element value. ������������� ��������� � ������
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. ������������� ��������� � ������
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'ArchDocumentID' element value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getArchDocumentID() {
        return archDocumentID;
    }

    /** 
     * Set the 'ArchDocumentID' element value. ���������� ������������� ���������
     * 
     * @param archDocumentID
     */
    public void setArchDocumentID(String archDocumentID) {
        this.archDocumentID = archDocumentID;
    }
}
