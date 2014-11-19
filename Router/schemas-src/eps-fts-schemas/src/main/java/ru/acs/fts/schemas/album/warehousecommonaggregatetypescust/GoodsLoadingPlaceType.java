
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Местонахождение товаров
 */
public class GoodsLoadingPlaceType
{
    private String customsCode;
    private int choiceSelect = -1;
    private static final int WAREHOUSE_CHOICE = 0;
    private static final int OTHER_LOADING_PLACE_CHOICE = 1;
    private WarehouseType warehouse;
    private OtherLoadingPlaceType otherLoadingPlace;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, в зоне деятельности которого находятся товары
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, в зоне деятельности которого находятся товары
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
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
     * Check if Warehouse is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifWarehouse() {
        return choiceSelect == WAREHOUSE_CHOICE;
    }

    /** 
     * Get the 'Warehouse' element value. Сведения о  СВХ на котором находятся товары
     * 
     * @return value
     */
    public WarehouseType getWarehouse() {
        return warehouse;
    }

    /** 
     * Set the 'Warehouse' element value. Сведения о  СВХ на котором находятся товары
     * 
     * @param warehouse
     */
    public void setWarehouse(WarehouseType warehouse) {
        setChoiceSelect(WAREHOUSE_CHOICE);
        this.warehouse = warehouse;
    }

    /** 
     * Check if OtherLoadingPlace is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifOtherLoadingPlace() {
        return choiceSelect == OTHER_LOADING_PLACE_CHOICE;
    }

    /** 
     * Get the 'OtherLoadingPlace' element value. Иное место нахождения товаров
     * 
     * @return value
     */
    public OtherLoadingPlaceType getOtherLoadingPlace() {
        return otherLoadingPlace;
    }

    /** 
     * Set the 'OtherLoadingPlace' element value. Иное место нахождения товаров
     * 
     * @param otherLoadingPlace
     */
    public void setOtherLoadingPlace(OtherLoadingPlaceType otherLoadingPlace) {
        setChoiceSelect(OTHER_LOADING_PLACE_CHOICE);
        this.otherLoadingPlace = otherLoadingPlace;
    }
}
