
package ru.acs.fts.schemas.album.custexpertresult;

/** 
 * �������� ������������� ������
 */
public class ConventionalEconomicEffectType extends SumType
{
    private String section;
    private String quantityDrug;
    private String measureUnitQualifierName;
    private String kind;

    /** 
     * Get the 'Section' element value. ������: 1- ��������� ������� �������, ������ ������� ��������; 2 - ��������� �������������� � ������������������ ������� (�� ������� ����), ���� (�����) ������� �� (�) ���������� �� ��������; 3 - ��������� ����������� (������������) � �����/������ �������; 4- ��� ������������� ������� (�� ������� ����)
     * 
     * @return value
     */
    public String getSection() {
        return section;
    }

    /** 
     * Set the 'Section' element value. ������: 1- ��������� ������� �������, ������ ������� ��������; 2 - ��������� �������������� � ������������������ ������� (�� ������� ����), ���� (�����) ������� �� (�) ���������� �� ��������; 3 - ��������� ����������� (������������) � �����/������ �������; 4- ��� ������������� ������� (�� ������� ����)
     * 
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /** 
     * Get the 'QuantityDrug' element value. ��� ������������� ������� (�� ������� ����)
     * 
     * @return value
     */
    public String getQuantityDrug() {
        return quantityDrug;
    }

    /** 
     * Set the 'QuantityDrug' element value. ��� ������������� ������� (�� ������� ����)
     * 
     * @param quantityDrug
     */
    public void setQuantityDrug(String quantityDrug) {
        this.quantityDrug = quantityDrug;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. ������������ ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. ������������ ������� ���������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'Kind' element value. ���
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. ���
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
}
