
package ru.acs.fts.schemas.album.sqcommonaggregatetypescust;

/** 
 * Сведения о заключении
 */
public class ConclusionType extends DocumentType
{
    private String conclusionType;

    /** 
     * Get the 'ConclusionType' element value. Тип заключения
     * 
     * @return value
     */
    public String getConclusionType() {
        return conclusionType;
    }

    /** 
     * Set the 'ConclusionType' element value. Тип заключения
     * 
     * @param conclusionType
     */
    public void setConclusionType(String conclusionType) {
        this.conclusionType = conclusionType;
    }
}
