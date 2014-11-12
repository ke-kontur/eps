
package ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������� ��� ��� ������
 */
public class ArchBaseType extends BaseDocType
{
    private String archDeclID;
    private String archID;

    /** 
     * Get the 'ArchDeclID' element value. ������������� ���������� � ������. 
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. ������������� ���������� � ������. 
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

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
}
