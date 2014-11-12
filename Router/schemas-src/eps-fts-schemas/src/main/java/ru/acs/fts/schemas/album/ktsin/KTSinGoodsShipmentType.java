
package ru.acs.fts.schemas.album.ktsin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSContractTermsType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSGoodsShipmentType;

/** 
 * КТС. Внутренний формат. Сведения о товарной партии.
 */
public class KTSinGoodsShipmentType extends KTSGoodsShipmentType
{
    private KTSContractTermsType KTSContractTerms;
    private List<KTSinGoodsItemType> KTSinGoodsItemList = new ArrayList<KTSinGoodsItemType>();
    private List<KTSinCommonOfficialMarkType> KTSinCommonOfficialMarkList = new ArrayList<KTSinCommonOfficialMarkType>();

    /** 
     * Get the 'KTSContractTerms' element value. КТС - Сведения об  условиях поставки, валюте и общей стоимости. (гр. 12, 20, 22,23)
     * 
     * @return value
     */
    public KTSContractTermsType getKTSContractTerms() {
        return KTSContractTerms;
    }

    /** 
     * Set the 'KTSContractTerms' element value. КТС - Сведения об  условиях поставки, валюте и общей стоимости. (гр. 12, 20, 22,23)
     * 
     * @param KTSContractTerms
     */
    public void setKTSContractTerms(KTSContractTermsType KTSContractTerms) {
        this.KTSContractTerms = KTSContractTerms;
    }

    /** 
     * Get the list of 'KTSinGoodsItem' element items. КТС. Внутренний формат. Сведения о товарах.
     * 
     * @return list
     */
    public List<KTSinGoodsItemType> getKTSinGoodsItemList() {
        return KTSinGoodsItemList;
    }

    /** 
     * Set the list of 'KTSinGoodsItem' element items. КТС. Внутренний формат. Сведения о товарах.
     * 
     * @param list
     */
    public void setKTSinGoodsItemList(List<KTSinGoodsItemType> list) {
        KTSinGoodsItemList = list;
    }

    /** 
     * Get the list of 'KTSinCommonOfficialMark' element items. КТС. Внутренний формат. Служебные отметки общие.
     * 
     * @return list
     */
    public List<KTSinCommonOfficialMarkType> getKTSinCommonOfficialMarkList() {
        return KTSinCommonOfficialMarkList;
    }

    /** 
     * Set the list of 'KTSinCommonOfficialMark' element items. КТС. Внутренний формат. Служебные отметки общие.
     * 
     * @param list
     */
    public void setKTSinCommonOfficialMarkList(
            List<KTSinCommonOfficialMarkType> list) {
        KTSinCommonOfficialMarkList = list;
    }
}
