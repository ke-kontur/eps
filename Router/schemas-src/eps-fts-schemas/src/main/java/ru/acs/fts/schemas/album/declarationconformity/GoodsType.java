
package ru.acs.fts.schemas.album.declarationconformity;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������
 */
public class GoodsType extends AppendsType
{
    private String productCode;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String seriesSign;
    private String normDocs;
    private List<ManufacturerType> manufacturerList = new ArrayList<ManufacturerType>();
    private List<GoodsInformationType> goodsInformationList = new ArrayList<GoodsInformationType>();
    private TypeDeclarationType typeDeclaration;
    private DocumentBaseType contract;

    /** 
     * Get the 'ProductCode' element value. ��� ��������� �� ��005 - ��������������� �������������� ���������
     * 
     * @return value
     */
    public String getProductCode() {
        return productCode;
    }

    /** 
     * Set the 'ProductCode' element value. ��� ��������� �� ��005 - ��������������� �������������� ���������
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������ ��������� (������������, ���, ���, ����� ���������, ����������� ���������, ����������� ������� ��� ����� ���������, �� �������� ��� ����������� (��� ��������� ��������� ������ �� �������� �������������. ��� ������ � ���������� ������� �������� ����� � ������ ������ ��� ����� �������, ����� � ���� ������ ���������, �������� (���������), ��������� � �������� � �.�.)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������ ��������� (������������, ���, ���, ����� ���������, ����������� ���������, ����������� ������� ��� ����� ���������, �� �������� ��� ����������� (��� ��������� ��������� ������ �� �������� �������������. ��� ������ � ���������� ������� �������� ����� � ������ ������ ��� ����� �������, ����� � ���� ������ ���������, �������� (���������), ��������� � �������� � �.�.)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'SeriesSign' element value. �������: 1 - "��������� �������", 2 - "������", 3 - "�������� ������"
     * 
     * @return value
     */
    public String getSeriesSign() {
        return seriesSign;
    }

    /** 
     * Set the 'SeriesSign' element value. �������: 1 - "��������� �������", 2 - "������", 3 - "�������� ������"
     * 
     * @param seriesSign
     */
    public void setSeriesSign(String seriesSign) {
        this.seriesSign = seriesSign;
    }

    /** 
     * Get the 'NormDocs' element value. ����������� ����������, �� ��������� ������� ����������� ���������
     * 
     * @return value
     */
    public String getNormDocs() {
        return normDocs;
    }

    /** 
     * Set the 'NormDocs' element value. ����������� ����������, �� ��������� ������� ����������� ���������
     * 
     * @param normDocs
     */
    public void setNormDocs(String normDocs) {
        this.normDocs = normDocs;
    }

    /** 
     * Get the list of 'Manufacturer' element items. �������� � ������������
     * 
     * @return list
     */
    public List<ManufacturerType> getManufacturerList() {
        return manufacturerList;
    }

    /** 
     * Set the list of 'Manufacturer' element items. �������� � ������������
     * 
     * @param list
     */
    public void setManufacturerList(List<ManufacturerType> list) {
        manufacturerList = list;
    }

    /** 
     * Get the list of 'GoodsInformation' element items. �������������� ������
     * 
     * @return list
     */
    public List<GoodsInformationType> getGoodsInformationList() {
        return goodsInformationList;
    }

    /** 
     * Set the list of 'GoodsInformation' element items. �������������� ������
     * 
     * @param list
     */
    public void setGoodsInformationList(List<GoodsInformationType> list) {
        goodsInformationList = list;
    }

    /** 
     * Get the 'TypeDeclaration' element value. �������� � ���� ������� ��������������
     * 
     * @return value
     */
    public TypeDeclarationType getTypeDeclaration() {
        return typeDeclaration;
    }

    /** 
     * Set the 'TypeDeclaration' element value. �������� � ���� ������� ��������������
     * 
     * @param typeDeclaration
     */
    public void setTypeDeclaration(TypeDeclarationType typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
    }

    /** 
     * Get the 'Contract' element value. �������� � ���������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. �������� � ���������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }
}
