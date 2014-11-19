
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * �������� �����
 */
public class DescriptionConsignmentType
{
    private String originCountryName;
    private String transMeans;
    private List<String> goodsNameList = new ArrayList<String>();
    private String goodsQuantity;
    private String plantName;
    private String declaredPoint;
    private String measureUnitQualifierName;
    private SertifOrgBaseType consignee;
    private SertifOrgBaseType exporter;
    private PackagingType packaging;
    private List<ExciseType> exciseList = new ArrayList<ExciseType>();

    /** 
     * Get the 'OriginCountryName' element value. ����� �������������
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ����� �������������
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'TransMeans' element value. ���������� ������ ���������������
     * 
     * @return value
     */
    public String getTransMeans() {
        return transMeans;
    }

    /** 
     * Set the 'TransMeans' element value. ���������� ������ ���������������
     * 
     * @param transMeans
     */
    public void setTransMeans(String transMeans) {
        this.transMeans = transMeans;
    }

    /** 
     * Get the list of 'GoodsName' element items. ������������ ���������
     * 
     * @return list
     */
    public List<String> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. ������������ ���������
     * 
     * @param list
     */
    public void setGoodsNameList(List<String> list) {
        goodsNameList = list;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ���������
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'PlantName' element value. ������������ �������� ��������
     * 
     * @return value
     */
    public String getPlantName() {
        return plantName;
    }

    /** 
     * Set the 'PlantName' element value. ������������ �������� ��������
     * 
     * @param plantName
     */
    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    /** 
     * Get the 'DeclaredPoint' element value. ���������� ����� �����
     * 
     * @return value
     */
    public String getDeclaredPoint() {
        return declaredPoint;
    }

    /** 
     * Set the 'DeclaredPoint' element value. ���������� ����� �����
     * 
     * @param declaredPoint
     */
    public void setDeclaredPoint(String declaredPoint) {
        this.declaredPoint = declaredPoint;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. ������������ ������� ���������. 
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. ������������ ������� ���������. 
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public SertifOrgBaseType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(SertifOrgBaseType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Exporter' element value. �����������
     * 
     * @return value
     */
    public SertifOrgBaseType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. �����������
     * 
     * @param exporter
     */
    public void setExporter(SertifOrgBaseType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Packaging' element value. �������� � ���������� ���� � �������� ��������
     * 
     * @return value
     */
    public PackagingType getPackaging() {
        return packaging;
    }

    /** 
     * Set the 'Packaging' element value. �������� � ���������� ���� � �������� ��������
     * 
     * @param packaging
     */
    public void setPackaging(PackagingType packaging) {
        this.packaging = packaging;
    }

    /** 
     * Get the list of 'Excise' element items. ������������� ����� (����������)
     * 
     * @return list
     */
    public List<ExciseType> getExciseList() {
        return exciseList;
    }

    /** 
     * Set the list of 'Excise' element items. ������������� ����� (����������)
     * 
     * @param list
     */
    public void setExciseList(List<ExciseType> list) {
        exciseList = list;
    }
}
