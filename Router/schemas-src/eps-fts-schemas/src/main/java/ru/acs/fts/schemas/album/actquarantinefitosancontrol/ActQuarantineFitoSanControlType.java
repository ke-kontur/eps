
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Акт государственного карантинного фитосанитарного контроля
 */
public class ActQuarantineFitoSanControlType extends BaseDocType
{
    private String nameSubject;
    private String nameManagement;
    private LocalDate issueDate;
    private String registrationNumber;
    private String numberIKR;
    private List<String> resultScreeningList = new ArrayList<String>();
    private String confiscationSamples;
    private String returnDestructionSamples;
    private List<String> prescriptionList = new ArrayList<String>();
    private PersonBaseType authorizedOfficial;
    private List<DescriptionConsignmentType> descriptionConsignmentList = new ArrayList<DescriptionConsignmentType>();
    private FitoSanitaryCertificateInfoType fitoSanitaryCertificateInfo;
    private PersonBaseType owner;
    private String documentModeID;

    /** 
     * Get the 'NameSubject' element value. Наименование субъекта
     * 
     * @return value
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /** 
     * Set the 'NameSubject' element value. Наименование субъекта
     * 
     * @param nameSubject
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /** 
     * Get the 'NameManagement' element value. Наименование подразделения управления
     * 
     * @return value
     */
    public String getNameManagement() {
        return nameManagement;
    }

    /** 
     * Set the 'NameManagement' element value. Наименование подразделения управления
     * 
     * @param nameManagement
     */
    public void setNameManagement(String nameManagement) {
        this.nameManagement = nameManagement;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'NumberIKR' element value. Номер ИКР, на основании которого разрешается ввоз
     * 
     * @return value
     */
    public String getNumberIKR() {
        return numberIKR;
    }

    /** 
     * Set the 'NumberIKR' element value. Номер ИКР, на основании которого разрешается ввоз
     * 
     * @param numberIKR
     */
    public void setNumberIKR(String numberIKR) {
        this.numberIKR = numberIKR;
    }

    /** 
     * Get the list of 'ResultScreening' element items. Результат досмотра
     * 
     * @return list
     */
    public List<String> getResultScreeningList() {
        return resultScreeningList;
    }

    /** 
     * Set the list of 'ResultScreening' element items. Результат досмотра
     * 
     * @param list
     */
    public void setResultScreeningList(List<String> list) {
        resultScreeningList = list;
    }

    /** 
     * Get the 'ConfiscationSamples' element value. Для карантинной фитосанитарной экспертизы отобраны образцы
     * 
     * @return value
     */
    public String getConfiscationSamples() {
        return confiscationSamples;
    }

    /** 
     * Set the 'ConfiscationSamples' element value. Для карантинной фитосанитарной экспертизы отобраны образцы
     * 
     * @param confiscationSamples
     */
    public void setConfiscationSamples(String confiscationSamples) {
        this.confiscationSamples = confiscationSamples;
    }

    /** 
     * Get the 'ReturnDestructionSamples' element value. Образцы  после   проведения   экспертизы если 1- возращены, 2-  уничтожены, 3 - оставлены на хранение.
     * 
     * @return value
     */
    public String getReturnDestructionSamples() {
        return returnDestructionSamples;
    }

    /** 
     * Set the 'ReturnDestructionSamples' element value. Образцы  после   проведения   экспертизы если 1- возращены, 2-  уничтожены, 3 - оставлены на хранение.
     * 
     * @param returnDestructionSamples
     */
    public void setReturnDestructionSamples(String returnDestructionSamples) {
        this.returnDestructionSamples = returnDestructionSamples;
    }

    /** 
     * Get the list of 'Prescription' element items. Предписываются следующие карантинные  фитосанитарные  мероприятия,
     * 
     * @return list
     */
    public List<String> getPrescriptionList() {
        return prescriptionList;
    }

    /** 
     * Set the list of 'Prescription' element items. Предписываются следующие карантинные  фитосанитарные  мероприятия,
     * 
     * @param list
     */
    public void setPrescriptionList(List<String> list) {
        prescriptionList = list;
    }

    /** 
     * Get the 'AuthorizedOfficial' element value. Уполномоченное  должностное лицо
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedOfficial() {
        return authorizedOfficial;
    }

    /** 
     * Set the 'AuthorizedOfficial' element value. Уполномоченное  должностное лицо
     * 
     * @param authorizedOfficial
     */
    public void setAuthorizedOfficial(PersonBaseType authorizedOfficial) {
        this.authorizedOfficial = authorizedOfficial;
    }

    /** 
     * Get the list of 'DescriptionConsignment' element items. Описание груза
     * 
     * @return list
     */
    public List<DescriptionConsignmentType> getDescriptionConsignmentList() {
        return descriptionConsignmentList;
    }

    /** 
     * Set the list of 'DescriptionConsignment' element items. Описание груза
     * 
     * @param list
     */
    public void setDescriptionConsignmentList(
            List<DescriptionConsignmentType> list) {
        descriptionConsignmentList = list;
    }

    /** 
     * Get the 'FitoSanitaryCertificateInfo' element value. Сведения о фитосанитарном (карантинном) сертификате
     * 
     * @return value
     */
    public FitoSanitaryCertificateInfoType getFitoSanitaryCertificateInfo() {
        return fitoSanitaryCertificateInfo;
    }

    /** 
     * Set the 'FitoSanitaryCertificateInfo' element value. Сведения о фитосанитарном (карантинном) сертификате
     * 
     * @param fitoSanitaryCertificateInfo
     */
    public void setFitoSanitaryCertificateInfo(
            FitoSanitaryCertificateInfoType fitoSanitaryCertificateInfo) {
        this.fitoSanitaryCertificateInfo = fitoSanitaryCertificateInfo;
    }

    /** 
     * Get the 'Owner' element value. Акт составлен  в  присутствии  владельца   (представителя)   груза
     * 
     * @return value
     */
    public PersonBaseType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. Акт составлен  в  присутствии  владельца   (представителя)   груза
     * 
     * @param owner
     */
    public void setOwner(PersonBaseType owner) {
        this.owner = owner;
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
