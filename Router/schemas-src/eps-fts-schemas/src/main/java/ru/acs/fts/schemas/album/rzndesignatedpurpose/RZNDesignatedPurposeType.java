
package ru.acs.fts.schemas.album.rzndesignatedpurpose;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Подтверждение целевого назначения материалов, ввозимых в рамках Соглашения о ввозе материалов образовательного, научного и культурного характера от 22 ноября 1950 г./сведения о целевом назначении для медицины/сведения о подтверждении целевого назначения ввозимого товара (Минтранс)/сведения о подтверждении целевого назначения ввозимого товара (Минпромторг)
 */
public class RZNDesignatedPurposeType extends BaseDocType
{
    private String BDRDID;
    private String docSign;
    private ConfirmationType confirmation;
    private OrganizationType holder;
    private CUOrganizationType consignee;
    private DocumentBaseType contract;
    private GoodsDescriptionType goodsDescription;
    private List<CUOrganizationType> targetMedOrgList = new ArrayList<CUOrganizationType>();
    private DocumentBaseType confirmationLetter;
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
     * Get the 'DocSign' element value. Признак документа: 1 - подтверждение целевого назначения материалов, ввозимых в рамках Соглашения о ввозе материалов образовательного, научного и культурного характера от 22 ноября 1950 г.; 2 - сведения о целевом назначении для медицины; 3 - сведения о подтверждении целевого назначения ввозимого товара (Минтранс); 4 - сведения о подтверждении целевого назначения ввозимого товара (Минпромторг)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - подтверждение целевого назначения материалов, ввозимых в рамках Соглашения о ввозе материалов образовательного, научного и культурного характера от 22 ноября 1950 г.; 2 - сведения о целевом назначении для медицины; 3 - сведения о подтверждении целевого назначения ввозимого товара (Минтранс); 4 - сведения о подтверждении целевого назначения ввозимого товара (Минпромторг)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Confirmation' element value. Подтверждение (Удостоверение)
     * 
     * @return value
     */
    public ConfirmationType getConfirmation() {
        return confirmation;
    }

    /** 
     * Set the 'Confirmation' element value. Подтверждение (Удостоверение)
     * 
     * @param confirmation
     */
    public void setConfirmation(ConfirmationType confirmation) {
        this.confirmation = confirmation;
    }

    /** 
     * Get the 'Holder' element value. Держатель подтверждения (Получатель подтверждающего письма)
     * 
     * @return value
     */
    public OrganizationType getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. Держатель подтверждения (Получатель подтверждающего письма)
     * 
     * @param holder
     */
    public void setHolder(OrganizationType holder) {
        this.holder = holder;
    }

    /** 
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Contract' element value. Контракт
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Контракт
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'GoodsDescription' element value. Описание товара
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание товара
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the list of 'TargetMedOrg' element items. Медицинская организация (объект), для которой предназначен ввозимый товар
     * 
     * @return list
     */
    public List<CUOrganizationType> getTargetMedOrgList() {
        return targetMedOrgList;
    }

    /** 
     * Set the list of 'TargetMedOrg' element items. Медицинская организация (объект), для которой предназначен ввозимый товар
     * 
     * @param list
     */
    public void setTargetMedOrgList(List<CUOrganizationType> list) {
        targetMedOrgList = list;
    }

    /** 
     * Get the 'ConfirmationLetter' element value. Письмо о подтверждении целевого назначения товара для медицинских целей
     * 
     * @return value
     */
    public DocumentBaseType getConfirmationLetter() {
        return confirmationLetter;
    }

    /** 
     * Set the 'ConfirmationLetter' element value. Письмо о подтверждении целевого назначения товара для медицинских целей
     * 
     * @param confirmationLetter
     */
    public void setConfirmationLetter(DocumentBaseType confirmationLetter) {
        this.confirmationLetter = confirmationLetter;
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
