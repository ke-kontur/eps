
package ru.acs.fts.schemas.album.declchangedecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Решение о внесении изменений (дополнений) в сведения, указанные в декларации на товары
 */
public class DeclChangeDecisionType extends BaseDocType
{
    private LocalDate decisionDate;
    private String paragraph;
    private String subparagraph;
    private List<String> decisionFoundationList = new ArrayList<String>();
    private LocalDate dateLimit;
    private String releaseSign;
    private CUOrganizationType declarant;
    private CustomsType customs;
    private CustomsType KDTCustoms;
    private List<ChangesDescriptionType> changesDescriptionList = new ArrayList<ChangesDescriptionType>();
    private CustomsPersonType customsPerson;
    private SignatureInfoType sendInfo;
    private SignatureInfoType receiveInfo;
    private String documentModeID;

    /** 
     * Get the 'DecisionDate' element value. Дата решения
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата решения
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'Paragraph' element value. Номер абзаца нормативного документа
     * 
     * @return value
     */
    public String getParagraph() {
        return paragraph;
    }

    /** 
     * Set the 'Paragraph' element value. Номер абзаца нормативного документа
     * 
     * @param paragraph
     */
    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    /** 
     * Get the 'Subparagraph' element value. Номер подпункта нормативного документа
     * 
     * @return value
     */
    public String getSubparagraph() {
        return subparagraph;
    }

    /** 
     * Set the 'Subparagraph' element value. Номер подпункта нормативного документа
     * 
     * @param subparagraph
     */
    public void setSubparagraph(String subparagraph) {
        this.subparagraph = subparagraph;
    }

    /** 
     * Get the list of 'DecisionFoundation' element items. Основания внесения изменений в ДТ
     * 
     * @return list
     */
    public List<String> getDecisionFoundationList() {
        return decisionFoundationList;
    }

    /** 
     * Set the list of 'DecisionFoundation' element items. Основания внесения изменений в ДТ
     * 
     * @param list
     */
    public void setDecisionFoundationList(List<String> list) {
        decisionFoundationList = list;
    }

    /** 
     * Get the 'DateLimit' element value. Срок предоставления корректировки декларации
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Срок предоставления корректировки декларации
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'ReleaseSign' element value. Признак принятия решения о внесении изменений в декларацию на товары после выпуска (1 - после выпуска, 0 - до выпуска)
     * 
     * @return value
     */
    public String getReleaseSign() {
        return releaseSign;
    }

    /** 
     * Set the 'ReleaseSign' element value. Признак принятия решения о внесении изменений в декларацию на товары после выпуска (1 - после выпуска, 0 - до выпуска)
     * 
     * @param releaseSign
     */
    public void setReleaseSign(String releaseSign) {
        this.releaseSign = releaseSign;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'KDTCustoms' element value. Таможенный пост, на который следует предоставить КДТ
     * 
     * @return value
     */
    public CustomsType getKDTCustoms() {
        return KDTCustoms;
    }

    /** 
     * Set the 'KDTCustoms' element value. Таможенный пост, на который следует предоставить КДТ
     * 
     * @param KDTCustoms
     */
    public void setKDTCustoms(CustomsType KDTCustoms) {
        this.KDTCustoms = KDTCustoms;
    }

    /** 
     * Get the list of 'ChangesDescription' element items. Описание необходимых изменений (дополнений)
     * 
     * @return list
     */
    public List<ChangesDescriptionType> getChangesDescriptionList() {
        return changesDescriptionList;
    }

    /** 
     * Set the list of 'ChangesDescription' element items. Описание необходимых изменений (дополнений)
     * 
     * @param list
     */
    public void setChangesDescriptionList(List<ChangesDescriptionType> list) {
        changesDescriptionList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'SendInfo' element value. Сведения о направлении решения
     * 
     * @return value
     */
    public SignatureInfoType getSendInfo() {
        return sendInfo;
    }

    /** 
     * Set the 'SendInfo' element value. Сведения о направлении решения
     * 
     * @param sendInfo
     */
    public void setSendInfo(SignatureInfoType sendInfo) {
        this.sendInfo = sendInfo;
    }

    /** 
     * Get the 'ReceiveInfo' element value. Сведения о получении решения
     * 
     * @return value
     */
    public SignatureInfoType getReceiveInfo() {
        return receiveInfo;
    }

    /** 
     * Set the 'ReceiveInfo' element value. Сведения о получении решения
     * 
     * @param receiveInfo
     */
    public void setReceiveInfo(SignatureInfoType receiveInfo) {
        this.receiveInfo = receiveInfo;
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
