
package ru.acs.fts.schemas.album.actoperationindentif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * ��� �� ���������, ��������, ����������� ��� ������ ������� �������������
 */
public class ActOperationIndentifType extends BaseDocType
{
    private LocalDate actDate;
    private String actNumber;
    private String descriptionCircumstances;
    private String operationIndentif;
    private List<String> transportIdentifierList = new ArrayList<String>();
    private String descriptionIdentif;
    private String descriptionNewIdentif;
    private LocalDate applicationIdentifiDate;
    private CUCustomsType customs;
    private CustomsPersonInfoType customsPerson;
    private OperationPlaceType operationPlace;
    private PersonType secondCopyReceived;
    private PersonType personGoods;
    private String documentModeID;

    /** 
     * Get the 'ActDate' element value. ���� ����
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. ���� ����
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'ActNumber' element value. ����� ����
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. ����� ����
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'DescriptionCircumstances' element value. ������� �������� �������������
     * 
     * @return value
     */
    public String getDescriptionCircumstances() {
        return descriptionCircumstances;
    }

    /** 
     * Set the 'DescriptionCircumstances' element value. ������� �������� �������������
     * 
     * @param descriptionCircumstances
     */
    public void setDescriptionCircumstances(String descriptionCircumstances) {
        this.descriptionCircumstances = descriptionCircumstances;
    }

    /** 
     * Get the 'OperationIndentif' element value. �������� �� ���������� �������������. 1 - ��������, 2 - ���������, 3 - ������, 4 - �����������.
     * 
     * @return value
     */
    public String getOperationIndentif() {
        return operationIndentif;
    }

    /** 
     * Set the 'OperationIndentif' element value. �������� �� ���������� �������������. 1 - ��������, 2 - ���������, 3 - ������, 4 - �����������.
     * 
     * @param operationIndentif
     */
    public void setOperationIndentif(String operationIndentif) {
        this.operationIndentif = operationIndentif;
    }

    /** 
     * Get the list of 'TransportIdentifier' element items. ����� ������������ ������� � �����������, �� ������� ������� ��� �������� �������� �������������
     * 
     * @return list
     */
    public List<String> getTransportIdentifierList() {
        return transportIdentifierList;
    }

    /** 
     * Set the list of 'TransportIdentifier' element items. ����� ������������ ������� � �����������, �� ������� ������� ��� �������� �������� �������������
     * 
     * @param list
     */
    public void setTransportIdentifierList(List<String> list) {
        transportIdentifierList = list;
    }

    /** 
     * Get the 'DescriptionIdentif' element value. �������� ����������,  ���������,  ������������ ���  ���������� ������� ������������� 
     * 
     * @return value
     */
    public String getDescriptionIdentif() {
        return descriptionIdentif;
    }

    /** 
     * Set the 'DescriptionIdentif' element value. �������� ����������,  ���������,  ������������ ���  ���������� ������� ������������� 
     * 
     * @param descriptionIdentif
     */
    public void setDescriptionIdentif(String descriptionIdentif) {
        this.descriptionIdentif = descriptionIdentif;
    }

    /** 
     * Get the 'DescriptionNewIdentif' element value. �������� ����� ������� �������������
     * 
     * @return value
     */
    public String getDescriptionNewIdentif() {
        return descriptionNewIdentif;
    }

    /** 
     * Set the 'DescriptionNewIdentif' element value. �������� ����� ������� �������������
     * 
     * @param descriptionNewIdentif
     */
    public void setDescriptionNewIdentif(String descriptionNewIdentif) {
        this.descriptionNewIdentif = descriptionNewIdentif;
    }

    /** 
     * Get the 'ApplicationIdentifiDate' element value. ���� ���������� �������(�) �������������
     * 
     * @return value
     */
    public LocalDate getApplicationIdentifiDate() {
        return applicationIdentifiDate;
    }

    /** 
     * Set the 'ApplicationIdentifiDate' element value. ���� ���������� �������(�) �������������
     * 
     * @param applicationIdentifiDate
     */
    public void setApplicationIdentifiDate(LocalDate applicationIdentifiDate) {
        this.applicationIdentifiDate = applicationIdentifiDate;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonInfoType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonInfoType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'OperationPlace' element value. �������� ����� ���������� �������� �� ���������, ��������, ����������� ��� ������ ������� �������������
     * 
     * @return value
     */
    public OperationPlaceType getOperationPlace() {
        return operationPlace;
    }

    /** 
     * Set the 'OperationPlace' element value. �������� ����� ���������� �������� �� ���������, ��������, ����������� ��� ������ ������� �������������
     * 
     * @param operationPlace
     */
    public void setOperationPlace(OperationPlaceType operationPlace) {
        this.operationPlace = operationPlace;
    }

    /** 
     * Get the 'SecondCopyReceived' element value. ������ ��������� ���� �� ���� �������
     * 
     * @return value
     */
    public PersonType getSecondCopyReceived() {
        return secondCopyReceived;
    }

    /** 
     * Set the 'SecondCopyReceived' element value. ������ ��������� ���� �� ���� �������
     * 
     * @param secondCopyReceived
     */
    public void setSecondCopyReceived(PersonType secondCopyReceived) {
        this.secondCopyReceived = secondCopyReceived;
    }

    /** 
     * Get the 'PersonGoods' element value. ����, ���������� ������������ � ��������� ������� (������������� ����)
     * 
     * @return value
     */
    public PersonType getPersonGoods() {
        return personGoods;
    }

    /** 
     * Set the 'PersonGoods' element value. ����, ���������� ������������ � ��������� ������� (������������� ����)
     * 
     * @param personGoods
     */
    public void setPersonGoods(PersonType personGoods) {
        this.personGoods = personGoods;
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
