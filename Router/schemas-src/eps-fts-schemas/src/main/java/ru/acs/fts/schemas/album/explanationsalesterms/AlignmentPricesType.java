
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * —огласование цены сделки.
 */
public class AlignmentPricesType
{
    private String negotiations;
    private String correspondence;
    private String negotiationsCorrespondence;
    private String negotiationsComments;

    /** 
     * Get the 'Negotiations' element value. ѕризнак согласовани€ цены сделки путем личных переговоров представителей продавца и покупател€
     * 
     * @return value
     */
    public String getNegotiations() {
        return negotiations;
    }

    /** 
     * Set the 'Negotiations' element value. ѕризнак согласовани€ цены сделки путем личных переговоров представителей продавца и покупател€
     * 
     * @param negotiations
     */
    public void setNegotiations(String negotiations) {
        this.negotiations = negotiations;
    }

    /** 
     * Get the 'Correspondence' element value. ѕризнак согласовани€ цены сделки по переписке
     * 
     * @return value
     */
    public String getCorrespondence() {
        return correspondence;
    }

    /** 
     * Set the 'Correspondence' element value. ѕризнак согласовани€ цены сделки по переписке
     * 
     * @param correspondence
     */
    public void setCorrespondence(String correspondence) {
        this.correspondence = correspondence;
    }

    /** 
     * Get the 'NegotiationsCorrespondence' element value. ѕризнак согласовани€ цены сделки путем личных переговоров представителей продавца и покупател€ и по переписке
     * 
     * @return value
     */
    public String getNegotiationsCorrespondence() {
        return negotiationsCorrespondence;
    }

    /** 
     * Set the 'NegotiationsCorrespondence' element value. ѕризнак согласовани€ цены сделки путем личных переговоров представителей продавца и покупател€ и по переписке
     * 
     * @param negotiationsCorrespondence
     */
    public void setNegotiationsCorrespondence(String negotiationsCorrespondence) {
        this.negotiationsCorrespondence = negotiationsCorrespondence;
    }

    /** 
     * Get the 'NegotiationsComments' element value. ѕутем личных переговоров представителей продавца и покупател€ (укажите где и кто участвовал)
     * 
     * @return value
     */
    public String getNegotiationsComments() {
        return negotiationsComments;
    }

    /** 
     * Set the 'NegotiationsComments' element value. ѕутем личных переговоров представителей продавца и покупател€ (укажите где и кто участвовал)
     * 
     * @param negotiationsComments
     */
    public void setNegotiationsComments(String negotiationsComments) {
        this.negotiationsComments = negotiationsComments;
    }
}
