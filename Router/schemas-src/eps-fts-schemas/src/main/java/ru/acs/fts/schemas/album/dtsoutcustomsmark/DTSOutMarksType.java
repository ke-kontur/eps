
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTSOfficialMarkType;

/** 
 * Отметки инспектора.
 */
public class DTSOutMarksType extends DTSOfficialMarkType
{
    private String identifierDescription;

    /** 
     * Get the 'IdentifierDescription' element value. Описание идентификатора отметки
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. Описание идентификатора отметки
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }
}
