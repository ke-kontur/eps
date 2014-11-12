
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Покупатель товаров
 */
public class BuyerGoodsType
{
    private String ownRetailNetwork;
    private String sellOneThreePersons;
    private String sellDifferentPersons;
    private String ownUse;

    /** 
     * Get the 'OwnRetailNetwork' element value. Признак того, что покупатель товаров реализует товары на внутреннем рынке Российской Федерации через собственную розничную сеть
     * 
     * @return value
     */
    public String getOwnRetailNetwork() {
        return ownRetailNetwork;
    }

    /** 
     * Set the 'OwnRetailNetwork' element value. Признак того, что покупатель товаров реализует товары на внутреннем рынке Российской Федерации через собственную розничную сеть
     * 
     * @param ownRetailNetwork
     */
    public void setOwnRetailNetwork(String ownRetailNetwork) {
        this.ownRetailNetwork = ownRetailNetwork;
    }

    /** 
     * Get the 'SellOne_ThreePersons' element value. Признак того, что покупатель товаров продает (планирует продать) товары одному - трем лицам
     * 
     * @return value
     */
    public String getSellOneThreePersons() {
        return sellOneThreePersons;
    }

    /** 
     * Set the 'SellOne_ThreePersons' element value. Признак того, что покупатель товаров продает (планирует продать) товары одному - трем лицам
     * 
     * @param sellOneThreePersons
     */
    public void setSellOneThreePersons(String sellOneThreePersons) {
        this.sellOneThreePersons = sellOneThreePersons;
    }

    /** 
     * Get the 'SellDifferentPersons' element value. Признак того, что покупатель товаров продает (планирует продать) товары разным лицам
     * 
     * @return value
     */
    public String getSellDifferentPersons() {
        return sellDifferentPersons;
    }

    /** 
     * Set the 'SellDifferentPersons' element value. Признак того, что покупатель товаров продает (планирует продать) товары разным лицам
     * 
     * @param sellDifferentPersons
     */
    public void setSellDifferentPersons(String sellDifferentPersons) {
        this.sellDifferentPersons = sellDifferentPersons;
    }

    /** 
     * Get the 'OwnUse' element value. Признак того, что покупатель товаров использует товары для собственного потребления или в собственной производственной деятельности
     * 
     * @return value
     */
    public String getOwnUse() {
        return ownUse;
    }

    /** 
     * Set the 'OwnUse' element value. Признак того, что покупатель товаров использует товары для собственного потребления или в собственной производственной деятельности
     * 
     * @param ownUse
     */
    public void setOwnUse(String ownUse) {
        this.ownUse = ownUse;
    }
}
