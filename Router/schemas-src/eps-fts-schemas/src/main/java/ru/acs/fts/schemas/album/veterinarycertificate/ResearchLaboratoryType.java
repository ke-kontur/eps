
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;

/** 
 * ������������ � �����������
 */
public class ResearchLaboratoryType
{
    private String nameLaboratory;
    private String numberExamination;
    private LocalDate dateExamination;
    private String methodExamination;
    private String sickName;
    private String resultExamination;

    /** 
     * Get the 'NameLaboratory' element value. ������������ �����������
     * 
     * @return value
     */
    public String getNameLaboratory() {
        return nameLaboratory;
    }

    /** 
     * Set the 'NameLaboratory' element value. ������������ �����������
     * 
     * @param nameLaboratory
     */
    public void setNameLaboratory(String nameLaboratory) {
        this.nameLaboratory = nameLaboratory;
    }

    /** 
     * Get the 'NumberExamination' element value. ����� ����������
     * 
     * @return value
     */
    public String getNumberExamination() {
        return numberExamination;
    }

    /** 
     * Set the 'NumberExamination' element value. ����� ����������
     * 
     * @param numberExamination
     */
    public void setNumberExamination(String numberExamination) {
        this.numberExamination = numberExamination;
    }

    /** 
     * Get the 'DateExamination' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getDateExamination() {
        return dateExamination;
    }

    /** 
     * Set the 'DateExamination' element value. ���� ����������
     * 
     * @param dateExamination
     */
    public void setDateExamination(LocalDate dateExamination) {
        this.dateExamination = dateExamination;
    }

    /** 
     * Get the 'MethodExamination' element value. ����� ������������
     * 
     * @return value
     */
    public String getMethodExamination() {
        return methodExamination;
    }

    /** 
     * Set the 'MethodExamination' element value. ����� ������������
     * 
     * @param methodExamination
     */
    public void setMethodExamination(String methodExamination) {
        this.methodExamination = methodExamination;
    }

    /** 
     * Get the 'SickName' element value. ������������ �������
     * 
     * @return value
     */
    public String getSickName() {
        return sickName;
    }

    /** 
     * Set the 'SickName' element value. ������������ �������
     * 
     * @param sickName
     */
    public void setSickName(String sickName) {
        this.sickName = sickName;
    }

    /** 
     * Get the 'ResultExamination' element value. ��������� ����������
     * 
     * @return value
     */
    public String getResultExamination() {
        return resultExamination;
    }

    /** 
     * Set the 'ResultExamination' element value. ��������� ����������
     * 
     * @param resultExamination
     */
    public void setResultExamination(String resultExamination) {
        this.resultExamination = resultExamination;
    }
}
