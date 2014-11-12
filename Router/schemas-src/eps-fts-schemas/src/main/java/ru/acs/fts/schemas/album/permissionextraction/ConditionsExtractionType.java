
package ru.acs.fts.schemas.album.permissionextraction;

/** 
 * ������� ������ (������) ������ ������������� ��������
 */
public class ConditionsExtractionType
{
    private String miningRegion;
    private String typeResources;
    private String productionQuota;
    private String productionMethod;
    private String termExtraction;
    private String measurementUnitTime;

    /** 
     * Get the 'MiningRegion' element value. ����� ������ (������) ������ ����������� � (���) ��������������� �������
     * 
     * @return value
     */
    public String getMiningRegion() {
        return miningRegion;
    }

    /** 
     * Set the 'MiningRegion' element value. ����� ������ (������) ������ ����������� � (���) ��������������� �������
     * 
     * @param miningRegion
     */
    public void setMiningRegion(String miningRegion) {
        this.miningRegion = miningRegion;
    }

    /** 
     * Get the 'TypeResources' element value. ���� ������ �����������
     * 
     * @return value
     */
    public String getTypeResources() {
        return typeResources;
    }

    /** 
     * Set the 'TypeResources' element value. ���� ������ �����������
     * 
     * @param typeResources
     */
    public void setTypeResources(String typeResources) {
        this.typeResources = typeResources;
    }

    /** 
     * Get the 'ProductionQuota' element value. ����� (������) ������ (������) ������ �����������
     * 
     * @return value
     */
    public String getProductionQuota() {
        return productionQuota;
    }

    /** 
     * Set the 'ProductionQuota' element value. ����� (������) ������ (������) ������ �����������
     * 
     * @param productionQuota
     */
    public void setProductionQuota(String productionQuota) {
        this.productionQuota = productionQuota;
    }

    /** 
     * Get the 'ProductionMethod' element value. ������, ������� ������ (������) ������ �����������
     * 
     * @return value
     */
    public String getProductionMethod() {
        return productionMethod;
    }

    /** 
     * Set the 'ProductionMethod' element value. ������, ������� ������ (������) ������ �����������
     * 
     * @param productionMethod
     */
    public void setProductionMethod(String productionMethod) {
        this.productionMethod = productionMethod;
    }

    /** 
     * Get the 'TermExtraction' element value. ����� ������ (������) ������ �����������
     * 
     * @return value
     */
    public String getTermExtraction() {
        return termExtraction;
    }

    /** 
     * Set the 'TermExtraction' element value. ����� ������ (������) ������ �����������
     * 
     * @param termExtraction
     */
    public void setTermExtraction(String termExtraction) {
        this.termExtraction = termExtraction;
    }

    /** 
     * Get the 'MeasurementUnitTime' element value. ������� ��������� �������
     * 
     * @return value
     */
    public String getMeasurementUnitTime() {
        return measurementUnitTime;
    }

    /** 
     * Set the 'MeasurementUnitTime' element value. ������� ��������� �������
     * 
     * @param measurementUnitTime
     */
    public void setMeasurementUnitTime(String measurementUnitTime) {
        this.measurementUnitTime = measurementUnitTime;
    }
}
