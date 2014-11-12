
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Покупатель/продавец
 */
public class BuyerSellerType
{
    private String buyer;
    private String seller;

    /** 
     * Get the 'Buyer' element value. Признак того, что условия поставки были предложены покупателем
     * 
     * @return value
     */
    public String getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. Признак того, что условия поставки были предложены покупателем
     * 
     * @param buyer
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seller' element value. Признак того, что условия поставки были предложены продавцом
     * 
     * @return value
     */
    public String getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. Признак того, что условия поставки были предложены продавцом
     * 
     * @param seller
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }
}
