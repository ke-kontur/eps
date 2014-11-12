
package ru.acs.fts.schemas.album.ktsout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.CUKTSCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSGoodsItemType;

/** 
 * КТС. Сведения о корректируемых товарах
 */
public class KTSoutCUGoodsItemType extends KTSGoodsItemType
{
    private List<KTSoutPresentedDocumentsType> KTSoutPresentedDocumentList = new ArrayList<KTSoutPresentedDocumentsType>();
    private List<CUKTSCustomsPaymentCalculationType> KTSCustomsPaymentCalculationList = new ArrayList<CUKTSCustomsPaymentCalculationType>();
    private ESADCustomsProcedureType customsProcedure;
    private List<AutomobileType> goodsAutomobileList = new ArrayList<AutomobileType>();

    /** 
     * Get the list of 'KTSoutPresentedDocuments' element items. КТС. Представленные документы
     * 
     * @return list
     */
    public List<KTSoutPresentedDocumentsType> getKTSoutPresentedDocumentList() {
        return KTSoutPresentedDocumentList;
    }

    /** 
     * Set the list of 'KTSoutPresentedDocuments' element items. КТС. Представленные документы
     * 
     * @param list
     */
    public void setKTSoutPresentedDocumentList(
            List<KTSoutPresentedDocumentsType> list) {
        KTSoutPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'KTSCustomsPaymentCalculation' element items. КТС. Исчисление платежей
     * 
     * @return list
     */
    public List<CUKTSCustomsPaymentCalculationType> getKTSCustomsPaymentCalculationList() {
        return KTSCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'KTSCustomsPaymentCalculation' element items. КТС. Исчисление платежей
     * 
     * @param list
     */
    public void setKTSCustomsPaymentCalculationList(
            List<CUKTSCustomsPaymentCalculationType> list) {
        KTSCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the 'CustomsProcedure' element value. Процедура. гр 37
     * 
     * @return value
     */
    public ESADCustomsProcedureType getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Процедура. гр 37
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(ESADCustomsProcedureType customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the list of 'GoodsAutomobile' element items. Сведения об автомобилях. Гр. 31
     * 
     * @return list
     */
    public List<AutomobileType> getGoodsAutomobileList() {
        return goodsAutomobileList;
    }

    /** 
     * Set the list of 'GoodsAutomobile' element items. Сведения об автомобилях. Гр. 31
     * 
     * @param list
     */
    public void setGoodsAutomobileList(List<AutomobileType> list) {
        goodsAutomobileList = list;
    }
}
