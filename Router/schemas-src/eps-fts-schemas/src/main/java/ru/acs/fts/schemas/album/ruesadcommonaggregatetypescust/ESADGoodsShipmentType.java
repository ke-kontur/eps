
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Сведения о товарной партии.
 */
public class ESADGoodsShipmentType
{
    private String originCountryName;
    private String specificationNumber;
    private String specificationListNumber;
    private String totalGoodsNumber;
    private String totalPackageNumber;
    private String totalSheetNumber;
    private String totalCustCost;
    private String custCostCurrencyCode;

    /** 
     * Get the 'OriginCountryName' element value. Страна происхождения товара. Наименование / РАЗНЫЕ/ НЕИЗВЕСТНА
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Страна происхождения товара. Наименование / РАЗНЫЕ/ НЕИЗВЕСТНА
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'SpecificationNumber' element value. Общее количество представленных спецификаций.
     * 
     * @return value
     */
    public String getSpecificationNumber() {
        return specificationNumber;
    }

    /** 
     * Set the 'SpecificationNumber' element value. Общее количество представленных спецификаций.
     * 
     * @param specificationNumber
     */
    public void setSpecificationNumber(String specificationNumber) {
        this.specificationNumber = specificationNumber;
    }

    /** 
     * Get the 'SpecificationListNumber' element value. Общее количество листов представленных спецификаций.
     * 
     * @return value
     */
    public String getSpecificationListNumber() {
        return specificationListNumber;
    }

    /** 
     * Set the 'SpecificationListNumber' element value. Общее количество листов представленных спецификаций.
     * 
     * @param specificationListNumber
     */
    public void setSpecificationListNumber(String specificationListNumber) {
        this.specificationListNumber = specificationListNumber;
    }

    /** 
     * Get the 'TotalGoodsNumber' element value. Всего наименований товаров.
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. Всего наименований товаров.
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'TotalPackageNumber' element value. Общее количество грузовых мест.
     * 
     * @return value
     */
    public String getTotalPackageNumber() {
        return totalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. Общее количество грузовых мест.
     * 
     * @param totalPackageNumber
     */
    public void setTotalPackageNumber(String totalPackageNumber) {
        this.totalPackageNumber = totalPackageNumber;
    }

    /** 
     * Get the 'TotalSheetNumber' element value. Общее количество комплектов ТД1/ТД2,  ТД3/ТД4 или КТД1/КТД2.
     * 
     * @return value
     */
    public String getTotalSheetNumber() {
        return totalSheetNumber;
    }

    /** 
     * Set the 'TotalSheetNumber' element value. Общее количество комплектов ТД1/ТД2,  ТД3/ТД4 или КТД1/КТД2.
     * 
     * @param totalSheetNumber
     */
    public void setTotalSheetNumber(String totalSheetNumber) {
        this.totalSheetNumber = totalSheetNumber;
    }

    /** 
     * Get the 'TotalCustCost' element value. Сведения о стоимости/общая таможенная стоимость
     * 
     * @return value
     */
    public String getTotalCustCost() {
        return totalCustCost;
    }

    /** 
     * Set the 'TotalCustCost' element value. Сведения о стоимости/общая таможенная стоимость
     * 
     * @param totalCustCost
     */
    public void setTotalCustCost(String totalCustCost) {
        this.totalCustCost = totalCustCost;
    }

    /** 
     * Get the 'CustCostCurrencyCode' element value. Цифровой код валюты таможенной стоимости.
     * 
     * @return value
     */
    public String getCustCostCurrencyCode() {
        return custCostCurrencyCode;
    }

    /** 
     * Set the 'CustCostCurrencyCode' element value. Цифровой код валюты таможенной стоимости.
     * 
     * @param custCostCurrencyCode
     */
    public void setCustCostCurrencyCode(String custCostCurrencyCode) {
        this.custCostCurrencyCode = custCostCurrencyCode;
    }
}
