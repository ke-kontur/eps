
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Заказ товара
 */
public class OrderGoodsType
{
    private String specially;
    private String serially;
    private String supplyStore;
    private String supplyStoreComments;
    private String timeTable;
    private String exhibition;
    private String secondHand;

    /** 
     * Get the 'Specially' element value. Признак того, что товар произведен специально для покупателя и не является серийным
     * 
     * @return value
     */
    public String getSpecially() {
        return specially;
    }

    /** 
     * Set the 'Specially' element value. Признак того, что товар произведен специально для покупателя и не является серийным
     * 
     * @param specially
     */
    public void setSpecially(String specially) {
        this.specially = specially;
    }

    /** 
     * Get the 'Serially' element value. Признак того, что товар серийного производства произведен по предварительному заказу покупателя
     * 
     * @return value
     */
    public String getSerially() {
        return serially;
    }

    /** 
     * Set the 'Serially' element value. Признак того, что товар серийного производства произведен по предварительному заказу покупателя
     * 
     * @param serially
     */
    public void setSerially(String serially) {
        this.serially = serially;
    }

    /** 
     * Get the 'SupplyStore' element value. Признак того, что товар поставляется по отдельным заказам со склада
     * 
     * @return value
     */
    public String getSupplyStore() {
        return supplyStore;
    }

    /** 
     * Set the 'SupplyStore' element value. Признак того, что товар поставляется по отдельным заказам со склада
     * 
     * @param supplyStore
     */
    public void setSupplyStore(String supplyStore) {
        this.supplyStore = supplyStore;
    }

    /** 
     * Get the 'SupplyStoreComments' element value. Товар поставляется по отдельным заказам со склада, указать собственника склада либо, соответственно, лицо, заключавшее договор на хранение на складе (например, производитель, продавец, отправитель)
     * 
     * @return value
     */
    public String getSupplyStoreComments() {
        return supplyStoreComments;
    }

    /** 
     * Set the 'SupplyStoreComments' element value. Товар поставляется по отдельным заказам со склада, указать собственника склада либо, соответственно, лицо, заключавшее договор на хранение на складе (например, производитель, продавец, отправитель)
     * 
     * @param supplyStoreComments
     */
    public void setSupplyStoreComments(String supplyStoreComments) {
        this.supplyStoreComments = supplyStoreComments;
    }

    /** 
     * Get the 'Time-table' element value. Признак того, что товар поставляется по предварительно согласованному графику
     * 
     * @return value
     */
    public String getTimeTable() {
        return timeTable;
    }

    /** 
     * Set the 'Time-table' element value. Признак того, что товар поставляется по предварительно согласованному графику
     * 
     * @param timeTable
     */
    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

    /** 
     * Get the 'Exhibition' element value. Признак того, что товар поставляется с выставки, витрины, после испытаний
     * 
     * @return value
     */
    public String getExhibition() {
        return exhibition;
    }

    /** 
     * Set the 'Exhibition' element value. Признак того, что товар поставляется с выставки, витрины, после испытаний
     * 
     * @param exhibition
     */
    public void setExhibition(String exhibition) {
        this.exhibition = exhibition;
    }

    /** 
     * Get the 'Second-hand' element value. Признак того, что товар, бывший в употреблении, поставляется от бывшего владельца
     * 
     * @return value
     */
    public String getSecondHand() {
        return secondHand;
    }

    /** 
     * Set the 'Second-hand' element value. Признак того, что товар, бывший в употреблении, поставляется от бывшего владельца
     * 
     * @param secondHand
     */
    public void setSecondHand(String secondHand) {
        this.secondHand = secondHand;
    }
}
