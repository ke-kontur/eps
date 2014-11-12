
package ru.acs.fts.schemas.album.gtdreference;

/** 
 * Раздел Б.Сведения о сделках
 */
public class BSideDealInfoType
{
    private OrgDealInfoType seller;
    private OrgDealInfoType buyer;

    /** 
     * Get the 'Seller' element value. Сведения, касающиеся организации-продавца
     * 
     * @return value
     */
    public OrgDealInfoType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. Сведения, касающиеся организации-продавца
     * 
     * @param seller
     */
    public void setSeller(OrgDealInfoType seller) {
        this.seller = seller;
    }

    /** 
     * Get the 'Buyer' element value. Сведения, касающиеся организации-покупателя
     * 
     * @return value
     */
    public OrgDealInfoType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. Сведения, касающиеся организации-покупателя
     * 
     * @param buyer
     */
    public void setBuyer(OrgDealInfoType buyer) {
        this.buyer = buyer;
    }
}
