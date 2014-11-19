
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;

/** 
 * Сведения о товарах
 */
public class ESADoutGoodsPType extends ESADGoodsItemPType
{
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private SupplementaryQuantityType supplementaryQuantity;
    private ESADGoodsQuotaType ESADGoodsQuota;
    private ESADCustomsProcedureType ESADCustomsProcedure;
    private List<CUESADPresentedDocumentsType> ESADoutPresentedDocumentPList = new ArrayList<CUESADPresentedDocumentsType>();
    private List<CUCustomsPaymentCalculationType> customsPaymentCalcPList = new ArrayList<CUCustomsPaymentCalculationType>();

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
     * Get the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
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
     * Get the list of 'ESADoutPresentedDocumentP' element items. Предоставляемые документы
     * 
     * @return list
     */
    public List<CUESADPresentedDocumentsType> getESADoutPresentedDocumentPList() {
        return ESADoutPresentedDocumentPList;
    }

    /** 
     * Set the list of 'ESADoutPresentedDocumentP' element items. Предоставляемые документы
     * 
     * @param list
     */
    public void setESADoutPresentedDocumentPList(
            List<CUESADPresentedDocumentsType> list) {
        ESADoutPresentedDocumentPList = list;
    }

    /** 
     * Get the list of 'CustomsPaymentCalcP' element items. Расчет таможенных платежей
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getCustomsPaymentCalcPList() {
        return customsPaymentCalcPList;
    }

    /** 
     * Set the list of 'CustomsPaymentCalcP' element items. Расчет таможенных платежей
     * 
     * @param list
     */
    public void setCustomsPaymentCalcPList(
            List<CUCustomsPaymentCalculationType> list) {
        customsPaymentCalcPList = list;
    }
}
