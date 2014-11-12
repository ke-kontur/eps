
package ru.acs.fts.schemas.album.repudinotreatment;

/** 
 * Причины отказа
 */
public class RepudReasonType
{
    private String reasonDescription;

    /** 
     * Get the 'ReasonDescription' element value. Описание причины отказа
     * 
     * @return value
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /** 
     * Set the 'ReasonDescription' element value. Описание причины отказа
     * 
     * @param reasonDescription
     */
    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }
}
