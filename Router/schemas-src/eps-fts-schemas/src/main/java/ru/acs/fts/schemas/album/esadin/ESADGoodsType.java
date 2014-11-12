
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADElectricalEnergyQuantityType;

/** 
 * Товарная часть. Гр. 31-47
 */
public class ESADGoodsType extends ESADGoodsItemType
{
    private String additionalSheetCount;
    private String formNumber;
    private String FKSIGN;
    private ESADContainerType ESADContainer;
    private ESADCustomsProcedureType ESADCustomsProcedure;
    private ESADGoodsQuotaType ESADGoodsQuota;
    private List<ESADElectricalEnergyQuantityType> ESADElectricalEnergyQuantityList = new ArrayList<ESADElectricalEnergyQuantityType>();
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private List<SupplementaryQuantityType> supplementaryGoodsQuantity1List = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'AdditionalSheetCount' element value. Порядковый номер листа
     * 
     * @return value
     */
    public String getAdditionalSheetCount() {
        return additionalSheetCount;
    }

    /** 
     * Set the 'AdditionalSheetCount' element value. Порядковый номер листа
     * 
     * @param additionalSheetCount
     */
    public void setAdditionalSheetCount(String additionalSheetCount) {
        this.additionalSheetCount = additionalSheetCount;
    }

    /** 
     * Get the 'FormNumber' element value. Резерв. Учетный номер бланка (не заполняется для случая FKSIGN='1')
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Резерв. Учетный номер бланка (не заполняется для случая FKSIGN='1')
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'FKSIGN' element value. Признак корректировки ДТ : "1"-заполняется при внесении изменений в ДТ  (в том числе после выпуска товаров) в случае корректировки, связанной с добавлением наименований товаров (например, в результате принятого таможенным органом решения о классификации товаров в соответствии с ТН ВЭД ТС товар, ранее заявленный как один, разбивается на несколько).
     * 
     * @return value
     */
    public String getFKSIGN() {
        return FKSIGN;
    }

    /** 
     * Set the 'FKSIGN' element value. Признак корректировки ДТ : "1"-заполняется при внесении изменений в ДТ  (в том числе после выпуска товаров) в случае корректировки, связанной с добавлением наименований товаров (например, в результате принятого таможенным органом решения о классификации товаров в соответствии с ТН ВЭД ТС товар, ранее заявленный как один, разбивается на несколько).
     * 
     * @param FKSIGN
     */
    public void setFKSIGN(String FKSIGN) {
        this.FKSIGN = FKSIGN;
    }

    /** 
     * Get the 'ESADContainer' element value. ESAD. Сведения о контейнерах.
     * 
     * @return value
     */
    public ESADContainerType getESADContainer() {
        return ESADContainer;
    }

    /** 
     * Set the 'ESADContainer' element value. ESAD. Сведения о контейнерах.
     * 
     * @param ESADContainer
     */
    public void setESADContainer(ESADContainerType ESADContainer) {
        this.ESADContainer = ESADContainer;
    }

    /** 
     * Get the 'ESADCustomsProcedure' element value. Процедура.
     * 
     * @return value
     */
    public ESADCustomsProcedureType getESADCustomsProcedure() {
        return ESADCustomsProcedure;
    }

    /** 
     * Set the 'ESADCustomsProcedure' element value. Процедура.
     * 
     * @param ESADCustomsProcedure
     */
    public void setESADCustomsProcedure(
            ESADCustomsProcedureType ESADCustomsProcedure) {
        this.ESADCustomsProcedure = ESADCustomsProcedure;
    }

    /** 
     * Get the 'ESADGoodsQuota' element value. Квота.
     * 
     * @return value
     */
    public ESADGoodsQuotaType getESADGoodsQuota() {
        return ESADGoodsQuota;
    }

    /** 
     * Set the 'ESADGoodsQuota' element value. Квота.
     * 
     * @param ESADGoodsQuota
     */
    public void setESADGoodsQuota(ESADGoodsQuotaType ESADGoodsQuota) {
        this.ESADGoodsQuota = ESADGoodsQuota;
    }

    /** 
     * Get the list of 'ESADElectricalEnergyQuantity' element items. Количество поставленной электроэнергии. Распоряжение ГТК РФ 350-р от 23.05.2002г.
     * 
     * @return list
     */
    public List<ESADElectricalEnergyQuantityType> getESADElectricalEnergyQuantityList() {
        return ESADElectricalEnergyQuantityList;
    }

    /** 
     * Set the list of 'ESADElectricalEnergyQuantity' element items. Количество поставленной электроэнергии. Распоряжение ГТК РФ 350-р от 23.05.2002г.
     * 
     * @param list
     */
    public void setESADElectricalEnergyQuantityList(
            List<ESADElectricalEnergyQuantityType> list) {
        ESADElectricalEnergyQuantityList = list;
    }

    /** 
     * Get the 'ESADGoodsPackaging' element value. Сведения о грузовых местах, поддонах и упаковке товаров.
     * 
     * @return value
     */
    public ESADGoodsPackagingType getESADGoodsPackaging() {
        return ESADGoodsPackaging;
    }

    /** 
     * Set the 'ESADGoodsPackaging' element value. Сведения о грузовых местах, поддонах и упаковке товаров.
     * 
     * @param ESADGoodsPackaging
     */
    public void setESADGoodsPackaging(ESADGoodsPackagingType ESADGoodsPackaging) {
        this.ESADGoodsPackaging = ESADGoodsPackaging;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения.
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения.
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the list of 'SupplementaryGoodsQuantity1' element items. Количество товара в единице измерения, отличной от основной и дополнительной (1)
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryGoodsQuantity1List() {
        return supplementaryGoodsQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryGoodsQuantity1' element items. Количество товара в единице измерения, отличной от основной и дополнительной (1)
     * 
     * @param list
     */
    public void setSupplementaryGoodsQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryGoodsQuantity1List = list;
    }
}
