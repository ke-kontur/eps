
package ru.acs.fts.schemas.album.actexpertise;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Акт экспертизы
 */
public class ActExpertiseType extends BaseDocType
{
    private String nameCommission;
    private String authority;
    private List<String> productionList = new ArrayList<String>();
    private List<String> questionList = new ArrayList<String>();
    private String methodExpertise;
    private String article;
    private PersonSignatureType chiefInspection;
    private List<PersonBaseType> listCommissionList = new ArrayList<PersonBaseType>();
    private DocumentType resolution;
    private DocumentType receipt;
    private List<ResultsExaminationType> resultsExaminationList = new ArrayList<ResultsExaminationType>();
    private List<PersonSignatureType> commissionSignatureList = new ArrayList<PersonSignatureType>();
    private String documentModeID;

    /** 
     * Get the 'NameCommission' element value. Наименование комиссии
     * 
     * @return value
     */
    public String getNameCommission() {
        return nameCommission;
    }

    /** 
     * Set the 'NameCommission' element value. Наименование комиссии
     * 
     * @param nameCommission
     */
    public void setNameCommission(String nameCommission) {
        this.nameCommission = nameCommission;
    }

    /** 
     * Get the 'Authority' element value. Наименование органа, назначившего экспертизу
     * 
     * @return value
     */
    public String getAuthority() {
        return authority;
    }

    /** 
     * Set the 'Authority' element value. Наименование органа, назначившего экспертизу
     * 
     * @param authority
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /** 
     * Get the list of 'Production' element items. Представленные изделия (материалы)
     * 
     * @return list
     */
    public List<String> getProductionList() {
        return productionList;
    }

    /** 
     * Set the list of 'Production' element items. Представленные изделия (материалы)
     * 
     * @param list
     */
    public void setProductionList(List<String> list) {
        productionList = list;
    }

    /** 
     * Get the list of 'Questions' element items. Поставленные вопросы
     * 
     * @return list
     */
    public List<String> getQuestionList() {
        return questionList;
    }

    /** 
     * Set the list of 'Questions' element items. Поставленные вопросы
     * 
     * @param list
     */
    public void setQuestionList(List<String> list) {
        questionList = list;
    }

    /** 
     * Get the 'MethodExpertise' element value. Метод проведения экспертизы
     * 
     * @return value
     */
    public String getMethodExpertise() {
        return methodExpertise;
    }

    /** 
     * Set the 'MethodExpertise' element value. Метод проведения экспертизы
     * 
     * @param methodExpertise
     */
    public void setMethodExpertise(String methodExpertise) {
        this.methodExpertise = methodExpertise;
    }

    /** 
     * Get the 'Article' element value. Статья УПК РФ
     * 
     * @return value
     */
    public String getArticle() {
        return article;
    }

    /** 
     * Set the 'Article' element value. Статья УПК РФ
     * 
     * @param article
     */
    public void setArticle(String article) {
        this.article = article;
    }

    /** 
     * Get the 'ChiefInspection' element value. Начальник государственной инспекции пробирного надзора
     * 
     * @return value
     */
    public PersonSignatureType getChiefInspection() {
        return chiefInspection;
    }

    /** 
     * Set the 'ChiefInspection' element value. Начальник государственной инспекции пробирного надзора
     * 
     * @param chiefInspection
     */
    public void setChiefInspection(PersonSignatureType chiefInspection) {
        this.chiefInspection = chiefInspection;
    }

    /** 
     * Get the list of 'ListCommission' element items. Лист комиссии
     * 
     * @return list
     */
    public List<PersonBaseType> getListCommissionList() {
        return listCommissionList;
    }

    /** 
     * Set the list of 'ListCommission' element items. Лист комиссии
     * 
     * @param list
     */
    public void setListCommissionList(List<PersonBaseType> list) {
        listCommissionList = list;
    }

    /** 
     * Get the 'Resolution' element value. Постановление
     * 
     * @return value
     */
    public DocumentType getResolution() {
        return resolution;
    }

    /** 
     * Set the 'Resolution' element value. Постановление
     * 
     * @param resolution
     */
    public void setResolution(DocumentType resolution) {
        this.resolution = resolution;
    }

    /** 
     * Get the 'Receipt' element value. Квитанция
     * 
     * @return value
     */
    public DocumentType getReceipt() {
        return receipt;
    }

    /** 
     * Set the 'Receipt' element value. Квитанция
     * 
     * @param receipt
     */
    public void setReceipt(DocumentType receipt) {
        this.receipt = receipt;
    }

    /** 
     * Get the list of 'ResultsExamination' element items. Результат экспертизы
     * 
     * @return list
     */
    public List<ResultsExaminationType> getResultsExaminationList() {
        return resultsExaminationList;
    }

    /** 
     * Set the list of 'ResultsExamination' element items. Результат экспертизы
     * 
     * @param list
     */
    public void setResultsExaminationList(List<ResultsExaminationType> list) {
        resultsExaminationList = list;
    }

    /** 
     * Get the list of 'CommissionSignature' element items. Подпись комиссии
     * 
     * @return list
     */
    public List<PersonSignatureType> getCommissionSignatureList() {
        return commissionSignatureList;
    }

    /** 
     * Set the list of 'CommissionSignature' element items. Подпись комиссии
     * 
     * @param list
     */
    public void setCommissionSignatureList(List<PersonSignatureType> list) {
        commissionSignatureList = list;
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
