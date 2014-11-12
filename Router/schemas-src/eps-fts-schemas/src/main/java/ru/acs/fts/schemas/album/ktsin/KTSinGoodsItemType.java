
package ru.acs.fts.schemas.album.ktsin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.CUKTSCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSGoodsItemType;

/** 
 * ���. ���������� ������. �������� � �������.
 */
public class KTSinGoodsItemType extends KTSGoodsItemType
{
    private List<CUESADPresentedDocumentsType> KTSinPresentedDocumentList = new ArrayList<CUESADPresentedDocumentsType>();
    private List<CUKTSCustomsPaymentCalculationType> KTSinCustomsPaymentCalculationList = new ArrayList<CUKTSCustomsPaymentCalculationType>();
    private List<KTSinGoodsOfficialMarkType> KTSinGoodsOfficialMarkList = new ArrayList<KTSinGoodsOfficialMarkType>();
    private List<AutomobileType> goodsAutomobileList = new ArrayList<AutomobileType>();

    /** 
     * Get the list of 'KTSinPresentedDocuments' element items. ���. ���������� ������. �������������� ���������.
     * 
     * @return list
     */
    public List<CUESADPresentedDocumentsType> getKTSinPresentedDocumentList() {
        return KTSinPresentedDocumentList;
    }

    /** 
     * Set the list of 'KTSinPresentedDocuments' element items. ���. ���������� ������. �������������� ���������.
     * 
     * @param list
     */
    public void setKTSinPresentedDocumentList(
            List<CUESADPresentedDocumentsType> list) {
        KTSinPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'KTSinCustomsPaymentCalculation' element items. ���. ���������� ������. ���������� ���������� ��������
     * 
     * @return list
     */
    public List<CUKTSCustomsPaymentCalculationType> getKTSinCustomsPaymentCalculationList() {
        return KTSinCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'KTSinCustomsPaymentCalculation' element items. ���. ���������� ������. ���������� ���������� ��������
     * 
     * @param list
     */
    public void setKTSinCustomsPaymentCalculationList(
            List<CUKTSCustomsPaymentCalculationType> list) {
        KTSinCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the list of 'KTSinGoodsOfficialMark' element items. ���. ���������� ������. ��������� ������� �� �������.
     * 
     * @return list
     */
    public List<KTSinGoodsOfficialMarkType> getKTSinGoodsOfficialMarkList() {
        return KTSinGoodsOfficialMarkList;
    }

    /** 
     * Set the list of 'KTSinGoodsOfficialMark' element items. ���. ���������� ������. ��������� ������� �� �������.
     * 
     * @param list
     */
    public void setKTSinGoodsOfficialMarkList(
            List<KTSinGoodsOfficialMarkType> list) {
        KTSinGoodsOfficialMarkList = list;
    }

    /** 
     * Get the list of 'GoodsAutomobile' element items. �������� �� �����������. ��. 31.
     * 
     * @return list
     */
    public List<AutomobileType> getGoodsAutomobileList() {
        return goodsAutomobileList;
    }

    /** 
     * Set the list of 'GoodsAutomobile' element items. �������� �� �����������. ��. 31.
     * 
     * @param list
     */
    public void setGoodsAutomobileList(List<AutomobileType> list) {
        goodsAutomobileList = list;
    }
}
