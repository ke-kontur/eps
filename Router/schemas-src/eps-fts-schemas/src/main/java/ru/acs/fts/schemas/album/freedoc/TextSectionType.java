
package ru.acs.fts.schemas.album.freedoc;

/** 
 * Текстовый раздел документа
 */
public class TextSectionType extends TextParagrType
{
    private String sectionName;

    /** 
     * Get the 'SectionName' element value. Наименование раздела
     * 
     * @return value
     */
    public String getSectionName() {
        return sectionName;
    }

    /** 
     * Set the 'SectionName' element value. Наименование раздела
     * 
     * @param sectionName
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
