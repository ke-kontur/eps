
package ru.acs.fts.schemas.album.archlist;

/** 
 * ������� ������ ������� ����������
 */
public class ArchiveListType
{
    private String archID;
    private String archName;

    /** 
     * Get the 'ArchID' element value. ������������� ������
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. ������������� ������
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchName' element value. ������������ ������
     * 
     * @return value
     */
    public String getArchName() {
        return archName;
    }

    /** 
     * Set the 'ArchName' element value. ������������ ������
     * 
     * @param archName
     */
    public void setArchName(String archName) {
        this.archName = archName;
    }
}
