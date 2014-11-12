
package ru.acs.fts.schemas.album.bartertransactionpasport;

import java.util.ArrayList;
import java.util.List;

/** 
 * Приложение к Паспорту бартерной сделки 
 */
public class EnclosureType
{
    private String exportIndicator;
    private String goodsTNVEDCode;
    private String goodsDescription;
    private String goodsQuantity;
    private String measureUnitQualifierCode;
    private String supplementaryQualifierName;
    private String price;
    private String cost1;
    private List<String> deliveryTermsStringCodeList = new ArrayList<String>();
    private String serviceModeCode;
    private Choice choice;

    /** 
     * Get the 'ExportIndicator' element value. Индикатор экспорта товаров, в случае импорта не заполняется
     * 
     * @return value
     */
    public String getExportIndicator() {
        return exportIndicator;
    }

    /** 
     * Set the 'ExportIndicator' element value. Индикатор экспорта товаров, в случае импорта не заполняется
     * 
     * @param exportIndicator
     */
    public void setExportIndicator(String exportIndicator) {
        this.exportIndicator = exportIndicator;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsDescription' element value. Описание товаров (услуг) 
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание товаров (услуг) 
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара в указанных единицах измерения
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара в указанных единицах измерения
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Код единицы измерения
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Код единицы измерения
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'SupplementaryQualifierName' element value. Название единицы измерения при возможности ее указания
     * 
     * @return value
     */
    public String getSupplementaryQualifierName() {
        return supplementaryQualifierName;
    }

    /** 
     * Set the 'SupplementaryQualifierName' element value. Название единицы измерения при возможности ее указания
     * 
     * @param supplementaryQualifierName
     */
    public void setSupplementaryQualifierName(String supplementaryQualifierName) {
        this.supplementaryQualifierName = supplementaryQualifierName;
    }

    /** 
     * Get the 'Price' element value. Цена единицы экспортируемого (импортируемого) товара в валюте цены Договора.
     * 
     * @return value
     */
    public String getPrice() {
        return price;
    }

    /** 
     * Set the 'Price' element value. Цена единицы экспортируемого (импортируемого) товара в валюте цены Договора.
     * 
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /** 
     * Get the 'Cost1' element value. Стоимость (в тысячах денежных единиц) экспортируемых (импортируемых) товаров, работ, услуг, результатов интеллектуальной деятельности в валюте цены Договора на условиях основного базиса поставки.
     * 
     * @return value
     */
    public String getCost1() {
        return cost1;
    }

    /** 
     * Set the 'Cost1' element value. Стоимость (в тысячах денежных единиц) экспортируемых (импортируемых) товаров, работ, услуг, результатов интеллектуальной деятельности в валюте цены Договора на условиях основного базиса поставки.
     * 
     * @param cost1
     */
    public void setCost1(String cost1) {
        this.cost1 = cost1;
    }

    /** 
     * Get the list of 'DeliveryTermsStringCode' element items. Код базиса поставки экспортируемых (импортируемых) товаров в соответствии с Международными правилами толкования торговых терминов ИНКОТЕРМС
     * 
     * @return list
     */
    public List<String> getDeliveryTermsStringCodeList() {
        return deliveryTermsStringCodeList;
    }

    /** 
     * Set the list of 'DeliveryTermsStringCode' element items. Код базиса поставки экспортируемых (импортируемых) товаров в соответствии с Международными правилами толкования торговых терминов ИНКОТЕРМС
     * 
     * @param list
     */
    public void setDeliveryTermsStringCodeList(List<String> list) {
        deliveryTermsStringCodeList = list;
    }

    /** 
     * Get the 'ServiceModeCode' element value. Коды работ и услуг согласно Классификатору услуг во внешнеэкономической деятельности 
     * 
     * @return value
     */
    public String getServiceModeCode() {
        return serviceModeCode;
    }

    /** 
     * Set the 'ServiceModeCode' element value. Коды работ и услуг согласно Классификатору услуг во внешнеэкономической деятельности 
     * 
     * @param serviceModeCode
     */
    public void setServiceModeCode(String serviceModeCode) {
        this.serviceModeCode = serviceModeCode;
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
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int IMPORT_GOODS_COST_CHOICE = 0;
        private static final int EXPORT_GOODS_COST_CHOICE = 1;
        private GoodsCostType importGoodsCost;
        private GoodsCostType exportGoodsCost;

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
         * Check if ImportGoodsCost is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifImportGoodsCost() {
            return choiceSelect == IMPORT_GOODS_COST_CHOICE;
        }

        /** 
         * Get the 'ImportGoodsCost' element value. Итоговая стоимость импортируемых товаров, работ, услуг, результатов интеллектуальной деятельности
         * 
         * @return value
         */
        public GoodsCostType getImportGoodsCost() {
            return importGoodsCost;
        }

        /** 
         * Set the 'ImportGoodsCost' element value. Итоговая стоимость импортируемых товаров, работ, услуг, результатов интеллектуальной деятельности
         * 
         * @param importGoodsCost
         */
        public void setImportGoodsCost(GoodsCostType importGoodsCost) {
            setChoiceSelect(IMPORT_GOODS_COST_CHOICE);
            this.importGoodsCost = importGoodsCost;
        }

        /** 
         * Check if ExportGoodsCost is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifExportGoodsCost() {
            return choiceSelect == EXPORT_GOODS_COST_CHOICE;
        }

        /** 
         * Get the 'ExportGoodsCost' element value. Итоговая стоимость экспортируемых товаров, работ, услуг, результатов интеллектуальной деятельности
         * 
         * @return value
         */
        public GoodsCostType getExportGoodsCost() {
            return exportGoodsCost;
        }

        /** 
         * Set the 'ExportGoodsCost' element value. Итоговая стоимость экспортируемых товаров, работ, услуг, результатов интеллектуальной деятельности
         * 
         * @param exportGoodsCost
         */
        public void setExportGoodsCost(GoodsCostType exportGoodsCost) {
            setChoiceSelect(EXPORT_GOODS_COST_CHOICE);
            this.exportGoodsCost = exportGoodsCost;
        }
    }
}
