
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Акт отбора проб и образцов
 */
public class ActThievingSamplingType extends BaseDocType
{
    private LocalDate date;
    private String number;
    private List<String> nameObjectList = new ArrayList<String>();
    private LocalDate datePresentation;
    private LocalDate dateTakeDuplicateAct;
    private List<String> applicationList = new ArrayList<String>();
    private CustomsType customs;
    private PersonSignatureType takeSample;
    private PersonInfoType expert;
    private List<PersonInfoType> witnessList = new ArrayList<PersonInfoType>();
    private List<PersonInfoType> otherParticipantList = new ArrayList<PersonInfoType>();
    private AccessoriesType accessories;
    private TermsThievingSamplingType termsThievingSampling;
    private List<InfoObjectType> infoObjectList = new ArrayList<InfoObjectType>();
    private PackingType packing;
    private List<ObservationType> observationList = new ArrayList<ObservationType>();
    private PersonSignatureAuthorActType personSignatureAuthorAct;
    private List<PersonInfoType> personPresentList = new ArrayList<PersonInfoType>();
    private PersonInfoType specialist;
    private List<PersonInfoType> otherSpecialistList = new ArrayList<PersonInfoType>();
    private DescriptionSampleType descriptionSample;
    private PersonSignatureType copyReceived;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата составления акта
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата составления акта
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Number' element value. Номер акта
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер акта
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the list of 'NameObject' element items. Наименование предмета
     * 
     * @return list
     */
    public List<String> getNameObjectList() {
        return nameObjectList;
    }

    /** 
     * Set the list of 'NameObject' element items. Наименование предмета
     * 
     * @param list
     */
    public void setNameObjectList(List<String> list) {
        nameObjectList = list;
    }

    /** 
     * Get the 'DatePresentation' element value. Дата предъявления предметов
     * 
     * @return value
     */
    public LocalDate getDatePresentation() {
        return datePresentation;
    }

    /** 
     * Set the 'DatePresentation' element value. Дата предъявления предметов
     * 
     * @param datePresentation
     */
    public void setDatePresentation(LocalDate datePresentation) {
        this.datePresentation = datePresentation;
    }

    /** 
     * Get the 'DateTakeDuplicateAct' element value. Дата получения копии акта
     * 
     * @return value
     */
    public LocalDate getDateTakeDuplicateAct() {
        return dateTakeDuplicateAct;
    }

    /** 
     * Set the 'DateTakeDuplicateAct' element value. Дата получения копии акта
     * 
     * @param dateTakeDuplicateAct
     */
    public void setDateTakeDuplicateAct(LocalDate dateTakeDuplicateAct) {
        this.dateTakeDuplicateAct = dateTakeDuplicateAct;
    }

    /** 
     * Get the list of 'Application' element items. Приложение
     * 
     * @return list
     */
    public List<String> getApplicationList() {
        return applicationList;
    }

    /** 
     * Set the list of 'Application' element items. Приложение
     * 
     * @param list
     */
    public void setApplicationList(List<String> list) {
        applicationList = list;
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
     * Get the 'TakeSample' element value. Лицо, отобравшее пробы или образцы
     * 
     * @return value
     */
    public PersonSignatureType getTakeSample() {
        return takeSample;
    }

    /** 
     * Set the 'TakeSample' element value. Лицо, отобравшее пробы или образцы
     * 
     * @param takeSample
     */
    public void setTakeSample(PersonSignatureType takeSample) {
        this.takeSample = takeSample;
    }

    /** 
     * Get the 'Expert' element value. Таможенный эксперт (эксперт)
     * 
     * @return value
     */
    public PersonInfoType getExpert() {
        return expert;
    }

    /** 
     * Set the 'Expert' element value. Таможенный эксперт (эксперт)
     * 
     * @param expert
     */
    public void setExpert(PersonInfoType expert) {
        this.expert = expert;
    }

    /** 
     * Get the list of 'Witness' element items. Понятые
     * 
     * @return list
     */
    public List<PersonInfoType> getWitnessList() {
        return witnessList;
    }

    /** 
     * Set the list of 'Witness' element items. Понятые
     * 
     * @param list
     */
    public void setWitnessList(List<PersonInfoType> list) {
        witnessList = list;
    }

    /** 
     * Get the list of 'OtherParticipant' element items. Иные лица, обладающие полномочиями в отношении товаров
     * 
     * @return list
     */
    public List<PersonInfoType> getOtherParticipantList() {
        return otherParticipantList;
    }

    /** 
     * Set the list of 'OtherParticipant' element items. Иные лица, обладающие полномочиями в отношении товаров
     * 
     * @param list
     */
    public void setOtherParticipantList(List<PersonInfoType> list) {
        otherParticipantList = list;
    }

    /** 
     * Get the 'Accessories' element value. Принадлежность предметов, пробы или образцы которых берут
     * 
     * @return value
     */
    public AccessoriesType getAccessories() {
        return accessories;
    }

    /** 
     * Set the 'Accessories' element value. Принадлежность предметов, пробы или образцы которых берут
     * 
     * @param accessories
     */
    public void setAccessories(AccessoriesType accessories) {
        this.accessories = accessories;
    }

    /** 
     * Get the 'TermsThievingSampling' element value. Условия отбора проб или образцов
     * 
     * @return value
     */
    public TermsThievingSamplingType getTermsThievingSampling() {
        return termsThievingSampling;
    }

    /** 
     * Set the 'TermsThievingSampling' element value. Условия отбора проб или образцов
     * 
     * @param termsThievingSampling
     */
    public void setTermsThievingSampling(
            TermsThievingSamplingType termsThievingSampling) {
        this.termsThievingSampling = termsThievingSampling;
    }

    /** 
     * Get the list of 'InfoObject' element items. Информация о предметах, взятых в качестве проб или образцов.
     * 
     * @return list
     */
    public List<InfoObjectType> getInfoObjectList() {
        return infoObjectList;
    }

    /** 
     * Set the list of 'InfoObject' element items. Информация о предметах, взятых в качестве проб или образцов.
     * 
     * @param list
     */
    public void setInfoObjectList(List<InfoObjectType> list) {
        infoObjectList = list;
    }

    /** 
     * Get the 'Packing' element value. Упаковка взятых проб или образцов
     * 
     * @return value
     */
    public PackingType getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. Упаковка взятых проб или образцов
     * 
     * @param packing
     */
    public void setPacking(PackingType packing) {
        this.packing = packing;
    }

    /** 
     * Get the list of 'Observation' element items. Замечания и заявления присутствующих (участвующих) лиц
     * 
     * @return list
     */
    public List<ObservationType> getObservationList() {
        return observationList;
    }

    /** 
     * Set the list of 'Observation' element items. Замечания и заявления присутствующих (участвующих) лиц
     * 
     * @param list
     */
    public void setObservationList(List<ObservationType> list) {
        observationList = list;
    }

    /** 
     * Get the 'PersonSignatureAuthorAct' element value. Подпись лица, составившего акт
     * 
     * @return value
     */
    public PersonSignatureAuthorActType getPersonSignatureAuthorAct() {
        return personSignatureAuthorAct;
    }

    /** 
     * Set the 'PersonSignatureAuthorAct' element value. Подпись лица, составившего акт
     * 
     * @param personSignatureAuthorAct
     */
    public void setPersonSignatureAuthorAct(
            PersonSignatureAuthorActType personSignatureAuthorAct) {
        this.personSignatureAuthorAct = personSignatureAuthorAct;
    }

    /** 
     * Get the list of 'PersonPresent' element items. Сведения о декларанте, ином лице, обладающем полномочиями в отношении товаров, или их представителях
     * 
     * @return list
     */
    public List<PersonInfoType> getPersonPresentList() {
        return personPresentList;
    }

    /** 
     * Set the list of 'PersonPresent' element items. Сведения о декларанте, ином лице, обладающем полномочиями в отношении товаров, или их представителях
     * 
     * @param list
     */
    public void setPersonPresentList(List<PersonInfoType> list) {
        personPresentList = list;
    }

    /** 
     * Get the 'Specialist' element value. Специалист
     * 
     * @return value
     */
    public PersonInfoType getSpecialist() {
        return specialist;
    }

    /** 
     * Set the 'Specialist' element value. Специалист
     * 
     * @param specialist
     */
    public void setSpecialist(PersonInfoType specialist) {
        this.specialist = specialist;
    }

    /** 
     * Get the list of 'OtherSpecialist' element items. Иные специалисты
     * 
     * @return list
     */
    public List<PersonInfoType> getOtherSpecialistList() {
        return otherSpecialistList;
    }

    /** 
     * Set the list of 'OtherSpecialist' element items. Иные специалисты
     * 
     * @param list
     */
    public void setOtherSpecialistList(List<PersonInfoType> list) {
        otherSpecialistList = list;
    }

    /** 
     * Get the 'DescriptionSample' element value. Описание отобранных проб (образцов)
     * 
     * @return value
     */
    public DescriptionSampleType getDescriptionSample() {
        return descriptionSample;
    }

    /** 
     * Set the 'DescriptionSample' element value. Описание отобранных проб (образцов)
     * 
     * @param descriptionSample
     */
    public void setDescriptionSample(DescriptionSampleType descriptionSample) {
        this.descriptionSample = descriptionSample;
    }

    /** 
     * Get the 'CopyReceived' element value. Лицо, получившее копию акта
     * 
     * @return value
     */
    public PersonSignatureType getCopyReceived() {
        return copyReceived;
    }

    /** 
     * Set the 'CopyReceived' element value. Лицо, получившее копию акта
     * 
     * @param copyReceived
     */
    public void setCopyReceived(PersonSignatureType copyReceived) {
        this.copyReceived = copyReceived;
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
