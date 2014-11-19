
package ru.acs.fts.schemas.album.permitcustprocessing;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.BaseTreatmentDocsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOperationsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;

/** 
 * �����������
 */
public class TreatmentInfType
{
    private List<String> yieldNormList = new ArrayList<String>();
    private List<String> identificationMethodList = new ArrayList<String>();
    private LocalDate dateLimit;
    private List<String> processProductionDeList = new ArrayList<String>();
    private List<String> specialCustomMarkList = new ArrayList<String>();
    private List<BaseTreatmentDocsType> baseTreatmentDocList = new ArrayList<BaseTreatmentDocsType>();
    private List<TreatmentOrganizationType> treatmentOrganizationList = new ArrayList<TreatmentOrganizationType>();
    private TreatmentOperationsType treatmentOperations;

    /** 
     * Get the list of 'YieldNorm' element items. ����� ������
     * 
     * @return list
     */
    public List<String> getYieldNormList() {
        return yieldNormList;
    }

    /** 
     * Set the list of 'YieldNorm' element items. ����� ������
     * 
     * @param list
     */
    public void setYieldNormList(List<String> list) {
        yieldNormList = list;
    }

    /** 
     * Get the list of 'IdentificationMethod' element items. ������� ������������� ������� � ��������� �����������
     * 
     * @return list
     */
    public List<String> getIdentificationMethodList() {
        return identificationMethodList;
    }

    /** 
     * Set the list of 'IdentificationMethod' element items. ������� ������������� ������� � ��������� �����������
     * 
     * @param list
     */
    public void setIdentificationMethodList(List<String> list) {
        identificationMethodList = list;
    }

    /** 
     * Get the 'DateLimit' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� �����������
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the list of 'ProcessProductionDes' element items. ������� �������� ����������������� ��������
     * 
     * @return list
     */
    public List<String> getProcessProductionDeList() {
        return processProductionDeList;
    }

    /** 
     * Set the list of 'ProcessProductionDes' element items. ������� �������� ����������������� ��������
     * 
     * @param list
     */
    public void setProcessProductionDeList(List<String> list) {
        processProductionDeList = list;
    }

    /** 
     * Get the list of 'SpecialCustomMarks' element items. ����������� ������� �������
     * 
     * @return list
     */
    public List<String> getSpecialCustomMarkList() {
        return specialCustomMarkList;
    }

    /** 
     * Set the list of 'SpecialCustomMarks' element items. ����������� ������� �������
     * 
     * @param list
     */
    public void setSpecialCustomMarkList(List<String> list) {
        specialCustomMarkList = list;
    }

    /** 
     * Get the list of 'BaseTreatmentDocs' element items. �������� ��� ���� ���������, � ������������ � �������� ��������� �� ����������� ������
     * 
     * @return list
     */
    public List<BaseTreatmentDocsType> getBaseTreatmentDocList() {
        return baseTreatmentDocList;
    }

    /** 
     * Set the list of 'BaseTreatmentDocs' element items. �������� ��� ���� ���������, � ������������ � �������� ��������� �� ����������� ������
     * 
     * @param list
     */
    public void setBaseTreatmentDocList(List<BaseTreatmentDocsType> list) {
        baseTreatmentDocList = list;
    }

    /** 
     * Get the list of 'TreatmentOrganization' element items. �������� �����������-�������������
     * 
     * @return list
     */
    public List<TreatmentOrganizationType> getTreatmentOrganizationList() {
        return treatmentOrganizationList;
    }

    /** 
     * Set the list of 'TreatmentOrganization' element items. �������� �����������-�������������
     * 
     * @param list
     */
    public void setTreatmentOrganizationList(
            List<TreatmentOrganizationType> list) {
        treatmentOrganizationList = list;
    }

    /** 
     * Get the 'TreatmentOperations' element value. �������� �� ����������� ������� � ������� �� ����������
     * 
     * @return value
     */
    public TreatmentOperationsType getTreatmentOperations() {
        return treatmentOperations;
    }

    /** 
     * Set the 'TreatmentOperations' element value. �������� �� ����������� ������� � ������� �� ����������
     * 
     * @param treatmentOperations
     */
    public void setTreatmentOperations(
            TreatmentOperationsType treatmentOperations) {
        this.treatmentOperations = treatmentOperations;
    }
}
