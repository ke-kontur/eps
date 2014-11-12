
package ru.acs.fts.schemas.album.paymentdocument;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Сведения о плательщике
 */
public class PayerInfoType
{
    private String organizationName;
    private String classification;
    private String residenceStatus;
    private String ITN;
    private String OGRNID;
    private IdentityCardType identityCard;
    private AccountType account;

    /** 
     * Get the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Classification' element value. Классификация плательщика/тип лицевого счета: "1" - "юридическое лицо"; "2" - "физическое лицо"; "3" - "таможенный представитель". 
     * 
     * @return value
     */
    public String getClassification() {
        return classification;
    }

    /** 
     * Set the 'Classification' element value. Классификация плательщика/тип лицевого счета: "1" - "юридическое лицо"; "2" - "физическое лицо"; "3" - "таможенный представитель". 
     * 
     * @param classification
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /** 
     * Get the 'ResidenceStatus' element value. Статус плательщика: "true" - резидент; "false" - нерезидент.
     * 
     * @return value
     */
    public String getResidenceStatus() {
        return residenceStatus;
    }

    /** 
     * Set the 'ResidenceStatus' element value. Статус плательщика: "true" - резидент; "false" - нерезидент.
     * 
     * @param residenceStatus
     */
    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    /** 
     * Get the 'ITN' element value. ИТН плательщика
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ИТН плательщика
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'OGRNID' element value. ОГРН/ОГРНИП плательщика
     * 
     * @return value
     */
    public String getOGRNID() {
        return OGRNID;
    }

    /** 
     * Set the 'OGRNID' element value. ОГРН/ОГРНИП плательщика
     * 
     * @param OGRNID
     */
    public void setOGRNID(String OGRNID) {
        this.OGRNID = OGRNID;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'Account' element value. Номер лицевого счета плательщика
     * 
     * @return value
     */
    public AccountType getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. Номер лицевого счета плательщика
     * 
     * @param account
     */
    public void setAccount(AccountType account) {
        this.account = account;
    }
}
