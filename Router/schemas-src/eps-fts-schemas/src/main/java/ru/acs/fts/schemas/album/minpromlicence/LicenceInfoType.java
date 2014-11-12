
package ru.acs.fts.schemas.album.minpromlicence;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� � ��������
 */
public class LicenceInfoType
{
    private LocalDate dateTo;
    private String licType;
    private String licOperation;
    private String departmentShortName;
    private String departmentCode;
    private DocumentBaseType licence;
    private CUOrganizationType holder;
    private List<DocumentType> reasonList = new ArrayList<DocumentType>();
    private PersonSignatureType signPerson;

    /** 
     * Get the 'DateTo' element value. ���� ��������� �������� ��������
     * 
     * @return value
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    /** 
     * Set the 'DateTo' element value. ���� ��������� �������� ��������
     * 
     * @param dateTo
     */
    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    /** 
     * Get the 'LicType' element value. ��� �������� (�������, �����������, ��������������)
     * 
     * @return value
     */
    public String getLicType() {
        return licType;
    }

    /** 
     * Set the 'LicType' element value. ��� �������� (�������, �����������, ��������������)
     * 
     * @param licType
     */
    public void setLicType(String licType) {
        this.licType = licType;
    }

    /** 
     * Get the 'LicOperation' element value. ��� �������� (������, �������)
     * 
     * @return value
     */
    public String getLicOperation() {
        return licOperation;
    }

    /** 
     * Set the 'LicOperation' element value. ��� �������� (������, �������)
     * 
     * @param licOperation
     */
    public void setLicOperation(String licOperation) {
        this.licOperation = licOperation;
    }

    /** 
     * Get the 'DepartmentShortName' element value. �������� ������������ ������������� ������������ ������, ����������� ��������
     * 
     * @return value
     */
    public String getDepartmentShortName() {
        return departmentShortName;
    }

    /** 
     * Set the 'DepartmentShortName' element value. �������� ������������ ������������� ������������ ������, ����������� ��������
     * 
     * @param departmentShortName
     */
    public void setDepartmentShortName(String departmentShortName) {
        this.departmentShortName = departmentShortName;
    }

    /** 
     * Get the 'DepartmentCode' element value. ��� ������������� ������������ ������, ����������� ��������
     * 
     * @return value
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /** 
     * Set the 'DepartmentCode' element value. ��� ������������� ������������ ������, ����������� ��������
     * 
     * @param departmentCode
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /** 
     * Get the 'Licence' element value. ��������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getLicence() {
        return licence;
    }

    /** 
     * Set the 'Licence' element value. ��������� ��������
     * 
     * @param licence
     */
    public void setLicence(DocumentBaseType licence) {
        this.licence = licence;
    }

    /** 
     * Get the 'Holder' element value. ���������� � ��������� ��������
     * 
     * @return value
     */
    public CUOrganizationType getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. ���������� � ��������� ��������
     * 
     * @param holder
     */
    public void setHolder(CUOrganizationType holder) {
        this.holder = holder;
    }

    /** 
     * Get the list of 'Reason' element items. ��������� ��� ������ ��������
     * 
     * @return list
     */
    public List<DocumentType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. ��������� ��� ������ ��������
     * 
     * @param list
     */
    public void setReasonList(List<DocumentType> list) {
        reasonList = list;
    }

    /** 
     * Get the 'SignPerson' element value. ����, ����������� ��������
     * 
     * @return value
     */
    public PersonSignatureType getSignPerson() {
        return signPerson;
    }

    /** 
     * Set the 'SignPerson' element value. ����, ����������� ��������
     * 
     * @param signPerson
     */
    public void setSignPerson(PersonSignatureType signPerson) {
        this.signPerson = signPerson;
    }
}
