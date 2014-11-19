
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

/** 
 * Пломбы или опознавательные знаки (число, идентификация)
 */
public class IdentityMarkType
{
    private String identityNumber;
    private String markDescription;

    /** 
     * Get the 'IdentityNumber' element value. Количество
     * 
     * @return value
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /** 
     * Set the 'IdentityNumber' element value. Количество
     * 
     * @param identityNumber
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    /** 
     * Get the 'MarkDescription' element value. Описание и идентификация 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Описание и идентификация 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }
}
