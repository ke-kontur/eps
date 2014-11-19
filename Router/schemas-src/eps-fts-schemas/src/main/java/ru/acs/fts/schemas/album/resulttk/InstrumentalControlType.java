
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� �� ����������������� ��������
 */
public class InstrumentalControlType
{
    private String number;
    private String dateTime;
    private String passNumber;
    private String course;
    private CustomsPersonType instrumentalEmployee;
    private WeightType weight;
    private SizeType size;
    private TransportMeansBaseType auto;
    private List<CheckViolationType> violSmokeNoiseList = new ArrayList<CheckViolationType>();
    private UsingPassType passWeight;

    /** 
     * Get the 'Number' element value. ����� ����� �����
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ����� �����
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'DateTime' element value. ����/����� ������ ����������������� ��������
     * 
     * @return value
     */
    public String getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'DateTime' element value. ����/����� ������ ����������������� ��������
     * 
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'PassNumber' element value. ����� ������ ��������
     * 
     * @return value
     */
    public String getPassNumber() {
        return passNumber;
    }

    /** 
     * Set the 'PassNumber' element value. ����� ������ ��������
     * 
     * @param passNumber
     */
    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    /** 
     * Get the 'Course' element value. ���� �������
     * 
     * @return value
     */
    public String getCourse() {
        return course;
    }

    /** 
     * Set the 'Course' element value. ���� �������
     * 
     * @param course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /** 
     * Get the 'InstrumentalEmployee' element value. ���������, ����������� ���������������� ��������
     * 
     * @return value
     */
    public CustomsPersonType getInstrumentalEmployee() {
        return instrumentalEmployee;
    }

    /** 
     * Set the 'InstrumentalEmployee' element value. ���������, ����������� ���������������� ��������
     * 
     * @param instrumentalEmployee
     */
    public void setInstrumentalEmployee(CustomsPersonType instrumentalEmployee) {
        this.instrumentalEmployee = instrumentalEmployee;
    }

    /** 
     * Get the 'Weight' element value. ������� ��������� ��
     * 
     * @return value
     */
    public WeightType getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. ������� ��������� ��
     * 
     * @param weight
     */
    public void setWeight(WeightType weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'Size' element value. ���������� ��������� ��
     * 
     * @return value
     */
    public SizeType getSize() {
        return size;
    }

    /** 
     * Set the 'Size' element value. ���������� ��������� ��
     * 
     * @param size
     */
    public void setSize(SizeType size) {
        this.size = size;
    }

    /** 
     * Get the 'Auto' element value. ��������������� ������ ��
     * 
     * @return value
     */
    public TransportMeansBaseType getAuto() {
        return auto;
    }

    /** 
     * Set the 'Auto' element value. ��������������� ������ ��
     * 
     * @param auto
     */
    public void setAuto(TransportMeansBaseType auto) {
        this.auto = auto;
    }

    /** 
     * Get the list of 'ViolSmokeNoise' element items. ������������ �������� (�����������)/������ ��������
     * 
     * @return list
     */
    public List<CheckViolationType> getViolSmokeNoiseList() {
        return violSmokeNoiseList;
    }

    /** 
     * Set the list of 'ViolSmokeNoise' element items. ������������ �������� (�����������)/������ ��������
     * 
     * @param list
     */
    public void setViolSmokeNoiseList(List<CheckViolationType> list) {
        violSmokeNoiseList = list;
    }

    /** 
     * Get the 'PassWeight' element value. �����
     * 
     * @return value
     */
    public UsingPassType getPassWeight() {
        return passWeight;
    }

    /** 
     * Set the 'PassWeight' element value. �����
     * 
     * @param passWeight
     */
    public void setPassWeight(UsingPassType passWeight) {
        this.passWeight = passWeight;
    }
}
