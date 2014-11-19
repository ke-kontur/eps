
package ru.acs.fts.schemas.album.ktsin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSContractTermsType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSGoodsShipmentType;

/** 
 * ���. ���������� ������. �������� � �������� ������.
 */
public class KTSinGoodsShipmentType extends KTSGoodsShipmentType
{
    private KTSContractTermsType KTSContractTerms;
    private List<KTSinGoodsItemType> KTSinGoodsItemList = new ArrayList<KTSinGoodsItemType>();
    private List<KTSinCommonOfficialMarkType> KTSinCommonOfficialMarkList = new ArrayList<KTSinCommonOfficialMarkType>();

    /** 
     * Get the 'KTSContractTerms' element value. ��� - �������� ��  �������� ��������, ������ � ����� ���������. (��. 12, 20, 22,23)
     * 
     * @return value
     */
    public KTSContractTermsType getKTSContractTerms() {
        return KTSContractTerms;
    }

    /** 
     * Set the 'KTSContractTerms' element value. ��� - �������� ��  �������� ��������, ������ � ����� ���������. (��. 12, 20, 22,23)
     * 
     * @param KTSContractTerms
     */
    public void setKTSContractTerms(KTSContractTermsType KTSContractTerms) {
        this.KTSContractTerms = KTSContractTerms;
    }

    /** 
     * Get the list of 'KTSinGoodsItem' element items. ���. ���������� ������. �������� � �������.
     * 
     * @return list
     */
    public List<KTSinGoodsItemType> getKTSinGoodsItemList() {
        return KTSinGoodsItemList;
    }

    /** 
     * Set the list of 'KTSinGoodsItem' element items. ���. ���������� ������. �������� � �������.
     * 
     * @param list
     */
    public void setKTSinGoodsItemList(List<KTSinGoodsItemType> list) {
        KTSinGoodsItemList = list;
    }

    /** 
     * Get the list of 'KTSinCommonOfficialMark' element items. ���. ���������� ������. ��������� ������� �����.
     * 
     * @return list
     */
    public List<KTSinCommonOfficialMarkType> getKTSinCommonOfficialMarkList() {
        return KTSinCommonOfficialMarkList;
    }

    /** 
     * Set the list of 'KTSinCommonOfficialMark' element items. ���. ���������� ������. ��������� ������� �����.
     * 
     * @param list
     */
    public void setKTSinCommonOfficialMarkList(
            List<KTSinCommonOfficialMarkType> list) {
        KTSinCommonOfficialMarkList = list;
    }
}
