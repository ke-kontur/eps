
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * ������� ��������
 */
public class DegreeInspectionType
{
    private String weighing;
    private String convertingFreightPlace;
    private String chooseOpening;
    private String openingAllFreightPlace;
    private String convertingQuantityObjects;
    private String choose;
    private String all;
    private String measurementDeterminationBehaviourGoods;
    private String withoutThievingSampling;
    private String withThievingSampling;
    private String others;
    private String otherComments;

    /** 
     * Get the 'Weighing' element value. ����������� (������/����������/��� �����������).���� �������� ����: 1 - ������; 2 - ����������; 3 - ��� �����������.
     * 
     * @return value
     */
    public String getWeighing() {
        return weighing;
    }

    /** 
     * Set the 'Weighing' element value. ����������� (������/����������/��� �����������).���� �������� ����: 1 - ������; 2 - ����������; 3 - ��� �����������.
     * 
     * @param weighing
     */
    public void setWeighing(String weighing) {
        this.weighing = weighing;
    }

    /** 
     * Get the 'ConvertingFreightPlace' element value. �������� �������� ����.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getConvertingFreightPlace() {
        return convertingFreightPlace;
    }

    /** 
     * Set the 'ConvertingFreightPlace' element value. �������� �������� ����.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param convertingFreightPlace
     */
    public void setConvertingFreightPlace(String convertingFreightPlace) {
        this.convertingFreightPlace = convertingFreightPlace;
    }

    /** 
     * Get the 'ChooseOpening' element value. ���������� ���������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getChooseOpening() {
        return chooseOpening;
    }

    /** 
     * Set the 'ChooseOpening' element value. ���������� ���������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param chooseOpening
     */
    public void setChooseOpening(String chooseOpening) {
        this.chooseOpening = chooseOpening;
    }

    /** 
     * Get the 'OpeningAllFreightPlace' element value. ��������� ���� �������� ����. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getOpeningAllFreightPlace() {
        return openingAllFreightPlace;
    }

    /** 
     * Set the 'OpeningAllFreightPlace' element value. ��������� ���� �������� ����. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param openingAllFreightPlace
     */
    public void setOpeningAllFreightPlace(String openingAllFreightPlace) {
        this.openingAllFreightPlace = openingAllFreightPlace;
    }

    /** 
     * Get the 'ConvertingQuantityObjects' element value. �������� ���������� ��������� � �������� ������. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getConvertingQuantityObjects() {
        return convertingQuantityObjects;
    }

    /** 
     * Set the 'ConvertingQuantityObjects' element value. �������� ���������� ��������� � �������� ������. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param convertingQuantityObjects
     */
    public void setConvertingQuantityObjects(String convertingQuantityObjects) {
        this.convertingQuantityObjects = convertingQuantityObjects;
    }

    /** 
     * Get the 'Choose' element value. ���������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getChoose() {
        return choose;
    }

    /** 
     * Set the 'Choose' element value. ���������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param choose
     */
    public void setChoose(String choose) {
        this.choose = choose;
    }

    /** 
     * Get the 'All' element value. ����.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getAll() {
        return all;
    }

    /** 
     * Set the 'All' element value. ����.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param all
     */
    public void setAll(String all) {
        this.all = all;
    }

    /** 
     * Get the 'MeasurementDeterminationBehaviourGoods' element value. ��������� � ����������� ������������� ������� (� ��������� ���������/� ������ ���������).���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getMeasurementDeterminationBehaviourGoods() {
        return measurementDeterminationBehaviourGoods;
    }

    /** 
     * Set the 'MeasurementDeterminationBehaviourGoods' element value. ��������� � ����������� ������������� ������� (� ��������� ���������/� ������ ���������).���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param measurementDeterminationBehaviourGoods
     */
    public void setMeasurementDeterminationBehaviourGoods(
            String measurementDeterminationBehaviourGoods) {
        this.measurementDeterminationBehaviourGoods = measurementDeterminationBehaviourGoods;
    }

    /** 
     * Get the 'WithoutThievingSampling' element value. ��� ������ ���� � ��������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getWithoutThievingSampling() {
        return withoutThievingSampling;
    }

    /** 
     * Set the 'WithoutThievingSampling' element value. ��� ������ ���� � ��������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param withoutThievingSampling
     */
    public void setWithoutThievingSampling(String withoutThievingSampling) {
        this.withoutThievingSampling = withoutThievingSampling;
    }

    /** 
     * Get the 'WithThievingSampling' element value. � ������� ���� � ��������. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getWithThievingSampling() {
        return withThievingSampling;
    }

    /** 
     * Set the 'WithThievingSampling' element value. � ������� ���� � ��������. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param withThievingSampling
     */
    public void setWithThievingSampling(String withThievingSampling) {
        this.withThievingSampling = withThievingSampling;
    }

    /** 
     * Get the 'Others' element value. ������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getOthers() {
        return others;
    }

    /** 
     * Set the 'Others' element value. ������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param others
     */
    public void setOthers(String others) {
        this.others = others;
    }

    /** 
     * Get the 'OtherComments' element value. ������(�������)
     * 
     * @return value
     */
    public String getOtherComments() {
        return otherComments;
    }

    /** 
     * Set the 'OtherComments' element value. ������(�������)
     * 
     * @param otherComments
     */
    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }
}
