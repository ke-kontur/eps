
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ѕокупатель/продавец
 */
public class BuyerSellerType
{
    private String buyer;
    private String seller;

    /** 
     * Get the 'Buyer' element value. ѕризнак того, что услови€ поставки были предложены покупателем
     * 
     * @return value
     */
    public String getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. ѕризнак того, что услови€ поставки были предложены покупателем
     * 
     * @param buyer
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seller' element value. ѕризнак того, что услови€ поставки были предложены продавцом
     * 
     * @return value
     */
    public String getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. ѕризнак того, что услови€ поставки были предложены продавцом
     * 
     * @param seller
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }
}
