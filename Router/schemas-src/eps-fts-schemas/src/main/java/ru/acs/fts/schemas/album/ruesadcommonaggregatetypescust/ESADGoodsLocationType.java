
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Местонахождение товаров. Гр. 30. 
 */
public class ESADGoodsLocationType
{
    private String informationTypeCode;
    private int choiceSelect = -1;
    private static final int GOODS_LOCATION_WAREHOUSE_CHOICE = 0;
    private static final int GOODS_LOCATION_PLACE_CHOICE = 1;
    private static final int ST_TRANSPORT_CHOICE = 2;
    private WarehousePlaceType goodsLocationWarehouse;
    private GoodsLocationPlaceType goodsLocationPlace;
    private StTransportType stTransport;

    /** 
     * Get the 'InformationTypeCode' element value. Код информации.
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. Код информации.
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if GoodsLocationWarehouse is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifGoodsLocationWarehouse() {
        return choiceSelect == GOODS_LOCATION_WAREHOUSE_CHOICE;
    }

    /** 
     * Get the 'GoodsLocationWarehouse' element value. Сведения о местонахождении товаров. Сведения о таможенном складе, СВХ.
     * 
     * @return value
     */
    public WarehousePlaceType getGoodsLocationWarehouse() {
        return goodsLocationWarehouse;
    }

    /** 
     * Set the 'GoodsLocationWarehouse' element value. Сведения о местонахождении товаров. Сведения о таможенном складе, СВХ.
     * 
     * @param goodsLocationWarehouse
     */
    public void setGoodsLocationWarehouse(
            WarehousePlaceType goodsLocationWarehouse) {
        setChoiceSelect(GOODS_LOCATION_WAREHOUSE_CHOICE);
        this.goodsLocationWarehouse = goodsLocationWarehouse;
    }

    /** 
     * Check if GoodsLocationPlace is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifGoodsLocationPlace() {
        return choiceSelect == GOODS_LOCATION_PLACE_CHOICE;
    }

    /** 
     * Get the 'GoodsLocationPlace' element value. Сведения о местонахождении товара. (склад получателя, иное место).
     * 
     * @return value
     */
    public GoodsLocationPlaceType getGoodsLocationPlace() {
        return goodsLocationPlace;
    }

    /** 
     * Set the 'GoodsLocationPlace' element value. Сведения о местонахождении товара. (склад получателя, иное место).
     * 
     * @param goodsLocationPlace
     */
    public void setGoodsLocationPlace(GoodsLocationPlaceType goodsLocationPlace) {
        setChoiceSelect(GOODS_LOCATION_PLACE_CHOICE);
        this.goodsLocationPlace = goodsLocationPlace;
    }

    /** 
     * Check if StTransport is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifStTransport() {
        return choiceSelect == ST_TRANSPORT_CHOICE;
    }

    /** 
     * Get the 'StTransport' element value. Наименование стационарного вида транспорта: ТРУБОПРОВОДНЫЙ / ЭЛЕКТРОПЕРЕДАЧА
     * 
     * @return value
     */
    public StTransportType getStTransport() {
        return stTransport;
    }

    /** 
     * Set the 'StTransport' element value. Наименование стационарного вида транспорта: ТРУБОПРОВОДНЫЙ / ЭЛЕКТРОПЕРЕДАЧА
     * 
     * @param stTransport
     */
    public void setStTransport(StTransportType stTransport) {
        setChoiceSelect(ST_TRANSPORT_CHOICE);
        this.stTransport = stTransport;
    }
}
