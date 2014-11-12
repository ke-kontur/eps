
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Вид договора: иной
 */
public class OtherKindContractType extends DescriptionKindContractType
{
    private String otherComments;

    /** 
     * Get the 'OtherComments' element value. Иной (указать вид)
     * 
     * @return value
     */
    public String getOtherComments() {
        return otherComments;
    }

    /** 
     * Set the 'OtherComments' element value. Иной (указать вид)
     * 
     * @param otherComments
     */
    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }
}
