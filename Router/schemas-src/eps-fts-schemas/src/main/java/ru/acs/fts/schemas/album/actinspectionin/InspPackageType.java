
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * ��� - �������� �� ���������
 */
public class InspPackageType extends PackingInformationType
{
    private String packageDescription;
    private String packDestructFlag;
    private String packDestructDesc;
    private String recordNumber;

    /** 
     * Get the 'PackageDescription' element value. �������� �������� � ���������� ������
     * 
     * @return value
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /** 
     * Set the 'PackageDescription' element value. �������� �������� � ���������� ������
     * 
     * @param packageDescription
     */
    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /** 
     * Get the 'PackDestructFlag' element value. ������� ������� ����������� ������� � �������� 0 - ����������� ��� 1 - ����������� ����
     * 
     * @return value
     */
    public String getPackDestructFlag() {
        return packDestructFlag;
    }

    /** 
     * Set the 'PackDestructFlag' element value. ������� ������� ����������� ������� � �������� 0 - ����������� ��� 1 - ����������� ����
     * 
     * @param packDestructFlag
     */
    public void setPackDestructFlag(String packDestructFlag) {
        this.packDestructFlag = packDestructFlag;
    }

    /** 
     * Get the 'PackDestructDesc' element value. �������� ����������� ��������
     * 
     * @return value
     */
    public String getPackDestructDesc() {
        return packDestructDesc;
    }

    /** 
     * Set the 'PackDestructDesc' element value. �������� ����������� ��������
     * 
     * @param packDestructDesc
     */
    public void setPackDestructDesc(String packDestructDesc) {
        this.packDestructDesc = packDestructDesc;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
