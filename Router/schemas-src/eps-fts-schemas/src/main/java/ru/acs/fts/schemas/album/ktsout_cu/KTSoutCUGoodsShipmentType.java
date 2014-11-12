
package ru.acs.fts.schemas.album.ktsout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSContractTermsType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSGoodsShipmentType;

/** 
 * КТС. Внешний формат. Сведения о товарной партии
 */
public class KTSoutCUGoodsShipmentType extends KTSGoodsShipmentType
{
    private KTSContractTermsType KTSContractTerms;
    private List<KTSoutCUGoodsItemType> KTSoutGoodsItemList = new ArrayList<KTSoutCUGoodsItemType>();

    /** 
     * Get the 'KTSContractTerms' element value. КТС - Сведения об  условиях поставки, валюте и общей стоимости. (гр. 20, 22, 23, 24)
     * 
     * @return value
     */
    public KTSContractTermsType getKTSContractTerms() {
        return KTSContractTerms;
    }

    /** 
     * Set the 'KTSContractTerms' element value. КТС - Сведения об  условиях поставки, валюте и общей стоимости. (гр. 20, 22, 23, 24)
     * 
     * @param KTSContractTerms
     */
    public void setKTSContractTerms(KTSContractTermsType KTSContractTerms) {
        this.KTSContractTerms = KTSContractTerms;
    }

    /** 
     * Get the list of 'KTSoutGoodsItem' element items. КТС. Сведения о корректируемом товаре
     * 
     * @return list
     */
    public List<KTSoutCUGoodsItemType> getKTSoutGoodsItemList() {
        return KTSoutGoodsItemList;
    }

    /** 
     * Set the list of 'KTSoutGoodsItem' element items. КТС. Сведения о корректируемом товаре
     * 
     * @param list
     */
    public void setKTSoutGoodsItemList(List<KTSoutCUGoodsItemType> list) {
        KTSoutGoodsItemList = list;
    }
}
