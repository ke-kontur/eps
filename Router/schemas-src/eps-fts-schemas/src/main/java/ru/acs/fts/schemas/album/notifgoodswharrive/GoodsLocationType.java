
package ru.acs.fts.schemas.album.notifgoodswharrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGoodsLocationPlaceType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUTransportType;

/** 
 * Местонахождение товара
 */
public class GoodsLocationType
{
    private String customsOffice;
    private String customsCountryCode;
    private Choice choice;
    private AddressType address;

    /** 
     * Get the 'CustomsOffice' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Код таможенного органа
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(String customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice getChoice() {
        return choice;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice
     */
    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    /** 
     * Get the 'Address' element value. Точный адрес местонахождения товаров.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Точный адрес местонахождения товаров.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int GOODS_LOCATION_WAREHOUSE_CHOICE = 0;
        private static final int CU_GOODS_LOCATION_PLACE_CHOICE = 1;
        private static final int CU_TRANSPORT_CHOICE = 2;
        private GoodsLocationWarehouseType goodsLocationWarehouse;
        private CUGoodsLocationPlaceType CUGoodsLocationPlace;
        private CUTransportType CUTransport;

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
         * Get the 'GoodsLocationWarehouse' element value. Сведения о местонахождении товаров: таможенный склад, склад временного хранения, свободный склад, склад получателя, иные
         * 
         * @return value
         */
        public GoodsLocationWarehouseType getGoodsLocationWarehouse() {
            return goodsLocationWarehouse;
        }

        /** 
         * Set the 'GoodsLocationWarehouse' element value. Сведения о местонахождении товаров: таможенный склад, склад временного хранения, свободный склад, склад получателя, иные
         * 
         * @param goodsLocationWarehouse
         */
        public void setGoodsLocationWarehouse(
                GoodsLocationWarehouseType goodsLocationWarehouse) {
            setChoiceSelect(GOODS_LOCATION_WAREHOUSE_CHOICE);
            this.goodsLocationWarehouse = goodsLocationWarehouse;
        }

        /** 
         * Check if CUGoodsLocationPlace is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifCUGoodsLocationPlace() {
            return choiceSelect == CU_GOODS_LOCATION_PLACE_CHOICE;
        }

        /** 
         * Get the 'CUGoodsLocationPlace' element value. Сведения о местонахождении товара.
         * 
         * @return value
         */
        public CUGoodsLocationPlaceType getCUGoodsLocationPlace() {
            return CUGoodsLocationPlace;
        }

        /** 
         * Set the 'CUGoodsLocationPlace' element value. Сведения о местонахождении товара.
         * 
         * @param CUGoodsLocationPlace
         */
        public void setCUGoodsLocationPlace(
                CUGoodsLocationPlaceType CUGoodsLocationPlace) {
            setChoiceSelect(CU_GOODS_LOCATION_PLACE_CHOICE);
            this.CUGoodsLocationPlace = CUGoodsLocationPlace;
        }

        /** 
         * Check if CUTransport is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifCUTransport() {
            return choiceSelect == CU_TRANSPORT_CHOICE;
        }

        /** 
         * Get the 'CUTransport' element value. Сведения о местонахождении товаров - транспортное средство
         * 
         * @return value
         */
        public CUTransportType getCUTransport() {
            return CUTransport;
        }

        /** 
         * Set the 'CUTransport' element value. Сведения о местонахождении товаров - транспортное средство
         * 
         * @param CUTransport
         */
        public void setCUTransport(CUTransportType CUTransport) {
            setChoiceSelect(CU_TRANSPORT_CHOICE);
            this.CUTransport = CUTransport;
        }
    }
}
