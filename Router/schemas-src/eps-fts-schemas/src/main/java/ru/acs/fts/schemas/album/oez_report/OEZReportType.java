
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����� � ��������, ���������, ����������, ���������������, ����������������, ������������� � ����������� ������� �� ���������� ���
 */
public class OEZReportType extends BaseDocType
{
    private LocalDate reportDate;
    private List<String> formNumList = new ArrayList<String>();
    private CustomsType customs;
    private CompanyType declarant;
    private ReportingPeriodType reportingPeriod;
    private PersonSignatureType residentPersonSignature;
    private Table1Type table1;
    private Table2Type table2;
    private Table3Type table3;
    private Table4Type table4;
    private GTDIDType registryNumber;
    private List<GTDIDType> declarationNumForReportList = new ArrayList<GTDIDType>();
    private String documentModeID;

    /** 
     * Get the 'ReportDate' element value. ���� ������ ������
     * 
     * @return value
     */
    public LocalDate getReportDate() {
        return reportDate;
    }

    /** 
     * Set the 'ReportDate' element value. ���� ������ ������
     * 
     * @param reportDate
     */
    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    /** 
     * Get the list of 'FormNum' element items. ����� �����
     * 
     * @return list
     */
    public List<String> getFormNumList() {
        return formNumList;
    }

    /** 
     * Set the list of 'FormNum' element items. ����� �����
     * 
     * @param list
     */
    public void setFormNumList(List<String> list) {
        formNumList = list;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ���� ��� �� �����������, ������� ����� �����
     * 
     * @return value
     */
    public CompanyType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ���� ��� �� �����������, ������� ����� �����
     * 
     * @param declarant
     */
    public void setDeclarant(CompanyType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'ReportingPeriod' element value. �������� ������
     * 
     * @return value
     */
    public ReportingPeriodType getReportingPeriod() {
        return reportingPeriod;
    }

    /** 
     * Set the 'ReportingPeriod' element value. �������� ������
     * 
     * @param reportingPeriod
     */
    public void setReportingPeriod(ReportingPeriodType reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    /** 
     * Get the 'ResidentPersonSignature' element value. �.�.�., ������� ��������������� ����, �� ������� ��������� ��������������� ����������� ����������, ����
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. �.�.�., ������� ��������������� ����, �� ������� ��������� ��������������� ����������� ����������, ����
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'Table1' element value. ������� 1. ����� � �������, ��������� � ������������ � ���������� ������� ���
     * 
     * @return value
     */
    public Table1Type getTable1() {
        return table1;
    }

    /** 
     * Set the 'Table1' element value. ������� 1. ����� � �������, ��������� � ������������ � ���������� ������� ���
     * 
     * @param table1
     */
    public void setTable1(Table1Type table1) {
        this.table1 = table1;
    }

    /** 
     * Get the 'Table2' element value. ������� 2. ����� � �������, ���������� ��� ���������� ����� ��������� ���������� ���� � �����
     * 
     * @return value
     */
    public Table2Type getTable2() {
        return table2;
    }

    /** 
     * Set the 'Table2' element value. ������� 2. ����� � �������, ���������� ��� ���������� ����� ��������� ���������� ���� � �����
     * 
     * @param table2
     */
    public void setTable2(Table2Type table2) {
        this.table2 = table2;
    }

    /** 
     * Get the 'Table3' element value. ������� 3. ����� � �������, �������������(����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ���� �� ����� 3
     * 
     * @return value
     */
    public Table3Type getTable3() {
        return table3;
    }

    /** 
     * Set the 'Table3' element value. ������� 3. ����� � �������, �������������(����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ���� �� ����� 3
     * 
     * @param table3
     */
    public void setTable3(Table3Type table3) {
        this.table3 = table3;
    }

    /** 
     * Get the 'Table4' element value. ������� 4. ����� � �������, ������������� (����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ����
     * 
     * @return value
     */
    public Table4Type getTable4() {
        return table4;
    }

    /** 
     * Set the 'Table4' element value. ������� 4. ����� � �������, ������������� (����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ����
     * 
     * @param table4
     */
    public void setTable4(Table4Type table4) {
        this.table4 = table4;
    }

    /** 
     * Get the 'RegistryNumber' element value. ��������������� ����� ������
     * 
     * @return value
     */
    public GTDIDType getRegistryNumber() {
        return registryNumber;
    }

    /** 
     * Set the 'RegistryNumber' element value. ��������������� ����� ������
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(GTDIDType registryNumber) {
        this.registryNumber = registryNumber;
    }

    /** 
     * Get the list of 'DeclarationNumForReport' element items. ����� ���������� ����������, ���������� ���������� � �������, ���������� ��� ���������� ��������� ���
     * 
     * @return list
     */
    public List<GTDIDType> getDeclarationNumForReportList() {
        return declarationNumForReportList;
    }

    /** 
     * Set the list of 'DeclarationNumForReport' element items. ����� ���������� ����������, ���������� ���������� � �������, ���������� ��� ���������� ��������� ���
     * 
     * @param list
     */
    public void setDeclarationNumForReportList(List<GTDIDType> list) {
        declarationNumForReportList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
