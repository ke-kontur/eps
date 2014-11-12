
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTSOfficialMarkType;

/** 
 * ������� ����������.
 */
public class DTSOutMarksType extends DTSOfficialMarkType
{
    private String identifierDescription;

    /** 
     * Get the 'IdentifierDescription' element value. �������� �������������� �������
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. �������� �������������� �������
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }
}
