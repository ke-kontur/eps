
package ru.acs.fts.schemas.album.rosprirodsites;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.AuthorizedPersonType;

/** 
 * ����� �� ������ ���������� �� ����� �� ���������� ��������� � ���� � ���������� ��������� ����� ����� ����� � �����
 */
public class RosPrirodSitesType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String opeartion;
    private String regNumber;
    private LocalDate endDate;
    private String specialConditions;
    private String blankNumber;
    private LocalDate dateBegin;
    private CUOrganizationType importer;
    private CUOrganizationType exporter;
    private AuthorizedPersonType authorizedPerson;
    private List<ObjectType> objectList = new ArrayList<ObjectType>();
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentId' element value. Id ���������
     * 
     * @return value
     */
    public String getDocumentId() {
        return documentId;
    }

    /** 
     * Set the 'DocumentId' element value. Id ���������
     * 
     * @param documentId
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /** 
     * Get the 'Opeartion' element value. ������� (��, ��, ���������, �����������)/EXPORT, IMPORT, REEXPORT, INTRODUCTION/
     * 
     * @return value
     */
    public String getOpeartion() {
        return opeartion;
    }

    /** 
     * Set the 'Opeartion' element value. ������� (��, ��, ���������, �����������)/EXPORT, IMPORT, REEXPORT, INTRODUCTION/
     * 
     * @param opeartion
     */
    public void setOpeartion(String opeartion) {
        this.opeartion = opeartion;
    }

    /** 
     * Get the 'RegNumber' element value. ����� ���������� (�����������)
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. ����� ���������� (�����������)
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'EndDate' element value. ������������� ��
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ������������� ��
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'SpecialConditions' element value. ������ �������
     * 
     * @return value
     */
    public String getSpecialConditions() {
        return specialConditions;
    }

    /** 
     * Set the 'SpecialConditions' element value. ������ �������
     * 
     * @param specialConditions
     */
    public void setSpecialConditions(String specialConditions) {
        this.specialConditions = specialConditions;
    }

    /** 
     * Get the 'BlankNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getBlankNumber() {
        return blankNumber;
    }

    /** 
     * Set the 'BlankNumber' element value. ����� ������
     * 
     * @param blankNumber
     */
    public void setBlankNumber(String blankNumber) {
        this.blankNumber = blankNumber;
    }

    /** 
     * Get the 'DateBegin' element value. ���� ������ ���������
     * 
     * @return value
     */
    public LocalDate getDateBegin() {
        return dateBegin;
    }

    /** 
     * Set the 'DateBegin' element value. ���� ������ ���������
     * 
     * @param dateBegin
     */
    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    /** 
     * Get the 'Importer' element value. ��������
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. ��������
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'Exporter' element value. ���������
     * 
     * @return value
     */
    public CUOrganizationType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. ���������
     * 
     * @param exporter
     */
    public void setExporter(CUOrganizationType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ���� (���, ���������, ����� ������), ����������� ����������
     * 
     * @return value
     */
    public AuthorizedPersonType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ���� (���, ���������, ����� ������), ����������� ����������
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(AuthorizedPersonType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the list of 'Object' element items. �������� ��� ��������, ���������� � ���������� �����, �� ����/����� �������� ������ ����������
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. �������� ��� ��������, ���������� � ���������� �����, �� ����/����� �������� ������ ����������
     * 
     * @param list
     */
    public void setObjectList(List<ObjectType> list) {
        objectList = list;
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
