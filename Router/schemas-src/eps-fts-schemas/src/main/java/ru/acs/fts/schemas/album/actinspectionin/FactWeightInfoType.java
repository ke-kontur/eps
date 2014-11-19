
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * �������� �� ����� ����������� ���� �������
 */
public class FactWeightInfoType
{
    private String weightNettoFact;
    private String weightBruttoFact;
    private String weightMethodKind;
    private String weightMetodDesc;

    /** 
     * Get the 'WeightNettoFact' element value. ����������� ��� ������ �����, ��
     * 
     * @return value
     */
    public String getWeightNettoFact() {
        return weightNettoFact;
    }

    /** 
     * Set the 'WeightNettoFact' element value. ����������� ��� ������ �����, ��
     * 
     * @param weightNettoFact
     */
    public void setWeightNettoFact(String weightNettoFact) {
        this.weightNettoFact = weightNettoFact;
    }

    /** 
     * Get the 'WeightBruttoFact' element value. ����������� ��� ������ ������, ��
     * 
     * @return value
     */
    public String getWeightBruttoFact() {
        return weightBruttoFact;
    }

    /** 
     * Set the 'WeightBruttoFact' element value. ����������� ��� ������ ������, ��
     * 
     * @param weightBruttoFact
     */
    public void setWeightBruttoFact(String weightBruttoFact) {
        this.weightBruttoFact = weightBruttoFact;
    }

    /** 
     * Get the 'WeightMethodKind' element value. ������ ����������� ������������ ���� �������: "1" - ����������� �����������,  "2" - ����������� �������� ���� ������ ����� ������������ ���������� ����, "3" - ��������� �����, "4" - ������.
     * 
     * @return value
     */
    public String getWeightMethodKind() {
        return weightMethodKind;
    }

    /** 
     * Set the 'WeightMethodKind' element value. ������ ����������� ������������ ���� �������: "1" - ����������� �����������,  "2" - ����������� �������� ���� ������ ����� ������������ ���������� ����, "3" - ��������� �����, "4" - ������.
     * 
     * @param weightMethodKind
     */
    public void setWeightMethodKind(String weightMethodKind) {
        this.weightMethodKind = weightMethodKind;
    }

    /** 
     * Get the 'WeightMetodDesc' element value. ���������� � ������� �����������: ���������� ���������� ����, �������� ��������, �������� ������� ������� �����������.
     * 
     * @return value
     */
    public String getWeightMetodDesc() {
        return weightMetodDesc;
    }

    /** 
     * Set the 'WeightMetodDesc' element value. ���������� � ������� �����������: ���������� ���������� ����, �������� ��������, �������� ������� ������� �����������.
     * 
     * @param weightMetodDesc
     */
    public void setWeightMetodDesc(String weightMetodDesc) {
        this.weightMetodDesc = weightMetodDesc;
    }
}
