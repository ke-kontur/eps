
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;

/** 
 * �������� �� ������������ �������������
 */
public class BranchDescriptionType extends CUBranchDescriptionType
{
    private String branchKind;
    private AddressType foreignAddress;
    private RecordDataType recordData;

    /** 
     * Get the 'BranchKind' element value. ��� �������������: 0 - ������; 1 - �����������������
     * 
     * @return value
     */
    public String getBranchKind() {
        return branchKind;
    }

    /** 
     * Set the 'BranchKind' element value. ��� �������������: 0 - ������; 1 - �����������������
     * 
     * @param branchKind
     */
    public void setBranchKind(String branchKind) {
        this.branchKind = branchKind;
    }

    /** 
     * Get the 'ForeignAddress' element value. ����� ����� ������������ �� ��������� ���������� ��
     * 
     * @return value
     */
    public AddressType getForeignAddress() {
        return foreignAddress;
    }

    /** 
     * Set the 'ForeignAddress' element value. ����� ����� ������������ �� ��������� ���������� ��
     * 
     * @param foreignAddress
     */
    public void setForeignAddress(AddressType foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
