
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Поставляемый товар
 */
public class DeliveryGoodsType
{
    private String retail;
    private String packingSorting;
    private String productionRawMaterial;
    private String meansProduction;
    private String ownConsumption;

    /** 
     * Get the 'Retail' element value. Признак того, что поставляемый товар подготовлен для розничной продажи
     * 
     * @return value
     */
    public String getRetail() {
        return retail;
    }

    /** 
     * Set the 'Retail' element value. Признак того, что поставляемый товар подготовлен для розничной продажи
     * 
     * @param retail
     */
    public void setRetail(String retail) {
        this.retail = retail;
    }

    /** 
     * Get the 'PackingSorting' element value. Признак того, что поставляемый товар требует упаковки, сортировки перед розничной продажей
     * 
     * @return value
     */
    public String getPackingSorting() {
        return packingSorting;
    }

    /** 
     * Set the 'PackingSorting' element value. Признак того, что поставляемый товар требует упаковки, сортировки перед розничной продажей
     * 
     * @param packingSorting
     */
    public void setPackingSorting(String packingSorting) {
        this.packingSorting = packingSorting;
    }

    /** 
     * Get the 'ProductionRawMaterial' element value. Признак того, что поставляемый товар предназначен для использования в производстве в качестве сырья или сопутствующих товаров
     * 
     * @return value
     */
    public String getProductionRawMaterial() {
        return productionRawMaterial;
    }

    /** 
     * Set the 'ProductionRawMaterial' element value. Признак того, что поставляемый товар предназначен для использования в производстве в качестве сырья или сопутствующих товаров
     * 
     * @param productionRawMaterial
     */
    public void setProductionRawMaterial(String productionRawMaterial) {
        this.productionRawMaterial = productionRawMaterial;
    }

    /** 
     * Get the 'MeansProduction' element value. Признак того, что поставляемый товар будет использован в качестве средства производства
     * 
     * @return value
     */
    public String getMeansProduction() {
        return meansProduction;
    }

    /** 
     * Set the 'MeansProduction' element value. Признак того, что поставляемый товар будет использован в качестве средства производства
     * 
     * @param meansProduction
     */
    public void setMeansProduction(String meansProduction) {
        this.meansProduction = meansProduction;
    }

    /** 
     * Get the 'OwnConsumption' element value. Признак того, что поставляемый товар предназначен для собственного потребления
     * 
     * @return value
     */
    public String getOwnConsumption() {
        return ownConsumption;
    }

    /** 
     * Set the 'OwnConsumption' element value. Признак того, что поставляемый товар предназначен для собственного потребления
     * 
     * @param ownConsumption
     */
    public void setOwnConsumption(String ownConsumption) {
        this.ownConsumption = ownConsumption;
    }
}
