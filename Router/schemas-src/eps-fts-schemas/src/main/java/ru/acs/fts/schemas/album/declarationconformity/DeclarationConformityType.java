
package ru.acs.fts.schemas.album.declarationconformity;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Декларация о соответствии
 */
public class DeclarationConformityType extends BaseDocType
{
    private String BDRDID;
    private String schemaDeclaration;
    private List<String> otherInfoList = new ArrayList<String>();
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> declNormDocList = new ArrayList<String>();
    private String declarationSign;
    private RegistrationNumberType registrationNumber;
    private DeclarantType declarant;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<DocumentBaseType> documentList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType declarantSignature;
    private RegisterType register;
    private PersonSignatureType registerSignature;
    private List<AppendsType> appendList = new ArrayList<AppendsType>();
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'SchemaDeclaration' element value. Схема декларирования соответствия
     * 
     * @return value
     */
    public String getSchemaDeclaration() {
        return schemaDeclaration;
    }

    /** 
     * Set the 'SchemaDeclaration' element value. Схема декларирования соответствия
     * 
     * @param schemaDeclaration
     */
    public void setSchemaDeclaration(String schemaDeclaration) {
        this.schemaDeclaration = schemaDeclaration;
    }

    /** 
     * Get the list of 'OtherInfo' element items. Иные сведения
     * 
     * @return list
     */
    public List<String> getOtherInfoList() {
        return otherInfoList;
    }

    /** 
     * Set the list of 'OtherInfo' element items. Иные сведения
     * 
     * @param list
     */
    public void setOtherInfoList(List<String> list) {
        otherInfoList = list;
    }

    /** 
     * Get the 'StartDate' element value. Дата начала действия декларации соответствия
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата начала действия декларации соответствия
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания действия декларации соответствия
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания действия декларации соответствия
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the list of 'DeclNormDoc' element items. Обозначение нормативных документов, на основании которых принимается декларация о соответствии 
     * 
     * @return list
     */
    public List<String> getDeclNormDocList() {
        return declNormDocList;
    }

    /** 
     * Set the list of 'DeclNormDoc' element items. Обозначение нормативных документов, на основании которых принимается декларация о соответствии 
     * 
     * @param list
     */
    public void setDeclNormDocList(List<String> list) {
        declNormDocList = list;
    }

    /** 
     * Get the 'DeclarationSign' element value. Декларация соответствия: 0 - Таможенный союз; 1 - Росстандарт
     * 
     * @return value
     */
    public String getDeclarationSign() {
        return declarationSign;
    }

    /** 
     * Set the 'DeclarationSign' element value. Декларация соответствия: 0 - Таможенный союз; 1 - Росстандарт
     * 
     * @param declarationSign
     */
    public void setDeclarationSign(String declarationSign) {
        this.declarationSign = declarationSign;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о заявителе
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о заявителе
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о продукции
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о продукции
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'Document' element items. Документы, послужившие основанием для подтверждения соответствия
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. Документы, послужившие основанием для подтверждения соответствия
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentBaseType> list) {
        documentList = list;
    }

    /** 
     * Get the 'DeclarantSignature' element value. Подпись заявителя
     * 
     * @return value
     */
    public PersonSignatureType getDeclarantSignature() {
        return declarantSignature;
    }

    /** 
     * Set the 'DeclarantSignature' element value. Подпись заявителя
     * 
     * @param declarantSignature
     */
    public void setDeclarantSignature(PersonSignatureType declarantSignature) {
        this.declarantSignature = declarantSignature;
    }

    /** 
     * Get the 'Register' element value. Сведения об органе, зарегистрировавшего декларацию о соответствии
     * 
     * @return value
     */
    public RegisterType getRegister() {
        return register;
    }

    /** 
     * Set the 'Register' element value. Сведения об органе, зарегистрировавшего декларацию о соответствии
     * 
     * @param register
     */
    public void setRegister(RegisterType register) {
        this.register = register;
    }

    /** 
     * Get the 'RegisterSignature' element value. Подпись Руководителя органа, регистрирующего  декларацию о соответствии
     * 
     * @return value
     */
    public PersonSignatureType getRegisterSignature() {
        return registerSignature;
    }

    /** 
     * Set the 'RegisterSignature' element value. Подпись Руководителя органа, регистрирующего  декларацию о соответствии
     * 
     * @param registerSignature
     */
    public void setRegisterSignature(PersonSignatureType registerSignature) {
        this.registerSignature = registerSignature;
    }

    /** 
     * Get the list of 'Append' element items. Сведения о приложениях
     * 
     * @return list
     */
    public List<AppendsType> getAppendList() {
        return appendList;
    }

    /** 
     * Set the list of 'Append' element items. Сведения о приложениях
     * 
     * @param list
     */
    public void setAppendList(List<AppendsType> list) {
        appendList = list;
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
