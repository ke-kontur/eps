
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� � ���������� ���������� ����������
 */
public class ResolutionDestinationExaminationType extends BaseDocType
{
    private String nameExamination;
    private String country;
    private LocalDate date;
    private List<String> reasonList = new ArrayList<String>();
    private List<String> questionList = new ArrayList<String>();
    private String kindExamination;
    private LocalDate dateDuties;
    private LocalDate dateRights;
    private String changes;
    private CommissionExaminationType commissionExamination;
    private TermRealizationExaminationType termRealizationExamination;
    private List<GoodsAccordanceExhertType> goodsAccordanceExhertList = new ArrayList<GoodsAccordanceExhertType>();
    private PersonBaseType person;
    private InfoCustomsPersonType infoCustomsPerson;
    private PersonSignatureType expertSignature;
    private PersonSignatureType declarantSignature;
    private List<PersonType> representativeSignatureList = new ArrayList<PersonType>();
    private PersonType personSignature;
    private GoodsLocationType goodsLocation;
    private PersonSignatureType customsChief;
    private CustomsType customs;
    private CustomsPersonType infoCustomsPersonDetermineAim;
    private GTDIDType GTDID;
    private DocumentBaseType otherDocument;
    private String documentModeID;

    /** 
     * Get the 'NameExamination' element value. ������������ ����������
     * 
     * @return value
     */
    public String getNameExamination() {
        return nameExamination;
    }

    /** 
     * Set the 'NameExamination' element value. ������������ ����������
     * 
     * @param nameExamination
     */
    public void setNameExamination(String nameExamination) {
        this.nameExamination = nameExamination;
    }

    /** 
     * Get the 'Country' element value. ������������ ������
     * 
     * @return value
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Set the 'Country' element value. ������������ ������
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Get the 'Date' element value. ���� �������������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the list of 'Reason' element items. ��������� ��� ���������� ����������
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. ��������� ��� ���������� ����������
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the list of 'Question' element items. �������, ������������ ����� ���������
     * 
     * @return list
     */
    public List<String> getQuestionList() {
        return questionList;
    }

    /** 
     * Set the list of 'Question' element items. �������, ������������ ����� ���������
     * 
     * @param list
     */
    public void setQuestionList(List<String> list) {
        questionList = list;
    }

    /** 
     * Get the 'KindExamination' element value. ��� ����������. "1" - ��������������, "2" - ���������, "3" - ������������, "4" - �����������.
     * 
     * @return value
     */
    public String getKindExamination() {
        return kindExamination;
    }

    /** 
     * Set the 'KindExamination' element value. ��� ����������. "1" - ��������������, "2" - ���������, "3" - ������������, "4" - �����������.
     * 
     * @param kindExamination
     */
    public void setKindExamination(String kindExamination) {
        this.kindExamination = kindExamination;
    }

    /** 
     * Get the 'DateDuties' element value. ���� ����������� ���� � ������������, ��������������� ������� 140 ����������� ������� ����������� �����
     * 
     * @return value
     */
    public LocalDate getDateDuties() {
        return dateDuties;
    }

    /** 
     * Set the 'DateDuties' element value. ���� ����������� ���� � ������������, ��������������� ������� 140 ����������� ������� ����������� �����
     * 
     * @param dateDuties
     */
    public void setDateDuties(LocalDate dateDuties) {
        this.dateDuties = dateDuties;
    }

    /** 
     * Get the 'DateRights' element value. ���� ����������� ���� ����������, ����� ����, ����������� ������������ � ��������� ������� � (���) ������������ �������, � �� �������������� ��� ���������� � ���������� ���������� ����������, ��������������� ������� 141 ����������� ������� ����������� �����
     * 
     * @return value
     */
    public LocalDate getDateRights() {
        return dateRights;
    }

    /** 
     * Set the 'DateRights' element value. ���� ����������� ���� ����������, ����� ����, ����������� ������������ � ��������� ������� � (���) ������������ �������, � �� �������������� ��� ���������� � ���������� ���������� ����������, ��������������� ������� 141 ����������� ������� ����������� �����
     * 
     * @param dateRights
     */
    public void setDateRights(LocalDate dateRights) {
        this.dateRights = dateRights;
    }

    /** 
     * Get the 'Changes' element value. ������� ����, ��� ��������� �������������, ��������� ��� ������ �����������, ���������� ����������, ���������� ���� � �������� ������������
     * 
     * @return value
     */
    public String getChanges() {
        return changes;
    }

    /** 
     * Set the 'Changes' element value. ������� ����, ��� ��������� �������������, ��������� ��� ������ �����������, ���������� ����������, ���������� ���� � �������� ������������
     * 
     * @param changes
     */
    public void setChanges(String changes) {
        this.changes = changes;
    }

    /** 
     * Get the 'CommissionExamination' element value. ��������� �� ����������
     * 
     * @return value
     */
    public CommissionExaminationType getCommissionExamination() {
        return commissionExamination;
    }

    /** 
     * Set the 'CommissionExamination' element value. ��������� �� ����������
     * 
     * @param commissionExamination
     */
    public void setCommissionExamination(
            CommissionExaminationType commissionExamination) {
        this.commissionExamination = commissionExamination;
    }

    /** 
     * Get the 'TermRealizationExamination' element value. ���� ���������� ����������
     * 
     * @return value
     */
    public TermRealizationExaminationType getTermRealizationExamination() {
        return termRealizationExamination;
    }

    /** 
     * Set the 'TermRealizationExamination' element value. ���� ���������� ����������
     * 
     * @param termRealizationExamination
     */
    public void setTermRealizationExamination(
            TermRealizationExaminationType termRealizationExamination) {
        this.termRealizationExamination = termRealizationExamination;
    }

    /** 
     * Get the list of 'GoodsAccordanceExhert' element items. ���������, ��������������� ��������
     * 
     * @return list
     */
    public List<GoodsAccordanceExhertType> getGoodsAccordanceExhertList() {
        return goodsAccordanceExhertList;
    }

    /** 
     * Set the list of 'GoodsAccordanceExhert' element items. ���������, ��������������� ��������
     * 
     * @param list
     */
    public void setGoodsAccordanceExhertList(
            List<GoodsAccordanceExhertType> list) {
        goodsAccordanceExhertList = list;
    }

    /** 
     * Get the 'Person' element value. ����, �������� �������� ���������� �������� ��� ����� � ���������������
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ����, �������� �������� ���������� �������� ��� ����� � ���������������
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'InfoCustomsPerson' element value. �������� � ����������� ����, ������������ ����������.
     * 
     * @return value
     */
    public InfoCustomsPersonType getInfoCustomsPerson() {
        return infoCustomsPerson;
    }

    /** 
     * Set the 'InfoCustomsPerson' element value. �������� � ����������� ����, ������������ ����������.
     * 
     * @param infoCustomsPerson
     */
    public void setInfoCustomsPerson(InfoCustomsPersonType infoCustomsPerson) {
        this.infoCustomsPerson = infoCustomsPerson;
    }

    /** 
     * Get the 'ExpertSignature' element value. ������� ��������
     * 
     * @return value
     */
    public PersonSignatureType getExpertSignature() {
        return expertSignature;
    }

    /** 
     * Set the 'ExpertSignature' element value. ������� ��������
     * 
     * @param expertSignature
     */
    public void setExpertSignature(PersonSignatureType expertSignature) {
        this.expertSignature = expertSignature;
    }

    /** 
     * Get the 'DeclarantSignature' element value. ������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getDeclarantSignature() {
        return declarantSignature;
    }

    /** 
     * Set the 'DeclarantSignature' element value. ������� ����������
     * 
     * @param declarantSignature
     */
    public void setDeclarantSignature(PersonSignatureType declarantSignature) {
        this.declarantSignature = declarantSignature;
    }

    /** 
     * Get the list of 'RepresentativeSignature' element items. ������� ��������������
     * 
     * @return list
     */
    public List<PersonType> getRepresentativeSignatureList() {
        return representativeSignatureList;
    }

    /** 
     * Set the list of 'RepresentativeSignature' element items. ������� ��������������
     * 
     * @param list
     */
    public void setRepresentativeSignatureList(List<PersonType> list) {
        representativeSignatureList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ����, ����������� ������������ � ��������� ������ � (���) ������������ �������
     * 
     * @return value
     */
    public PersonType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ����, ����������� ������������ � ��������� ������ � (���) ������������ �������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'GoodsLocation' element value. ��������������� �������
     * 
     * @return value
     */
    public GoodsLocationType getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. ��������������� �������
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(GoodsLocationType goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    /** 
     * Get the 'CustomsChief' element value. ��������� ����������� ������
     * 
     * @return value
     */
    public PersonSignatureType getCustomsChief() {
        return customsChief;
    }

    /** 
     * Set the 'CustomsChief' element value. ��������� ����������� ������
     * 
     * @param customsChief
     */
    public void setCustomsChief(PersonSignatureType customsChief) {
        this.customsChief = customsChief;
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
     * Get the 'InfoCustomsPersonDetermineAim' element value. �������� � ����������� ���� ����������� ������, ������������� ���� ���������� ����������.
     * 
     * @return value
     */
    public CustomsPersonType getInfoCustomsPersonDetermineAim() {
        return infoCustomsPersonDetermineAim;
    }

    /** 
     * Set the 'InfoCustomsPersonDetermineAim' element value. �������� � ����������� ���� ����������� ������, ������������� ���� ���������� ����������.
     * 
     * @param infoCustomsPersonDetermineAim
     */
    public void setInfoCustomsPersonDetermineAim(
            CustomsPersonType infoCustomsPersonDetermineAim) {
        this.infoCustomsPersonDetermineAim = infoCustomsPersonDetermineAim;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ����������� ���������. 
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ����������� ���������. 
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'OtherDocument' element value. ��������� ���� ����������
     * 
     * @return value
     */
    public DocumentBaseType getOtherDocument() {
        return otherDocument;
    }

    /** 
     * Set the 'OtherDocument' element value. ��������� ���� ����������
     * 
     * @param otherDocument
     */
    public void setOtherDocument(DocumentBaseType otherDocument) {
        this.otherDocument = otherDocument;
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
