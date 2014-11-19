
package ru.acs.fts.schemas.album.coordinationrequests;

import org.joda.time.LocalDate;

/** 
 * ���������� � ������ � ����������� �� ��� ������� �����, ���������� ������ ���� �� ����������� �����
 */
public class GoodsPRInfoType
{
    private String goodsNumber;
    private String PRRegKind;
    private String PRRegCustomCode;
    private LocalDate PRRegDate;
    private String PRRegNumber;
    private String PRVersion;
    private String PRPointCode;

    /** 
     * Get the 'GoodsNumber' element value. ���������� ����� ������, ��� �������� ���������� ��������� ���� �� ����������� ��. ��� ������ ������� - 0.
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ���������� ����� ������, ��� �������� ���������� ��������� ���� �� ����������� ��. ��� ������ ������� - 0.
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'PRRegKind' element value. ��� ������� ����� (����� ���. ������)
     * 
     * @return value
     */
    public String getPRRegKind() {
        return PRRegKind;
    }

    /** 
     * Set the 'PRRegKind' element value. ��� ������� ����� (����� ���. ������)
     * 
     * @param PRRegKind
     */
    public void setPRRegKind(String PRRegKind) {
        this.PRRegKind = PRRegKind;
    }

    /** 
     * Get the 'PRRegCustomCode' element value. ��� ��, � ������� ��������������� �� (����� ���. ������)
     * 
     * @return value
     */
    public String getPRRegCustomCode() {
        return PRRegCustomCode;
    }

    /** 
     * Set the 'PRRegCustomCode' element value. ��� ��, � ������� ��������������� �� (����� ���. ������)
     * 
     * @param PRRegCustomCode
     */
    public void setPRRegCustomCode(String PRRegCustomCode) {
        this.PRRegCustomCode = PRRegCustomCode;
    }

    /** 
     * Get the 'PRRegDate' element value. ���� ����������� �� (����� ���. ������)
     * 
     * @return value
     */
    public LocalDate getPRRegDate() {
        return PRRegDate;
    }

    /** 
     * Set the 'PRRegDate' element value. ���� ����������� �� (����� ���. ������)
     * 
     * @param PRRegDate
     */
    public void setPRRegDate(LocalDate PRRegDate) {
        this.PRRegDate = PRRegDate;
    }

    /** 
     * Get the 'PRRegNumber' element value. ���������� ����� �� (����� ���. ������)
     * 
     * @return value
     */
    public String getPRRegNumber() {
        return PRRegNumber;
    }

    /** 
     * Set the 'PRRegNumber' element value. ���������� ����� �� (����� ���. ������)
     * 
     * @param PRRegNumber
     */
    public void setPRRegNumber(String PRRegNumber) {
        this.PRRegNumber = PRRegNumber;
    }

    /** 
     * Get the 'PRVersion' element value. ����� ������ �� (����� ���. ������)
     * 
     * @return value
     */
    public String getPRVersion() {
        return PRVersion;
    }

    /** 
     * Set the 'PRVersion' element value. ����� ������ �� (����� ���. ������)
     * 
     * @param PRVersion
     */
    public void setPRVersion(String PRVersion) {
        this.PRVersion = PRVersion;
    }

    /** 
     * Get the 'PRPointCode' element value. ������ ��������� ��. ���������� ��������: 00 � ��� ����������� ��; 10 � ������ ������� (������������� ����������� �������, �� ����������� ������� ��� ����������� ������ ���������� ��������); 11 � ������ ��� ����������� ������ ���������� �������� (���� �� �� ������ �� ������� �������������� ������� 11); 20 � ������������� ������ ������� (����� ������������� ��������� ������� � ������� ��� ����������� �� ������������� ������). 99 � � �������� ���������� ����������� ���������� � ����������� �������� (�������������� ���������� ��)'
     * 
     * @return value
     */
    public String getPRPointCode() {
        return PRPointCode;
    }

    /** 
     * Set the 'PRPointCode' element value. ������ ��������� ��. ���������� ��������: 00 � ��� ����������� ��; 10 � ������ ������� (������������� ����������� �������, �� ����������� ������� ��� ����������� ������ ���������� ��������); 11 � ������ ��� ����������� ������ ���������� �������� (���� �� �� ������ �� ������� �������������� ������� 11); 20 � ������������� ������ ������� (����� ������������� ��������� ������� � ������� ��� ����������� �� ������������� ������). 99 � � �������� ���������� ����������� ���������� � ����������� �������� (�������������� ���������� ��)'
     * 
     * @param PRPointCode
     */
    public void setPRPointCode(String PRPointCode) {
        this.PRPointCode = PRPointCode;
    }
}
