
package ru.acs.fts.schemas.album.gtdreference;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ���������� � ������
 */
public class GoodsInformationType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String markIndicator;
    private DocumentBaseType sellPermitionDoc;
    private CUOrganizationType manufacturer;
    private List<DocumentBaseType> normDocList = new ArrayList<DocumentBaseType>();
    private DocumentBaseType contract;
    private SupplementaryQuantityType goodsPackingInfo;
    private SupplementaryQuantityType individualPackingInfo;

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'MarkIndicator' element value. ������� ������� �������� �����
     * 
     * @return value
     */
    public String getMarkIndicator() {
        return markIndicator;
    }

    /** 
     * Set the 'MarkIndicator' element value. ������� ������� �������� �����
     * 
     * @param markIndicator
     */
    public void setMarkIndicator(String markIndicator) {
        this.markIndicator = markIndicator;
    }

    /** 
     * Get the 'SellPermitionDoc' element value. ��������, �������������� ������� ���������� �� ����������
     * 
     * @return value
     */
    public DocumentBaseType getSellPermitionDoc() {
        return sellPermitionDoc;
    }

    /** 
     * Set the 'SellPermitionDoc' element value. ��������, �������������� ������� ���������� �� ����������
     * 
     * @param sellPermitionDoc
     */
    public void setSellPermitionDoc(DocumentBaseType sellPermitionDoc) {
        this.sellPermitionDoc = sellPermitionDoc;
    }

    /** 
     * Get the 'Manufacturer' element value. �������� � �������������
     * 
     * @return value
     */
    public CUOrganizationType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. �������� � �������������
     * 
     * @param manufacturer
     */
    public void setManufacturer(CUOrganizationType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the list of 'NormDocs' element items. �������� � ���������, ����������������� � ������������� ������������ ��������� ����������� ����������� �����������
     * 
     * @return list
     */
    public List<DocumentBaseType> getNormDocList() {
        return normDocList;
    }

    /** 
     * Set the list of 'NormDocs' element items. �������� � ���������, ����������������� � ������������� ������������ ��������� ����������� ����������� �����������
     * 
     * @param list
     */
    public void setNormDocList(List<DocumentBaseType> list) {
        normDocList = list;
    }

    /** 
     * Get the 'Contract' element value. ��������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������� ��������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'GoodsPackingInfo' element value. �������� � ���������� ������ � �������������� ��������
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsPackingInfo() {
        return goodsPackingInfo;
    }

    /** 
     * Set the 'GoodsPackingInfo' element value. �������� � ���������� ������ � �������������� ��������
     * 
     * @param goodsPackingInfo
     */
    public void setGoodsPackingInfo(SupplementaryQuantityType goodsPackingInfo) {
        this.goodsPackingInfo = goodsPackingInfo;
    }

    /** 
     * Get the 'IndividualPackingInfo' element value. �������� �� �������������� ��������
     * 
     * @return value
     */
    public SupplementaryQuantityType getIndividualPackingInfo() {
        return individualPackingInfo;
    }

    /** 
     * Set the 'IndividualPackingInfo' element value. �������� �� �������������� ��������
     * 
     * @param individualPackingInfo
     */
    public void setIndividualPackingInfo(
            SupplementaryQuantityType individualPackingInfo) {
        this.individualPackingInfo = individualPackingInfo;
    }
}
