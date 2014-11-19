
package ru.acs.fts.schemas.album.sanitarysertif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * ���������-������������������ ���������� (������������� ����������)
 */
public class SanitarySertifType extends BaseDocType
{
    private String sertifNumber;
    private LocalDate beginDate;
    private LocalDate endDate;
    private String formNumber;
    private String typeOfSetif;
    private SertifOrganizationType sertifOrganization;
    private SertifOrgBaseType normDocsOrganization;
    private List<SertifOrgBaseType> manufacturerInfList = new ArrayList<SertifOrgBaseType>();
    private SertifOrgBaseType sertifRecipient;
    private GoodsType goods;
    private PersonSignatureType documentSignature;
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();
    private SertifSupplementType sertifSupplement;
    private String documentModeID;

    /** 
     * Get the 'SertifNumber' element value. ����� �����������
     * 
     * @return value
     */
    public String getSertifNumber() {
        return sertifNumber;
    }

    /** 
     * Set the 'SertifNumber' element value. ����� �����������
     * 
     * @param sertifNumber
     */
    public void setSertifNumber(String sertifNumber) {
        this.sertifNumber = sertifNumber;
    }

    /** 
     * Get the 'BeginDate' element value. ���� ������ �������� ����������� (��������� � ����� ����������� ���������)
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ������ �������� ����������� (��������� � ����� ����������� ���������)
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������� ����������� (������������ ��� ������������ ������)
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������� ����������� (������������ ��� ������������ ������)
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'FormNumber' element value. ����� ������ �����������
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ����� ������ �����������
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'TypeOfSetif' element value. ������� ���� ����������: 1 - ���������-������������������ ����������, ����� - �������������
     * 
     * @return value
     */
    public String getTypeOfSetif() {
        return typeOfSetif;
    }

    /** 
     * Set the 'TypeOfSetif' element value. ������� ���� ����������: 1 - ���������-������������������ ����������, ����� - �������������
     * 
     * @param typeOfSetif
     */
    public void setTypeOfSetif(String typeOfSetif) {
        this.typeOfSetif = typeOfSetif;
    }

    /** 
     * Get the 'SertifOrganization' element value. �������� �� ������ ������������
     * 
     * @return value
     */
    public SertifOrganizationType getSertifOrganization() {
        return sertifOrganization;
    }

    /** 
     * Set the 'SertifOrganization' element value. �������� �� ������ ������������
     * 
     * @param sertifOrganization
     */
    public void setSertifOrganization(SertifOrganizationType sertifOrganization) {
        this.sertifOrganization = sertifOrganization;
    }

    /** 
     * Get the 'NormDocsOrganization' element value. ���������� �� ����������� - ������������ ����������� ������������
     * 
     * @return value
     */
    public SertifOrgBaseType getNormDocsOrganization() {
        return normDocsOrganization;
    }

    /** 
     * Set the 'NormDocsOrganization' element value. ���������� �� ����������� - ������������ ����������� ������������
     * 
     * @param normDocsOrganization
     */
    public void setNormDocsOrganization(SertifOrgBaseType normDocsOrganization) {
        this.normDocsOrganization = normDocsOrganization;
    }

    /** 
     * Get the list of 'ManufacturerInf' element items. ���������� �� ������������/�������������� ���������������
     * 
     * @return list
     */
    public List<SertifOrgBaseType> getManufacturerInfList() {
        return manufacturerInfList;
    }

    /** 
     * Set the list of 'ManufacturerInf' element items. ���������� �� ������������/�������������� ���������������
     * 
     * @param list
     */
    public void setManufacturerInfList(List<SertifOrgBaseType> list) {
        manufacturerInfList = list;
    }

    /** 
     * Get the 'SertifRecipient' element value. ���������� � ����, �������� ����� ���������� 
     * 
     * @return value
     */
    public SertifOrgBaseType getSertifRecipient() {
        return sertifRecipient;
    }

    /** 
     * Set the 'SertifRecipient' element value. ���������� � ����, �������� ����� ���������� 
     * 
     * @param sertifRecipient
     */
    public void setSertifRecipient(SertifOrgBaseType sertifRecipient) {
        this.sertifRecipient = sertifRecipient;
    }

    /** 
     * Get the 'Goods' element value. �������� � ���������
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. �������� � ���������
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'DocumentSignature' element value. ������� ������������
     * 
     * @return value
     */
    public PersonSignatureType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. ������� ������������
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonSignatureType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the list of 'Contract' element items. ����� � ���� ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. ����� � ���� ���������
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }

    /** 
     * Get the 'SertifSupplement' element value. ���������� � ���������-������������������� ���������� / ����� �������� ������� �������������
     * 
     * @return value
     */
    public SertifSupplementType getSertifSupplement() {
        return sertifSupplement;
    }

    /** 
     * Set the 'SertifSupplement' element value. ���������� � ���������-������������������� ���������� / ����� �������� ������� �������������
     * 
     * @param sertifSupplement
     */
    public void setSertifSupplement(SertifSupplementType sertifSupplement) {
        this.sertifSupplement = sertifSupplement;
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
