
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID6Type;

/** 
 * ���������� � ��������������� ��������
 */
public class TechOperationType
{
    private LocalDate techOperationDate;
    private OperationInfoType ATDOperationInfo;
    private GTDID6Type modifiedATDNum;

    /** 
     * Get the 'TechOperationDate' element value. ���� �������� ���������� � ��������������� ��������
     * 
     * @return value
     */
    public LocalDate getTechOperationDate() {
        return techOperationDate;
    }

    /** 
     * Set the 'TechOperationDate' element value. ���� �������� ���������� � ��������������� ��������
     * 
     * @param techOperationDate
     */
    public void setTechOperationDate(LocalDate techOperationDate) {
        this.techOperationDate = techOperationDate;
    }

    /** 
     * Get the 'ATDOperationInfo' element value. ���������� �� �������� (����� ���������, ����������� ���� ��)
     * 
     * @return value
     */
    public OperationInfoType getATDOperationInfo() {
        return ATDOperationInfo;
    }

    /** 
     * Set the 'ATDOperationInfo' element value. ���������� �� �������� (����� ���������, ����������� ���� ��)
     * 
     * @param ATDOperationInfo
     */
    public void setATDOperationInfo(OperationInfoType ATDOperationInfo) {
        this.ATDOperationInfo = ATDOperationInfo;
    }

    /** 
     * Get the 'ModifiedATDNum' element value. ������������ �������� ������ ���
     * 
     * @return value
     */
    public GTDID6Type getModifiedATDNum() {
        return modifiedATDNum;
    }

    /** 
     * Set the 'ModifiedATDNum' element value. ������������ �������� ������ ���
     * 
     * @param modifiedATDNum
     */
    public void setModifiedATDNum(GTDID6Type modifiedATDNum) {
        this.modifiedATDNum = modifiedATDNum;
    }
}
