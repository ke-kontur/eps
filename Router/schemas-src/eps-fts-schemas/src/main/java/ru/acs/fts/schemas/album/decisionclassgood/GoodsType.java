
package ru.acs.fts.schemas.album.decisionclassgood;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupInformationType;

/** 
 * �����
 */
public class GoodsType
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String isPartialGood;
    private String additionalInformation;
    private List<GoodsGroupInformationType> goodsInformationList = new ArrayList<GoodsGroupInformationType>();
    private List<NumericTNVEDCodeType> numericTNVEDCodeList = new ArrayList<NumericTNVEDCodeType>();

    /** 
     * Get the list of 'GoodDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'IsPartialGood' element value. ������� �������� ������� � ��������� ����� ������
     * 
     * @return value
     */
    public String getIsPartialGood() {
        return isPartialGood;
    }

    /** 
     * Set the 'IsPartialGood' element value. ������� �������� ������� � ��������� ����� ������
     * 
     * @param isPartialGood
     */
    public void setIsPartialGood(String isPartialGood) {
        this.isPartialGood = isPartialGood;
    }

    /** 
     * Get the 'AdditionalInformation' element value. �������������� ���������� ��� ������������� ������
     * 
     * @return value
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /** 
     * Set the 'AdditionalInformation' element value. �������������� ���������� ��� ������������� ������
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /** 
     * Get the list of 'GoodsInformation' element items. �������������� ������
     * 
     * @return list
     */
    public List<GoodsGroupInformationType> getGoodsInformationList() {
        return goodsInformationList;
    }

    /** 
     * Set the list of 'GoodsInformation' element items. �������������� ������
     * 
     * @param list
     */
    public void setGoodsInformationList(List<GoodsGroupInformationType> list) {
        goodsInformationList = list;
    }

    /** 
     * Get the list of 'Numeric_TNVEDCode' element items. �������� � ������ ������ �� �� � ���������� ���� ������ �� �� ��� ��
     * 
     * @return list
     */
    public List<NumericTNVEDCodeType> getNumericTNVEDCodeList() {
        return numericTNVEDCodeList;
    }

    /** 
     * Set the list of 'Numeric_TNVEDCode' element items. �������� � ������ ������ �� �� � ���������� ���� ������ �� �� ��� ��
     * 
     * @param list
     */
    public void setNumericTNVEDCodeList(List<NumericTNVEDCodeType> list) {
        numericTNVEDCodeList = list;
    }
}
