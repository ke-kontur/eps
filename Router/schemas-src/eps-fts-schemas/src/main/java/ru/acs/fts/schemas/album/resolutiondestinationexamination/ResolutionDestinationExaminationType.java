
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
 * Решение о назначении таможенной экспертизы
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
     * Get the 'NameExamination' element value. Наименование экспертизы
     * 
     * @return value
     */
    public String getNameExamination() {
        return nameExamination;
    }

    /** 
     * Set the 'NameExamination' element value. Наименование экспертизы
     * 
     * @param nameExamination
     */
    public void setNameExamination(String nameExamination) {
        this.nameExamination = nameExamination;
    }

    /** 
     * Get the 'Country' element value. Наименование города
     * 
     * @return value
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Set the 'Country' element value. Наименование города
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Get the 'Date' element value. Дата постановления
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата постановления
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the list of 'Reason' element items. Основание для назначения экспертизы
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Основание для назначения экспертизы
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the list of 'Question' element items. Вопросы, поставленные перед экспертом
     * 
     * @return list
     */
    public List<String> getQuestionList() {
        return questionList;
    }

    /** 
     * Set the list of 'Question' element items. Вопросы, поставленные перед экспертом
     * 
     * @param list
     */
    public void setQuestionList(List<String> list) {
        questionList = list;
    }

    /** 
     * Get the 'KindExamination' element value. Вид экспертизы. "1" - дополнительная, "2" - повторная, "3" - комиссионная, "4" - комплексная.
     * 
     * @return value
     */
    public String getKindExamination() {
        return kindExamination;
    }

    /** 
     * Set the 'KindExamination' element value. Вид экспертизы. "1" - дополнительная, "2" - повторная, "3" - комиссионная, "4" - комплексная.
     * 
     * @param kindExamination
     */
    public void setKindExamination(String kindExamination) {
        this.kindExamination = kindExamination;
    }

    /** 
     * Get the 'DateDuties' element value. Дата разъяснений прав и обязанностей, предусмотренные статьей 140 Таможенного кодекса Таможенного союза
     * 
     * @return value
     */
    public LocalDate getDateDuties() {
        return dateDuties;
    }

    /** 
     * Set the 'DateDuties' element value. Дата разъяснений прав и обязанностей, предусмотренные статьей 140 Таможенного кодекса Таможенного союза
     * 
     * @param dateDuties
     */
    public void setDateDuties(LocalDate dateDuties) {
        this.dateDuties = dateDuties;
    }

    /** 
     * Get the 'DateRights' element value. Дата разъяснения прав декларанта, иного лица, обладающего полномочиями в отношении товаров и (или) транспортных средств, и их представителей при назначении и проведении таможенной экспертизы, предусмотренные статьей 141 Таможенного кодекса Таможенного союза
     * 
     * @return value
     */
    public LocalDate getDateRights() {
        return dateRights;
    }

    /** 
     * Set the 'DateRights' element value. Дата разъяснения прав декларанта, иного лица, обладающего полномочиями в отношении товаров и (или) транспортных средств, и их представителей при назначении и проведении таможенной экспертизы, предусмотренные статьей 141 Таможенного кодекса Таможенного союза
     * 
     * @param dateRights
     */
    public void setDateRights(LocalDate dateRights) {
        this.dateRights = dateRights;
    }

    /** 
     * Get the 'Changes' element value. Признак того, что разрешено видоизменение, частичное или полное уничтожение, разрушение материалов, документов проб и образцов исследования
     * 
     * @return value
     */
    public String getChanges() {
        return changes;
    }

    /** 
     * Set the 'Changes' element value. Признак того, что разрешено видоизменение, частичное или полное уничтожение, разрушение материалов, документов проб и образцов исследования
     * 
     * @param changes
     */
    public void setChanges(String changes) {
        this.changes = changes;
    }

    /** 
     * Get the 'CommissionExamination' element value. Поручение на экспертизу
     * 
     * @return value
     */
    public CommissionExaminationType getCommissionExamination() {
        return commissionExamination;
    }

    /** 
     * Set the 'CommissionExamination' element value. Поручение на экспертизу
     * 
     * @param commissionExamination
     */
    public void setCommissionExamination(
            CommissionExaminationType commissionExamination) {
        this.commissionExamination = commissionExamination;
    }

    /** 
     * Get the 'TermRealizationExamination' element value. Срок проведения экспертизы
     * 
     * @return value
     */
    public TermRealizationExaminationType getTermRealizationExamination() {
        return termRealizationExamination;
    }

    /** 
     * Set the 'TermRealizationExamination' element value. Срок проведения экспертизы
     * 
     * @param termRealizationExamination
     */
    public void setTermRealizationExamination(
            TermRealizationExaminationType termRealizationExamination) {
        this.termRealizationExamination = termRealizationExamination;
    }

    /** 
     * Get the list of 'GoodsAccordanceExhert' element items. Материалы, предоставленные эксперту
     * 
     * @return list
     */
    public List<GoodsAccordanceExhertType> getGoodsAccordanceExhertList() {
        return goodsAccordanceExhertList;
    }

    /** 
     * Set the list of 'GoodsAccordanceExhert' element items. Материалы, предоставленные эксперту
     * 
     * @param list
     */
    public void setGoodsAccordanceExhertList(
            List<GoodsAccordanceExhertType> list) {
        goodsAccordanceExhertList = list;
    }

    /** 
     * Get the 'Person' element value. Лицо, которому поручено разъяснить эксперту его права и ответственность
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Лицо, которому поручено разъяснить эксперту его права и ответственность
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'InfoCustomsPerson' element value. Сведения о должностном лице, назначившего экспертизу.
     * 
     * @return value
     */
    public InfoCustomsPersonType getInfoCustomsPerson() {
        return infoCustomsPerson;
    }

    /** 
     * Set the 'InfoCustomsPerson' element value. Сведения о должностном лице, назначившего экспертизу.
     * 
     * @param infoCustomsPerson
     */
    public void setInfoCustomsPerson(InfoCustomsPersonType infoCustomsPerson) {
        this.infoCustomsPerson = infoCustomsPerson;
    }

    /** 
     * Get the 'ExpertSignature' element value. Подпись эксперта
     * 
     * @return value
     */
    public PersonSignatureType getExpertSignature() {
        return expertSignature;
    }

    /** 
     * Set the 'ExpertSignature' element value. Подпись эксперта
     * 
     * @param expertSignature
     */
    public void setExpertSignature(PersonSignatureType expertSignature) {
        this.expertSignature = expertSignature;
    }

    /** 
     * Get the 'DeclarantSignature' element value. Подпись декларанта
     * 
     * @return value
     */
    public PersonSignatureType getDeclarantSignature() {
        return declarantSignature;
    }

    /** 
     * Set the 'DeclarantSignature' element value. Подпись декларанта
     * 
     * @param declarantSignature
     */
    public void setDeclarantSignature(PersonSignatureType declarantSignature) {
        this.declarantSignature = declarantSignature;
    }

    /** 
     * Get the list of 'RepresentativeSignature' element items. Подпись представителей
     * 
     * @return list
     */
    public List<PersonType> getRepresentativeSignatureList() {
        return representativeSignatureList;
    }

    /** 
     * Set the list of 'RepresentativeSignature' element items. Подпись представителей
     * 
     * @param list
     */
    public void setRepresentativeSignatureList(List<PersonType> list) {
        representativeSignatureList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись лица, обладающего полномочиями в отношении товара и (или) транспортных средств
     * 
     * @return value
     */
    public PersonType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись лица, обладающего полномочиями в отношении товара и (или) транспортных средств
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'GoodsLocation' element value. Местонахождение товаров
     * 
     * @return value
     */
    public GoodsLocationType getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. Местонахождение товаров
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(GoodsLocationType goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    /** 
     * Get the 'CustomsChief' element value. Начальник таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsChief() {
        return customsChief;
    }

    /** 
     * Set the 'CustomsChief' element value. Начальник таможенного органа
     * 
     * @param customsChief
     */
    public void setCustomsChief(PersonSignatureType customsChief) {
        this.customsChief = customsChief;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'InfoCustomsPersonDetermineAim' element value. Сведения о должностном лице таможенного органа, установившего цель проведения экспертизы.
     * 
     * @return value
     */
    public CustomsPersonType getInfoCustomsPersonDetermineAim() {
        return infoCustomsPersonDetermineAim;
    }

    /** 
     * Set the 'InfoCustomsPersonDetermineAim' element value. Сведения о должностном лице таможенного органа, установившего цель проведения экспертизы.
     * 
     * @param infoCustomsPersonDetermineAim
     */
    public void setInfoCustomsPersonDetermineAim(
            CustomsPersonType infoCustomsPersonDetermineAim) {
        this.infoCustomsPersonDetermineAim = infoCustomsPersonDetermineAim;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер таможенного документа. 
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер таможенного документа. 
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'OtherDocument' element value. Реквизиты иных документов
     * 
     * @return value
     */
    public DocumentBaseType getOtherDocument() {
        return otherDocument;
    }

    /** 
     * Set the 'OtherDocument' element value. Реквизиты иных документов
     * 
     * @param otherDocument
     */
    public void setOtherDocument(DocumentBaseType otherDocument) {
        this.otherDocument = otherDocument;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
