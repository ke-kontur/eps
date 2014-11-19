
package ru.acs.fts.schemas.album.kdtoutcustomsmark;

import org.joda.time.LocalDate;

/** 
 * ��������� ������� �� �������
 */
public class KDTOutGoodsResolutionType
{
    private String goodsNumeric;
    private String GRNumber;
    private String stageMarkIdentifier;
    private String noteMarkIdentifier;
    private String markDescription;
    private LocalDate dateInf;
    private String timeInf;
    private String personName;
    private String LNP;

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ���
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ���
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GRNumber' element value. ����������� ����� (���������� �����)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. ����������� ����� (���������� �����)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'StageMarkIdentifier' element value. ������������� ������������� ��������������� ������� - 1 (����� �����)
     * 
     * @return value
     */
    public String getStageMarkIdentifier() {
        return stageMarkIdentifier;
    }

    /** 
     * Set the 'StageMarkIdentifier' element value. ������������� ������������� ��������������� ������� - 1 (����� �����)
     * 
     * @param stageMarkIdentifier
     */
    public void setStageMarkIdentifier(String stageMarkIdentifier) {
        this.stageMarkIdentifier = stageMarkIdentifier;
    }

    /** 
     * Get the 'NoteMarkIdentifier' element value. ������������� ������������� ��������������� �������  -  2 (��� ����������)
     * 
     * @return value
     */
    public String getNoteMarkIdentifier() {
        return noteMarkIdentifier;
    }

    /** 
     * Set the 'NoteMarkIdentifier' element value. ������������� ������������� ��������������� �������  -  2 (��� ����������)
     * 
     * @param noteMarkIdentifier
     */
    public void setNoteMarkIdentifier(String noteMarkIdentifier) {
        this.noteMarkIdentifier = noteMarkIdentifier;
    }

    /** 
     * Get the 'MarkDescription' element value. ��������� ������
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. ��������� ������
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. ���� ������������ �������
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� ������������ �������
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. �����
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. �����
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
